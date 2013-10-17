package org.eclipse.emf.cdo.releng.setup.impl;

import org.eclipse.emf.cdo.releng.setup.ApiBaselineTask;
import org.eclipse.emf.cdo.releng.setup.SetupPackage;
import org.eclipse.emf.cdo.releng.setup.SetupTaskContext;
import org.eclipse.emf.cdo.releng.setup.Trigger;
import org.eclipse.emf.cdo.releng.setup.util.DownloadUtil;
import org.eclipse.emf.cdo.releng.setup.util.log.ProgressLogMonitor;

import org.eclipse.net4j.util.io.ZIPUtil;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.core.runtime.Path;
import org.eclipse.pde.api.tools.internal.ApiBaselineManager;
import org.eclipse.pde.api.tools.internal.model.ApiModelFactory;
import org.eclipse.pde.api.tools.internal.provisional.ApiPlugin;
import org.eclipse.pde.api.tools.internal.provisional.IApiBaselineManager;
import org.eclipse.pde.api.tools.internal.provisional.model.IApiBaseline;

import java.io.File;
import java.io.InputStream;
import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api Baseline Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.releng.setup.impl.ApiBaselineTaskImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.releng.setup.impl.ApiBaselineTaskImpl#getZipLocation <em>Zip Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApiBaselineTaskImpl extends SetupTaskImpl implements ApiBaselineTask
{
  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getZipLocation() <em>Zip Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZipLocation()
   * @generated
   * @ordered
   */
  protected static final String ZIP_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getZipLocation() <em>Zip Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZipLocation()
   * @generated
   * @ordered
   */
  protected String zipLocation = ZIP_LOCATION_EDEFAULT;

  private transient String baselineName;

  private transient File baselineDir;

  private transient Object cachedBaseline;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApiBaselineTaskImpl()
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
    return SetupPackage.Literals.API_BASELINE_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.API_BASELINE_TASK__VERSION, oldVersion,
          version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getZipLocation()
  {
    return zipLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZipLocation(String newZipLocation)
  {
    String oldZipLocation = zipLocation;
    zipLocation = newZipLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.API_BASELINE_TASK__ZIP_LOCATION,
          oldZipLocation, zipLocation));
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
    case SetupPackage.API_BASELINE_TASK__VERSION:
      return getVersion();
    case SetupPackage.API_BASELINE_TASK__ZIP_LOCATION:
      return getZipLocation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case SetupPackage.API_BASELINE_TASK__VERSION:
      setVersion((String)newValue);
      return;
    case SetupPackage.API_BASELINE_TASK__ZIP_LOCATION:
      setZipLocation((String)newValue);
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
    case SetupPackage.API_BASELINE_TASK__VERSION:
      setVersion(VERSION_EDEFAULT);
      return;
    case SetupPackage.API_BASELINE_TASK__ZIP_LOCATION:
      setZipLocation(ZIP_LOCATION_EDEFAULT);
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
    case SetupPackage.API_BASELINE_TASK__VERSION:
      return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
    case SetupPackage.API_BASELINE_TASK__ZIP_LOCATION:
      return ZIP_LOCATION_EDEFAULT == null ? zipLocation != null : !ZIP_LOCATION_EDEFAULT.equals(zipLocation);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (version: ");
    result.append(version);
    result.append(", zipLocation: ");
    result.append(zipLocation);
    result.append(')');
    return result.toString();
  }

  @Override
  public Set<Trigger> getValidTriggers()
  {
    return Trigger.IDE_TRIGGERS;
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    baselineName = context.getSetup().getBranch().getProject().getName() + " Baseline";
    baselineDir = new File(new File(context.getProjectDir(), ".baselines"), getVersion());

    IApiBaselineManager baselineManager = ApiPlugin.getDefault().getApiBaselineManager();
    IApiBaseline baseline = baselineManager.getApiBaseline(baselineName);
    if (baseline == null)
    {
      return true;
    }

    ((ApiBaselineManager)baselineManager).loadBaselineInfos(baseline);

    if (!new File(baseline.getLocation()).equals(baselineDir))
    {
      baselineManager.removeApiBaseline(baselineName);
      baseline.setName(baselineName + " " + System.currentTimeMillis());
      baselineManager.addApiBaseline(baseline);
      return true;
    }

    if (baselineManager.getDefaultApiBaseline() != baseline)
    {
      cachedBaseline = baseline;
      return true;
    }

    return false;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    IApiBaselineManager baselineManager = ApiPlugin.getDefault().getApiBaselineManager();
    IApiBaseline baseline = (IApiBaseline)cachedBaseline;
    if (baseline == null)
    {
      if (!baselineDir.exists())
      {
        downloadAndUnzip(context);
      }

      String location = baselineDir.toString();
      context.log("Creating API baseline from " + location);

      baseline = ApiModelFactory.newApiBaseline(baselineName, location);
      ApiModelFactory.addComponents(baseline, location, new ProgressLogMonitor(context));
      baselineManager.addApiBaseline(baseline);
    }

    context.log("Activating API baseline: " + baselineName);
    baselineManager.setDefaultApiBaseline(baselineName);
  }

  private void downloadAndUnzip(final SetupTaskContext context)
  {
    final File baselinesDir = baselineDir.getParentFile();
    baselinesDir.mkdirs();

    File zipFile = DownloadUtil.downloadURL(getZipLocation(), context);

    final File[] rootDir = { null };
    ZIPUtil.unzip(zipFile, new ZIPUtil.FileSystemUnzipHandler(baselinesDir, ZIPUtil.DEFAULT_BUFFER_SIZE)
    {
      @Override
      public void unzipFile(String name, InputStream zipStream)
      {
        if (rootDir[0] == null)
        {
          rootDir[0] = new File(baselinesDir, new Path(name).segment(0));
        }

        context.log("Unzipping " + name);
        super.unzipFile(name, zipStream);
      }
    });

    rootDir[0].renameTo(baselineDir);
  }

} // ApiBaselineTaskImpl
