/**
 * Copyright (c) 2004 - 2009 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Simon McDuff - initial API and implementation
 *    Eike Stepper - maintenance
 */
package org.eclipse.emf.cdo.server.internal.net4j.protocol;

import org.eclipse.emf.cdo.common.id.CDOIDAndBranch;
import org.eclipse.emf.cdo.common.io.CDODataInput;
import org.eclipse.emf.cdo.common.io.CDODataOutput;
import org.eclipse.emf.cdo.common.protocol.CDOProtocolConstants;
import org.eclipse.emf.cdo.server.IView;

import org.eclipse.net4j.util.concurrent.IRWLockManager.LockType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon McDuff
 */
public class UnlockObjectsIndication extends CDOReadIndication
{
  public UnlockObjectsIndication(CDOServerProtocol protocol)
  {
    super(protocol, CDOProtocolConstants.SIGNAL_UNLOCK_OBJECTS);
  }

  @Override
  protected void indicating(CDODataInput in) throws IOException
  {
    int viewID = in.readInt();
    LockType lockType = in.readCDOLockType();
    int size = in.readInt();

    IView view = getSession().getView(viewID);
    if (size == CDOProtocolConstants.RELEASE_ALL_LOCKS)
    {
      getRepository().getLockManager().unlock(view);
    }
    else
    {
      List<CDOIDAndBranch> idAndBranches = new ArrayList<CDOIDAndBranch>(size);
      for (int i = 0; i < size; i++)
      {
        CDOIDAndBranch idAndBranch = in.readCDOIDAndBranch();
        idAndBranches.add(idAndBranch);
      }

      getRepository().getLockManager().unlock(lockType, view, idAndBranches);
    }
  }

  @Override
  protected void responding(CDODataOutput out) throws IOException
  {
    out.writeBoolean(true);
  }
}
