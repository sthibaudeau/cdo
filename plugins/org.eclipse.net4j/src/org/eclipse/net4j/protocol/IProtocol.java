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
package org.eclipse.net4j.protocol;

import org.eclipse.net4j.ILocationAware;
import org.eclipse.net4j.buffer.IBufferHandler;
import org.eclipse.net4j.buffer.IBufferProvider;
import org.eclipse.net4j.channel.IChannel;

import java.util.concurrent.ExecutorService;

/**
 * @author Eike Stepper
 */
public interface IProtocol<INFRA_STRUCTURE> extends ILocationAware, IBufferHandler
{
  public String getType();

  public IChannel getChannel();

  public void setChannel(IChannel channel);

  public INFRA_STRUCTURE getInfraStructure();

  public void setInfraStructure(INFRA_STRUCTURE infraStructure);

  public IBufferProvider getBufferProvider();

  public ExecutorService getExecutorService();

  public void setExecutorService(ExecutorService executorService);
}
