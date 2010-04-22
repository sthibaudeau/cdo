/**
 * Copyright (c) 2004 - 2010 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.tests;

/**
 * @author Eike Stepper
 */
public class OfflineSqueezedTest extends AbstractSyncingTest
{
  @Override
  protected boolean isFailover()
  {
    return false;
  }

  @Override
  protected boolean isSqueezedCommitInfos()
  {
    return true;
  }
}
