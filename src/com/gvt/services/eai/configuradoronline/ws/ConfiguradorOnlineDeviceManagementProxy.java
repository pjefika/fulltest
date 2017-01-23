package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineDeviceManagementProxy implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagement {
  private String _endpoint = null;
  private com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagement configuradorOnlineDeviceManagement = null;
  
  public ConfiguradorOnlineDeviceManagementProxy() {
    _initConfiguradorOnlineDeviceManagementProxy();
  }
  
  public ConfiguradorOnlineDeviceManagementProxy(String endpoint) {
    _endpoint = endpoint;
    _initConfiguradorOnlineDeviceManagementProxy();
  }
  
  private void _initConfiguradorOnlineDeviceManagementProxy() {
    try {
      configuradorOnlineDeviceManagement = (new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementServiceLocator()).getConfiguradorOnlineDeviceManagementSoapPort();
      if (configuradorOnlineDeviceManagement != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)configuradorOnlineDeviceManagement)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)configuradorOnlineDeviceManagement)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (configuradorOnlineDeviceManagement != null)
      ((javax.xml.rpc.Stub)configuradorOnlineDeviceManagement)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagement getConfiguradorOnlineDeviceManagement() {
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement;
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoCertificacaoTranspondersOut consultarHistoricoCertificacaoTransponders(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoCertificacaoTranspondersIn consultarHistoricoCertificacaoTranspondersIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.consultarHistoricoCertificacaoTransponders(consultarHistoricoCertificacaoTranspondersIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoOut validacaoCertificacao(br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoIn validacaoCertificacaoIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.validacaoCertificacao(validacaoCertificacaoIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsOut atualizarFirmwareCPEs(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsIn atualizarFirmwareCPEsIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.atualizarFirmwareCPEs(atualizarFirmwareCPEsIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarStatusAtualizacaoFirmwareOut consultarStatusAtualizacaoFirmware(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarStatusAtualizacaoFirmwareIn consultarStatusAtualizacaoFirmwareIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.consultarStatusAtualizacaoFirmware(consultarStatusAtualizacaoFirmwareIn);
  }
  
  public br.com.gvt.www.tv.configuraWiFiDns.ConfiguraWiFiDnsOut configuraWiFiDns(br.com.gvt.www.tv.configuraWiFiDns.ConfiguraWiFiDnsIn configuraWiFiDnsIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.configuraWiFiDns(configuraWiFiDnsIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ResetDeviceOut resetDevices(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ResetDeviceIn resetDeviceIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.resetDevices(resetDeviceIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtivarModalidadeHomeGatewayOut ativarModalidadeHomeGateway(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtivarModalidadeHomeGatewayIn ativarModalidadeHomeGatewayIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.ativarModalidadeHomeGateway(ativarModalidadeHomeGatewayIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHOut validarChaveCertificacaoDTH(br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHIn validarChaveCertificacaoDTHIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.validarChaveCertificacaoDTH(validarChaveCertificacaoDTHIn);
  }
  
  public void atualizarFirmwareCPEsURA(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsURAIn atualizarFirmwareCPEsURAIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    configuradorOnlineDeviceManagement.atualizarFirmwareCPEsURA(atualizarFirmwareCPEsURAIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBSOut consultarHistoricoDiagnosticoDVBS(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBSIn consultarHistoricoDiagnosticoDVBSIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.consultarHistoricoDiagnosticoDVBS(consultarHistoricoDiagnosticoDVBSIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBTOut consultarHistoricoDiagnosticoDVBT(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBTIn consultarHistoricoDiagnosticoDVBTIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.consultarHistoricoDiagnosticoDVBT(consultarHistoricoDiagnosticoDVBTIn);
  }
  
  public br.com.gvt.www.tv.atualizaWiFiPassword.AtualizaWiFiPasswordOut atualizaWiFiPassword(br.com.gvt.www.tv.atualizaWiFiPassword.AtualizaWiFiPasswordIn atualizaWiFiPasswordIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.atualizaWiFiPassword(atualizaWiFiPasswordIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ResetSIPAgentOut executarResetSIPAgent(com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn resetSIPAgentIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.executarResetSIPAgent(resetSIPAgentIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEOut configurarLinhaSIPnoCPE(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEIn configurarLinhaSIPnoCPEIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.configurarLinhaSIPnoCPE(configurarLinhaSIPnoCPEIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut executarDiagnosticoDVBT(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBIn executarDiagnosticoDVBIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.executarDiagnosticoDVBT(executarDiagnosticoDVBIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCPEsOut consultarCPEs(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCPEsIn consultarCPEsIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.consultarCPEs(consultarCPEsIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosDSLOut consultarParametrosDSL(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosDSLIn consultarParametrosDSLIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.consultarParametrosDSL(consultarParametrosDSLIn);
  }
  
  public br.com.gvt.www.tv.atualizaWiFiSSID.AtualizaWiFiSSIDOut atualizaWiFiSSID(br.com.gvt.www.tv.atualizaWiFiSSID.AtualizaWiFiSSIDIn atualizaWiFiSSIDIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.atualizaWiFiSSID(atualizaWiFiSSIDIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCertificacaoTranspondersOut consultarCertificacaoTransponders(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCertificacaoTranspondersIn consultarCertificacaoTranspondersIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.consultarCertificacaoTransponders(consultarCertificacaoTranspondersIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut executarDiagnosticoDVBS(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBIn executarDiagnosticoDVBIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.executarDiagnosticoDVBS(executarDiagnosticoDVBIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoOut gravarChavesCertificacao(br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoIn gravarChavesCertificacaoIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.gravarChavesCertificacao(gravarChavesCertificacaoIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut executarDiagnosticoSIP(com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn diagnosticoSIPIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.executarDiagnosticoSIP(diagnosticoSIPIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarFirmwareCPEsURAOut consultarFirmwareCPEs(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarFirmwareCPEsURAIn consultarFirmwareCPEsURAIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.consultarFirmwareCPEs(consultarFirmwareCPEsURAIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosCPEOut consultarParamentrosCPE(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosCPEIn consultarParametrosCPEIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.consultarParamentrosCPE(consultarParametrosCPEIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ObterInformacoesDispositivoOut obterInformacoesDispositivo(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ObterInformacoesDispositivoIn obterInformacoesDispositivoIn) throws java.rmi.RemoteException{
    if (configuradorOnlineDeviceManagement == null)
      _initConfiguradorOnlineDeviceManagementProxy();
    return configuradorOnlineDeviceManagement.obterInformacoesDispositivo(obterInformacoesDispositivoIn);
  }
  
  
}