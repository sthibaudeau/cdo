/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parameter.java,v 1.1 2008-06-12 17:22:17 estepper Exp $
 */
package org.eclipse.emf.cdo.tests.mango;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.cdo.tests.mango.Parameter#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.cdo.tests.mango.Parameter#getPassing <em>Passing</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.cdo.tests.mango.MangoPackage#getParameter()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Parameter extends CDOObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.cdo.tests.mango.MangoPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.cdo.tests.mango.Parameter#getName <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Passing</b></em>' attribute. The literals are from the enumeration
   * {@link org.eclipse.emf.cdo.tests.mango.ParameterPassing}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Passing</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Passing</em>' attribute.
   * @see org.eclipse.emf.cdo.tests.mango.ParameterPassing
   * @see #setPassing(ParameterPassing)
   * @see org.eclipse.emf.cdo.tests.mango.MangoPackage#getParameter_Passing()
   * @model
   * @generated
   */
  ParameterPassing getPassing();

  /**
   * Sets the value of the '{@link org.eclipse.emf.cdo.tests.mango.Parameter#getPassing <em>Passing</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Passing</em>' attribute.
   * @see org.eclipse.emf.cdo.tests.mango.ParameterPassing
   * @see #getPassing()
   * @generated
   */
  void setPassing(ParameterPassing value);

} // Parameter