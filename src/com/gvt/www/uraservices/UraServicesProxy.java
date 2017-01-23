package com.gvt.www.uraservices;

public class UraServicesProxy implements com.gvt.www.uraservices.UraServices {
  private String _endpoint = null;
  private com.gvt.www.uraservices.UraServices uraServices = null;
  
  public UraServicesProxy() {
    _initUraServicesProxy();
  }
  
  public UraServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initUraServicesProxy();
  }
  
  private void _initUraServicesProxy() {
    try {
      uraServices = (new com.gvt.www.uraservices.UraServicesServiceLocator()).getUraServicesPort();
      if (uraServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)uraServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)uraServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (uraServices != null)
      ((javax.xml.rpc.Stub)uraServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gvt.www.uraservices.UraServices getUraServices() {
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices;
  }
  
  public com.gvt.www.uraservices.CheckCustomerCoverageOut verifyCoverageByCEP(com.gvt.www.uraservices.CheckCustomerCoverageIn verifyCoverageByCEPIn) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.verifyCoverageByCEP(verifyCoverageByCEPIn);
  }
  
  public int saleTVVas(java.lang.String channel, java.lang.String agent, java.lang.String comQuoteSolutionId, java.lang.String assetNumber, com.gvt.www.uraservices.VasElementVO[] element) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.saleTVVas(channel, agent, comQuoteSolutionId, assetNumber, element);
  }
  
  public com.gvt.www.uraservices.CertifyOut certificar(com.gvt.www.uraservices.CertifyIn certificarInDocument) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.certificar(certificarInDocument);
  }
  
  public boolean permiteAlteracaoDataVencimento(java.lang.String conta) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.permiteAlteracaoDataVencimento(conta);
  }
  
  public com.gvt.www.uraservices.CancelTTOut cancelarTT(com.gvt.www.uraservices.CancelTTIn cancelarTTIn) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.cancelarTT(cancelarTTIn);
  }
  
  public com.gvt.www.uraservices.CreateSSFromUraOut createSSFromUra(com.gvt.www.uraservices.CreateSSFromUraIn createSSFromUraIn) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.createSSFromUra(createSSFromUraIn);
  }
  
  public com.gvt.www.uraservices.GetSSByFilterUraOut getSSByFilterUra(com.gvt.www.uraservices.GetSSByFilterUraIn getSSByFilterUraIn) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.getSSByFilterUra(getSSByFilterUraIn);
  }
  
  public com.gvt.www.uraservices.DirectDebitRequestOut solicitarDebitoAutomatico(com.gvt.www.uraservices.DirectDebitRequestIn solicitarDebitoAutomaticoIn) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.solicitarDebitoAutomatico(solicitarDebitoAutomaticoIn);
  }
  
  public com.gvt.www.uraservices.RechargeControlPlanOut efetuarRecargaPlanoControle(com.gvt.www.uraservices.RechargeControlPlanIn efetuarRecargaPlanoControleInDocument) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.efetuarRecargaPlanoControle(efetuarRecargaPlanoControleInDocument);
  }
  
  public com.gvt.www.uraservices.RechargeCellControlPlanOut efetuarRecargaControleVC(com.gvt.www.uraservices.RechargeCellControlPlanIn efetuarRecargaControleVCInDocument) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.efetuarRecargaControleVC(efetuarRecargaControleVCInDocument);
  }
  
  public void salesVas(java.lang.String channel, java.lang.String agent, com.gvt.www.uraservices.PhoneVasVO vo) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    uraServices.salesVas(channel, agent, vo);
  }
  
  public com.gvt.www.uraservices.GetSwitchInfoOut getInfoSwitch(java.lang.String phonenumber) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.getInfoSwitch(phonenumber);
  }
  
  public com.gvt.www.uraservices.CodeMessageOut validateServiceBlock(java.lang.String phonenumber) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.validateServiceBlock(phonenumber);
  }
  
  public com.gvt.www.uraservices.CodeMessageOut validateChangeAddressInstall(java.lang.String phonenumber) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.validateChangeAddressInstall(phonenumber);
  }
  
  public com.gvt.www.uraservices.CodeMessageOut validateTbsRadiusDivergency(java.lang.String phonenumber) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.validateTbsRadiusDivergency(phonenumber);
  }
  
  public com.gvt.www.uraservices.SasMassiveResult validateNetworkIncident(java.lang.String phonenumber) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.validateNetworkIncident(phonenumber);
  }
  
  public com.gvt.www.uraservices.IsSpecialCellOut verifyIsTroubleTicketSpecialCell(java.lang.String phonenumber) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.verifyIsTroubleTicketSpecialCell(phonenumber);
  }
  
  public com.gvt.www.uraservices.AllowOmbudsmanServiceOut allowOmbudsmanService(com.gvt.www.uraservices.AllowOmbudsmanServiceIn allowOmbudsmanServiceIn) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.allowOmbudsmanService(allowOmbudsmanServiceIn);
  }
  
  public com.gvt.www.uraservices.ValidateTbsSwitchDivergencyOut validateTbsSwitchDivergency(java.lang.String phonenumber) throws java.rmi.RemoteException{
    if (uraServices == null)
      _initUraServicesProxy();
    return uraServices.validateTbsSwitchDivergency(phonenumber);
  }
  
  
}