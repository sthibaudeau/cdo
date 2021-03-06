/**
 */
package org.eclipse.emf.cdo.releng.setup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Set Import Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.releng.setup.ProjectSetImportTask#getURL <em>URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.releng.setup.SetupPackage#getProjectSetImportTask()
 * @model
 * @generated
 */
public interface ProjectSetImportTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>URL</em>' attribute.
   * @see #setURL(String)
   * @see org.eclipse.emf.cdo.releng.setup.SetupPackage#getProjectSetImportTask_URL()
   * @model required="true"
   * @generated
   */
  String getURL();

  /**
   * Sets the value of the '{@link org.eclipse.emf.cdo.releng.setup.ProjectSetImportTask#getURL <em>URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>URL</em>' attribute.
   * @see #getURL()
   * @generated
   */
  void setURL(String value);

} // ProjectSetImportTask
