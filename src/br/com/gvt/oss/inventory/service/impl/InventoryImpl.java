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
    public br.com.gvt.oss.inventory.service.impl.SuspendItemResponse suspendItem(br.com.gvt.oss.inventory.service.impl.SuspendItem parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.GenerateAccessDesignatorResponse generateAccessDesignator(br.com.gvt.oss.inventory.service.impl.GenerateAccessDesignator parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse getAssociatedDesignators(java.lang.String designator, com.gvt.www.ws.eai.oss.inventory.api.Filter filter) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.ProvisionOrderResponse provisionOrder(java.lang.String orderId, long systemId, com.gvt.www.ws.eai.oss.inventory.api.Account account) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.ReleaseAccessDesignatorResponse releaseAccessDesignator(br.com.gvt.oss.inventory.service.impl.ReleaseAccessDesignator parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.AddSubItemResponse addSubItem(br.com.gvt.oss.inventory.service.impl.AddSubItem parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.ChangePhoneNumberResponse changePhoneNumber(br.com.gvt.oss.inventory.service.impl.ChangePhoneNumber parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.ChangeAccountResponse changeAccount(br.com.gvt.oss.inventory.service.impl.ChangeAccount parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.ChangeAddressIdResponse changeAddressId(br.com.gvt.oss.inventory.service.impl.ChangeAddressId parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.AddItemParametersResponse addItemParameters(br.com.gvt.oss.inventory.service.impl.AddItemParameters parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.ChangeItemParametersResponse changeItemParameters(br.com.gvt.oss.inventory.service.impl.ChangeItemParameters parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.RemoveItemParametersResponse removeItemParameters(br.com.gvt.oss.inventory.service.impl.RemoveItemParameters parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.ActivateItemResponse activateItem(br.com.gvt.oss.inventory.service.impl.ActivateItem parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.ConfirmAddressChangeResponse confirmAddressChange(br.com.gvt.oss.inventory.service.impl.ConfirmAddressChange parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public br.com.gvt.oss.inventory.service.impl.CancelAddressChangeResponse cancelAddressChange(br.com.gvt.oss.inventory.service.impl.CancelAddressChange parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse generateNetworkOwnerId(java.lang.String cnl, java.lang.String prefix, java.lang.String sufix) throws java.rmi.RemoteException;
}
