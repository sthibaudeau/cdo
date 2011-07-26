/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.examples.server.offline;

import org.eclipse.emf.cdo.common.revision.CDORevisionCache;
import org.eclipse.emf.cdo.common.revision.CDORevisionUtil;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.IRepositorySynchronizer;
import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.session.CDOSessionConfiguration.SessionOpenedEvent;
import org.eclipse.emf.cdo.session.CDOSessionConfigurationFactory;

import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;

import java.util.Map;

/**
 * @author Eike Stepper
 * @author Martin Fluegge
 * @since 4.0
 */
public class OfflineExampleClone extends AbstractOfflineExampleServer
{
  public final static String NAME = "clone";

  private static final int PORT = 2037;

  private static final int DB_BROWSER_PORT = 7778;

  public OfflineExampleClone()
  {
    super(NAME, PORT, DB_BROWSER_PORT);
  }

  @Override
  protected IRepository createRepository(IStore store, Map<String, String> props)
  {
    IRepositorySynchronizer synchronizer = createRepositorySynchronizer("localhost:" + OfflineExampleMaster.PORT,
        OfflineExampleMaster.NAME);
    return CDOServerUtil.createOfflineClone(name, store, props, synchronizer);
  }

  /**
   * Creates a repository synchronizer which connects to the master repository to synchronize between master and client.
   */
  protected IRepositorySynchronizer createRepositorySynchronizer(String connectorDescription, String repositoryName)
  {
    CDOSessionConfigurationFactory factory = createSessionConfigurationFactory(connectorDescription, repositoryName);

    IRepositorySynchronizer synchronizer = CDOServerUtil.createRepositorySynchronizer(factory);
    synchronizer.setRetryInterval(2);
    synchronizer.setRawReplication(true);
    synchronizer.setMaxRecommits(10);
    synchronizer.setRecommitInterval(2);
    return synchronizer;
  }

  /**
   * creates a CDOSessionConfigurationFactory for the offline clone. It instantiates a connection to the master
   * repository.
   */
  protected CDOSessionConfigurationFactory createSessionConfigurationFactory(final String connectorDescription,
      final String repositoryName)
  {
    return new CDOSessionConfigurationFactory()
    {
      public CDOSessionConfiguration createSessionConfiguration()
      {
        IConnector connector = createConnector("localhost:" + OfflineExampleMaster.PORT);
        return OfflineExampleClone.this.createSessionConfiguration(connector, repositoryName);
      }
    };
  }

  protected CDOSessionConfiguration createSessionConfiguration(IConnector connector, String repositoryName)
  {
    CDOSessionConfiguration configuration = CDONet4jUtil.createSessionConfiguration();
    configuration.setConnector(connector);
    configuration.setRepositoryName(repositoryName);
    configuration.setRevisionManager(CDORevisionUtil.createRevisionManager(CDORevisionCache.NOOP));
    configuration.addListener(new IListener()
    {
      public void notifyEvent(IEvent event)
      {
        if (event instanceof SessionOpenedEvent)
        {
          SessionOpenedEvent e = (SessionOpenedEvent)event;
          CDOSession session = e.getOpenedSession();
          System.out.println("Opened " + session);

          session.addListener(new LifecycleEventAdapter()
          {
            @Override
            protected void onAboutToDeactivate(ILifecycle lifecycle)
            {
              System.out.println("Closing " + lifecycle);
            }
          });
        }
      }
    });

    return configuration;
  }

  protected IConnector createConnector(String description)
  {
    return Net4jUtil.getConnector(container, AbstractOfflineExampleServer.TRANSPORT_TYPE, description);
  }

  public static void main(String[] args) throws Exception
  {
    System.out.println("Clone repository starting...");
    OfflineExampleClone example = new OfflineExampleClone();
    example.init();
    example.run();
    example.done();
  }
}