/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package org.eclipse.emf.cdo.internal.common.model;

import org.eclipse.emf.cdo.common.CDODataInput;
import org.eclipse.emf.cdo.common.CDODataOutput;
import org.eclipse.emf.cdo.common.model.CDOClassifier;
import org.eclipse.emf.cdo.common.model.CDOClassifierRef;
import org.eclipse.emf.cdo.common.model.CDOPackage;
import org.eclipse.emf.cdo.common.model.CDOPackageManager;

import java.io.IOException;
import java.text.MessageFormat;

/**
 * TODO Optimize transfer of CDOClassifierRef instances
 * 
 * @author Eike Stepper
 */
public final class CDOClassRefImpl implements CDOClassifierRef
{
  private String packageURI;

  private int classifierID;

  public CDOClassRefImpl()
  {
  }

  public CDOClassRefImpl(String packageURI, int classifierID)
  {
    this.packageURI = packageURI;
    this.classifierID = classifierID;
  }

  public CDOClassRefImpl(CDODataInput in) throws IOException
  {
    packageURI = in.readCDOPackageURI();
    classifierID = in.readInt();
  }

  public void write(CDODataOutput out) throws IOException
  {
    out.writeCDOPackageURI(packageURI);
    out.writeInt(classifierID);
  }

  public String getPackageURI()
  {
    return packageURI;
  }

  public int getClassifierID()
  {
    return classifierID;
  }

  public CDOClassifier resolve(CDOPackageManager packageManager)
  {
    CDOPackage cdoPackage = packageManager.lookupPackage(packageURI);
    if (cdoPackage != null)
    {
      return cdoPackage.lookupClass(classifierID);
    }

    return null;
  }

  @Override
  public String toString()
  {
    return MessageFormat.format("CDOClassifierRef({0}, {1})", packageURI, classifierID);
  }
}
