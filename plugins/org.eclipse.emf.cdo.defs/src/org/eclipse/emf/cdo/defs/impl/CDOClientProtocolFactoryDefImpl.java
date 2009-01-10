/**
 * <copyright>
 * Copyright (c) 2004 - 2008 André Dietisheim, Switzerland.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    André Dietisheim - initial API and implementation
 * </copyright> *
 * $Id: CDOClientProtocolFactoryDefImpl.java,v 1.1.2.1 2009-01-10 12:31:08 estepper Exp $
 */
package org.eclipse.emf.cdo.defs.impl;

import org.eclipse.emf.cdo.defs.CDOClientProtocolFactoryDef;
import org.eclipse.emf.cdo.defs.CDODefsPackage;

import org.eclipse.emf.internal.cdo.net4j.protocol.CDOClientProtocolFactory;

import org.eclipse.net4j.defs.impl.ClientProtocolFactoryDefImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>CDO Client Protocol Factory Def</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class CDOClientProtocolFactoryDefImpl extends ClientProtocolFactoryDefImpl implements
    CDOClientProtocolFactoryDef
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected CDOClientProtocolFactoryDefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CDODefsPackage.Literals.CDO_CLIENT_PROTOCOL_FACTORY_DEF;
  }

  @Override
  protected Object createInstance()
  {
    return new CDOClientProtocolFactory();
  }

} // CDOClientProtocolFactoryDefImpl
