/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Stefan Winkler - initial API and implementation
 **************************************************************************/
package org.eclipse.emf.cdo.tests;

import org.eclipse.emf.cdo.CDOSession;
import org.eclipse.emf.cdo.CDOTransaction;
import org.eclipse.emf.cdo.CDOView;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.tests.model1.Company;
import org.eclipse.emf.cdo.tests.model1.Model1Factory;

/**
 * @author Stefan Winkler
 */
public class DBStoreTest extends AbstractCDOTest
{
  // Bug 256462
  public void testInsertNull() throws Exception
  {
    CDOSession s = openModel1Session();
    CDOTransaction t = s.openTransaction();
    CDOResource r = t.createResource("/dbStoreTest");

    Company c = Model1Factory.eINSTANCE.createCompany();
    c.setName(null);
    r.getContents().add(c);

    t.commit();
  }

  public void testStoreStringTrailingBackslash()
  {
    storeRetrieve("foobar\\");
  }

  public void testStoreStringContainingBackslash()
  {
    storeRetrieve("foo\\bar");
  }

  public void testStoreStringTrailingSingleQuote()
  {
    storeRetrieve("foobar'");
  }

  public void testStoreStringContainingSingleQuote()
  {
    storeRetrieve("foo'bar");
  }

  public void testStoreStringTrailingDoubleQuote()
  {
    storeRetrieve("foobar\"");
  }

  public void testStoreStringContainingDoubleQuote()
  {
    storeRetrieve("foo\"bar");
  }

  public void testStoreStringTrailingTwoSingleQuote()
  {
    storeRetrieve("foobar''");
  }

  public void testStoreStringContainingTwoSingleQuote()
  {
    storeRetrieve("foo''bar");
  }

  private void storeRetrieve(String s)
  {
    CDOSession session = openModel1Session();
    CDOTransaction transaction = session.openTransaction();
    CDOResource resource = transaction.getOrCreateResource("/test");

    Company e = Model1Factory.eINSTANCE.createCompany();
    e.setName(s);
    // this escapes only the string!
    // resulting string only contains one backslash

    resource.getContents().add(e);
    transaction.commit();

    transaction.close();
    session.close();
    clearCache(getRepository().getRevisionManager());

    session = openModel1Session();
    CDOView view = session.openView();
    resource = view.getResource("/test");

    assertEquals(1, resource.getContents().size());
    e = (Company)resource.getContents().get(0);
    assertEquals(s, e.getName());
  }
}
