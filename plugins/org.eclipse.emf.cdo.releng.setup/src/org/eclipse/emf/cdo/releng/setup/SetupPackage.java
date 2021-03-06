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
package org.eclipse.emf.cdo.releng.setup;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.cdo.releng.setup.SetupFactory
 * @model kind="package"
 * @generated
 */
public interface SetupPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "setup";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/CDO/releng/setup/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "setup";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SetupPackage eINSTANCE = org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.TopLevelElement <em>Top Level Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.TopLevelElement
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getTopLevelElement()
   * @generated
   */
  int TOP_LEVEL_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Tool Version</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_ELEMENT__TOOL_VERSION = 0;

  /**
   * The number of structural features of the '<em>Top Level Element</em>' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.SetupTaskContainerImpl <em>Task Container</em>}' class.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupTaskContainerImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getSetupTaskContainer()
   * @generated
   */
  int SETUP_TASK_CONTAINER = 9;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.ConfigurationImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getConfiguration()
   * @generated
   */
  int CONFIGURATION = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.ProjectImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.BranchImpl <em>Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.BranchImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getBranch()
   * @generated
   */
  int BRANCH = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.InstallableUnitImpl <em>Installable Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.InstallableUnitImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getInstallableUnit()
   * @generated
   */
  int INSTALLABLE_UNIT = 14;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.P2RepositoryImpl <em>P2 Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.P2RepositoryImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getP2Repository()
   * @generated
   */
  int P2_REPOSITORY = 15;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.PreferencesImpl <em>Preferences</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.PreferencesImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getPreferences()
   * @generated
   */
  int PREFERENCES = 6;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.SetupTaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getSetupTask()
   * @generated
   */
  int SETUP_TASK = 8;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.LinkLocationTaskImpl <em>Link Location Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.LinkLocationTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getLinkLocationTask()
   * @generated
   */
  int LINK_LOCATION_TASK = 12;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.EclipsePreferenceTaskImpl <em>Eclipse Preference Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.EclipsePreferenceTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getEclipsePreferenceTask()
   * @generated
   */
  int ECLIPSE_PREFERENCE_TASK = 28;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.SetupImpl <em>Setup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getSetup()
   * @generated
   */
  int SETUP = 7;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.P2TaskImpl <em>P2 Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.P2TaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getP2Task()
   * @generated
   */
  int P2_TASK = 13;

  /**
   * The feature id for the '<em><b>Setup Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP_TASK_CONTAINER__SETUP_TASKS = 0;

  /**
   * The number of structural features of the '<em>Task Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP_TASK_CONTAINER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ConfigurableItemImpl <em>Configurable Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.ConfigurableItemImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getConfigurableItem()
   * @generated
   */
  int CONFIGURABLE_ITEM = 3;

  /**
   * The feature id for the '<em><b>Setup Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_ITEM__SETUP_TASKS = SETUP_TASK_CONTAINER__SETUP_TASKS;

  /**
   * The number of structural features of the '<em>Configurable Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_ITEM_FEATURE_COUNT = SETUP_TASK_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.EclipseImpl <em>Eclipse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.EclipseImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getEclipse()
   * @generated
   */
  int ECLIPSE = 1;

  /**
   * The feature id for the '<em><b>Setup Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE__SETUP_TASKS = CONFIGURABLE_ITEM__SETUP_TASKS;

  /**
   * The feature id for the '<em><b>Configuration</b></em>' container reference.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE__CONFIGURATION = CONFIGURABLE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE__VERSION = CONFIGURABLE_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Eclipse</em>' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_FEATURE_COUNT = CONFIGURABLE_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tool Version</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__TOOL_VERSION = TOP_LEVEL_ELEMENT__TOOL_VERSION;

  /**
   * The feature id for the '<em><b>Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__PROJECTS = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Eclipse Versions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__ECLIPSE_VERSIONS = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Configuration</em>' class.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FEATURE_COUNT = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Setup Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__SETUP_TASKS = CONFIGURABLE_ITEM__SETUP_TASKS;

  /**
   * The feature id for the '<em><b>Tool Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__TOOL_VERSION = CONFIGURABLE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Configuration</b></em>' container reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__CONFIGURATION = CONFIGURABLE_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__BRANCHES = CONFIGURABLE_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = CONFIGURABLE_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__LABEL = CONFIGURABLE_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = CONFIGURABLE_ITEM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Setup Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__SETUP_TASKS = CONFIGURABLE_ITEM__SETUP_TASKS;

  /**
   * The feature id for the '<em><b>Project</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__PROJECT = CONFIGURABLE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__NAME = CONFIGURABLE_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_FEATURE_COUNT = CONFIGURABLE_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Setup Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES__SETUP_TASKS = SETUP_TASK_CONTAINER__SETUP_TASKS;

  /**
   * The feature id for the '<em><b>Tool Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES__TOOL_VERSION = SETUP_TASK_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>User Name</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES__USER_NAME = SETUP_TASK_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Install Folder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES__INSTALL_FOLDER = SETUP_TASK_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Git Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES__GIT_PREFIX = SETUP_TASK_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Accepted Licenses</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES__ACCEPTED_LICENSES = SETUP_TASK_CONTAINER_FEATURE_COUNT + 4;

  /**
  	 * The number of structural features of the '<em>Preferences</em>' class.
  	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
  	 * @generated
  	 * @ordered
  	 */
  int PREFERENCES_FEATURE_COUNT = SETUP_TASK_CONTAINER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Tool Version</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP__TOOL_VERSION = TOP_LEVEL_ELEMENT__TOOL_VERSION;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ApiBaselineTaskImpl <em>Api Baseline Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.ApiBaselineTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getApiBaselineTask()
   * @generated
   */
  int API_BASELINE_TASK = 25;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.GitCloneTaskImpl <em>Git Clone Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.GitCloneTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getGitCloneTask()
   * @generated
   */
  int GIT_CLONE_TASK = 26;

  /**
   * The feature id for the '<em><b>Branch</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP__BRANCH = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Eclipse Version</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP__ECLIPSE_VERSION = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Preferences</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP__PREFERENCES = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Setup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP_FEATURE_COUNT = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP_TASK__REQUIREMENTS = 0;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP_TASK__RESTRICTIONS = 1;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP_TASK__DISABLED = 2;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP_TASK__SCOPE = 3;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP_TASK__EXCLUDED_TRIGGERS = 4;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP_TASK__DOCUMENTATION = 5;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP_TASK_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.WorkingSetTaskImpl <em>Working Set Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.WorkingSetTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getWorkingSetTask()
   * @generated
   */
  int WORKING_SET_TASK = 29;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.CompoundSetupTaskImpl <em>Compound Setup Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.CompoundSetupTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getCompoundSetupTask()
   * @generated
   */
  int COMPOUND_SETUP_TASK = 10;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_SETUP_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_SETUP_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_SETUP_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_SETUP_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_SETUP_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_SETUP_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Setup Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_SETUP_TASK__SETUP_TASKS = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_SETUP_TASK__NAME = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Compound Setup Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_SETUP_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.BuckminsterImportTaskImpl <em>Buckminster Import Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.BuckminsterImportTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getBuckminsterImportTask()
   * @generated
   */
  int BUCKMINSTER_IMPORT_TASK = 17;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.EclipseIniTaskImpl <em>Eclipse Ini Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.EclipseIniTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getEclipseIniTask()
   * @generated
   */
  int ECLIPSE_INI_TASK = 11;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_INI_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_INI_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_INI_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_INI_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_INI_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_INI_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_INI_TASK__OPTION = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_INI_TASK__VALUE = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Vm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_INI_TASK__VM = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Eclipse Ini Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_INI_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_LOCATION_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_LOCATION_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_LOCATION_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_LOCATION_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_LOCATION_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_LOCATION_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_LOCATION_TASK__PATH = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_LOCATION_TASK__NAME = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Link Location Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_LOCATION_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P2_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P2_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P2_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P2_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P2_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P2_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>P2 Repositories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P2_TASK__P2_REPOSITORIES = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Installable Units</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P2_TASK__INSTALLABLE_UNITS = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>P2 Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P2_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLABLE_UNIT__ID = 0;

  /**
   * The number of structural features of the '<em>Installable Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLABLE_UNIT_FEATURE_COUNT = 1;

  /**
   * The feature id for the '<em><b>URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P2_REPOSITORY__URL = 0;

  /**
   * The number of structural features of the '<em>P2 Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P2_REPOSITORY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.BasicMaterializationTaskImpl <em>Basic Materialization Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.BasicMaterializationTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getBasicMaterializationTask()
   * @generated
   */
  int BASIC_MATERIALIZATION_TASK = 16;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MATERIALIZATION_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MATERIALIZATION_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MATERIALIZATION_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MATERIALIZATION_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MATERIALIZATION_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MATERIALIZATION_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Target Platform</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MATERIALIZATION_TASK__TARGET_PLATFORM = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bundle Pool</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MATERIALIZATION_TASK__BUNDLE_POOL = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Basic Materialization Task</em>' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MATERIALIZATION_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCKMINSTER_IMPORT_TASK__REQUIREMENTS = BASIC_MATERIALIZATION_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCKMINSTER_IMPORT_TASK__RESTRICTIONS = BASIC_MATERIALIZATION_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCKMINSTER_IMPORT_TASK__DISABLED = BASIC_MATERIALIZATION_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCKMINSTER_IMPORT_TASK__SCOPE = BASIC_MATERIALIZATION_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCKMINSTER_IMPORT_TASK__EXCLUDED_TRIGGERS = BASIC_MATERIALIZATION_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCKMINSTER_IMPORT_TASK__DOCUMENTATION = BASIC_MATERIALIZATION_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Target Platform</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCKMINSTER_IMPORT_TASK__TARGET_PLATFORM = BASIC_MATERIALIZATION_TASK__TARGET_PLATFORM;

  /**
   * The feature id for the '<em><b>Bundle Pool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCKMINSTER_IMPORT_TASK__BUNDLE_POOL = BASIC_MATERIALIZATION_TASK__BUNDLE_POOL;

  /**
   * The feature id for the '<em><b>Mspec</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCKMINSTER_IMPORT_TASK__MSPEC = BASIC_MATERIALIZATION_TASK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Buckminster Import Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUCKMINSTER_IMPORT_TASK_FEATURE_COUNT = BASIC_MATERIALIZATION_TASK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ResourceCopyTaskImpl <em>Resource Copy Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.ResourceCopyTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getResourceCopyTask()
   * @generated
   */
  int RESOURCE_COPY_TASK = 30;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.TextModifyTaskImpl <em>Text Modify Task</em>}' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.TextModifyTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getTextModifyTask()
   * @generated
   */
  int TEXT_MODIFY_TASK = 32;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.TextModificationImpl <em>Text Modification</em>}' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.TextModificationImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getTextModification()
   * @generated
   */
  int TEXT_MODIFICATION = 33;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.KeyBindingTaskImpl <em>Key Binding Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.KeyBindingTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getKeyBindingTask()
   * @generated
   */
  int KEY_BINDING_TASK = 34;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.CommandParameterImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getCommandParameter()
   * @generated
   */
  int COMMAND_PARAMETER = 35;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ContextVariableTaskImpl <em>Context Variable Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.ContextVariableTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getContextVariableTask()
   * @generated
   */
  int CONTEXT_VARIABLE_TASK = 24;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ResourceCreationTaskImpl <em>Resource Creation Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.ResourceCreationTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getResourceCreationTask()
   * @generated
   */
  int RESOURCE_CREATION_TASK = 31;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.MaterializationTaskImpl <em>Materialization Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.MaterializationTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getMaterializationTask()
   * @generated
   */
  int MATERIALIZATION_TASK = 18;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK__REQUIREMENTS = BASIC_MATERIALIZATION_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK__RESTRICTIONS = BASIC_MATERIALIZATION_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK__DISABLED = BASIC_MATERIALIZATION_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK__SCOPE = BASIC_MATERIALIZATION_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK__EXCLUDED_TRIGGERS = BASIC_MATERIALIZATION_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK__DOCUMENTATION = BASIC_MATERIALIZATION_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Target Platform</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK__TARGET_PLATFORM = BASIC_MATERIALIZATION_TASK__TARGET_PLATFORM;

  /**
   * The feature id for the '<em><b>Bundle Pool</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK__BUNDLE_POOL = BASIC_MATERIALIZATION_TASK__BUNDLE_POOL;

  /**
   * The feature id for the '<em><b>Root Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK__ROOT_COMPONENTS = BASIC_MATERIALIZATION_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source Locators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK__SOURCE_LOCATORS = BASIC_MATERIALIZATION_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>P2 Repositories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK__P2_REPOSITORIES = BASIC_MATERIALIZATION_TASK_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Materialization Task</em>' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIALIZATION_TASK_FEATURE_COUNT = BASIC_MATERIALIZATION_TASK_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.SourceLocatorImpl <em>Source Locator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.SourceLocatorImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getSourceLocator()
   * @generated
   */
  int SOURCE_LOCATOR = 20;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.ComponentImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 2;

  /**
   * The number of structural features of the '<em>Source Locator</em>' class.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_LOCATOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.MylynQueryTaskImpl <em>Mylyn Query Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.MylynQueryTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getMylynQueryTask()
   * @generated
   */
  int MYLYN_QUERY_TASK = 36;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.AutomaticSourceLocatorImpl <em>Automatic Source Locator</em>}' class.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.AutomaticSourceLocatorImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getAutomaticSourceLocator()
   * @generated
   */
  int AUTOMATIC_SOURCE_LOCATOR = 22;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ManualSourceLocatorImpl <em>Manual Source Locator</em>}' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.ManualSourceLocatorImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getManualSourceLocator()
   * @generated
   */
  int MANUAL_SOURCE_LOCATOR = 21;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_SOURCE_LOCATOR__LOCATION = SOURCE_LOCATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Component Name Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_SOURCE_LOCATOR__COMPONENT_NAME_PATTERN = SOURCE_LOCATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Component Types</b></em>' attribute list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_SOURCE_LOCATOR__COMPONENT_TYPES = SOURCE_LOCATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Manual Source Locator</em>' class.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_SOURCE_LOCATOR_FEATURE_COUNT = SOURCE_LOCATOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Root Folder</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATIC_SOURCE_LOCATOR__ROOT_FOLDER = SOURCE_LOCATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Automatic Source Locator</em>' class.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTOMATIC_SOURCE_LOCATOR_FEATURE_COUNT = SOURCE_LOCATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.RedirectionTaskImpl <em>Redirection Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.RedirectionTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getRedirectionTask()
   * @generated
   */
  int REDIRECTION_TASK = 23;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTION_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTION_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTION_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTION_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTION_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTION_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Source URL</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTION_TASK__SOURCE_URL = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target URL</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTION_TASK__TARGET_URL = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Redirection Task</em>' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTION_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
          	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE_TASK__NAME = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE_TASK__VALUE = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>String Substitution</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE_TASK__STRING_SUBSTITUTION = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Context Variable Task</em>' class.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_BASELINE_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_BASELINE_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_BASELINE_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_BASELINE_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_BASELINE_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_BASELINE_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_BASELINE_TASK__VERSION = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Zip Location</b></em>' attribute.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_BASELINE_TASK__ZIP_LOCATION = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Api Baseline Task</em>' class.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_BASELINE_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIT_CLONE_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIT_CLONE_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIT_CLONE_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIT_CLONE_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIT_CLONE_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIT_CLONE_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIT_CLONE_TASK__LOCATION = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Remote Name</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIT_CLONE_TASK__REMOTE_NAME = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Remote URI</b></em>' attribute.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIT_CLONE_TASK__REMOTE_URI = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Checkout Branch</b></em>' attribute.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIT_CLONE_TASK__CHECKOUT_BRANCH = SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Git Clone Task</em>' class.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIT_CLONE_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ProjectSetImportTaskImpl <em>Project Set Import Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.impl.ProjectSetImportTaskImpl
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getProjectSetImportTask()
   * @generated
   */
  int PROJECT_SET_IMPORT_TASK = 27;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_SET_IMPORT_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_SET_IMPORT_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_SET_IMPORT_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_SET_IMPORT_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_SET_IMPORT_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_SET_IMPORT_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>URL</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_SET_IMPORT_TASK__URL = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Project Set Import Task</em>' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_SET_IMPORT_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_PREFERENCE_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_PREFERENCE_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_PREFERENCE_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_PREFERENCE_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_PREFERENCE_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_PREFERENCE_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_PREFERENCE_TASK__KEY = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_PREFERENCE_TASK__VALUE = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Eclipse Preference Task</em>' class.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSE_PREFERENCE_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_SET_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_SET_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_SET_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_SET_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_SET_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_SET_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Working Sets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
           * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_SET_TASK__WORKING_SETS = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Working Set Task</em>' class.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_SET_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_COPY_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_COPY_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_COPY_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_COPY_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_COPY_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_COPY_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Source URL</b></em>' attribute.
   * <!-- begin-user-doc -->
            	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_COPY_TASK__SOURCE_URL = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target URL</b></em>' attribute.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_COPY_TASK__TARGET_URL = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Resource Copy Task</em>' class.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_COPY_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CREATION_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CREATION_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CREATION_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CREATION_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CREATION_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CREATION_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CREATION_TASK__CONTENT = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target URL</b></em>' attribute.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CREATION_TASK__TARGET_URL = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CREATION_TASK__ENCODING = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Resource Creation Task</em>' class.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CREATION_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFY_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFY_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFY_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFY_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFY_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFY_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>URL</b></em>' attribute.
   * <!-- begin-user-doc -->
            	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFY_TASK__URL = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Modifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFY_TASK__MODIFICATIONS = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Text Modify Task</em>' class.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFY_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFICATION__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFICATION__SUBSTITUTIONS = 1;

  /**
   * The number of structural features of the '<em>Text Modification</em>' class.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_MODIFICATION_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Scheme</b></em>' attribute.
   * <!-- begin-user-doc -->
           * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__SCHEME = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__CONTEXT = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Platform</b></em>' attribute.
   * <!-- begin-user-doc -->
          	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__PLATFORM = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Locale</b></em>' attribute.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__LOCALE = SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Keys</b></em>' attribute.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__KEYS = SETUP_TASK_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__COMMAND = SETUP_TASK_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Command Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__COMMAND_PARAMETERS = SETUP_TASK_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Key Binding Task</em>' class.
   * <!-- begin-user-doc -->
            	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER__ID = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Command Parameter</em>' class.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYLYN_QUERY_TASK__REQUIREMENTS = SETUP_TASK__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYLYN_QUERY_TASK__RESTRICTIONS = SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYLYN_QUERY_TASK__DISABLED = SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYLYN_QUERY_TASK__SCOPE = SETUP_TASK__SCOPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYLYN_QUERY_TASK__EXCLUDED_TRIGGERS = SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYLYN_QUERY_TASK__DOCUMENTATION = SETUP_TASK__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Connector Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYLYN_QUERY_TASK__CONNECTOR_KIND = SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYLYN_QUERY_TASK__SUMMARY = SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Repository URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYLYN_QUERY_TASK__REPOSITORY_URL = SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Relative URL</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYLYN_QUERY_TASK__RELATIVE_URL = SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Mylyn Query Task</em>' class.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYLYN_QUERY_TASK_FEATURE_COUNT = SETUP_TASK_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.SetupTaskScope <em>Task Scope</em>}' enum.
   * <!-- begin-user-doc -->
                     * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.SetupTaskScope
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getSetupTaskScope()
   * @generated
   */
  int SETUP_TASK_SCOPE = 37;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.Trigger <em>Trigger</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.Trigger
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getTrigger()
   * @generated
   */
  int TRIGGER = 38;

  /**
   * The meta object id for the '{@link org.eclipse.emf.cdo.releng.setup.ComponentType <em>Component Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.cdo.releng.setup.ComponentType
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getComponentType()
   * @generated
   */
  int COMPONENT_TYPE = 39;

  /**
   * The meta object id for the '<em>URI</em>' data type.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.URI
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getURI()
   * @generated
   */
  int URI = 42;

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.TopLevelElement <em>Top Level Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Element</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.TopLevelElement
   * @generated
   */
  EClass getTopLevelElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.TopLevelElement#getToolVersion <em>Tool Version</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tool Version</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.TopLevelElement#getToolVersion()
   * @see #getTopLevelElement()
   * @generated
   */
  EAttribute getTopLevelElement_ToolVersion();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.Eclipse <em>Eclipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eclipse</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Eclipse
   * @generated
   */
  EClass getEclipse();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.cdo.releng.setup.Eclipse#getConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Configuration</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Eclipse#getConfiguration()
   * @see #getEclipse()
   * @generated
   */
  EReference getEclipse_Configuration();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.Eclipse#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Eclipse#getVersion()
   * @see #getEclipse()
   * @generated
   */
  EAttribute getEclipse_Version();

  /**
   * The meta object id for the '<em>Exception</em>' data type.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @see java.lang.Exception
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getException()
   * @generated
   */
  int EXCEPTION = 41;

  /**
   * The meta object id for the '<em>Trigger Set</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.Set
   * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getTriggerSet()
   * @generated
   */
  int TRIGGER_SET = 40;

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Configuration
   * @generated
   */
  EClass getConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.Configuration#getProjects <em>Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projects</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Configuration#getProjects()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Projects();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.Configuration#getEclipseVersions <em>Eclipse Versions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Eclipse Versions</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Configuration#getEclipseVersions()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_EclipseVersions();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.cdo.releng.setup.Project#getConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Configuration</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Project#getConfiguration()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Configuration();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.Project#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Branches</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Project#getBranches()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Branches();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Project#getName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.Project#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Project#getLabel()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Label();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.Branch <em>Branch</em>}'.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branch</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Branch
   * @generated
   */
  EClass getBranch();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.cdo.releng.setup.Branch#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Project</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Branch#getProject()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Project();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.Branch#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Branch#getName()
   * @see #getBranch()
   * @generated
   */
  EAttribute getBranch_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.ApiBaselineTask <em>Api Baseline Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Api Baseline Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ApiBaselineTask
   * @generated
   */
  EClass getApiBaselineTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ApiBaselineTask#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ApiBaselineTask#getVersion()
   * @see #getApiBaselineTask()
   * @generated
   */
  EAttribute getApiBaselineTask_Version();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ApiBaselineTask#getZipLocation <em>Zip Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zip Location</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ApiBaselineTask#getZipLocation()
   * @see #getApiBaselineTask()
   * @generated
   */
  EAttribute getApiBaselineTask_ZipLocation();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.GitCloneTask <em>Git Clone Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Git Clone Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.GitCloneTask
   * @generated
   */
  EClass getGitCloneTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.GitCloneTask#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.GitCloneTask#getLocation()
   * @see #getGitCloneTask()
   * @generated
   */
  EAttribute getGitCloneTask_Location();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.GitCloneTask#getRemoteName <em>Remote Name</em>}'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remote Name</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.GitCloneTask#getRemoteName()
   * @see #getGitCloneTask()
   * @generated
   */
  EAttribute getGitCloneTask_RemoteName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.GitCloneTask#getRemoteURI <em>Remote URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remote URI</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.GitCloneTask#getRemoteURI()
   * @see #getGitCloneTask()
   * @generated
   */
  EAttribute getGitCloneTask_RemoteURI();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.GitCloneTask#getCheckoutBranch <em>Checkout Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Checkout Branch</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.GitCloneTask#getCheckoutBranch()
   * @see #getGitCloneTask()
   * @generated
   */
  EAttribute getGitCloneTask_CheckoutBranch();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.ProjectSetImportTask <em>Project Set Import Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Set Import Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ProjectSetImportTask
   * @generated
   */
  EClass getProjectSetImportTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ProjectSetImportTask#getURL <em>URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>URL</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ProjectSetImportTask#getURL()
   * @see #getProjectSetImportTask()
   * @generated
   */
  EAttribute getProjectSetImportTask_URL();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.P2Task <em>P2 Task</em>}'.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @return the meta object for class '<em>P2 Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.P2Task
   * @generated
   */
  EClass getP2Task();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.P2Task#getInstallableUnits <em>Installable Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Installable Units</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.P2Task#getInstallableUnits()
   * @see #getP2Task()
   * @generated
   */
  EReference getP2Task_InstallableUnits();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.P2Task#getP2Repositories <em>P2 Repositories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>P2 Repositories</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.P2Task#getP2Repositories()
   * @see #getP2Task()
   * @generated
   */
  EReference getP2Task_P2Repositories();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.InstallableUnit <em>Installable Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Installable Unit</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.InstallableUnit
   * @generated
   */
  EClass getInstallableUnit();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.InstallableUnit#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.InstallableUnit#getID()
   * @see #getInstallableUnit()
   * @generated
   */
  EAttribute getInstallableUnit_ID();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.P2Repository <em>P2 Repository</em>}'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the meta object for class '<em>P2 Repository</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.P2Repository
   * @generated
   */
  EClass getP2Repository();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.P2Repository#getURL <em>URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>URL</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.P2Repository#getURL()
   * @see #getP2Repository()
   * @generated
   */
  EAttribute getP2Repository_URL();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.Setup <em>Setup</em>}'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the meta object for class '<em>Setup</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Setup
   * @generated
   */
  EClass getSetup();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.cdo.releng.setup.Setup#getBranch <em>Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Branch</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Setup#getBranch()
   * @see #getSetup()
   * @generated
   */
  EReference getSetup_Branch();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.cdo.releng.setup.Setup#getEclipseVersion <em>Eclipse Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Eclipse Version</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Setup#getEclipseVersion()
   * @see #getSetup()
   * @generated
   */
  EReference getSetup_EclipseVersion();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.cdo.releng.setup.Setup#getPreferences <em>Preferences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Preferences</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Setup#getPreferences()
   * @see #getSetup()
   * @generated
   */
  EReference getSetup_Preferences();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.SetupTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.SetupTask
   * @generated
   */
  EClass getSetupTask();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.cdo.releng.setup.SetupTask#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Requirements</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.SetupTask#getRequirements()
   * @see #getSetupTask()
   * @generated
   */
  EReference getSetupTask_Requirements();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.cdo.releng.setup.SetupTask#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Restrictions</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.SetupTask#getRestrictions()
   * @see #getSetupTask()
   * @generated
   */
  EReference getSetupTask_Restrictions();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.SetupTask#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.SetupTask#getScope()
   * @see #getSetupTask()
   * @generated
   */
  EAttribute getSetupTask_Scope();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.SetupTask#getExcludedTriggers <em>Excluded Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Excluded Triggers</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.SetupTask#getExcludedTriggers()
   * @see #getSetupTask()
   * @generated
   */
  EAttribute getSetupTask_ExcludedTriggers();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.SetupTask#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.SetupTask#getDocumentation()
   * @see #getSetupTask()
   * @generated
   */
  EAttribute getSetupTask_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.SetupTask#isDisabled <em>Disabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Disabled</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.SetupTask#isDisabled()
   * @see #getSetupTask()
   * @generated
   */
  EAttribute getSetupTask_Disabled();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.WorkingSetTask <em>Working Set Task</em>}'.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @return the meta object for class '<em>Working Set Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.WorkingSetTask
   * @generated
   */
  EClass getWorkingSetTask();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.WorkingSetTask#getWorkingSets <em>Working Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Working Sets</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.WorkingSetTask#getWorkingSets()
   * @see #getWorkingSetTask()
   * @generated
   */
  EReference getWorkingSetTask_WorkingSets();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.ResourceCopyTask <em>Resource Copy Task</em>}'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Copy Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ResourceCopyTask
   * @generated
   */
  EClass getResourceCopyTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ResourceCopyTask#getSourceURL <em>Source URL</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source URL</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ResourceCopyTask#getSourceURL()
   * @see #getResourceCopyTask()
   * @generated
   */
  EAttribute getResourceCopyTask_SourceURL();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ResourceCopyTask#getTargetURL <em>Target URL</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target URL</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ResourceCopyTask#getTargetURL()
   * @see #getResourceCopyTask()
   * @generated
   */
  EAttribute getResourceCopyTask_TargetURL();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.TextModifyTask <em>Text Modify Task</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Modify Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.TextModifyTask
   * @generated
   */
  EClass getTextModifyTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.TextModifyTask#getURL <em>URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>URL</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.TextModifyTask#getURL()
   * @see #getTextModifyTask()
   * @generated
   */
  EAttribute getTextModifyTask_URL();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.TextModifyTask#getModifications <em>Modifications</em>}'.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifications</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.TextModifyTask#getModifications()
   * @see #getTextModifyTask()
   * @generated
   */
  EReference getTextModifyTask_Modifications();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.TextModification <em>Text Modification</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Modification</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.TextModification
   * @generated
   */
  EClass getTextModification();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.TextModification#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.TextModification#getPattern()
   * @see #getTextModification()
   * @generated
   */
  EAttribute getTextModification_Pattern();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.cdo.releng.setup.TextModification#getSubstitutions <em>Substitutions</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Substitutions</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.TextModification#getSubstitutions()
   * @see #getTextModification()
   * @generated
   */
  EAttribute getTextModification_Substitutions();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.KeyBindingTask <em>Key Binding Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Binding Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.KeyBindingTask
   * @generated
   */
  EClass getKeyBindingTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getScheme <em>Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scheme</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getScheme()
   * @see #getKeyBindingTask()
   * @generated
   */
  EAttribute getKeyBindingTask_Scheme();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getContext()
   * @see #getKeyBindingTask()
   * @generated
   */
  EAttribute getKeyBindingTask_Context();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getPlatform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Platform</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getPlatform()
   * @see #getKeyBindingTask()
   * @generated
   */
  EAttribute getKeyBindingTask_Platform();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getLocale <em>Locale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Locale</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getLocale()
   * @see #getKeyBindingTask()
   * @generated
   */
  EAttribute getKeyBindingTask_Locale();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keys</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getKeys()
   * @see #getKeyBindingTask()
   * @generated
   */
  EAttribute getKeyBindingTask_Keys();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getCommand()
   * @see #getKeyBindingTask()
   * @generated
   */
  EAttribute getKeyBindingTask_Command();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getCommandParameters <em>Command Parameters</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Command Parameters</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.KeyBindingTask#getCommandParameters()
   * @see #getKeyBindingTask()
   * @generated
   */
  EReference getKeyBindingTask_CommandParameters();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.CommandParameter <em>Command Parameter</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command Parameter</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.CommandParameter
   * @generated
   */
  EClass getCommandParameter();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.CommandParameter#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.CommandParameter#getID()
   * @see #getCommandParameter()
   * @generated
   */
  EAttribute getCommandParameter_ID();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.CommandParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.CommandParameter#getValue()
   * @see #getCommandParameter()
   * @generated
   */
  EAttribute getCommandParameter_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.MylynQueryTask <em>Mylyn Query Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mylyn Query Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.MylynQueryTask
   * @generated
   */
  EClass getMylynQueryTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.MylynQueryTask#getConnectorKind <em>Connector Kind</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connector Kind</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.MylynQueryTask#getConnectorKind()
   * @see #getMylynQueryTask()
   * @generated
   */
  EAttribute getMylynQueryTask_ConnectorKind();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.MylynQueryTask#getSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summary</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.MylynQueryTask#getSummary()
   * @see #getMylynQueryTask()
   * @generated
   */
  EAttribute getMylynQueryTask_Summary();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.MylynQueryTask#getRepositoryURL <em>Repository URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repository URL</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.MylynQueryTask#getRepositoryURL()
   * @see #getMylynQueryTask()
   * @generated
   */
  EAttribute getMylynQueryTask_RepositoryURL();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.MylynQueryTask#getRelativeURL <em>Relative URL</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relative URL</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.MylynQueryTask#getRelativeURL()
   * @see #getMylynQueryTask()
   * @generated
   */
  EAttribute getMylynQueryTask_RelativeURL();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.AutomaticSourceLocator <em>Automatic Source Locator</em>}'.
   * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
   * @return the meta object for class '<em>Automatic Source Locator</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.AutomaticSourceLocator
   * @generated
   */
  EClass getAutomaticSourceLocator();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.AutomaticSourceLocator#getRootFolder <em>Root Folder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root Folder</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.AutomaticSourceLocator#getRootFolder()
   * @see #getAutomaticSourceLocator()
   * @generated
   */
  EAttribute getAutomaticSourceLocator_RootFolder();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.RedirectionTask <em>Redirection Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Redirection Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.RedirectionTask
   * @generated
   */
  EClass getRedirectionTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.RedirectionTask#getSourceURL <em>Source URL</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source URL</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.RedirectionTask#getSourceURL()
   * @see #getRedirectionTask()
   * @generated
   */
  EAttribute getRedirectionTask_SourceURL();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.RedirectionTask#getTargetURL <em>Target URL</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target URL</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.RedirectionTask#getTargetURL()
   * @see #getRedirectionTask()
   * @generated
   */
  EAttribute getRedirectionTask_TargetURL();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.ManualSourceLocator <em>Manual Source Locator</em>}'.
   * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manual Source Locator</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ManualSourceLocator
   * @generated
   */
  EClass getManualSourceLocator();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ManualSourceLocator#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ManualSourceLocator#getLocation()
   * @see #getManualSourceLocator()
   * @generated
   */
  EAttribute getManualSourceLocator_Location();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ManualSourceLocator#getComponentNamePattern <em>Component Name Pattern</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Name Pattern</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ManualSourceLocator#getComponentNamePattern()
   * @see #getManualSourceLocator()
   * @generated
   */
  EAttribute getManualSourceLocator_ComponentNamePattern();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.cdo.releng.setup.ManualSourceLocator#getComponentTypes <em>Component Types</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Component Types</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ManualSourceLocator#getComponentTypes()
   * @see #getManualSourceLocator()
   * @generated
   */
  EAttribute getManualSourceLocator_ComponentTypes();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.ContextVariableTask <em>Context Variable Task</em>}'.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Variable Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ContextVariableTask
   * @generated
   */
  EClass getContextVariableTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ContextVariableTask#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ContextVariableTask#getName()
   * @see #getContextVariableTask()
   * @generated
   */
  EAttribute getContextVariableTask_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ContextVariableTask#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ContextVariableTask#getValue()
   * @see #getContextVariableTask()
   * @generated
   */
  EAttribute getContextVariableTask_Value();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ContextVariableTask#isStringSubstitution <em>String Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Substitution</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ContextVariableTask#isStringSubstitution()
   * @see #getContextVariableTask()
   * @generated
   */
  EAttribute getContextVariableTask_StringSubstitution();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.ResourceCreationTask <em>Resource Creation Task</em>}'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Creation Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ResourceCreationTask
   * @generated
   */
  EClass getResourceCreationTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ResourceCreationTask#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ResourceCreationTask#getContent()
   * @see #getResourceCreationTask()
   * @generated
   */
  EAttribute getResourceCreationTask_Content();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ResourceCreationTask#getTargetURL <em>Target URL</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target URL</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ResourceCreationTask#getTargetURL()
   * @see #getResourceCreationTask()
   * @generated
   */
  EAttribute getResourceCreationTask_TargetURL();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.ResourceCreationTask#getEncoding <em>Encoding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Encoding</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ResourceCreationTask#getEncoding()
   * @see #getResourceCreationTask()
   * @generated
   */
  EAttribute getResourceCreationTask_Encoding();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.MaterializationTask <em>Materialization Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Materialization Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.MaterializationTask
   * @generated
   */
  EClass getMaterializationTask();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.MaterializationTask#getSourceLocators <em>Source Locators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Source Locators</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.MaterializationTask#getSourceLocators()
   * @see #getMaterializationTask()
   * @generated
   */
  EReference getMaterializationTask_SourceLocators();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.MaterializationTask#getRootComponents <em>Root Components</em>}'.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Root Components</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.MaterializationTask#getRootComponents()
   * @see #getMaterializationTask()
   * @generated
   */
  EReference getMaterializationTask_RootComponents();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.SourceLocator <em>Source Locator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source Locator</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.SourceLocator
   * @generated
   */
  EClass getSourceLocator();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.MaterializationTask#getP2Repositories <em>P2 Repositories</em>}'.
   * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>P2 Repositories</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.MaterializationTask#getP2Repositories()
   * @see #getMaterializationTask()
   * @generated
   */
  EReference getMaterializationTask_P2Repositories();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.BasicMaterializationTask <em>Basic Materialization Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Materialization Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.BasicMaterializationTask
   * @generated
   */
  EClass getBasicMaterializationTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.BasicMaterializationTask#getTargetPlatform <em>Target Platform</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Platform</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.BasicMaterializationTask#getTargetPlatform()
   * @see #getBasicMaterializationTask()
   * @generated
   */
  EAttribute getBasicMaterializationTask_TargetPlatform();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.BasicMaterializationTask#getBundlePool <em>Bundle Pool</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bundle Pool</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.BasicMaterializationTask#getBundlePool()
   * @see #getBasicMaterializationTask()
   * @generated
   */
  EAttribute getBasicMaterializationTask_BundlePool();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.Component#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Component#getType()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Type();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.EclipseIniTask <em>Eclipse Ini Task</em>}'.
   * <!-- begin-user-doc -->
                         * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eclipse Ini Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.EclipseIniTask
   * @generated
   */
  EClass getEclipseIniTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.EclipseIniTask#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.EclipseIniTask#getOption()
   * @see #getEclipseIniTask()
   * @generated
   */
  EAttribute getEclipseIniTask_Option();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.EclipseIniTask#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.EclipseIniTask#getValue()
   * @see #getEclipseIniTask()
   * @generated
   */
  EAttribute getEclipseIniTask_Value();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.EclipseIniTask#isVm <em>Vm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vm</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.EclipseIniTask#isVm()
   * @see #getEclipseIniTask()
   * @generated
   */
  EAttribute getEclipseIniTask_Vm();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.cdo.releng.setup.SetupTaskScope <em>Task Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Task Scope</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.SetupTaskScope
   * @generated
   */
  EEnum getSetupTaskScope();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.cdo.releng.setup.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Trigger</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Trigger
   * @generated
   */
  EEnum getTrigger();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.cdo.releng.setup.ComponentType <em>Component Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Component Type</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ComponentType
   * @generated
   */
  EEnum getComponentType();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.CompoundSetupTask <em>Compound Setup Task</em>}'.
   * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Setup Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.CompoundSetupTask
   * @generated
   */
  EClass getCompoundSetupTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.CompoundSetupTask#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.CompoundSetupTask#getName()
   * @see #getCompoundSetupTask()
   * @generated
   */
  EAttribute getCompoundSetupTask_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.ConfigurableItem <em>Configurable Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configurable Item</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.ConfigurableItem
   * @generated
   */
  EClass getConfigurableItem();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.BuckminsterImportTask <em>Buckminster Import Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Buckminster Import Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.BuckminsterImportTask
   * @generated
   */
  EClass getBuckminsterImportTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.BuckminsterImportTask#getMspec <em>Mspec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mspec</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.BuckminsterImportTask#getMspec()
   * @see #getBuckminsterImportTask()
   * @generated
   */
  EAttribute getBuckminsterImportTask_Mspec();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.Preferences <em>Preferences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preferences</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Preferences
   * @generated
   */
  EClass getPreferences();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.Preferences#getUserName <em>User Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User Name</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Preferences#getUserName()
   * @see #getPreferences()
   * @generated
   */
  EAttribute getPreferences_UserName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.Preferences#getInstallFolder <em>Install Folder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Install Folder</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Preferences#getInstallFolder()
   * @see #getPreferences()
   * @generated
   */
  EAttribute getPreferences_InstallFolder();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.Preferences#getGitPrefix <em>Git Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Git Prefix</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Preferences#getGitPrefix()
   * @see #getPreferences()
   * @generated
   */
  EAttribute getPreferences_GitPrefix();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.cdo.releng.setup.Preferences#getAcceptedLicenses <em>Accepted Licenses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Accepted Licenses</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.Preferences#getAcceptedLicenses()
   * @see #getPreferences()
   * @generated
   */
  EAttribute getPreferences_AcceptedLicenses();

  /**
  	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.LinkLocationTask <em>Link Location Task</em>}'.
  	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
  	 * @return the meta object for class '<em>Link Location Task</em>'.
  	 * @see org.eclipse.emf.cdo.releng.setup.LinkLocationTask
  	 * @generated
  	 */
  EClass getLinkLocationTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.LinkLocationTask#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.LinkLocationTask#getPath()
   * @see #getLinkLocationTask()
   * @generated
   */
  EAttribute getLinkLocationTask_Path();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.LinkLocationTask#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.LinkLocationTask#getName()
   * @see #getLinkLocationTask()
   * @generated
   */
  EAttribute getLinkLocationTask_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.SetupTaskContainer <em>Task Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Container</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.SetupTaskContainer
   * @generated
   */
  EClass getSetupTaskContainer();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.cdo.releng.setup.SetupTaskContainer#getSetupTasks <em>Setup Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setup Tasks</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.SetupTaskContainer#getSetupTasks()
   * @see #getSetupTaskContainer()
   * @generated
   */
  EReference getSetupTaskContainer_SetupTasks();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.cdo.releng.setup.EclipsePreferenceTask <em>Eclipse Preference Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eclipse Preference Task</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.EclipsePreferenceTask
   * @generated
   */
  EClass getEclipsePreferenceTask();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.EclipsePreferenceTask#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.EclipsePreferenceTask#getKey()
   * @see #getEclipsePreferenceTask()
   * @generated
   */
  EAttribute getEclipsePreferenceTask_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.releng.setup.EclipsePreferenceTask#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.cdo.releng.setup.EclipsePreferenceTask#getValue()
   * @see #getEclipsePreferenceTask()
   * @generated
   */
  EAttribute getEclipsePreferenceTask_Value();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>URI</em>'.
   * @see org.eclipse.emf.common.util.URI
   * @model instanceClass="org.eclipse.emf.common.util.URI"
   * @generated
   */
  EDataType getURI();

  /**
   * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Exception</em>'.
   * @see java.lang.Exception
   * @model instanceClass="java.lang.Exception"
   * @generated
   */
  EDataType getException();

  /**
   * Returns the meta object for data type '{@link java.util.Set <em>Trigger Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Trigger Set</em>'.
   * @see java.util.Set
   * @model instanceClass="java.util.Set<org.eclipse.emf.cdo.releng.setup.Trigger>"
   * @generated
   */
  EDataType getTriggerSet();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SetupFactory getSetupFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.TopLevelElement <em>Top Level Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.TopLevelElement
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getTopLevelElement()
     * @generated
     */
    EClass TOP_LEVEL_ELEMENT = eINSTANCE.getTopLevelElement();

    /**
     * The meta object literal for the '<em><b>Tool Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_LEVEL_ELEMENT__TOOL_VERSION = eINSTANCE.getTopLevelElement_ToolVersion();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.EclipseImpl <em>Eclipse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.EclipseImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getEclipse()
     * @generated
     */
    EClass ECLIPSE = eINSTANCE.getEclipse();

    /**
     * The meta object literal for the '<em><b>Configuration</b></em>' container reference feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLIPSE__CONFIGURATION = eINSTANCE.getEclipse_Configuration();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECLIPSE__VERSION = eINSTANCE.getEclipse_Version();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.ConfigurationImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getConfiguration()
     * @generated
     */
    EClass CONFIGURATION = eINSTANCE.getConfiguration();

    /**
     * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__PROJECTS = eINSTANCE.getConfiguration_Projects();

    /**
     * The meta object literal for the '<em><b>Eclipse Versions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__ECLIPSE_VERSIONS = eINSTANCE.getConfiguration_EclipseVersions();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.ProjectImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Configuration</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__CONFIGURATION = eINSTANCE.getProject_Configuration();

    /**
     * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__BRANCHES = eINSTANCE.getProject_Branches();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__LABEL = eINSTANCE.getProject_Label();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.BranchImpl <em>Branch</em>}' class.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.BranchImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getBranch()
     * @generated
     */
    EClass BRANCH = eINSTANCE.getBranch();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH__PROJECT = eINSTANCE.getBranch_Project();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ApiBaselineTaskImpl <em>Api Baseline Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.ApiBaselineTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getApiBaselineTask()
     * @generated
     */
    EClass API_BASELINE_TASK = eINSTANCE.getApiBaselineTask();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute API_BASELINE_TASK__VERSION = eINSTANCE.getApiBaselineTask_Version();

    /**
     * The meta object literal for the '<em><b>Zip Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute API_BASELINE_TASK__ZIP_LOCATION = eINSTANCE.getApiBaselineTask_ZipLocation();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.GitCloneTaskImpl <em>Git Clone Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.GitCloneTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getGitCloneTask()
     * @generated
     */
    EClass GIT_CLONE_TASK = eINSTANCE.getGitCloneTask();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GIT_CLONE_TASK__LOCATION = eINSTANCE.getGitCloneTask_Location();

    /**
     * The meta object literal for the '<em><b>Remote Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GIT_CLONE_TASK__REMOTE_NAME = eINSTANCE.getGitCloneTask_RemoteName();

    /**
     * The meta object literal for the '<em><b>Remote URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GIT_CLONE_TASK__REMOTE_URI = eINSTANCE.getGitCloneTask_RemoteURI();

    /**
     * The meta object literal for the '<em><b>Checkout Branch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GIT_CLONE_TASK__CHECKOUT_BRANCH = eINSTANCE.getGitCloneTask_CheckoutBranch();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ProjectSetImportTaskImpl <em>Project Set Import Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.ProjectSetImportTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getProjectSetImportTask()
     * @generated
     */
    EClass PROJECT_SET_IMPORT_TASK = eINSTANCE.getProjectSetImportTask();

    /**
     * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT_SET_IMPORT_TASK__URL = eINSTANCE.getProjectSetImportTask_URL();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.P2TaskImpl <em>P2 Task</em>}' class.
     * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.P2TaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getP2Task()
     * @generated
     */
    EClass P2_TASK = eINSTANCE.getP2Task();

    /**
     * The meta object literal for the '<em><b>Installable Units</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference P2_TASK__INSTALLABLE_UNITS = eINSTANCE.getP2Task_InstallableUnits();

    /**
     * The meta object literal for the '<em><b>P2 Repositories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference P2_TASK__P2_REPOSITORIES = eINSTANCE.getP2Task_P2Repositories();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.InstallableUnitImpl <em>Installable Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.InstallableUnitImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getInstallableUnit()
     * @generated
     */
    EClass INSTALLABLE_UNIT = eINSTANCE.getInstallableUnit();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTALLABLE_UNIT__ID = eINSTANCE.getInstallableUnit_ID();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.P2RepositoryImpl <em>P2 Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.P2RepositoryImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getP2Repository()
     * @generated
     */
    EClass P2_REPOSITORY = eINSTANCE.getP2Repository();

    /**
     * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute P2_REPOSITORY__URL = eINSTANCE.getP2Repository_URL();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.SetupImpl <em>Setup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getSetup()
     * @generated
     */
    EClass SETUP = eINSTANCE.getSetup();

    /**
     * The meta object literal for the '<em><b>Branch</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETUP__BRANCH = eINSTANCE.getSetup_Branch();

    /**
     * The meta object literal for the '<em><b>Eclipse Version</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETUP__ECLIPSE_VERSION = eINSTANCE.getSetup_EclipseVersion();

    /**
     * The meta object literal for the '<em><b>Preferences</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETUP__PREFERENCES = eINSTANCE.getSetup_Preferences();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.SetupTaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getSetupTask()
     * @generated
     */
    EClass SETUP_TASK = eINSTANCE.getSetupTask();

    /**
     * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETUP_TASK__REQUIREMENTS = eINSTANCE.getSetupTask_Requirements();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETUP_TASK__RESTRICTIONS = eINSTANCE.getSetupTask_Restrictions();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETUP_TASK__SCOPE = eINSTANCE.getSetupTask_Scope();

    /**
     * The meta object literal for the '<em><b>Excluded Triggers</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETUP_TASK__EXCLUDED_TRIGGERS = eINSTANCE.getSetupTask_ExcludedTriggers();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETUP_TASK__DOCUMENTATION = eINSTANCE.getSetupTask_Documentation();

    /**
     * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETUP_TASK__DISABLED = eINSTANCE.getSetupTask_Disabled();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.WorkingSetTaskImpl <em>Working Set Task</em>}' class.
     * <!-- begin-user-doc -->
           * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.WorkingSetTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getWorkingSetTask()
     * @generated
     */
    EClass WORKING_SET_TASK = eINSTANCE.getWorkingSetTask();

    /**
     * The meta object literal for the '<em><b>Working Sets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKING_SET_TASK__WORKING_SETS = eINSTANCE.getWorkingSetTask_WorkingSets();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ResourceCopyTaskImpl <em>Resource Copy Task</em>}' class.
     * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.ResourceCopyTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getResourceCopyTask()
     * @generated
     */
    EClass RESOURCE_COPY_TASK = eINSTANCE.getResourceCopyTask();

    /**
     * The meta object literal for the '<em><b>Source URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_COPY_TASK__SOURCE_URL = eINSTANCE.getResourceCopyTask_SourceURL();

    /**
     * The meta object literal for the '<em><b>Target URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_COPY_TASK__TARGET_URL = eINSTANCE.getResourceCopyTask_TargetURL();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.TextModifyTaskImpl <em>Text Modify Task</em>}' class.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.TextModifyTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getTextModifyTask()
     * @generated
     */
    EClass TEXT_MODIFY_TASK = eINSTANCE.getTextModifyTask();

    /**
     * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_MODIFY_TASK__URL = eINSTANCE.getTextModifyTask_URL();

    /**
     * The meta object literal for the '<em><b>Modifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_MODIFY_TASK__MODIFICATIONS = eINSTANCE.getTextModifyTask_Modifications();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.TextModificationImpl <em>Text Modification</em>}' class.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.TextModificationImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getTextModification()
     * @generated
     */
    EClass TEXT_MODIFICATION = eINSTANCE.getTextModification();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_MODIFICATION__PATTERN = eINSTANCE.getTextModification_Pattern();

    /**
     * The meta object literal for the '<em><b>Substitutions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_MODIFICATION__SUBSTITUTIONS = eINSTANCE.getTextModification_Substitutions();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.KeyBindingTaskImpl <em>Key Binding Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.KeyBindingTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getKeyBindingTask()
     * @generated
     */
    EClass KEY_BINDING_TASK = eINSTANCE.getKeyBindingTask();

    /**
     * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_TASK__SCHEME = eINSTANCE.getKeyBindingTask_Scheme();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_TASK__CONTEXT = eINSTANCE.getKeyBindingTask_Context();

    /**
     * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
     * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_TASK__PLATFORM = eINSTANCE.getKeyBindingTask_Platform();

    /**
     * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_TASK__LOCALE = eINSTANCE.getKeyBindingTask_Locale();

    /**
     * The meta object literal for the '<em><b>Keys</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_TASK__KEYS = eINSTANCE.getKeyBindingTask_Keys();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_TASK__COMMAND = eINSTANCE.getKeyBindingTask_Command();

    /**
     * The meta object literal for the '<em><b>Command Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_BINDING_TASK__COMMAND_PARAMETERS = eINSTANCE.getKeyBindingTask_CommandParameters();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.CommandParameterImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getCommandParameter()
     * @generated
     */
    EClass COMMAND_PARAMETER = eINSTANCE.getCommandParameter();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND_PARAMETER__ID = eINSTANCE.getCommandParameter_ID();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND_PARAMETER__VALUE = eINSTANCE.getCommandParameter_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.MylynQueryTaskImpl <em>Mylyn Query Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.MylynQueryTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getMylynQueryTask()
     * @generated
     */
    EClass MYLYN_QUERY_TASK = eINSTANCE.getMylynQueryTask();

    /**
     * The meta object literal for the '<em><b>Connector Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MYLYN_QUERY_TASK__CONNECTOR_KIND = eINSTANCE.getMylynQueryTask_ConnectorKind();

    /**
     * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MYLYN_QUERY_TASK__SUMMARY = eINSTANCE.getMylynQueryTask_Summary();

    /**
     * The meta object literal for the '<em><b>Repository URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MYLYN_QUERY_TASK__REPOSITORY_URL = eINSTANCE.getMylynQueryTask_RepositoryURL();

    /**
     * The meta object literal for the '<em><b>Relative URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MYLYN_QUERY_TASK__RELATIVE_URL = eINSTANCE.getMylynQueryTask_RelativeURL();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.AutomaticSourceLocatorImpl <em>Automatic Source Locator</em>}' class.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.AutomaticSourceLocatorImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getAutomaticSourceLocator()
     * @generated
     */
    EClass AUTOMATIC_SOURCE_LOCATOR = eINSTANCE.getAutomaticSourceLocator();

    /**
     * The meta object literal for the '<em><b>Root Folder</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTOMATIC_SOURCE_LOCATOR__ROOT_FOLDER = eINSTANCE.getAutomaticSourceLocator_RootFolder();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.RedirectionTaskImpl <em>Redirection Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.RedirectionTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getRedirectionTask()
     * @generated
     */
    EClass REDIRECTION_TASK = eINSTANCE.getRedirectionTask();

    /**
     * The meta object literal for the '<em><b>Source URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REDIRECTION_TASK__SOURCE_URL = eINSTANCE.getRedirectionTask_SourceURL();

    /**
     * The meta object literal for the '<em><b>Target URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REDIRECTION_TASK__TARGET_URL = eINSTANCE.getRedirectionTask_TargetURL();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ManualSourceLocatorImpl <em>Manual Source Locator</em>}' class.
     * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.ManualSourceLocatorImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getManualSourceLocator()
     * @generated
     */
    EClass MANUAL_SOURCE_LOCATOR = eINSTANCE.getManualSourceLocator();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANUAL_SOURCE_LOCATOR__LOCATION = eINSTANCE.getManualSourceLocator_Location();

    /**
     * The meta object literal for the '<em><b>Component Name Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANUAL_SOURCE_LOCATOR__COMPONENT_NAME_PATTERN = eINSTANCE.getManualSourceLocator_ComponentNamePattern();

    /**
     * The meta object literal for the '<em><b>Component Types</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANUAL_SOURCE_LOCATOR__COMPONENT_TYPES = eINSTANCE.getManualSourceLocator_ComponentTypes();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ContextVariableTaskImpl <em>Context Variable Task</em>}' class.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.ContextVariableTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getContextVariableTask()
     * @generated
     */
    EClass CONTEXT_VARIABLE_TASK = eINSTANCE.getContextVariableTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_VARIABLE_TASK__NAME = eINSTANCE.getContextVariableTask_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_VARIABLE_TASK__VALUE = eINSTANCE.getContextVariableTask_Value();

    /**
     * The meta object literal for the '<em><b>String Substitution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_VARIABLE_TASK__STRING_SUBSTITUTION = eINSTANCE.getContextVariableTask_StringSubstitution();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ResourceCreationTaskImpl <em>Resource Creation Task</em>}' class.
     * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.ResourceCreationTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getResourceCreationTask()
     * @generated
     */
    EClass RESOURCE_CREATION_TASK = eINSTANCE.getResourceCreationTask();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_CREATION_TASK__CONTENT = eINSTANCE.getResourceCreationTask_Content();

    /**
     * The meta object literal for the '<em><b>Target URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_CREATION_TASK__TARGET_URL = eINSTANCE.getResourceCreationTask_TargetURL();

    /**
     * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_CREATION_TASK__ENCODING = eINSTANCE.getResourceCreationTask_Encoding();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.MaterializationTaskImpl <em>Materialization Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.MaterializationTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getMaterializationTask()
     * @generated
     */
    EClass MATERIALIZATION_TASK = eINSTANCE.getMaterializationTask();

    /**
     * The meta object literal for the '<em><b>Source Locators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIALIZATION_TASK__SOURCE_LOCATORS = eINSTANCE.getMaterializationTask_SourceLocators();

    /**
     * The meta object literal for the '<em><b>Root Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIALIZATION_TASK__ROOT_COMPONENTS = eINSTANCE.getMaterializationTask_RootComponents();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.SourceLocatorImpl <em>Source Locator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.SourceLocatorImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getSourceLocator()
     * @generated
     */
    EClass SOURCE_LOCATOR = eINSTANCE.getSourceLocator();

    /**
     * The meta object literal for the '<em><b>P2 Repositories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
      	 * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIALIZATION_TASK__P2_REPOSITORIES = eINSTANCE.getMaterializationTask_P2Repositories();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.BasicMaterializationTaskImpl <em>Basic Materialization Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.BasicMaterializationTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getBasicMaterializationTask()
     * @generated
     */
    EClass BASIC_MATERIALIZATION_TASK = eINSTANCE.getBasicMaterializationTask();

    /**
     * The meta object literal for the '<em><b>Target Platform</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_MATERIALIZATION_TASK__TARGET_PLATFORM = eINSTANCE.getBasicMaterializationTask_TargetPlatform();

    /**
     * The meta object literal for the '<em><b>Bundle Pool</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_MATERIALIZATION_TASK__BUNDLE_POOL = eINSTANCE.getBasicMaterializationTask_BundlePool();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.ComponentImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__TYPE = eINSTANCE.getComponent_Type();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.EclipseIniTaskImpl <em>Eclipse Ini Task</em>}' class.
     * <!-- begin-user-doc -->
                           * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.EclipseIniTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getEclipseIniTask()
     * @generated
     */
    EClass ECLIPSE_INI_TASK = eINSTANCE.getEclipseIniTask();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECLIPSE_INI_TASK__OPTION = eINSTANCE.getEclipseIniTask_Option();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECLIPSE_INI_TASK__VALUE = eINSTANCE.getEclipseIniTask_Value();

    /**
     * The meta object literal for the '<em><b>Vm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECLIPSE_INI_TASK__VM = eINSTANCE.getEclipseIniTask_Vm();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.SetupTaskScope <em>Task Scope</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.SetupTaskScope
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getSetupTaskScope()
     * @generated
     */
    EEnum SETUP_TASK_SCOPE = eINSTANCE.getSetupTaskScope();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.Trigger <em>Trigger</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.Trigger
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getTrigger()
     * @generated
     */
    EEnum TRIGGER = eINSTANCE.getTrigger();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.ComponentType <em>Component Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.ComponentType
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getComponentType()
     * @generated
     */
    EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.CompoundSetupTaskImpl <em>Compound Setup Task</em>}' class.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.CompoundSetupTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getCompoundSetupTask()
     * @generated
     */
    EClass COMPOUND_SETUP_TASK = eINSTANCE.getCompoundSetupTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOUND_SETUP_TASK__NAME = eINSTANCE.getCompoundSetupTask_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.ConfigurableItemImpl <em>Configurable Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.ConfigurableItemImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getConfigurableItem()
     * @generated
     */
    EClass CONFIGURABLE_ITEM = eINSTANCE.getConfigurableItem();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.BuckminsterImportTaskImpl <em>Buckminster Import Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.BuckminsterImportTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getBuckminsterImportTask()
     * @generated
     */
    EClass BUCKMINSTER_IMPORT_TASK = eINSTANCE.getBuckminsterImportTask();

    /**
     * The meta object literal for the '<em><b>Mspec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUCKMINSTER_IMPORT_TASK__MSPEC = eINSTANCE.getBuckminsterImportTask_Mspec();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.PreferencesImpl <em>Preferences</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.PreferencesImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getPreferences()
     * @generated
     */
    EClass PREFERENCES = eINSTANCE.getPreferences();

    /**
     * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCES__USER_NAME = eINSTANCE.getPreferences_UserName();

    /**
     * The meta object literal for the '<em><b>Install Folder</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCES__INSTALL_FOLDER = eINSTANCE.getPreferences_InstallFolder();

    /**
     * The meta object literal for the '<em><b>Git Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCES__GIT_PREFIX = eINSTANCE.getPreferences_GitPrefix();

    /**
     * The meta object literal for the '<em><b>Accepted Licenses</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCES__ACCEPTED_LICENSES = eINSTANCE.getPreferences_AcceptedLicenses();

    /**
    	 * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.LinkLocationTaskImpl <em>Link Location Task</em>}' class.
    	 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
    	 * @see org.eclipse.emf.cdo.releng.setup.impl.LinkLocationTaskImpl
    	 * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getLinkLocationTask()
    	 * @generated
    	 */
    EClass LINK_LOCATION_TASK = eINSTANCE.getLinkLocationTask();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_LOCATION_TASK__PATH = eINSTANCE.getLinkLocationTask_Path();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_LOCATION_TASK__NAME = eINSTANCE.getLinkLocationTask_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.SetupTaskContainerImpl <em>Task Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupTaskContainerImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getSetupTaskContainer()
     * @generated
     */
    EClass SETUP_TASK_CONTAINER = eINSTANCE.getSetupTaskContainer();

    /**
     * The meta object literal for the '<em><b>Setup Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETUP_TASK_CONTAINER__SETUP_TASKS = eINSTANCE.getSetupTaskContainer_SetupTasks();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.cdo.releng.setup.impl.EclipsePreferenceTaskImpl <em>Eclipse Preference Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.cdo.releng.setup.impl.EclipsePreferenceTaskImpl
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getEclipsePreferenceTask()
     * @generated
     */
    EClass ECLIPSE_PREFERENCE_TASK = eINSTANCE.getEclipsePreferenceTask();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECLIPSE_PREFERENCE_TASK__KEY = eINSTANCE.getEclipsePreferenceTask_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECLIPSE_PREFERENCE_TASK__VALUE = eINSTANCE.getEclipsePreferenceTask_Value();

    /**
     * The meta object literal for the '<em>URI</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.URI
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getURI()
     * @generated
     */
    EDataType URI = eINSTANCE.getURI();

    /**
     * The meta object literal for the '<em>Exception</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Exception
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getException()
     * @generated
     */
    EDataType EXCEPTION = eINSTANCE.getException();

    /**
     * The meta object literal for the '<em>Trigger Set</em>' data type.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @see java.util.Set
     * @see org.eclipse.emf.cdo.releng.setup.impl.SetupPackageImpl#getTriggerSet()
     * @generated
     */
    EDataType TRIGGER_SET = eINSTANCE.getTriggerSet();

  }

} // SetupPackage
