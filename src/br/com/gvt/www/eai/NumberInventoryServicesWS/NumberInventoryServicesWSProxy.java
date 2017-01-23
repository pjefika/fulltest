package br.com.gvt.www.eai.NumberInventoryServicesWS;

public class NumberInventoryServicesWSProxy implements br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWS {
  private String _endpoint = null;
  private br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWS numberInventoryServicesWS = null;
  
  public NumberInventoryServicesWSProxy() {
    _initNumberInventoryServicesWSProxy();
  }
  
  public NumberInventoryServicesWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initNumberInventoryServicesWSProxy();
  }
  
  private void _initNumberInventoryServicesWSProxy() {
    try {
      numberInventoryServicesWS = (new br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWSServiceLocator()).getNumberInventoryServicesWS();
      if (numberInventoryServicesWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)numberInventoryServicesWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)numberInventoryServicesWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (numberInventoryServicesWS != null)
      ((javax.xml.rpc.Stub)numberInventoryServicesWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWS getNumberInventoryServicesWS() {
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    return numberInventoryServicesWS;
  }
  
  public br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeOut getSwitchesByType(br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeIn getSwitchesByTypeIn) throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    return numberInventoryServicesWS.getSwitchesByType(getSwitchesByTypeIn);
  }
  
  public br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeOut changeSwichByRange(br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeIn changeSwichByRangeIn) throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    return numberInventoryServicesWS.changeSwichByRange(changeSwichByRangeIn);
  }
  
  public br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeOut getBDOByRange(br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeIn getBDOByRangeIn) throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    return numberInventoryServicesWS.getBDOByRange(getBDOByRangeIn);
  }
  
  public br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberOut updateEquipmentNumber(br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberIn updateEquipmentNumberIn) throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    return numberInventoryServicesWS.updateEquipmentNumber(updateEquipmentNumberIn);
  }
  
  public void liberarNaoLiberado() throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    numberInventoryServicesWS.liberarNaoLiberado();
  }
  
  public void liberarNaoSeAplica() throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    numberInventoryServicesWS.liberarNaoSeAplica();
  }
  
  public void liberarCancelado() throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    numberInventoryServicesWS.liberarCancelado();
  }
  
  public void liberarQuarentena() throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    numberInventoryServicesWS.liberarQuarentena();
  }
  
  public void liberarInconsistente() throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    numberInventoryServicesWS.liberarInconsistente();
  }
  
  public void liberarReservado() throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    numberInventoryServicesWS.liberarReservado();
  }
  
  public void liberarNumeros(br.com.gvt.www.eai.NumberInventoryServicesWS.LiberarNumerosIn arg0) throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    numberInventoryServicesWS.liberarNumeros(arg0);
  }
  
  public br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterOut getSwitchInfoByFilter(br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterIn getSwitchInfoByFilterIn) throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    return numberInventoryServicesWS.getSwitchInfoByFilter(getSwitchInfoByFilterIn);
  }
  
  public br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2Out getRouteRN2(br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2In getRouteRN2In) throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    return numberInventoryServicesWS.getRouteRN2(getRouteRN2In);
  }
  
  public br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut getNumberByFilter(br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterIn getNumberByFilterIn) throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    return numberInventoryServicesWS.getNumberByFilter(getNumberByFilterIn);
  }
  
  public void associateEquipmentNumber(br.com.gvt.www.eai.NumberInventoryServicesWS.AssociateEquipmentNumberIn associateEquipmentNumberIn) throws java.rmi.RemoteException{
    if (numberInventoryServicesWS == null)
      _initNumberInventoryServicesWSProxy();
    numberInventoryServicesWS.associateEquipmentNumber(associateEquipmentNumberIn);
  }
  
  
}