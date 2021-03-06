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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Variable Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.releng.setup.ContextVariableTask#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.releng.setup.ContextVariableTask#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.releng.setup.ContextVariableTask#isStringSubstitution <em>String Substitution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.releng.setup.SetupPackage#getContextVariableTask()
 * @model
 * @generated
 */
public interface ContextVariableTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.cdo.releng.setup.SetupPackage#getContextVariableTask_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.cdo.releng.setup.ContextVariableTask#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.eclipse.emf.cdo.releng.setup.SetupPackage#getContextVariableTask_Value()
   * @model required="true"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.cdo.releng.setup.ContextVariableTask#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>String Substitution</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <p>
  	 * If the meaning of the '<em>String Substitution</em>' attribute isn't clear,
  	 * there really should be more of a description here...
  	 * </p>
  	 * <!-- end-user-doc -->
   * @return the value of the '<em>String Substitution</em>' attribute.
   * @see #setStringSubstitution(boolean)
   * @see org.eclipse.emf.cdo.releng.setup.SetupPackage#getContextVariableTask_StringSubstitution()
   * @model
   * @generated
   */
  boolean isStringSubstitution();

  /**
   * Sets the value of the '{@link org.eclipse.emf.cdo.releng.setup.ContextVariableTask#isStringSubstitution <em>String Substitution</em>}' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Substitution</em>' attribute.
   * @see #isStringSubstitution()
   * @generated
   */
  void setStringSubstitution(boolean value);

} // ContextVariableTask
