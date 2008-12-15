/***************************************************************************
 * Copyright (c) 2004 - 2008 Eike Stepper, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Simon McDuff - initial API and implementation
 **************************************************************************/
package org.eclipse.emf.cdo.tests.bugzilla;

import org.eclipse.emf.cdo.CDOSession;
import org.eclipse.emf.cdo.CDOTransaction;
import org.eclipse.emf.cdo.common.model.CDOFeature;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.tests.AbstractCDOTest;
import org.eclipse.emf.cdo.tests.model1.Order;
import org.eclipse.emf.cdo.tests.model1.OrderDetail;
import org.eclipse.emf.cdo.tests.model1.PurchaseOrder;
import org.eclipse.emf.cdo.tests.model1.Supplier;
import org.eclipse.emf.cdo.util.CDOUtil;

/**
 * 246622: CDOStore.set doesn't affect variable correctly - Could cause memory retention
 * <p>
 * See https://bugs.eclipse.org/243310
 * 
 * @author Simon McDuff
 */
public class Bugzilla_246622_Test extends AbstractCDOTest
{
  public void testContainerAndMany() throws Exception
  {
    CDOSession session = openModel1Session();

    CDOTransaction transaction1 = session.openTransaction();
    CDOResource res = transaction1.createResource("/test1");
    Order order = getModel1Factory().createOrder();
    OrderDetail orderDetail = getModel1Factory().createOrderDetail();

    res.getContents().add(order);
    order.getOrderDetails().add(orderDetail);
    CDOFeature order_OrderDetailFeature = session.getPackageManager().convert(
        getModel1Package().getOrder_OrderDetails());
    assertEquals(orderDetail, CDOUtil.getCDOObject(order).cdoRevision().data().get(order_OrderDetailFeature, 0));

    assertEquals(order, CDOUtil.getCDOObject(orderDetail).cdoRevision().data().getContainerID());

    Order order2 = getModel1Factory().createOrder();
    OrderDetail orderDetail2 = getModel1Factory().createOrderDetail();

    order2.getOrderDetails().add(orderDetail2);
    res.getContents().add(order2);

    assertEquals(orderDetail2, CDOUtil.getCDOObject(order2).cdoRevision().data().get(order_OrderDetailFeature, 0));
    assertEquals(order2, CDOUtil.getCDOObject(orderDetail2).cdoRevision().data().getContainerID());

    msg("Committing");
    transaction1.commit();

    assertEquals(CDOUtil.getCDOObject(orderDetail).cdoID(), CDOUtil.getCDOObject(order).cdoRevision().data().get(
        order_OrderDetailFeature, 0));
    assertEquals(CDOUtil.getCDOObject(orderDetail2).cdoID(), CDOUtil.getCDOObject(order2).cdoRevision().data().get(
        order_OrderDetailFeature, 0));

    assertEquals(CDOUtil.getCDOObject(order).cdoID(), CDOUtil.getCDOObject(orderDetail).cdoRevision().data()
        .getContainerID());
    assertEquals(CDOUtil.getCDOObject(order2).cdoID(), CDOUtil.getCDOObject(orderDetail2).cdoRevision().data()
        .getContainerID());

    Order order3 = getModel1Factory().createOrder();

    res.getContents().add(order3);
    order3.getOrderDetails().add(orderDetail2);

    assertEquals(CDOUtil.getCDOObject(orderDetail2).cdoID(), CDOUtil.getCDOObject(order3).cdoRevision().data().get(
        order_OrderDetailFeature, 0));
    assertEquals(CDOUtil.getCDOObject(order3), CDOUtil.getCDOObject(orderDetail2).cdoRevision().data().getContainerID());

    msg("Committing");
    transaction1.commit();
  }

  public void testSet() throws Exception
  {
    CDOSession session = openModel1Session();

    CDOTransaction transaction1 = session.openTransaction();
    CDOResource res = transaction1.createResource("/test1");

    msg("Test set with link before");
    PurchaseOrder purchaseOrder = getModel1Factory().createPurchaseOrder();
    Supplier supplier = getModel1Factory().createSupplier();

    purchaseOrder.setSupplier(supplier);

    res.getContents().add(purchaseOrder);
    res.getContents().add(supplier);

    CDOFeature supplier_PurchaseOrder = session.getPackageManager().convert(
        getModel1Package().getSupplier_PurchaseOrders());
    CDOFeature purchaseOrder_Supplier = session.getPackageManager().convert(
        getModel1Package().getPurchaseOrder_Supplier());

    assertEquals(supplier, CDOUtil.getCDOObject(purchaseOrder).cdoRevision().data().get(purchaseOrder_Supplier, 0));
    assertEquals(purchaseOrder, CDOUtil.getCDOObject(supplier).cdoRevision().data().get(supplier_PurchaseOrder, 0));

    msg("Test set with link after");
    PurchaseOrder purchaseOrder2 = getModel1Factory().createPurchaseOrder();
    Supplier supplier2 = getModel1Factory().createSupplier();

    res.getContents().add(purchaseOrder2);
    res.getContents().add(supplier2);
    purchaseOrder2.setSupplier(supplier2);

    assertEquals(supplier2, CDOUtil.getCDOObject(purchaseOrder2).cdoRevision().data().get(purchaseOrder_Supplier, 0));
    assertEquals(purchaseOrder2, CDOUtil.getCDOObject(supplier2).cdoRevision().data().get(supplier_PurchaseOrder, 0));

    msg("Committing");
    transaction1.commit();

    assertEquals(CDOUtil.getCDOObject(supplier2).cdoID(), CDOUtil.getCDOObject(purchaseOrder2).cdoRevision().data()
        .get(purchaseOrder_Supplier, 0));
    assertEquals(CDOUtil.getCDOObject(purchaseOrder2).cdoID(), CDOUtil.getCDOObject(supplier2).cdoRevision().data()
        .get(supplier_PurchaseOrder, 0));

    assertEquals(CDOUtil.getCDOObject(supplier).cdoID(), CDOUtil.getCDOObject(purchaseOrder).cdoRevision().data().get(
        purchaseOrder_Supplier, 0));
    assertEquals(CDOUtil.getCDOObject(purchaseOrder).cdoID(), CDOUtil.getCDOObject(supplier).cdoRevision().data().get(
        supplier_PurchaseOrder, 0));

    msg("Test set with persisted CDOID");
    PurchaseOrder purchaseOrder3 = getModel1Factory().createPurchaseOrder();
    purchaseOrder3.setSupplier(supplier2);
    res.getContents().add(purchaseOrder3);

    assertEquals(CDOUtil.getCDOObject(supplier2).cdoID(), CDOUtil.getCDOObject(purchaseOrder3).cdoRevision().data()
        .get(purchaseOrder_Supplier, 0));
    assertEquals(purchaseOrder3, CDOUtil.getCDOObject(supplier2).cdoRevision().data().get(supplier_PurchaseOrder, 1));

    msg("Committing");
    transaction1.commit();
  }
}
