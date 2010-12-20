/**
 * Copyright (c) 2004 - 2010 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Fluegge - initial API and implementation
 */
package org.eclipse.emf.cdo.dawn.tests;

import org.eclipse.emf.cdo.dawn.tests.ui.util.DawnEMFEditorBot;

import org.junit.Before;

/**
 * @author Martin Fluegge
 */
public abstract class AbstractDawnEMFTest extends AbstractDawnUITest<DawnEMFEditorBot>
{
  @Override
  @Before
  public void setUp() throws Exception
  {
    super.setUp();
  }

  @Override
  protected void createBot()
  {
    setBot(new DawnEMFEditorBot());
  }
}
