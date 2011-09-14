/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.cdo.releng.doc.article.impl;

import org.eclipse.emf.cdo.releng.doc.article.ArticlePackage;
import org.eclipse.emf.cdo.releng.doc.article.Body;
import org.eclipse.emf.cdo.releng.doc.article.Link;
import org.eclipse.emf.cdo.releng.doc.article.LinkTarget;
import org.eclipse.emf.cdo.releng.doc.article.StructuralElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.sun.javadoc.SeeTag;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.cdo.releng.doc.article.impl.LinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LinkImpl extends BodyElementImpl implements Link
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected LinkTarget target;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected LinkImpl()
  {
    super();
  }

  LinkImpl(Body body, SeeTag tag, LinkTarget target)
  {
    super(body, tag);
    this.target = target;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArticlePackage.Literals.LINK;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public LinkTarget getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setTarget(LinkTarget newTarget)
  {
    LinkTarget oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArticlePackage.LINK__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case ArticlePackage.LINK__TARGET:
      return getTarget();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case ArticlePackage.LINK__TARGET:
      setTarget((LinkTarget)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case ArticlePackage.LINK__TARGET:
      setTarget((LinkTarget)null);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case ArticlePackage.LINK__TARGET:
      return target != null;
    }
    return super.eIsSet(featureID);
  }

  @Override
  public SeeTag getTag()
  {
    return (SeeTag)super.getTag();
  }

  @Override
  public String getHtml(StructuralElement linkSource)
  {
    String href = target.linkFrom(linkSource);

    SeeTag tag = getTag();
    String label = tag.label();
    if (label == null || label.length() == 0)
    {
      label = target.getDefaultLabel();
      if (label == null || label.length() == 0)
      {
        label = tag.text();
      }
    }

    String tooltip = target.getTooltip();
    if (tooltip != null && tooltip.length() != 0)
    {
      tooltip = " title=\"" + tooltip + "\"";
    }
    else
    {
      tooltip = "";
    }

    return "<a href=\"" + href + "\"" + tooltip + ">" + label + "</a>";
  }

} // LinkImpl
