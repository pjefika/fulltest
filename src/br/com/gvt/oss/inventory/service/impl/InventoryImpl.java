/**
 * InventoryImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.oss.inventory.service.impl;

public interface InventoryImpl extends java.rmi.Remote {
    public com.gvt.www.ws.eai.oss.inventory.api.InventoryItemResponse getItem(com.gvt.www.ws.eai.oss.inventory.api.ItemKey itemKey, boolean includeHistory, boolean cascade, long[] statusList) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.oss.inventory.api.InventoryAccountResponse getAccountItems(java.lang.String accountId, java.lang.String addressId, java.lang.String designator, java.lang.String networkOwnerId, boolean inactiveCancelled) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.DeactivateItemResponse deactivateItem(java.lang.String orderId, long systemId, com.gvt.www.ws.eai.oss.inventory.api.ItemKey[] items, boolean cascade, boolean finalStatus, long[] statusList) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse getAssociatedDesignators(java.lang.String designator, com.gvt.www.ws.eai.oss.inventory.api.Filter filter) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse generateNetworkOwnerId(java.lang.String cnl, java.lang.String prefix, java.lang.String sufix) throws java.rmi.RemoteException;
}
