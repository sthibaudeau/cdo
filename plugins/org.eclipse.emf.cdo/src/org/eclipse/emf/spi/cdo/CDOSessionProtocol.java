/*
 * Copyright (c) 2009-2013 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 *    Christian W. Damus (CEA LIST) - bug 399306
 */
package org.eclipse.emf.spi.cdo;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.CDOObjectReference;
import org.eclipse.emf.cdo.common.CDOCommonRepository;
import org.eclipse.emf.cdo.common.CDOCommonRepository.IDGenerationLocation;
import org.eclipse.emf.cdo.common.CDOCommonSession.Options.LockNotificationMode;
import org.eclipse.emf.cdo.common.CDOCommonSession.Options.PassiveUpdateMode;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.branch.CDOBranchPoint;
import org.eclipse.emf.cdo.common.branch.CDOBranchPointRange;
import org.eclipse.emf.cdo.common.commit.CDOChangeSetData;
import org.eclipse.emf.cdo.common.commit.CDOCommitData;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDProvider;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.common.lob.CDOLob;
import org.eclipse.emf.cdo.common.lob.CDOLobInfo;
import org.eclipse.emf.cdo.common.lock.CDOLockState;
import org.eclipse.emf.cdo.common.model.CDOPackageUnit;
import org.eclipse.emf.cdo.common.protocol.CDOProtocol;
import org.eclipse.emf.cdo.common.revision.CDOIDAndVersion;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.common.revision.CDORevisionKey;
import org.eclipse.emf.cdo.common.security.CDOPermission;
import org.eclipse.emf.cdo.common.util.CDOCommonUtil;
import org.eclipse.emf.cdo.session.remote.CDORemoteSession;
import org.eclipse.emf.cdo.session.remote.CDORemoteSessionMessage;
import org.eclipse.emf.cdo.spi.common.CDORawReplicationContext;
import org.eclipse.emf.cdo.spi.common.CDOReplicationContext;
import org.eclipse.emf.cdo.spi.common.branch.InternalCDOBranchManager.BranchLoader;
import org.eclipse.emf.cdo.spi.common.commit.CDORevisionAvailabilityInfo;
import org.eclipse.emf.cdo.spi.common.commit.InternalCDOCommitInfoManager.CommitInfoLoader;
import org.eclipse.emf.cdo.spi.common.model.InternalCDOPackageRegistry.PackageLoader;
import org.eclipse.emf.cdo.spi.common.model.InternalCDOPackageUnit;
import org.eclipse.emf.cdo.spi.common.revision.CDOIDMapper;
import org.eclipse.emf.cdo.spi.common.revision.CDOReferenceAdjuster;
import org.eclipse.emf.cdo.spi.common.revision.InternalCDORevision;
import org.eclipse.emf.cdo.spi.common.revision.InternalCDORevisionManager.RevisionLoader;
import org.eclipse.emf.cdo.view.CDOView;

import org.eclipse.net4j.util.CheckUtil;
import org.eclipse.net4j.util.concurrent.IRWLockManager.LockType;
import org.eclipse.net4j.util.om.monitor.OMMonitor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.spi.cdo.InternalCDOTransaction.InternalCDOCommitContext;
import org.eclipse.emf.spi.cdo.InternalCDOXATransaction.InternalCDOXACommitContext;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * If the meaning of this type isn't clear, there really should be more of a description here...
 *
 * @author Eike Stepper
 * @since 2.0
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface CDOSessionProtocol extends CDOProtocol, PackageLoader, BranchLoader, RevisionLoader, CommitInfoLoader
{
  public RepositoryTimeResult getRepositoryTime();

  /**
   * @since 3.0
   */
  public void disablePassiveUpdate();

  /**
   * @since 3.0
   */
  public void setPassiveUpdateMode(PassiveUpdateMode mode);

  /**
   * @since 4.1
   */
  public void setLockNotificationMode(LockNotificationMode mode);

  /**
   * @since 3.0
   */
  public RefreshSessionResult refresh(long lastUpdateTime,
      Map<CDOBranch, Map<CDOID, InternalCDORevision>> viewedRevisions, int initialChunkSize,
      boolean enablePassiveUpdates);

  /**
   * @param accessIndex
   *          Index of the item access at the client (with modifications)
   * @param fetchIndex
   *          Index of the item access at the server (without any modifications)
   * @param fromIndex
   *          Load objects at the client from fromIndex (inclusive)
   * @param toIndex
   *          Load objects at the client to toIndex (inclusive)
   */
  public Object loadChunk(InternalCDORevision revision, EStructuralFeature feature, int accessIndex, int fetchIndex,
      int fromIndex, int toIndex);

  /**
   * @since 4.0
   */
  public void openView(int viewID, boolean readOnly, CDOBranchPoint branchPoint);

  /**
   * @since 4.0
   */
  public CDOBranchPoint openView(int viewID, boolean readOnly, String durableLockingID);

  /**
   * @since 4.0
   */
  public void switchTarget(int viewID, CDOBranchPoint branchPoint, List<InternalCDOObject> invalidObjects,
      List<CDORevisionKey> allChangedObjects, List<CDOIDAndVersion> allDetachedObjects, OMMonitor monitor);

  public void closeView(int viewID);

  public void changeSubscription(int viewId, List<CDOID> ids, boolean subscribeMode, boolean clear);

  /**
   * @since 4.0
   */
  public void query(CDOView view, AbstractQueryIterator<?> queryResult);

  public boolean cancelQuery(int queryId);

  /**
   * @since 4.0
   * @deprecated Not called anymore. Use {@link #lockObjects2(List, int, CDOBranch, LockType, boolean, long)} instead.
   */
  @Deprecated
  public LockObjectsResult lockObjects(List<InternalCDORevision> viewedRevisions, int viewID, CDOBranch viewedBranch,
      LockType lockType, long timeout) throws InterruptedException;

  /**
   * @since 4.1
   */
  public LockObjectsResult lockObjects2(List<CDORevisionKey> revisionKeys, int viewID, CDOBranch viewedBranch,
      LockType lockType, boolean recursive, long timeout) throws InterruptedException;

  /**
   * @since 4.1
   */
  public LockObjectsResult delegateLockObjects(String lockAreaID, List<CDORevisionKey> revisionKeys,
      CDOBranch viewedBranch, LockType lockType, boolean recursive, long timeout) throws InterruptedException;

  /**
   * @since 3.0
   * @deprecated Not called anymore. Use {@link #unlockObjects2(CDOView, Collection, LockType, boolean)} instead.
   */
  @Deprecated
  public void unlockObjects(CDOView view, Collection<CDOID> objectIDs, LockType lockType);

  /**
   * @since 4.1
   */
  public UnlockObjectsResult unlockObjects2(CDOView view, Collection<CDOID> objectIDs, LockType lockType,
      boolean recursive);

  /**
   * @since 4.1
   */
  public UnlockObjectsResult delegateUnlockObjects(String lockAreaID, Collection<CDOID> objectIDs, LockType lockType,
      boolean recursive);

  /**
   * @since 3.0
   */
  public boolean isObjectLocked(CDOView view, CDOObject object, LockType lockType, boolean byOthers);

  /**
   * @since 4.0
   */
  public String changeLockArea(CDOView view, boolean create);

  /**
   * @since 4.0
   */
  public List<byte[]> queryLobs(Set<byte[]> ids);

  /**
   * @since 4.0
   */
  public void loadLob(CDOLobInfo info, Object outputStreamOrWriter) throws IOException;

  /**
   * @since 4.0
   * @deprecated Not called anymore. Use {@link #commitTransaction(InternalCDOCommitContext, OMMonitor)} instead.
   */
  @Deprecated
  public CommitTransactionResult commitTransaction(int transactionID, String comment, boolean releaseLocks,
      CDOIDProvider idProvider, CDOCommitData commitData, Collection<CDOLob<?>> lobs, OMMonitor monitor);

  /**
   * @since 4.1
   */
  public CommitTransactionResult commitTransaction(InternalCDOCommitContext context, OMMonitor monitor);

  /**
   * @since 4.0
   * @deprecated Not called anymore. Use {@link #commitDelegation(InternalCDOCommitContext, OMMonitor)} instead.
   */
  @Deprecated
  public CommitTransactionResult commitDelegation(CDOBranch branch, String userID, String comment,
      CDOCommitData commitData, Map<CDOID, EClass> detachedObjectTypes, Collection<CDOLob<?>> lobs, OMMonitor monitor);

  /**
   * @since 4.1
   */
  public CommitTransactionResult commitDelegation(InternalCDOCommitContext context, OMMonitor monitor);

  /**
   * @since 3.0
   */
  public CommitTransactionResult commitXATransactionPhase1(InternalCDOXACommitContext xaContext, OMMonitor monitor);

  /**
   * @since 3.0
   */
  public CommitTransactionResult commitXATransactionPhase2(InternalCDOXACommitContext xaContext, OMMonitor monitor);

  /**
   * @since 3.0
   */
  public CommitTransactionResult commitXATransactionPhase3(InternalCDOXACommitContext xaContext, OMMonitor monitor);

  /**
   * @since 3.0
   */
  public CommitTransactionResult commitXATransactionCancel(InternalCDOXACommitContext xaContext, OMMonitor monitor);

  public List<CDORemoteSession> getRemoteSessions(InternalCDORemoteSessionManager manager, boolean subscribe);

  /**
   * @since 3.0
   */
  public Set<Integer> sendRemoteMessage(CDORemoteSessionMessage message, List<CDORemoteSession> recipients);

  /**
   * @since 3.0
   */
  public boolean unsubscribeRemoteSessions();

  /**
   * @since 4.0
   */
  public void replicateRepository(CDOReplicationContext context, OMMonitor monitor);

  /**
   * @since 4.0
   */
  public void replicateRepositoryRaw(CDORawReplicationContext context, OMMonitor monitor);

  /**
   * @since 3.0
   */
  public CDOChangeSetData[] loadChangeSets(CDOBranchPointRange... ranges);

  /**
   * @since 4.0
   */
  public Set<CDOID> loadMergeData(CDORevisionAvailabilityInfo targetInfo, CDORevisionAvailabilityInfo sourceInfo,
      CDORevisionAvailabilityInfo targetBaseInfo, CDORevisionAvailabilityInfo sourceBaseInfo);

  /**
   * @since 4.1
   */
  public CDOLockState[] getLockStates(int viewID, Collection<CDOID> ids);

  /**
   * @since 4.1
   */
  public void enableLockNotifications(int viewID, boolean enable);

  /**
   * @since 4.3
   */
  public Map<CDORevision, CDOPermission> loadPermissions(InternalCDORevision[] revisions);

  /**
   * Requests that the server initiate the change-credentials protocol.
   * This is an optional session protocol operation.
   * 
   * @since 4.3
   * 
   * @throws UnsupportedOperationException if the session protocol implementation does
   *         not support requesting change of credentials
   */
  public void requestChangeCredentials();

  /**
   * Requests that the server initiate the reset-credentials protocol.
   * This is an optional session protocol operation.
   * 
   * @param userID the ID of the user whose credentials are to be reset
   * 
   * @since 4.3
   * 
   * @throws UnsupportedOperationException if the session protocol implementation does
   *         not support requesting reset of credentials
   */
  public void requestResetCredentials(String userID);

  /**
   * If the meaning of this type isn't clear, there really should be more of a description here...
   *
   * @author Eike Stepper
   * @since 3.0
   * @noinstantiate This class is not intended to be instantiated by clients.
   */
  public final class OpenSessionResult
  {
    private int sessionID;

    private String userID;

    private String repositoryUUID;

    private CDOCommonRepository.Type repositoryType;

    private CDOCommonRepository.State repositoryState;

    private String storeType;

    private Set<CDOID.ObjectType> objectIDTypes;

    private long repositoryCreationTime;

    private long lastUpdateTime;

    private RepositoryTimeResult repositoryTimeResult;

    private CDOID rootResourceID;

    private boolean repositorySupportingAudits;

    private boolean repositorySupportingBranches;

    private boolean repositorySerializingCommits;

    private boolean repositoryEnsuringReferentialIntegrity;

    private List<InternalCDOPackageUnit> packageUnits = new ArrayList<InternalCDOPackageUnit>();

    private IDGenerationLocation repositoryIDGenerationLocation;

    /**
     * @since 4.2
     */
    public OpenSessionResult(int sessionID, String userID, String repositoryUUID,
        CDOCommonRepository.Type repositoryType, CDOCommonRepository.State repositoryState, String storeType,
        Set<CDOID.ObjectType> objectIDTypes, long repositoryCreationTime, long lastUpdateTime, CDOID rootResourceID,
        boolean repositorySupportingAudits, boolean repositorySupportingBranches, boolean repositorySerializingCommits,
        boolean repositoryEnsuringReferentialIntegrity, IDGenerationLocation repositoryIDGenerationLocation)
    {
      this.sessionID = sessionID;
      this.userID = userID;
      this.repositoryUUID = repositoryUUID;
      this.repositoryType = repositoryType;
      this.repositoryState = repositoryState;
      this.storeType = storeType;
      this.objectIDTypes = objectIDTypes;
      this.repositoryCreationTime = repositoryCreationTime;
      this.lastUpdateTime = lastUpdateTime;
      this.rootResourceID = rootResourceID;
      this.repositorySupportingAudits = repositorySupportingAudits;
      this.repositorySupportingBranches = repositorySupportingBranches;
      this.repositorySerializingCommits = repositoryEnsuringReferentialIntegrity;
      this.repositoryEnsuringReferentialIntegrity = repositoryEnsuringReferentialIntegrity;
      this.repositoryIDGenerationLocation = repositoryIDGenerationLocation;
    }

    public int getSessionID()
    {
      return sessionID;
    }

    /**
     * @since 3.0
     */
    public String getUserID()
    {
      return userID;
    }

    public String getRepositoryUUID()
    {
      return repositoryUUID;
    }

    /**
     * @since 3.0
     */
    public CDOCommonRepository.Type getRepositoryType()
    {
      return repositoryType;
    }

    /**
     * @since 3.0
     */
    public CDOCommonRepository.State getRepositoryState()
    {
      return repositoryState;
    }

    /**
     * @since 3.0
     */
    public String getStoreType()
    {
      return storeType;
    }

    /**
     * @since 3.0
     */
    public Set<CDOID.ObjectType> getObjectIDTypes()
    {
      return objectIDTypes;
    }

    /**
     * @since 3.0
     */
    public CDOID getRootResourceID()
    {
      return rootResourceID;
    }

    public long getRepositoryCreationTime()
    {
      return repositoryCreationTime;
    }

    public boolean isRepositorySupportingAudits()
    {
      return repositorySupportingAudits;
    }

    /**
     * @since 3.0
     */
    public boolean isRepositorySupportingBranches()
    {
      return repositorySupportingBranches;
    }

    /**
     * @deprecated As of 4.2 instances of Ecore are always supported (on demand).
     */
    @Deprecated
    public boolean isRepositorySupportingEcore()
    {
      return true;
    }

    /**
     * @since 4.2
     */
    public boolean isRepositorySerializingCommits()
    {
      return repositorySerializingCommits;
    }

    /**
     * @since 4.0
     */
    public boolean isRepositoryEnsuringReferentialIntegrity()
    {
      return repositoryEnsuringReferentialIntegrity;
    }

    /**
     * @since 4.1
     */
    public IDGenerationLocation getRepositoryIDGenerationLocation()
    {
      return repositoryIDGenerationLocation;
    }

    public RepositoryTimeResult getRepositoryTimeResult()
    {
      return repositoryTimeResult;
    }

    public void setRepositoryTimeResult(RepositoryTimeResult repositoryTimeResult)
    {
      this.repositoryTimeResult = repositoryTimeResult;
    }

    /**
     * @since 3.0
     */
    public long getLastUpdateTime()
    {
      return lastUpdateTime;
    }

    public List<InternalCDOPackageUnit> getPackageUnits()
    {
      return packageUnits;
    }
  }

  /**
   * If the meaning of this type isn't clear, there really should be more of a description here...
   *
   * @author Eike Stepper
   * @since 3.0
   */
  public static final class RefreshSessionResult
  {
    private long lastUpdateTime;

    private List<CDOPackageUnit> packageUnits = new ArrayList<CDOPackageUnit>();

    private Map<CDOBranch, List<InternalCDORevision>> changedObjects = new HashMap<CDOBranch, List<InternalCDORevision>>();

    private Map<CDOBranch, List<CDOIDAndVersion>> detachedObjects = new HashMap<CDOBranch, List<CDOIDAndVersion>>();

    public RefreshSessionResult(long lastUpdateTime)
    {
      this.lastUpdateTime = lastUpdateTime;
    }

    public long getLastUpdateTime()
    {
      return lastUpdateTime;
    }

    public List<CDOPackageUnit> getPackageUnits()
    {
      return packageUnits;
    }

    public List<InternalCDORevision> getChangedObjects(CDOBranch branch)
    {
      List<InternalCDORevision> list = changedObjects.get(branch);
      if (list == null)
      {
        return Collections.emptyList();
      }

      return list;
    }

    public List<CDOIDAndVersion> getDetachedObjects(CDOBranch branch)
    {
      List<CDOIDAndVersion> list = detachedObjects.get(branch);
      if (list == null)
      {
        return Collections.emptyList();
      }

      return list;
    }

    public void addPackageUnit(CDOPackageUnit packageUnit)
    {
      packageUnits.add(packageUnit);
    }

    public void addChangedObject(InternalCDORevision revision)
    {
      CDOBranch branch = revision.getBranch();
      List<InternalCDORevision> list = changedObjects.get(branch);
      if (list == null)
      {
        list = new ArrayList<InternalCDORevision>();
        changedObjects.put(branch, list);
      }

      list.add(revision);
    }

    public void addDetachedObject(CDORevisionKey revision)
    {
      CDOBranch branch = revision.getBranch();
      List<CDOIDAndVersion> list = detachedObjects.get(branch);
      if (list == null)
      {
        list = new ArrayList<CDOIDAndVersion>();
        detachedObjects.put(branch, list);
      }

      list.add(revision);
    }
  }

  /**
   * If the meaning of this type isn't clear, there really should be more of a description here...
   *
   * @author Eike Stepper
   */
  public final class RepositoryTimeResult
  {
    private long requested;

    private long indicated;

    private long responded;

    private long confirmed;

    public RepositoryTimeResult()
    {
    }

    public long getRequested()
    {
      return requested;
    }

    public void setRequested(long requested)
    {
      this.requested = requested;
    }

    public long getIndicated()
    {
      return indicated;
    }

    public void setIndicated(long indicated)
    {
      this.indicated = indicated;
    }

    public long getResponded()
    {
      return responded;
    }

    public void setResponded(long responded)
    {
      this.responded = responded;
    }

    public long getConfirmed()
    {
      return confirmed;
    }

    public void setConfirmed(long confirmed)
    {
      this.confirmed = confirmed;
    }

    public long getAproximateRepositoryOffset()
    {
      long latency = confirmed - requested >> 1;
      long shift = confirmed - responded;
      return shift - latency;
    }

    public long getAproximateRepositoryTime()
    {
      long offset = getAproximateRepositoryOffset();
      return System.currentTimeMillis() + offset;
    }

    @Override
    public String toString()
    {
      return MessageFormat.format(
          "RepositoryTime[requested={0}, indicated={1}, responded={2}, confirmed={3}]", //$NON-NLS-1$
          CDOCommonUtil.formatTimeStamp(requested), CDOCommonUtil.formatTimeStamp(indicated),
          CDOCommonUtil.formatTimeStamp(responded), CDOCommonUtil.formatTimeStamp(confirmed));
    }
  }

  /**
   * If the meaning of this type isn't clear, there really should be more of a description here...
   *
   * @author Eike Stepper
   * @since 3.0
   */
  public final class CommitTransactionResult implements CDOBranchPoint
  {
    private CDOIDProvider idProvider;

    private byte rollbackReason;

    private String rollbackMessage;

    private List<CDOObjectReference> xRefs;

    private CDOBranchPoint branchPoint;

    private long previousTimeStamp;

    private Map<CDOID, CDOID> idMappings = CDOIDUtil.createMap();

    private CDOReferenceAdjuster referenceAdjuster;

    private CDOLockState[] newLockStates;

    private boolean clearResourcePathCache;

    private byte securityImpact;

    private Map<CDOID, CDOPermission> newPermissions;

    /**
     * @since 4.3
     */
    public CommitTransactionResult()
    {
    }

    /**
     * @since 4.0
     * @deprecated As of 4.2
     */
    @Deprecated
    public CommitTransactionResult(CDOIDProvider idProvider, String rollbackMessage, CDOBranchPoint branchPoint,
        long previousTimeStamp, List<CDOObjectReference> xRefs)
    {
      throw new UnsupportedOperationException();
    }

    /**
     * @since 4.2
     * @deprecated As of 4.3
     */
    @Deprecated
    public CommitTransactionResult(CDOIDProvider idProvider, byte rollbackReason, String rollbackMessage,
        CDOBranchPoint branchPoint, long previousTimeStamp, List<CDOObjectReference> xRefs,
        boolean clearResourcePathCache)
    {
      throw new UnsupportedOperationException();
    }

    /**
     * @since 4.0
     * @deprecated As of 4.2
     */
    @Deprecated
    public CommitTransactionResult(CDOIDProvider idProvider, CDOBranchPoint branchPoint, long previousTimeStamp)
    {
      throw new UnsupportedOperationException();
    }

    /**
     * @since 4.2
     * @deprecated As of 4.3
     */
    @Deprecated
    public CommitTransactionResult(CDOIDProvider idProvider, CDOBranchPoint branchPoint, long previousTimeStamp,
        boolean clearResourcePathCache)
    {
      throw new UnsupportedOperationException();
    }

    /**
     * @since 3.0
     */
    public CDOBranch getBranch()
    {
      return branchPoint.getBranch();
    }

    public long getTimeStamp()
    {
      return branchPoint.getTimeStamp();
    }

    /**
     * @since 4.3
     */
    public void setBranchPoint(CDOBranchPoint branchPoint)
    {
      this.branchPoint = branchPoint;
    }

    /**
     * @since 4.0
     */
    public long getPreviousTimeStamp()
    {
      return previousTimeStamp;
    }

    /**
     * @since 4.3
     */
    public void setPreviousTimeStamp(long previousTimeStamp)
    {
      this.previousTimeStamp = previousTimeStamp;
    }

    /**
     * @since 4.0
     */
    public CDOReferenceAdjuster getReferenceAdjuster()
    {
      if (referenceAdjuster == null)
      {
        referenceAdjuster = createReferenceAdjuster();
      }

      return referenceAdjuster;
    }

    /**
     * @since 4.0
     */
    public void setReferenceAdjuster(CDOReferenceAdjuster referenceAdjuster)
    {
      this.referenceAdjuster = referenceAdjuster;
    }

    /**
     * @since 4.2
     */
    public byte getRollbackReason()
    {
      return rollbackReason;
    }

    /**
     * @since 4.3
     */
    public void setRollbackReason(byte rollbackReason)
    {
      this.rollbackReason = rollbackReason;
    }

    public String getRollbackMessage()
    {
      return rollbackMessage;
    }

    /**
     * @since 4.3
     */
    public void setRollbackMessage(String rollbackMessage)
    {
      this.rollbackMessage = rollbackMessage;
    }

    /**
     * @since 4.0
     */
    public List<CDOObjectReference> getXRefs()
    {
      return xRefs;
    }

    /**
     * @since 4.3
     */
    public void setXRefs(List<CDOObjectReference> xRefs)
    {
      this.xRefs = xRefs;
    }

    /**
     * @since 4.2
     */
    public boolean isClearResourcePathCache()
    {
      return clearResourcePathCache;
    }

    /**
     * @since 4.3
     */
    public void setClearResourcePathCache(boolean clearResourcePathCache)
    {
      this.clearResourcePathCache = clearResourcePathCache;
    }

    /**
     * @since 4.3
     */
    public byte getSecurityImpact()
    {
      return securityImpact;
    }

    /**
     * @since 4.3
     */
    public void setSecurityImpact(byte securityImpact)
    {
      this.securityImpact = securityImpact;
    }

    /**
     * @since 4.3
     */
    public CDOIDProvider getIDProvider()
    {
      return idProvider;
    }

    /**
     * @since 4.3
     */
    public void setIDProvider(CDOIDProvider idProvider)
    {
      this.idProvider = idProvider;
    }

    public Map<CDOID, CDOID> getIDMappings()
    {
      return idMappings;
    }

    /**
     * @since 3.0
     */
    public void addIDMapping(CDOID oldID, CDOID newID)
    {
      idMappings.put(oldID, newID);
    }

    /**
     * @since 4.1
     */
    public CDOLockState[] getNewLockStates()
    {
      return newLockStates;
    }

    /**
     * @since 4.1
     */
    public void setNewLockStates(CDOLockState[] newLockStates)
    {
      CheckUtil.checkArg(newLockStates, "newLockStates");
      this.newLockStates = newLockStates;
    }

    /**
     * @since 4.3
     */
    public Map<CDOID, CDOPermission> getNewPermissions()
    {
      return newPermissions;
    }

    /**
     * @since 4.3
     */
    public void addNewPermission(CDOID id, CDOPermission permission)
    {
      if (newPermissions == null)
      {
        newPermissions = CDOIDUtil.createMap();
      }

      newPermissions.put(id, permission);
    }

    protected PostCommitReferenceAdjuster createReferenceAdjuster()
    {
      return new PostCommitReferenceAdjuster(idProvider, new CDOIDMapper(idMappings));
    }

    /**
     * If the meaning of this type isn't clear, there really should be more of a description here...
     *
     * @author Simon McDuff
     */
    protected static class PostCommitReferenceAdjuster implements CDOReferenceAdjuster
    {
      private CDOIDProvider idProvider;

      private CDOIDMapper idMapper;

      public PostCommitReferenceAdjuster(CDOIDProvider idProvider, CDOIDMapper idMapper)
      {
        this.idProvider = idProvider;
        this.idMapper = idMapper;
      }

      /**
       * @since 4.0
       */
      public Object adjustReference(Object id, EStructuralFeature feature, int index)
      {
        if (id == null || id == CDOID.NULL)
        {
          return id;
        }

        if (idProvider != null && (id instanceof CDOID || id instanceof InternalEObject))
        {
          id = idProvider.provideCDOID(id);
        }

        return idMapper.adjustReference(id, feature, index);
      }
    }
  }

  /**
   * If the meaning of this type isn't clear, there really should be more of a description here...
   *
   * @since 4.0
   */
  public static final class LockObjectsResult
  {
    private boolean successful;

    private boolean timedOut;

    private boolean waitForUpdate;

    private long requiredTimestamp;

    private long timestamp;

    private CDORevisionKey[] staleRevisions;

    private CDOLockState[] newLockStates;

    @Deprecated
    public LockObjectsResult(boolean successful, boolean timedOut, boolean waitForUpdate, long requiredTimestamp,
        CDORevisionKey[] staleRevisions)
    {
      throw new AssertionError("Deprecated");
    }

    /**
     * @since 4.1
     */
    public LockObjectsResult(boolean successful, boolean timedOut, boolean waitForUpdate, long requiredTimestamp,
        CDORevisionKey[] staleRevisions, CDOLockState[] newLockStates, long timestamp)
    {
      this.successful = successful;
      this.timedOut = timedOut;
      this.waitForUpdate = waitForUpdate;
      this.requiredTimestamp = requiredTimestamp;
      this.staleRevisions = staleRevisions;
      this.newLockStates = newLockStates;
      this.timestamp = timestamp;
    }

    public boolean isSuccessful()
    {
      return successful;
    }

    public boolean isTimedOut()
    {
      return timedOut;
    }

    public boolean isWaitForUpdate()
    {
      return waitForUpdate;
    }

    public long getRequiredTimestamp()
    {
      return requiredTimestamp;
    }

    public CDORevisionKey[] getStaleRevisions()
    {
      return staleRevisions;
    }

    /**
     * @since 4.1
     */
    public CDOLockState[] getNewLockStates()
    {
      return newLockStates;
    }

    /**
     * @since 4.1
     */
    public long getTimestamp()
    {
      return timestamp;
    }
  }

  /**
   * If the meaning of this type isn't clear, there really should be more of a description here...
   *
   * @since 4.1
   */
  public static final class UnlockObjectsResult
  {
    private CDOLockState[] newLockStates;

    private long timestamp;

    public UnlockObjectsResult(CDOLockState[] newLockStates, long timestamp)
    {
      this.newLockStates = newLockStates;
    }

    public CDOLockState[] getNewLockStates()
    {
      return newLockStates;
    }

    public long getTimestamp()
    {
      return timestamp;
    }
  }
}
