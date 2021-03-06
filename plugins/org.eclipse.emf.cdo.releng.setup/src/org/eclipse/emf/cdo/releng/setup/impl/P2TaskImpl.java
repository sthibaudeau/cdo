/*
 * Copyright (c) 2013 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.releng.setup.impl;

import org.eclipse.emf.cdo.releng.internal.setup.Activator;
import org.eclipse.emf.cdo.releng.internal.setup.ui.LicenseDialog;
import org.eclipse.emf.cdo.releng.setup.InstallableUnit;
import org.eclipse.emf.cdo.releng.setup.P2Repository;
import org.eclipse.emf.cdo.releng.setup.P2Task;
import org.eclipse.emf.cdo.releng.setup.Preferences;
import org.eclipse.emf.cdo.releng.setup.SetupPackage;
import org.eclipse.emf.cdo.releng.setup.SetupTaskContext;
import org.eclipse.emf.cdo.releng.setup.SetupTaskScope;
import org.eclipse.emf.cdo.releng.setup.util.FileUtil;
import org.eclipse.emf.cdo.releng.setup.util.log.ProgressLogMonitor;

import org.eclipse.net4j.util.ReflectUtil;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.internal.p2.director.app.DirectorApplication;
import org.eclipse.equinox.internal.p2.director.app.ILog;
import org.eclipse.equinox.internal.p2.director.app.Messages;
import org.eclipse.equinox.internal.p2.ui.ProvUI;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.engine.IProfile;
import org.eclipse.equinox.p2.engine.IProvisioningPlan;
import org.eclipse.equinox.p2.engine.ProvisioningContext;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.ILicense;
import org.eclipse.equinox.p2.metadata.MetadataFactory;
import org.eclipse.equinox.p2.metadata.MetadataFactory.InstallableUnitDescription;
import org.eclipse.equinox.p2.operations.InstallOperation;
import org.eclipse.equinox.p2.operations.ProvisioningJob;
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.operations.RepositoryTracker;
import org.eclipse.equinox.p2.planner.IPlanner;
import org.eclipse.equinox.p2.planner.IProfileChangeRequest;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.query.IQueryable;
import org.eclipse.equinox.p2.query.QueryUtil;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;
import org.eclipse.equinox.p2.ui.ProvisioningUI;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;

import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Install Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.releng.setup.impl.P2TaskImpl#getP2Repositories <em>P2 Repositories</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.releng.setup.impl.P2TaskImpl#getInstallableUnits <em>Installable Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class P2TaskImpl extends SetupTaskImpl implements P2Task
{
  private static final boolean SKIP = "true".equals(System.getProperty(P2Task.class.getName() + ".skip"));

  /**
   * The cached value of the '{@link #getP2Repositories() <em>P2 Repositories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP2Repositories()
   * @generated
   * @ordered
   */
  protected EList<P2Repository> p2Repositories;

  /**
   * The cached value of the '{@link #getInstallableUnits() <em>Installable Units</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstallableUnits()
   * @generated
   * @ordered
   */
  protected EList<InstallableUnit> installableUnits;

  private transient Set<String> neededInstallableUnits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected P2TaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SetupPackage.Literals.P2_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InstallableUnit> getInstallableUnits()
  {
    if (installableUnits == null)
    {
      installableUnits = new EObjectContainmentEList.Resolving<InstallableUnit>(InstallableUnit.class, this,
          SetupPackage.P2_TASK__INSTALLABLE_UNITS);
    }
    return installableUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<P2Repository> getP2Repositories()
  {
    if (p2Repositories == null)
    {
      p2Repositories = new EObjectContainmentEList.Resolving<P2Repository>(P2Repository.class, this,
          SetupPackage.P2_TASK__P2_REPOSITORIES);
    }
    return p2Repositories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case SetupPackage.P2_TASK__P2_REPOSITORIES:
      return ((InternalEList<?>)getP2Repositories()).basicRemove(otherEnd, msgs);
    case SetupPackage.P2_TASK__INSTALLABLE_UNITS:
      return ((InternalEList<?>)getInstallableUnits()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case SetupPackage.P2_TASK__P2_REPOSITORIES:
      return getP2Repositories();
    case SetupPackage.P2_TASK__INSTALLABLE_UNITS:
      return getInstallableUnits();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case SetupPackage.P2_TASK__P2_REPOSITORIES:
      getP2Repositories().clear();
      getP2Repositories().addAll((Collection<? extends P2Repository>)newValue);
      return;
    case SetupPackage.P2_TASK__INSTALLABLE_UNITS:
      getInstallableUnits().clear();
      getInstallableUnits().addAll((Collection<? extends InstallableUnit>)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case SetupPackage.P2_TASK__P2_REPOSITORIES:
      getP2Repositories().clear();
      return;
    case SetupPackage.P2_TASK__INSTALLABLE_UNITS:
      getInstallableUnits().clear();
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case SetupPackage.P2_TASK__P2_REPOSITORIES:
      return p2Repositories != null && !p2Repositories.isEmpty();
    case SetupPackage.P2_TASK__INSTALLABLE_UNITS:
      return installableUnits != null && !installableUnits.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  private static Set<String> getInstalledUnits()
  {
    Set<String> result = new HashSet<String>();
    ProvisioningUI provisioningUI = ProvisioningUI.getDefaultUI();
    ProvisioningSession session = provisioningUI.getSession();
    String profileId = provisioningUI.getProfileId();
    IProfile profile = ProvUI.getProfileRegistry(session).getProfile(profileId);
    IQueryResult<IInstallableUnit> queryResult = profile.query(QueryUtil.createIUAnyQuery(), null);

    for (IInstallableUnit installableUnit : queryResult)
    {
      result.add(installableUnit.getId());
    }

    return result;
  }

  private static Set<String> getKnownRepositories()
  {
    Set<String> result = new HashSet<String>();
    ProvisioningUI provisioningUI = ProvisioningUI.getDefaultUI();
    ProvisioningSession session = provisioningUI.getSession();
    for (URI knowRepository : provisioningUI.getRepositoryTracker().getKnownRepositories(session))
    {
      result.add(knowRepository.toString());
    }
    return result;
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    if (SKIP)
    {
      return false;
    }

    if (!Activator.SETUP_IDE)
    {
      return true;
    }

    Set<String> installedUnits = getInstalledUnits();
    for (InstallableUnit installableUnit : getInstallableUnits())
    {
      String id = context.expandString(installableUnit.getID());
      if (!installedUnits.contains(id))
      {
        if (neededInstallableUnits == null)
        {
          neededInstallableUnits = new HashSet<String>();
        }
        neededInstallableUnits.add(id);
      }
    }

    Set<String> knownRepositories = getKnownRepositories();
    for (P2Repository p2Repository : getP2Repositories())
    {
      String url = context.redirect(
          org.eclipse.emf.common.util.URI.createURI(context.expandString(p2Repository.getURL()))).toString();
      if (!knownRepositories.contains(url))
      {
        return true;
      }
    }

    return neededInstallableUnits != null;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    if (Activator.SETUP_IDE)
    {
      ProgressLogMonitor monitor = new ProgressLogMonitor(context);

      ProvisioningUI provisioningUI = ProvisioningUI.getDefaultUI();
      ProvisioningSession session = provisioningUI.getSession();
      IMetadataRepositoryManager manager = (IMetadataRepositoryManager)session.getProvisioningAgent().getService(
          IMetadataRepositoryManager.SERVICE_NAME);
      RepositoryTracker repositoryTracker = provisioningUI.getRepositoryTracker();

      Set<String> knownRepositories = getKnownRepositories();
      Set<IMetadataRepository> repositories = new HashSet<IMetadataRepository>();
      List<URI> repos = new ArrayList<URI>();
      for (P2Repository p2Repository : getP2Repositories())
      {
        String url = context.redirect(
            org.eclipse.emf.common.util.URI.createURI(context.expandString(p2Repository.getURL()))).toString();
        URI uri = new URI(url);
        context.log("Using repository " + uri);
        if (neededInstallableUnits == null)
        {
          if (!knownRepositories.contains(url))
          {
            IMetadataRepository repository = manager.loadRepository(uri, monitor);
            repositoryTracker.addRepository(uri, repository.getName(), session);
          }
        }
        else
        {
          repos.add(uri);

          IMetadataRepository repository = manager.loadRepository(uri, monitor);
          repositories.add(repository);

          if (!knownRepositories.contains(url))
          {
            repositoryTracker.addRepository(uri, repository.getName(), session);
          }
        }
      }

      if (neededInstallableUnits != null)
      {
        List<IInstallableUnit> toInstall = new ArrayList<IInstallableUnit>();
        for (String installableUnit : neededInstallableUnits)
        {
          IQuery<IInstallableUnit> iuQuery = QueryUtil.createIUQuery(installableUnit);
          IInstallableUnit candidate = null;
          for (IMetadataRepository repository : repositories)
          {
            IQueryResult<IInstallableUnit> queryResult = repository.query(iuQuery, monitor);
            for (IInstallableUnit installableUnitMatch : queryResult)
            {
              if (candidate == null || candidate.getVersion().compareTo(installableUnitMatch.getVersion()) < 0)
              {
                candidate = installableUnitMatch;
              }

              break;
            }
          }

          if (candidate != null)
          {
            toInstall.add(candidate);
          }
          else
          {
            // This will fail.
            // TODO
            InstallableUnitDescription installableUnitDescription = new InstallableUnitDescription();
            installableUnitDescription.setId(installableUnit);
            toInstall.add(MetadataFactory.createInstallableUnit(installableUnitDescription));
          }
        }

        context.log("Resolving...");
        InstallOperation installOperation = new InstallOperation(session, toInstall);
        String profileId = provisioningUI.getProfileId();
        installOperation.setProfileId(profileId);

        ProvisioningContext provisioningContext = makeProvisioningContext(session, repos);
        installOperation.setProvisioningContext(provisioningContext);

        IStatus status = installOperation.resolveModal(monitor);
        if (status.isOK())
        {
          IProvisioningPlan provisioningPlan = installOperation.getProvisioningPlan();
          processLicenses(context, provisioningPlan, monitor);

          ProvisioningJob provisioningJob = installOperation.getProvisioningJob(null);
          provisioningJob.run(monitor);
        }
        else
        {
          context.log(status);
          throw new CoreException(Status.CANCEL_STATUS);
        }

        context.setRestartNeeded("New software has been installed.");
      }
    }
    else
    {
      callDirectorApp(context);
    }
  }

  private void processLicenses(SetupTaskContext context, IProvisioningPlan provisioningPlan, IProgressMonitor monitor)
      throws Exception
  {
    final Preferences preferences = context.getSetup().getPreferences();
    HashSet<String> acceptedLicenses = new HashSet<String>(preferences.getAcceptedLicenses());
    final Map<ILicense, List<IInstallableUnit>> licensesToIUs = new HashMap<ILicense, List<IInstallableUnit>>();

    IQueryable<IInstallableUnit> queryable = provisioningPlan.getAdditions();
    IQueryResult<IInstallableUnit> result = queryable.query(QueryUtil.ALL_UNITS, monitor);
    for (IInstallableUnit installableUnit : result)
    {
      Collection<ILicense> licenses = installableUnit.getLicenses(null);
      for (ILicense license : licenses)
      {
        String uuid = license.getUUID();
        if (acceptedLicenses.contains(uuid))
        {
          continue;
        }

        List<IInstallableUnit> ius = licensesToIUs.get(license);
        if (ius == null)
        {
          ius = new ArrayList<IInstallableUnit>();
          licensesToIUs.put(license, ius);
        }

        ius.add(installableUnit);
      }
    }

    if (!licensesToIUs.isEmpty())
    {
      final Exception exception[] = { null };
      Display.getDefault().syncExec(new Runnable()
      {
        public void run()
        {
          try
          {
            LicenseDialog dialog = new LicenseDialog(null, licensesToIUs);
            if (dialog.open() == LicenseDialog.OK)
            {
              if (dialog.isRememberAcceptedLicenses())
              {
                for (ILicense license : licensesToIUs.keySet())
                {
                  preferences.getAcceptedLicenses().add(license.getUUID());
                }

                int xxx;
                // preferences.eResource().save(null);
              }
            }
            else
            {
              throw new UnsupportedOperationException("Licenses have been declined");
            }
          }
          catch (Exception ex)
          {
            exception[0] = ex;
          }
        }
      });

      if (exception[0] != null)
      {
        throw exception[0];
      }
    }
  }

  private ProvisioningContext makeProvisioningContext(ProvisioningSession session, Collection<URI> repositories)
  {
    URI[] repos = repositories.toArray(new URI[repositories.size()]);
    ProvisioningContext context = new ProvisioningContext(session.getProvisioningAgent());
    context.setMetadataRepositories(repos);
    context.setArtifactRepositories(repos);
    return context;
  }

  // public void computeRemediationOperation(ProfileChangeOperation op, ProvisioningUI ui, IProgressMonitor monitor) {
  // SubMonitor sub = SubMonitor.convert(monitor, ProvUIMessages.ProvisioningOperationWizard_Remediation_Operation,
  // RemedyConfig.getAllRemedyConfigs().length);
  // monitor.setTaskName(ProvUIMessages.ProvisioningOperationWizard_Remediation_Operation);
  // remediationOperation = new RemediationOperation(ui.getSession(), op.getProfileChangeRequest());
  // remediationOperation.resolveModal(monitor);
  // sub.done();
  // }

  private void callDirectorApp(final SetupTaskContext context) throws Exception
  {
    if (getScope() == SetupTaskScope.ECLIPSE)
    {
      FileUtil.delete(context.getP2ProfileDir(), new ProgressLogMonitor(context));
    }

    String destination = context.getEclipseDir().toString();
    String bundlePool = context.getP2PoolDir().toString();
    String bundleAgent = context.getP2AgentDir().toString();

    String os = Platform.getOS();
    String ws = Platform.getWS();
    String arch = Platform.getOSArch();

    EList<P2Repository> p2Repositories = getP2Repositories();
    EList<InstallableUnit> installableUnits = getInstallableUnits();

    context.log("Calling director to install " + installableUnits.size()
        + (installableUnits.size() == 1 ? " unit" : " units") + " from " + p2Repositories.size()
        + (p2Repositories.size() == 1 ? " repository" : " repositories") + " to " + destination);

    new File(destination).mkdirs();

    String repositories = makeList(context, p2Repositories, SetupPackage.Literals.P2_REPOSITORY__URL);
    for (String repository : repositories.split(","))
    {
      context.log("Using repository " + repository);
    }

    context.log("Executing p2 director...");

    String ius = makeList(context, installableUnits, SetupPackage.Literals.INSTALLABLE_UNIT__ID);

    String[] args = { "-destination", destination, "-repository", repositories, "-installIU", ius, "-profile",
        context.getP2ProfileName(), "-profileProperties", "org.eclipse.update.install.features=true", "-bundlepool",
        bundlePool, "-shared", bundleAgent, "-p2.os", os, "-p2.ws", ws, "-p2.arch", arch };

    DirectorApplication app = new DirectorApplication()
    {
      @Override
      public Object run(String[] args)
      {
        long time = System.currentTimeMillis();

        try
        {
          processArguments(args);
          initializeServices();

          final IProvisioningAgent targetAgent = getTargetAgent();
          IPlanner planner = new IPlanner()
          {
            IPlanner delegate = (IPlanner)targetAgent.getService(IPlanner.SERVICE_NAME);

            public IProvisioningPlan getProvisioningPlan(IProfileChangeRequest profileChangeRequest,
                ProvisioningContext provisioningContext, IProgressMonitor monitor)
            {
              IProvisioningPlan provisioningPlan = delegate.getProvisioningPlan(profileChangeRequest,
                  provisioningContext, monitor);

              try
              {
                processLicenses(context, provisioningPlan, monitor);
              }
              catch (Exception ex)
              {
                throw new RuntimeException(ex);
              }

              return provisioningPlan;
            }

            public IProvisioningPlan getDiffPlan(IProfile currentProfile, IProfile targetProfile,
                IProgressMonitor monitor)
            {
              return delegate.getDiffPlan(currentProfile, targetProfile, monitor);
            }

            public IProfileChangeRequest createChangeRequest(IProfile profileToChange)
            {
              return delegate.createChangeRequest(profileToChange);
            }

            public IQueryResult<IInstallableUnit> updatesFor(IInstallableUnit iu, ProvisioningContext context,
                IProgressMonitor monitor)
            {
              return delegate.updatesFor(iu, context, monitor);
            }
          };

          targetAgent.registerService(IPlanner.SERVICE_NAME, planner);

          Field field = ReflectUtil.getField(DirectorApplication.class, "planner");
          ReflectUtil.setValue(field, this, planner);

          initializeRepositories();
          performProvisioningActions();

          printMessage(NLS.bind(Messages.Operation_complete, new Long(System.currentTimeMillis() - time)));
          return IApplication.EXIT_OK;
        }
        catch (CoreException e)
        {
          printMessage(Messages.Operation_failed);
          deeplyPrint(e.getStatus(), System.err, 0);
          Activator.log(e.getStatus());
          return EXIT_ERROR;
        }
        finally
        {
          cleanupRepositories();
          cleanupServices();
        }
      }

      private IProvisioningAgent getTargetAgent()
      {
        Field field = ReflectUtil.getField(DirectorApplication.class, "targetAgent");
        return (IProvisioningAgent)ReflectUtil.getValue(field, this);
      }

      private void initializeServices()
      {
        Method method = ReflectUtil.getMethod(DirectorApplication.class, "initializeServices");
        ReflectUtil.invokeMethod(method, this);
      }

      private void performProvisioningActions()
      {
        Method method = ReflectUtil.getMethod(DirectorApplication.class, "performProvisioningActions");
        ReflectUtil.invokeMethod(method, this);
      }

      private void initializeRepositories()
      {
        Method method = ReflectUtil.getMethod(DirectorApplication.class, "initializeRepositories");
        ReflectUtil.invokeMethod(method, this);
      }

      private void cleanupServices()
      {
        Method method = ReflectUtil.getMethod(DirectorApplication.class, "cleanupServices");
        ReflectUtil.invokeMethod(method, this);
      }

      private void cleanupRepositories()
      {
        Method method = ReflectUtil.getMethod(DirectorApplication.class, "cleanupRepositories");
        ReflectUtil.invokeMethod(method, this);
      }

      private void deeplyPrint(IStatus status, PrintStream err, int i)
      {
        Method method = ReflectUtil.getMethod(DirectorApplication.class, "deeplyPrint", IStatus.class,
            PrintStream.class, int.class);
        ReflectUtil.invokeMethod(method, this, status, err, i);
      }

      private void printMessage(String str)
      {
        Method method = ReflectUtil.getMethod(DirectorApplication.class, "printMessage", String.class);
        ReflectUtil.invokeMethod(method, this, str);
      }
    };

    app.setLog(new ILog()
    {
      public void log(String message)
      {
        if (context.isCancelled())
        {
          throw new OperationCanceledException();
        }

        context.log(message);
      }

      public void log(IStatus status)
      {
        context.log(status);
      }

      public void close()
      {
      }
    });

    Object exitCode = app.run(args);
    if (EXIT_ERROR.equals(exitCode))
    {
      throw new CoreException(Status.CANCEL_STATUS);
    }
  }

  private static final Integer EXIT_ERROR = 13;

  private String makeList(SetupTaskContext context, EList<? extends EObject> objects, EAttribute attribute)
  {
    StringBuilder builder = new StringBuilder();
    for (EObject object : objects)
    {
      if (builder.length() > 0)
      {
        builder.append(',');
      }

      String value = (String)object.eGet(attribute);
      value = context.expandString(value);
      if (attribute == SetupPackage.Literals.P2_REPOSITORY__URL)
      {
        value = context.redirect(org.eclipse.emf.common.util.URI.createURI(value)).toString();
      }

      builder.append(value);
    }

    return builder.toString();
  }

} // InstallTaskImpl
