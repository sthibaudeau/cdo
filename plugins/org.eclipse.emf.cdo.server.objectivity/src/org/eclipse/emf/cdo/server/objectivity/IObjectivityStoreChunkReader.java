/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Simon McDuff - initial API and implementation
 *    Ibrahim Sallam - code refactoring for CDO 3.0
 */
package org.eclipse.emf.cdo.server.objectivity;

import org.eclipse.emf.cdo.server.IStoreChunkReader;

/**
 * @author Eike Stepper
 */
public interface IObjectivityStoreChunkReader extends IStoreChunkReader
{
  /**
   * @since 2.0
   */
  public IObjectivityStoreAccessor getAccessor();
}