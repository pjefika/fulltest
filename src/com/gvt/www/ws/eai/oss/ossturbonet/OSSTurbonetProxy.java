package com.gvt.www.ws.eai.oss.ossturbonet;

public class OSSTurbonetProxy implements com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonet {
  private String _endpoint = null;
  private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonet oSSTurbonet = null;
  
  public OSSTurbonetProxy() {
    _initOSSTurbonetProxy();
  }
  
  public OSSTurbonetProxy(String endpoint) {
    _endpoint = endpoint;
    _initOSSTurbonetProxy();
  }
  
  private void _initOSSTurbonetProxy() {
    try {
      oSSTurbonet = (new com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetServiceLocator()).getOSSTurbonetSoapPort();
      if (oSSTurbonet != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)oSSTurbonet)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)oSSTurbonet)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (oSSTurbonet != null)
      ((javax.xml.rpc.Stub)oSSTurbonet)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonet getOSSTurbonet() {
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet;
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut verificaSeClienteAutenticadoNoRelay(com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoIn OSSTurbonetClienteAutenticadoIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.verificaSeClienteAutenticadoNoRelay(OSSTurbonetClienteAutenticadoIn);
  }
  
  public com.gvt.www.ws.eai.oss.setpvc.ConfigurarPVCOut configurarPVC(com.gvt.www.ws.eai.oss.setpvc.ConfigurarPVCIn configurarPVCIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.configurarPVC(configurarPVCIn);
  }
  
  public java.lang.String getDesignatorByAccessDesignator(java.lang.String accessDesignator) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getDesignatorByAccessDesignator(accessDesignator);
  }
  
  public bean.ossturbonet.oss.gvt.com.InfoCertify certifyTurbonetProcess(java.lang.String designator, java.lang.String instance, java.lang.String login, java.lang.String userName, java.lang.String originalSystem, java.lang.String baNumber, java.lang.String baType, java.lang.String baDispatched, boolean allowedToFix) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.certifyTurbonetProcess(designator, instance, login, userName, originalSystem, baNumber, baType, baDispatched, allowedToFix);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetModem.OSSTurbonetModemOut isModemSincronizado(com.gvt.www.ws.eai.oss.OSSTurbonetModem.OSSTurbonetModemIn OSSTurbonetModemIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.isModemSincronizado(OSSTurbonetModemIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperarCGNATOut operarCGNAT(com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperarCGNATIn operarCGNATIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.operarCGNAT(operarCGNATIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetReconfigureModem.OSSTurbonetReconfigureModemOut reconfigureModem(com.gvt.www.ws.eai.oss.OSSTurbonetReconfigureModem.OSSTurbonetReconfigureModemIn OSSTurbonetReconfigureModemIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.reconfigureModem(OSSTurbonetReconfigureModemIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao.OSSTurbonetSNRAtenuacaoOut obterValoresSnrAtenuacao(com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao.OSSTurbonetSNRAtenuacaoIn OSSTurbonetSNRAtenuacaoIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.obterValoresSnrAtenuacao(OSSTurbonetSNRAtenuacaoIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius.OSSTurbonetUpdateRadiusOut updateRadius(com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius.OSSTurbonetUpdateRadiusIn OSSTurbonetUpdateRadiusIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.updateRadius(OSSTurbonetUpdateRadiusIn);
  }
  
  public com.gvt.www.ws.eai.oss.gpon.ConsultInfoGponOut consultInfoGpon(com.gvt.www.ws.eai.oss.gpon.ConsultInfoGponIn consultInfoGponIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.consultInfoGpon(consultInfoGponIn);
  }
  
  public bean.ossturbonet.oss.gvt.com.InfoAuthentication getInfoAuthentication(java.lang.String designator, java.lang.String instance, java.lang.String login, java.lang.String userName, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getInfoAuthentication(designator, instance, login, userName, sistemaOriginario);
  }
  
  public bean.ossturbonet.oss.gvt.com.ADSLRate[] getDefaultVelocity(int downStreamCRM, java.lang.String sistemaOriginario, java.lang.String dslamVendor, java.lang.String dslamModel, java.lang.String designator) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getDefaultVelocity(downStreamCRM, sistemaOriginario, dslamVendor, dslamModel, designator);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile.OSSTurbonetChangeProfileOut changeProfileWithProtocol(com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile.OSSTurbonetChangeProfileIn OSSTurbonetChangeProfileIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.changeProfileWithProtocol(OSSTurbonetChangeProfileIn);
  }
  
  public com.gvt.www.ws.eai.oss.canaispvc.ConsultarStatusCanaisPVCOut consultarStatusCanaisPVC(com.gvt.www.ws.eai.oss.canaispvc.ConsultarStatusCanaisPVCIn consultarStatusCanaisPVCIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.consultarStatusCanaisPVC(consultarStatusCanaisPVCIn);
  }
  
  public boolean associaSerialOLT(java.lang.String accessDesignator, java.lang.String serialOLT, java.lang.String designator, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.associaSerialOLT(accessDesignator, serialOLT, designator, login, userName, instance, sistemaOriginario);
  }
  
  public com.gvt.www.ws.eai.oss.setpvc.ConsultarBridgeOut consultarBridge(com.gvt.www.ws.eai.oss.setpvc.ConsultarBridgeIn consultarBridgeIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.consultarBridge(consultarBridgeIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade.OSSTurbonetVerificaModulacaoVelocidadeOut verificaModulacaoVelocidade(com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade.OSSTurbonetVerificaModulacaoVelocidadeIn OSSTurbonetVerificaModulacaoVelocidadeIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.verificaModulacaoVelocidade(OSSTurbonetVerificaModulacaoVelocidadeIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOut getAdslUseReport(com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportIn OSSTurbonetAdslUseReportIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getAdslUseReport(OSSTurbonetAdslUseReportIn);
  }
  
  public com.gvt.www.ws.eai.oss.gpon.ManobraDslamGponOut manobrarDslamGpon(com.gvt.www.ws.eai.oss.gpon.ManobraDslamGponIn manobraDslamGponIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.manobrarDslamGpon(manobraDslamGponIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut isClienteAutenticado(com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoIn OSSTurbonetClienteAutenticadoIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.isClienteAutenticado(OSSTurbonetClienteAutenticadoIn);
  }
  
  public java.lang.String changeRate(java.lang.String designator, java.lang.String accessDesignator, java.lang.String instance, java.math.BigInteger newDownRate, java.math.BigInteger newUpRate, java.lang.String oldDownUpRate, java.lang.String pon, java.lang.String rpon, java.lang.String login, java.lang.String userName, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.changeRate(designator, accessDesignator, instance, newDownRate, newUpRate, oldDownUpRate, pon, rpon, login, userName, sistemaOriginario);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetChangeCfg.OSSTurbonetChangeCfgOut resetWithProtocol(com.gvt.www.ws.eai.oss.OSSTurbonetChangeCfg.OSSTurbonetChangeCfgIn OSSTurbonetChangeCfgIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.resetWithProtocol(OSSTurbonetChangeCfgIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusOut verificarInconsistenciaTBSRadius(com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusIn OSSTurbonetInconsistenciaTBSRadiusIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.verificarInconsistenciaTBSRadius(OSSTurbonetInconsistenciaTBSRadiusIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetAtualizarIpProfissional.OSSTurbonetAtualizarIpProfissionalOut atualizarIpProfissional(com.gvt.www.ws.eai.oss.OSSTurbonetAtualizarIpProfissional.OSSTurbonetAtualizarIpProfissionalIn OSSTurbonetAtualizarIpProfissionalIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.atualizarIpProfissional(OSSTurbonetAtualizarIpProfissionalIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify.OSSTurbonetGetLogCertifyOut getLogCertify(com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify.OSSTurbonetGetLogCertifyIn ossTurbonetGetLogCertifyIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getLogCertify(ossTurbonetGetLogCertifyIn);
  }
  
  public bean.ossturbonet.oss.gvt.com.InfoCertify certifyTurbonet(java.lang.String designator, java.lang.String instance, java.lang.String login, java.lang.String userName, java.lang.String originalSystem, java.lang.String baNumber, java.lang.String baType, java.lang.String baDispatched, boolean allowedToFix) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.certifyTurbonet(designator, instance, login, userName, originalSystem, baNumber, baType, baDispatched, allowedToFix);
  }
  
  public java.lang.String changeProfile(java.lang.String designator, java.lang.String newModulation, java.lang.String oldModulation, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.changeProfile(designator, newModulation, oldModulation, login, userName, instance, sistemaOriginario);
  }
  
  public java.lang.String getAccessDesignator(java.lang.String designator) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getAccessDesignator(designator);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetGetLogTesteVelocidade.OSSTurbonetGetLogTesteVelocidadeOut getLogTesteVelocidade(com.gvt.www.ws.eai.oss.OSSTurbonetGetLogTesteVelocidade.OSSTurbonetGetLogTesteVelocidadeIn ossTurbonetGetLogTesteVelocidadeIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getLogTesteVelocidade(ossTurbonetGetLogTesteVelocidadeIn);
  }
  
  public java.lang.String reset(java.lang.String designator, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.reset(designator, login, userName, instance, sistemaOriginario);
  }
  
  public java.lang.String[] getSeriaisOLT(java.lang.String accessDesignator, java.lang.String designator, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getSeriaisOLT(accessDesignator, designator, login, userName, instance, sistemaOriginario);
  }
  
  public bean.ossturbonet.oss.gvt.com.Designators[] getDesignators(java.lang.String designator) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getDesignators(designator);
  }
  
  public void createSNRAttenLog(java.lang.Integer upStreamSinc, java.lang.Integer downStreamSinc, java.lang.Integer upStreamProfile, java.lang.Integer downStreamProfile, java.lang.Integer upStreamSNR, java.lang.Integer downStreamSNR, java.lang.Integer upStreamSNRRange, java.lang.Integer downStreamSNRRange, java.lang.Integer attenuationMin, java.lang.Integer attenuationMax, java.lang.String designador, java.lang.String instancia, java.lang.String upstreamSincRange, java.lang.String downstreamSincRange, java.lang.String tipoSS, java.lang.String descricaoSS, java.lang.String detalheSS, java.lang.String solucaoSS, java.lang.String sistemaOriginario) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    oSSTurbonet.createSNRAttenLog(upStreamSinc, downStreamSinc, upStreamProfile, downStreamProfile, upStreamSNR, downStreamSNR, upStreamSNRRange, downStreamSNRRange, attenuationMin, attenuationMax, designador, instancia, upstreamSincRange, downstreamSincRange, tipoSS, descricaoSS, detalheSS, solucaoSS, sistemaOriginario);
  }
  
  public boolean desassociaSerialOLT(java.lang.String accessDesignator, java.lang.String designator, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.desassociaSerialOLT(accessDesignator, designator, login, userName, instance, sistemaOriginario);
  }
  
  public com.gvt.www.ws.eai.oss.gpon.EquipmentSimulateGponOut equipmentSimulationGpon(com.gvt.www.ws.eai.oss.gpon.EquipmentSimulateGponIn equipmentSimulateGponIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.equipmentSimulationGpon(equipmentSimulateGponIn);
  }
  
  public bean.ossturbonet.oss.gvt.com.AccessInfo getAccessInfo(java.lang.String accessDesignator, java.lang.String instancia, java.lang.String activityInd) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getAccessInfo(accessDesignator, instancia, activityInd);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade.OSSTurbonetLastLogTesteVelocidadeOut getLastLogTesteVelocidade(com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade.OSSTurbonetLastLogTesteVelocidadeIn ossTurbonetLastLogTesteVelocidadeIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getLastLogTesteVelocidade(ossTurbonetLastLogTesteVelocidadeIn);
  }
  
  public com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeOut configurarBridge(com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeIn configurarBridgeIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.configurarBridge(configurarBridgeIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius.OSSTurbonetPerfilRadiusOut obterPerfilRadius(com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius.OSSTurbonetPerfilRadiusIn OSSTurbonetPerfilRadiusIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.obterPerfilRadius(OSSTurbonetPerfilRadiusIn);
  }
  
  public bean.ossturbonet.oss.gvt.com.RadiusInfo getRadiusInfo(java.lang.String designator) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getRadiusInfo(designator);
  }
  
  public java.lang.String changeRateForRadius(java.lang.String designator, java.lang.String instance, java.lang.String oldDownUpRate, java.lang.String login, java.lang.String userName, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.changeRateForRadius(designator, instance, oldDownUpRate, login, userName, sistemaOriginario);
  }
  
  public java.lang.String changeLockAndUnlock(java.lang.String designator, java.lang.String instance, java.lang.String newstatus, java.lang.String oldstatus, java.lang.String login, java.lang.String userName, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.changeLockAndUnlock(designator, instance, newstatus, oldstatus, login, userName, sistemaOriginario);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.OSSTurbonetDiagnosticoBandaLargaOut diagnosticoBandaLarga(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.OSSTurbonetDiagnosticoBandaLargaIn OSSTurbonetDiagnosticoBandaLargaIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.diagnosticoBandaLarga(OSSTurbonetDiagnosticoBandaLargaIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut getAuthenticationByIPorMac(java.lang.String ipOrmac) throws java.rmi.RemoteException, rpc.xml.javax.ServiceException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getAuthenticationByIPorMac(ipOrmac);
  }
  
  public bean.ossturbonet.oss.gvt.com.GetInfoOut getInfo(java.lang.String designator, java.lang.String accessDesignator, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario, java.lang.String downstreamCrm, java.lang.String upstreamCrm) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getInfo(designator, accessDesignator, login, userName, instance, sistemaOriginario, downstreamCrm, upstreamCrm);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut getStatusConexao(com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoIn ossTurbonetStatusConexaoIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getStatusConexao(ossTurbonetStatusConexaoIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetAccountingRelay.OSSTurbonetAccountingRelayOut getAccountingRelayInfo(com.gvt.www.ws.eai.oss.OSSTurbonetAccountingRelay.OSSTurbonetAccountingRelayIn OSSTurbonetAccountingRelayIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getAccountingRelayInfo(OSSTurbonetAccountingRelayIn);
  }
  
  public com.gvt.www.ws.eai.oss.gpon.DiagnosticoAcessoGPONOut diagnosticoAcessoGPON(com.gvt.www.ws.eai.oss.gpon.DiagnosticoAcessoGPONIn diagnosticoAcessoGPONIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.diagnosticoAcessoGPON(diagnosticoAcessoGPONIn);
  }
  
  public bean.ossturbonet.oss.gvt.com.ADSLRate[] getSyncRateByFilter(int id, int downStreamCRM, java.lang.String sistemaOriginario) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getSyncRateByFilter(id, downStreamCRM, sistemaOriginario);
  }
  
  public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut logCertify(com.gvt.www.ws.eai.oss.OSSTurbonetLogCertify.OSSTurbonetLogCertifyIn ossTurbonetLogCertifyIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.logCertify(ossTurbonetLogCertifyIn);
  }
  
  public com.gvt.www.ws.eai.oss.gpon.UpdateRateGponOut updateRateGpon(com.gvt.www.ws.eai.oss.gpon.UpdateRateGponIn updateRateGponIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.updateRateGpon(updateRateGponIn);
  }
  
  public com.gvt.www.ws.eai.oss.gpon.DiagnosticoVozGPONOut diagnosticoVozGPON(com.gvt.www.ws.eai.oss.gpon.DiagnosticoVozGPONIn diagnosticoVozGPONIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.diagnosticoVozGPON(diagnosticoVozGPONIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOut obterMotivosDesconexao(com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoIn OSSTurbonetMotivosDesconexaoIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.obterMotivosDesconexao(OSSTurbonetMotivosDesconexaoIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitOut getInfoShortCircuit(com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitIn ossTurbonetShortCircuitIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getInfoShortCircuit(ossTurbonetShortCircuitIn);
  }
  
  public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut logTesteVelocidade(com.gvt.www.ws.eai.oss.OSSTurbonetLogTesteVelocidade.OSSTurbonetLogTesteVelocidadeIn ossTurbonetLogTesteVelocidadeIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.logTesteVelocidade(ossTurbonetLogTesteVelocidadeIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano.OSSTurbonetModulacaoPlanoOut isModulacaoCorretaPlano(com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano.OSSTurbonetModulacaoPlanoIn OSSTurbonetModulacaoPlanoIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.isModulacaoCorretaPlano(OSSTurbonetModulacaoPlanoIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada.OSSTurbonetVelocidadeSincronizadaOut obterVelocidadeSincronizada(com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada.OSSTurbonetVelocidadeSincronizadaIn OSSTurbonetVelocidadeSincronizadaIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.obterVelocidadeSincronizada(OSSTurbonetVelocidadeSincronizadaIn);
  }
  
  public bean.ossturbonet.oss.gvt.com.SmartToolLog[] getWiseToolActionReport(java.lang.Integer numberOfDays, java.lang.String designator, java.lang.String sistemaOriginario) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.getWiseToolActionReport(numberOfDays, designator, sistemaOriginario);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile.OSSTurbonetVelocidadeProfileOut obterVelocidadeDeProfile(com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile.OSSTurbonetVelocidadeProfileIn OSSTurbonetVelocidadeProfileIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.obterVelocidadeDeProfile(OSSTurbonetVelocidadeProfileIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate.OSSTurbonetChangeRateOut changeRateWithProtocol(com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate.OSSTurbonetChangeRateIn OSSTurbonetChangeRateIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.changeRateWithProtocol(OSSTurbonetChangeRateIn);
  }
  
  public com.gvt.www.ws.eai.oss.ResetOntGPON.ResetOntGPONOut resetOnt(com.gvt.www.ws.eai.oss.ResetOntGPON.ResetOntGPONIn resetOntGPONIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.resetOnt(resetOntGPONIn);
  }
  
  public com.gvt.www.ws.eai.oss.OSSTurbonetBlackList.OSSTurbonetBlackListOut isInBlackList(com.gvt.www.ws.eai.oss.OSSTurbonetBlackList.OSSTurbonetBlackListIn OSSTurbonetBlackListIn) throws java.rmi.RemoteException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.isInBlackList(OSSTurbonetBlackListIn);
  }
  
  public java.lang.String changeDNSReverso(java.lang.String designator, java.lang.String instance, java.lang.String strNewDomain, java.lang.String strOldDomain, java.lang.String login, java.lang.String userName, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException{
    if (oSSTurbonet == null)
      _initOSSTurbonetProxy();
    return oSSTurbonet.changeDNSReverso(designator, instance, strNewDomain, strOldDomain, login, userName, sistemaOriginario);
  }
  
  
}