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
package org.eclipse.net4j.signal.failover;

import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.signal.ISignalProtocol;
import org.eclipse.net4j.util.event.Notifier;

/**
 * @author Eike Stepper
 */
public class NOOPFailOverStrategy extends Notifier implements IFailOverStrategy
{
  private IConnector connector;

  /**
   * @since 2.0
   */
  public NOOPFailOverStrategy(IConnector connector)
  {
    setConnector(connector);
  }

  /**
   * @since 2.0
   */
  public IConnector getConnector()
  {
    return connector;
  }

  /**
   * @since 2.0
   */
  public void setConnector(IConnector connector)
  {
    this.connector = connector;
  }

  /**
   * @since 2.0
   */
  public IConnector open(ISignalProtocol<?> protocol)
  {
    return connector;
  }

  /**
   * @since 2.0
   */
  public void failOver(ISignalProtocol<?> protocol)
  {
    throw new UnsupportedOperationException();
  }
}
