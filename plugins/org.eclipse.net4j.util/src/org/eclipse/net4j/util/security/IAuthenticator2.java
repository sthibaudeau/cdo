/*
 * Copyright (c) 2013 Eike Stepper (Berlin, Germany), CEA LIST, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Christian W. Damus (CEA LIST) - initial API and implementation
 */
package org.eclipse.net4j.util.security;

/**
 * Extension interface for authenticators that can update user credentials in addition to authenticating them.
 * 
 * @since 3.4
 */
public interface IAuthenticator2 extends IAuthenticator
{

  /**
   * Updates the password <em>stored</em> for the user identified by {@code userID}.  The {@code oldPassword} is authenticated
   * {@linkplain IAuthenticator#authenticate(String, char[]) as per usual} and is replaced by the {@code newPassword} only
   * (and atomically) on success.
   * 
   * @param userID the ID of the user whose password is to be updated
   * @param oldPassword the user's current password attempt to verify against the <em>stored</em> password
   * @param newPassword the new password to replace the {@code oldPassword}
   * 
   * @throws SecurityException on any failure to authenticate the {@code oldPassword} or validate and/or set the {@code newPassword}
   */
  void updatePassword(String userID, char[] oldPassword, char[] newPassword);
}
