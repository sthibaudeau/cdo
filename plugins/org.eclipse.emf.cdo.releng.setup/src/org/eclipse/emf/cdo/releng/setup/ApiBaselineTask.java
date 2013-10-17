/**
 */
package org.eclipse.emf.cdo.releng.setup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api Baseline Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.releng.setup.ApiBaselineTask#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.releng.setup.ApiBaselineTask#getZipLocation <em>Zip Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.releng.setup.SetupPackage#getApiBaselineTask()
 * @model
 * @generated
 */
public interface ApiBaselineTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.eclipse.emf.cdo.releng.setup.SetupPackage#getApiBaselineTask_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.eclipse.emf.cdo.releng.setup.ApiBaselineTask#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Zip Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zip Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zip Location</em>' attribute.
   * @see #setZipLocation(String)
   * @see org.eclipse.emf.cdo.releng.setup.SetupPackage#getApiBaselineTask_ZipLocation()
   * @model
   * @generated
   */
  String getZipLocation();

  /**
   * Sets the value of the '{@link org.eclipse.emf.cdo.releng.setup.ApiBaselineTask#getZipLocation <em>Zip Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zip Location</em>' attribute.
   * @see #getZipLocation()
   * @generated
   */
  void setZipLocation(String value);

} // ApiBaselineTask
