/*
 * Copyright (c) 2012 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 *    Christian W. Damus (CEA LIST) - bug 418454
 */
package org.eclipse.emf.cdo.server.internal.admin.protocol;

import org.eclipse.emf.cdo.common.CDOCommonRepository.State;
import org.eclipse.emf.cdo.common.CDOCommonRepository.Type;
import org.eclipse.emf.cdo.server.internal.admin.CDOAdminServer;
import org.eclipse.emf.cdo.server.internal.admin.CDOAdminServerRepository;
import org.eclipse.emf.cdo.spi.common.admin.CDOAdminProtocolConstants;
import org.eclipse.emf.cdo.spi.server.IAuthenticationProtocol;

import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.signal.SignalReactor;
import org.eclipse.net4j.signal.security.AuthenticationRequest;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.net4j.util.security.CredentialsUpdateOperation;
import org.eclipse.net4j.util.security.DiffieHellman.Client.Response;
import org.eclipse.net4j.util.security.DiffieHellman.Server.Challenge;

import org.eclipse.spi.net4j.ServerProtocolFactory;

/**
 * @author Eike Stepper
 */
public class CDOAdminServerProtocol extends SignalProtocol<CDOAdminServer> implements IAuthenticationProtocol
{
  public static final long DEFAULT_NEGOTIATION_TIMEOUT = 15 * 1000;

  private long negotiationTimeout = DEFAULT_NEGOTIATION_TIMEOUT;

  private final IManagedContainer container;

  public CDOAdminServerProtocol(IManagedContainer container, CDOAdminServer admin)
  {
    super(CDOAdminProtocolConstants.PROTOCOL_NAME);
    this.container = container;
    setInfraStructure(admin);
    admin.registerProtocol(this);
  }

  public final IManagedContainer getContainer()
  {
    return container;
  }

  public void sendRepositoryAdded(CDOAdminServerRepository repository) throws Exception
  {
    if (LifecycleUtil.isActive(getChannel()))
    {
      new RepositoryAddedRequest(this, repository).sendAsync();
    }
  }

  public void sendRepositoryRemoved(String name) throws Exception
  {
    if (LifecycleUtil.isActive(getChannel()))
    {
      new RepositoryRemovedRequest(this, name).sendAsync();
    }
  }

  public void sendRepositoryTypeChanged(String name, Type oldType, Type newType) throws Exception
  {
    if (LifecycleUtil.isActive(getChannel()))
    {
      new RepositoryTypeChangedRequest(this, name, oldType, newType).sendAsync();
    }
  }

  public void sendRepositoryStateChanged(String name, State oldState, State newState) throws Exception
  {
    if (LifecycleUtil.isActive(getChannel()))
    {
      new RepositoryStateChangedRequest(this, name, oldState, newState).sendAsync();
    }
  }

  public void sendRepositoryReplicationProgressed(String name, double totalWork, double work) throws Exception
  {
    if (LifecycleUtil.isActive(getChannel()))
    {
      new RepositoryReplicationPogressedRequest(this, name, totalWork, work).sendAsync();
    }
  }

  public long getNegotiationTimeout()
  {
    return negotiationTimeout;
  }

  public void setNegotiationTimeout(long negotiationTimeout)
  {
    this.negotiationTimeout = negotiationTimeout;
  }

  public Response sendAuthenticationChallenge(Challenge challenge) throws Exception
  {
    return new AuthenticationRequest(this, CDOAdminProtocolConstants.SIGNAL_AUTHENTICATION, challenge)
        .send(negotiationTimeout);
  }

  public Response sendCredentialsChallenge(Challenge challenge, String userID, CredentialsUpdateOperation operation)
      throws Exception
  {
    throw new UnsupportedOperationException("sendCredentialsChallenge"); //$NON-NLS-1$
  }

  @Override
  protected SignalReactor createSignalReactor(short signalID)
  {
    switch (signalID)
    {
    case CDOAdminProtocolConstants.SIGNAL_QUERY_REPOSITORIES:
      return new QueryRepositoriesIndication(this);

    case CDOAdminProtocolConstants.SIGNAL_CREATE_REPOSITORY:
      return new CreateRepositoryIndication(this);

    case CDOAdminProtocolConstants.SIGNAL_DELETE_REPOSITORY:
      return new DeleteRepositoryIndication(this);

    default:
      return super.createSignalReactor(signalID);
    }
  }

  @Override
  protected void doDeactivate() throws Exception
  {
    getInfraStructure().deregisterProtocol(this);
    super.doDeactivate();
  }

  /**
   * @author Eike Stepper
   */
  public static class Factory extends ServerProtocolFactory
  {
    public static final String TYPE = CDOAdminProtocolConstants.PROTOCOL_NAME;

    private IManagedContainer container;

    public Factory(IManagedContainer container)
    {
      super(TYPE);
      this.container = container;
    }

    public IManagedContainer getContainer()
    {
      return container;
    }

    public CDOAdminServerProtocol create(String description)
    {
      CDOAdminServer admin = getAdmin();
      return new CDOAdminServerProtocol(container, admin);
    }

    protected CDOAdminServer getAdmin()
    {
      String productGroup = CDOAdminServer.Factory.PRODUCT_GROUP;
      String type = CDOAdminServer.Factory.TYPE;
      return (CDOAdminServer)container.getElement(productGroup, type, null);
    }

    public static CDOAdminServerProtocol get(IManagedContainer container, String description)
    {
      return (CDOAdminServerProtocol)container.getElement(PRODUCT_GROUP, TYPE, description);
    }

    /**
     * @author Eike Stepper
     */
    public static final class Plugin extends Factory
    {
      public Plugin()
      {
        super(IPluginContainer.INSTANCE);
      }
    }
  }
}
