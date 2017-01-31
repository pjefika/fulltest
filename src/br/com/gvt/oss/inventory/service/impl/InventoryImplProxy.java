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
   
  
  
}