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
package org.eclipse.emf.cdo.tests.bugzilla;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.tests.AbstractCDOTest;
import org.eclipse.emf.cdo.tests.model1.Category;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

/**
 * @author Eike Stepper
 */
public class Bugzilla_324585_Test extends AbstractCDOTest
{
  @Test
  public void testUpdate() throws CommitException
  {
    // user 1
    CDOSession session1 = openSession();
    CDOTransaction transaction1 = session1.openTransaction();
    CDOResource resource1 = transaction1.createResource("test");

    Category category1 = getModel1Factory().createCategory();
    resource1.getContents().add(category1);
    resource1.getContents().add(category1);
    transaction1.commit();

    // user 2
    CDOSession session2 = openSession();
    session2.options().setPassiveUpdateEnabled(false);
    CDOTransaction transaction2 = session2.openTransaction();
    CDOResource resource2 = transaction2.getResource("test");

    EObject category2 = resource2.getContents().get(0);
    category2.eAdapters().add(new AdapterImpl());

    // user1
    for (int i = 0; i < 1000; i++)
    {
      category1.getProducts().add(getModel1Factory().createProduct1());
    }

    transaction1.commit();

    // user2
    session2.refresh();
  }
}
