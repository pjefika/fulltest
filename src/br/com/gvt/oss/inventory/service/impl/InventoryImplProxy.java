package br.com.gvt.oss.inventory.service.impl;

public class InventoryImplProxy implements br.com.gvt.oss.inventory.service.impl.InventoryImpl {
  private String _endpoint = null;
  private br.com.gvt.oss.inventory.service.impl.InventoryImpl inventoryImpl = null;
  
  public InventoryImplProxy() {
    _initInventoryImplProxy();
  }
  
  public InventoryImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initInventoryImplProxy();
  }
  
  private void _initInventoryImplProxy() {
    try {
      inventoryImpl = (new br.com.gvt.oss.inventory.service.impl.InventoryServiceLocator()).getInventoryImplPort();
      if (inventoryImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)inventoryImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)inventoryImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (inventoryImpl != null)
      ((javax.xml.rpc.Stub)inventoryImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.gvt.oss.inventory.service.impl.InventoryImpl getInventoryImpl() {
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl;
  }
  
  public com.gvt.www.ws.eai.oss.inventory.api.InventoryItemResponse getItem(com.gvt.www.ws.eai.oss.inventory.api.ItemKey itemKey, boolean includeHistory, boolean cascade, long[] statusList) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.getItem(itemKey, includeHistory, cascade, statusList);
  }
  
  public com.gvt.www.ws.eai.oss.inventory.api.InventoryAccountResponse getAccountItems(java.lang.String accountId, java.lang.String addressId, java.lang.String designator, java.lang.String networkOwnerId, boolean inactiveCancelled) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.getAccountItems(accountId, addressId, designator, networkOwnerId, inactiveCancelled);
  }
  
  public br.com.gvt.oss.inventory.service.impl.DeactivateItemResponse deactivateItem(java.lang.String orderId, long systemId, com.gvt.www.ws.eai.oss.inventory.api.ItemKey[] items, boolean cascade, boolean finalStatus, long[] statusList) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.deactivateItem(orderId, systemId, items, cascade, finalStatus, statusList);
  }
  
  public br.com.gvt.oss.inventory.service.impl.SuspendItemResponse suspendItem(br.com.gvt.oss.inventory.service.impl.SuspendItem parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.suspendItem(parameters, orderId, systemId);
  }
  
  public br.com.gvt.oss.inventory.service.impl.GenerateAccessDesignatorResponse generateAccessDesignator(br.com.gvt.oss.inventory.service.impl.GenerateAccessDesignator parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.generateAccessDesignator(parameters, orderId, systemId);
  }
  
  public com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse getAssociatedDesignators(java.lang.String designator, com.gvt.www.ws.eai.oss.inventory.api.Filter filter) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.getAssociatedDesignators(designator, filter);
  }
  
  public br.com.gvt.oss.inventory.service.impl.ProvisionOrderResponse provisionOrder(java.lang.String orderId, long systemId, com.gvt.www.ws.eai.oss.inventory.api.Account account) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.provisionOrder(orderId, systemId, account);
  }
  
  public br.com.gvt.oss.inventory.service.impl.ReleaseAccessDesignatorResponse releaseAccessDesignator(br.com.gvt.oss.inventory.service.impl.ReleaseAccessDesignator parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.releaseAccessDesignator(parameters, orderId, systemId);
  }
  
  public br.com.gvt.oss.inventory.service.impl.AddSubItemResponse addSubItem(br.com.gvt.oss.inventory.service.impl.AddSubItem parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.addSubItem(parameters, orderId, systemId);
  }
  
  public br.com.gvt.oss.inventory.service.impl.ChangePhoneNumberResponse changePhoneNumber(br.com.gvt.oss.inventory.service.impl.ChangePhoneNumber parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.changePhoneNumber(parameters, orderId, systemId);
  }
  
  public br.com.gvt.oss.inventory.service.impl.ChangeAccountResponse changeAccount(br.com.gvt.oss.inventory.service.impl.ChangeAccount parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.changeAccount(parameters, orderId, systemId);
  }
  
  public br.com.gvt.oss.inventory.service.impl.ChangeAddressIdResponse changeAddressId(br.com.gvt.oss.inventory.service.impl.ChangeAddressId parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.changeAddressId(parameters, orderId, systemId);
  }
  
  public br.com.gvt.oss.inventory.service.impl.AddItemParametersResponse addItemParameters(br.com.gvt.oss.inventory.service.impl.AddItemParameters parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.addItemParameters(parameters, orderId, systemId);
  }
  
  public br.com.gvt.oss.inventory.service.impl.ChangeItemParametersResponse changeItemParameters(br.com.gvt.oss.inventory.service.impl.ChangeItemParameters parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.changeItemParameters(parameters, orderId, systemId);
  }
  
  public br.com.gvt.oss.inventory.service.impl.RemoveItemParametersResponse removeItemParameters(br.com.gvt.oss.inventory.service.impl.RemoveItemParameters parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.removeItemParameters(parameters, orderId, systemId);
  }
  
  public br.com.gvt.oss.inventory.service.impl.ActivateItemResponse activateItem(br.com.gvt.oss.inventory.service.impl.ActivateItem parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.activateItem(parameters, orderId, systemId);
  }
  
  public br.com.gvt.oss.inventory.service.impl.ConfirmAddressChangeResponse confirmAddressChange(br.com.gvt.oss.inventory.service.impl.ConfirmAddressChange parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.confirmAddressChange(parameters, orderId, systemId);
  }
  
  public br.com.gvt.oss.inventory.service.impl.CancelAddressChangeResponse cancelAddressChange(br.com.gvt.oss.inventory.service.impl.CancelAddressChange parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.cancelAddressChange(parameters, orderId, systemId);
  }
  
  public com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse generateNetworkOwnerId(java.lang.String cnl, java.lang.String prefix, java.lang.String sufix) throws java.rmi.RemoteException{
    if (inventoryImpl == null)
      _initInventoryImplProxy();
    return inventoryImpl.generateNetworkOwnerId(cnl, prefix, sufix);
  }
  
  
}