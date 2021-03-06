/*
 * Copyright (c) 2010-2012 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.location;

import org.eclipse.emf.cdo.session.CDOSessionConfigurationFactory;

import org.eclipse.net4j.util.container.IContainer;

import java.io.IOException;
import java.io.OutputStream;

/**
 * A CDO server independent representation of a repository.
 * 
 * @author Eike Stepper
 * @since 4.0
 * @apiviz.landmark
 * @apiviz.composedOf {@link ICheckoutSource}
 */
public interface IRepositoryLocation extends IContainer<ICheckoutSource>, CDOSessionConfigurationFactory
{
  public IRepositoryLocationManager getManager();

  public String getConnectorType();

  public String getConnectorDescription();

  public String getRepositoryName();

  public void write(OutputStream out) throws IOException;

  public void delete();
}
