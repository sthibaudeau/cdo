/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany, and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 *    Martin Taal  - moved code from HibernateStore to this class
 **************************************************************************/
package org.eclipse.emf.cdo.server.internal.hibernate;

import org.eclipse.emf.cdo.internal.protocol.model.InternalCDOClass;
import org.eclipse.emf.cdo.internal.protocol.model.InternalCDOFeature;
import org.eclipse.emf.cdo.internal.protocol.model.InternalCDOPackage;
import org.eclipse.emf.cdo.protocol.model.CDOClass;
import org.eclipse.emf.cdo.protocol.model.CDOFeature;
import org.eclipse.emf.cdo.protocol.model.CDOPackage;
import org.eclipse.emf.cdo.protocol.model.CDOPackageInfo;
import org.eclipse.emf.cdo.server.internal.hibernate.bundle.OM;

import org.eclipse.net4j.internal.util.om.trace.ContextTracer;
import org.eclipse.net4j.util.WrappedException;
import org.eclipse.net4j.util.io.IOUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Delegate which stores and retrieves cdo packages.
 * 
 * @author Eike Stepper
 * @author Martin Taal
 */
public class HibernatePackageHandler
{
  private static final ContextTracer TRACER = new ContextTracer(OM.DEBUG, HibernateStoreWriter.class);

  private Configuration configuration;

  private SessionFactory sessionFactory;

  private int nextPackageID;

  private int nextClassID;

  private int nextFeatureID;

  private Collection<CDOPackageInfo> cdoPackageInfos = null;

  private Collection<CDOPackage> cdoPackages = null;

  private HibernateStore hibernateStore;

  /**
   * TODO Necessary to pass/store/dump the properties from the store?
   */
  public HibernatePackageHandler(HibernateStore store)
  {
    hibernateStore = store;
  }

  public void writePackages(CDOPackage... cdoPackages)
  {
    TRACER.trace("Persisting new CDOPackages");
    final Session session = getSessionFactory().openSession();
    final Transaction tx = session.beginTransaction();
    boolean err = true;
    try
    {
      for (CDOPackage cdoPackage : cdoPackages)
      {
        if (null != getCDOPackage(cdoPackage.getPackageURI()))
        {
          OM.LOG.warn("CDOPackage " + cdoPackage.getPackageURI() + " already exists not persisting it again!");
          continue;
        }

        TRACER.trace("Persisting CDOPackage " + cdoPackage.getPackageURI());
        session.saveOrUpdate(cdoPackage);
      }
      tx.commit();
      err = false;
    }
    finally
    {
      if (err)
      {
        tx.rollback();
      }
      session.close();
    }
    reset();
    hibernateStore.reInitialize();
  }

  public void writePackage(CDOPackage cdoPackage)
  {
    if (null != getCDOPackage(cdoPackage.getPackageURI()))
    {
      OM.LOG.warn("CDOPackage " + cdoPackage.getPackageURI() + " already exists not persisting it again!");
      return;
    }

    final Session session = getSessionFactory().openSession();
    final Transaction tx = session.beginTransaction();
    boolean err = true;
    try
    {
      TRACER.trace("Persisting CDOPackage " + cdoPackage.getPackageURI());
      session.saveOrUpdate(cdoPackage);
      tx.commit();
      err = false;
    }
    finally
    {
      if (err)
      {
        tx.rollback();
      }
      session.close();
    }
    reset();
    hibernateStore.reInitialize();
  }

  public CDOPackage getCDOPackage(String uri)
  {
    TRACER.trace("Getting CDOPackage using uri: " + uri);
    for (CDOPackage cdoPackage : cdoPackages)
    {
      if (cdoPackage.getPackageURI().compareTo(uri) == 0)
      {
        TRACER.trace("CDOPackage found");
        return cdoPackage;
      }
    }
    TRACER.trace("CDOPackage NOT found");
    return null;
  }

  public Collection<CDOPackageInfo> getCDOPackageInfos()
  {
    readPackages();
    return cdoPackageInfos;
  }

  public Collection<CDOPackage> getCDOPackages()
  {
    readPackages();
    return cdoPackages;
  }

  protected void readPackages()
  {
    if (cdoPackageInfos == null)
    {
      TRACER.trace("Reading CDOPackages from db");
      Collection<CDOPackageInfo> result = new ArrayList<CDOPackageInfo>();
      Collection<CDOPackage> resultPackages = new ArrayList<CDOPackage>();
      Session session = getSessionFactory().openSession();
      try
      {
        Criteria criteria = session.createCriteria(CDOPackage.class);
        List<?> list = criteria.list();
        TRACER.trace("Found " + list.size() + " CDOPackages in DB");
        for (Object object : list)
        {
          CDOPackage cdoPackage = (CDOPackage)object;
          TRACER.trace("Read CDOPackage: " + cdoPackage.getName());
          result.add(new CDOPackageInfo(cdoPackage.getPackageURI(), cdoPackage.isDynamic(), null));
          ((InternalCDOPackage)cdoPackage).setPackageManager(hibernateStore.getRepository().getPackageManager());
          resultPackages.add(cdoPackage);

          // repair something
          // TODO: set this in the mapping with a bi-directional relation
          for (CDOClass cdoClass : cdoPackage.getClasses())
          {
            ((InternalCDOClass)cdoClass).setContainingPackage(cdoPackage);
            for (CDOFeature cdoFeature : cdoClass.getFeatures())
            {
              ((InternalCDOFeature)cdoFeature).setContainingClass(cdoClass);
            }
          }
        }

        cdoPackages = resultPackages;
        cdoPackageInfos = result;
      }
      finally
      {
        session.close();
      }
    }
    TRACER.trace("Finished reading CDOPackages");
  }

  public synchronized SessionFactory getSessionFactory()
  {
    if (sessionFactory == null)
    {
      sessionFactory = configuration.buildSessionFactory();
    }

    return sessionFactory;
  }

  public synchronized int getNextPackageID()
  {
    // TODO Better synchronization
    return nextPackageID++;
  }

  public synchronized int getNextClassID()
  {
    // TODO Better synchronization
    return nextClassID++;
  }

  public synchronized int getNextFeatureID()
  {
    // TODO Better synchronization
    return nextFeatureID++;
  }

  public void reset()
  {
    cdoPackageInfos = null;
    cdoPackages = null;
  }

  protected void doActivate()
  {
    TRACER.trace("Activating CDOPackageHandler");

    initConfiguration();
    initSchema();
  }

  protected void doDeactivate() throws Exception
  {
    TRACER.trace("De-Activating CDOPackageHandler");

    if (sessionFactory != null)
    {
      sessionFactory.close();
      sessionFactory = null;
    }
  }

  protected void initConfiguration()
  {
    TRACER.trace("Initializing datastore for CDO metadata");
    InputStream in = null;

    try
    {
      in = OM.BUNDLE.getInputStream("mappings/meta.hbm.xml");
      configuration = new Configuration();
      configuration.addInputStream(in);
      configuration.setProperties(HibernateUtil.getInstance().getPropertiesFromStore(hibernateStore));
    }
    catch (Exception ex)
    {
      throw WrappedException.wrap(ex);
    }
    finally
    {
      IOUtil.close(in);
    }
  }

  protected void initSchema()
  {
    TRACER.trace("Updating db schema for Hibernate PackageHandler");
    new SchemaUpdate(configuration).execute(true, true);
  }
}
