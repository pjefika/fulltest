package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineProxy implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnline {
  private String _endpoint = null;
  private com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnline configuradorOnline = null;
  
  public ConfiguradorOnlineProxy() {
    _initConfiguradorOnlineProxy();
  }
  
  public ConfiguradorOnlineProxy(String endpoint) {
    _endpoint = endpoint;
    _initConfiguradorOnlineProxy();
  }
  
  private void _initConfiguradorOnlineProxy() {
    try {
      configuradorOnline = (new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServiceLocator()).getConfiguradorOnlineSoapPort();
      if (configuradorOnline != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)configuradorOnline)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)configuradorOnline)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (configuradorOnline != null)
      ((javax.xml.rpc.Stub)configuradorOnline)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnline getConfiguradorOnline() {
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline;
  }
  
  public com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoOut montaComando(com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoIn montaComandoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.montaComando(montaComandoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVOut ativarElementosInventarioTV(br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVIn ativarElementosInventarioTVIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.ativarElementosInventarioTV(ativarElementosInventarioTVIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosOut getArvoreEquipamento(br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosIn consultarArvoreEquipamentosIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.getArvoreEquipamento(consultarArvoreEquipamentosIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoOut criarInstanciaServico(com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoIn criarInstanciaServicoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.criarInstanciaServico(criarInstanciaServicoIn);
  }
  
  public void ativaDesativaTom(com.gvt.www.ws.eai.configuradoronline.ativaDesativaTom.AtivaDesativaTomIn ativaDesativaTomIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    configuradorOnline.ativaDesativaTom(ativaDesativaTomIn);
  }
  
  public br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAOut consultarDiagnosticoHPNA(br.com.gvt.www.tv.diagnosticoHPNA.ConsultaDiagnosticoHPNAIn consultaDiagnosticoHPNAIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarDiagnosticoHPNA(consultaDiagnosticoHPNAIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDOut consultarExecucoesVoD(br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDIn consultarExecucoesVoDIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarExecucoesVoD(consultarExecucoesVoDIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut removerPayPerView(br.com.gvt.www.tv.configuracaoTV.EventoPayPerViewIn configurarEventoPayPerView) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.removerPayPerView(configurarEventoPayPerView);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaInstanciasAssociadasOut consultarInstanciasAssociadas(com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaIntanciasAssociadasIn consultaInstanciasAssociadasIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarInstanciasAssociadas(consultaInstanciasAssociadasIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvOut consultarServicosDeTv(br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvIn consultaServicosDeTvIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarServicosDeTv(consultaServicosDeTvIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.getProductChild.Produto[] getChildProduct(com.gvt.www.ws.eai.configuradoronline.getProductChild.GetProductChildIn getProductChildIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.getChildProduct(getProductChildIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[] consultaInventarioServico(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.ConsultaInventarioServicoIn consultaInventarioServicoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultaInventarioServico(consultaInventarioServicoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVOut consultarEquipamentosDeTV(br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVIn consultarEquipamentosTVIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarEquipamentosDeTV(consultarEquipamentosTVIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelOut atualizaElementoSiebel(com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelIn atualizaElementoSiebelIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.atualizaElementoSiebel(atualizaElementoSiebelIn);
  }
  
  public br.com.gvt.www.tv.coberturatv.ServicesRegionOut obterTodasServicesRegionTV() throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.obterTodasServicesRegionTV();
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDOut consultarTopExecucoesVoD(br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDIn consultarTopExecucoesVoDIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarTopExecucoesVoD(consultarTopExecucoesVoDIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPOut ativarAssinanteGVP(br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPIn ativarAssinanteGVPIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.ativarAssinanteGVP(ativarAssinanteGVPIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoOut criarEventoInventarioServico(com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoIn criarEventoInventarioServicoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.criarEventoInventarioServico(criarEventoInventarioServicoIn);
  }
  
  public void enviaComandoAssincronoHP(com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn enviaComandoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    configuradorOnline.enviaComandoAssincronoHP(enviaComandoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDOut consultarComprasVoD(br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDIn consultarComprasVoDIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarComprasVoD(consultarComprasVoDIn);
  }
  
  public com.gvt.www.metaData.configuradoronline.DadosProcesso[] consultaProcessos(com.gvt.www.ws.eai.configuradoronline.consultaProcessos.ConsultaProcessosIn consultaProcessosIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultaProcessos(consultaProcessosIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoOut removerSetTopBoxNaoInstalado(br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoIn removerSetTopBoxNaoInstaladoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.removerSetTopBoxNaoInstalado(removerSetTopBoxNaoInstaladoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVOut alterarEquipamentoDeTV(br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVIn alterarEquipamentosTVIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.alterarEquipamentoDeTV(alterarEquipamentosTVIn);
  }
  
  public void enviaComandoAssincronoNEC(com.gvt.www.ws.eai.oss.configurarBloqueio.ConfigurarBloqueioIn configurarBloqueioIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    configuradorOnline.enviaComandoAssincronoNEC(configurarBloqueioIn);
  }
  
  public br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoRecolhidoOut consultarSetTopBoxNaoRecolhido(br.com.gvt.www.tv.consultaSetTopBox.ConsultaEquipamentoSetTopBoxIn inDoc) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarSetTopBoxNaoRecolhido(inDoc);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoOut consultaProdutoAtivado(com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoIn consultaProdutoAtivadoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultaProdutoAtivado(consultaProdutoAtivadoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPOut consultarEquipamentosSAP(br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPIn consultarEquipamentosSAPIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarEquipamentosSAP(consultarEquipamentosSAPIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut adicionarPayPerView(br.com.gvt.www.tv.configuracaoTV.EventoPayPerViewIn configurarEventoPayPerView) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.adicionarPayPerView(configurarEventoPayPerView);
  }
  
  public com.gvt.www.metaData.configuradoronline.DadosArea[] consultaAreas() throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultaAreas();
  }
  
  public br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAOut consultarHistoricoDiagnosticoHPNA(br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAIn consultaHistoricoDiagnosticoHPNAIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarHistoricoDiagnosticoHPNA(consultaHistoricoDiagnosticoHPNAIn);
  }
  
  public br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsOut executarDiagnosticoCPEs(br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsIn diagnosticoCPEsIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.executarDiagnosticoCPEs(diagnosticoCPEsIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoOut consultarDadosServicos(com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoIn consultaDadosServicoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarDadosServicos(consultaDadosServicoIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaOut verificarChavesReserva(com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaIn verificarChavesReservaIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.verificarChavesReserva(verificarChavesReservaIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ProdutoCatalogo[] obterHierarquiaProdutosCatalogo(com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ObterHierarquiaProdutosCatalogoIn obterHierarquiaProdutosCatalogoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.obterHierarquiaProdutosCatalogo(obterHierarquiaProdutosCatalogoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayOut consultarServicosHomeGateway(br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayIn consultarServicosHomeGatewayIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarServicosHomeGateway(consultarServicosHomeGatewayIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ServicoDTTOut servicoDTT(br.com.gvt.www.tv.configuracaoTV.ServicoDTTIn servicoDTTIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.servicoDTT(servicoDTTIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoOut criarInstanciaProduto(com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoIn criarInstanciaProdutoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.criarInstanciaProduto(criarInstanciaProdutoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayOut alterarServicosHomeGateway(br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayIn alterarServicosHomeGatewayIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.alterarServicosHomeGateway(alterarServicosHomeGatewayIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVOut corrigirServicosTV(br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVIn corrigirServicosTVIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.corrigirServicosTV(corrigirServicosTVIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxOut removerSetTopBox(br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxIn removerSetTopBoxIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.removerSetTopBox(removerSetTopBoxIn);
  }
  
  public void limpaCacheBD() throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    configuradorOnline.limpaCacheBD();
  }
  
  public void enviaComandoLegado(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.enviaComandoLegado.EnviaComandoLegadoIn enviaComandoLegadoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    configuradorOnline.enviaComandoLegado(enviaComandoLegadoIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaOut criarChavesReserva(com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaIn criarChavesReservaIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.criarChavesReserva(criarChavesReservaIn);
  }
  
  public void cadastraProtecaoBloqueio(com.gvt.www.ws.eai.configuradoronline.cadastraProtecaoBloqueio.CadastraProtecaoBloqueioIn cadastraProtecaoBloqueioIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    configuradorOnline.cadastraProtecaoBloqueio(cadastraProtecaoBloqueioIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoOut gravaHistorico(com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoIn gravaHistoricoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.gravaHistorico(gravaHistoricoIn);
  }
  
  public com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockOut atualizaBlockUnblock(com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockIn atualizaBlockUnblockIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.atualizaBlockUnblock(atualizaBlockUnblockIn);
  }
  
  public br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoInstaladoOut consultarSetTopBoxNaoInstalado(br.com.gvt.www.tv.consultaSetTopBox.ConsultaEquipamentoSetTopBoxIn inDoc) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarSetTopBoxNaoInstalado(inDoc);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut desconectarServicosDeTV(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn configurarElementoTVIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.desconectarServicosDeTV(configurarElementoTVIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.InstServParamHist[] consultarDadosServicosParamHistorico(com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.ConsultaDadosServicoParamIn consultaDadosServicoParamIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarDadosServicosParamHistorico(consultaDadosServicoParamIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioOut atualizaInventario(com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioIn atualizaInventarioIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.atualizaInventario(atualizaInventarioIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEOut atualizarFirmwareCPE(br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEIn atualizarFirmwareCPEIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.atualizarFirmwareCPE(atualizarFirmwareCPEIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTOut removerFavoritoGVT(com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTIn removerFavoritoGVTIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.removerFavoritoGVT(removerFavoritoGVTIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoOut existeComandoEmProcessamento(com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoIn existeComandoProcessamentoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.existeComandoEmProcessamento(existeComandoProcessamentoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteOut consultarCanaisAssinante(br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteIn consultarCanaisAssinanteIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarCanaisAssinante(consultarCanaisAssinanteIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaOut iniciarSolicitacaoChavesReserva(com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaIn iniciarSolicitacaoChavesReservaIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.iniciarSolicitacaoChavesReserva(iniciarSolicitacaoChavesReservaIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut consultaInventarioSmartTool(com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioSmartToolIn consultaInventarioSmartToolIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultaInventarioSmartTool(consultaInventarioSmartToolIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoOut enviaComando(com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn enviaComandoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.enviaComando(enviaComandoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewOut reenviarPayPerView(br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewIn reenviarEventoPayPerViewIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.reenviarPayPerView(reenviarEventoPayPerViewIn);
  }
  
  public com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[] consultaTiposBloqueio(com.gvt.www.ws.eai.configuradoronline.consultaTiposBloqueio.enviaComando.ConsultaTiposBloqueioIn consultaTiposBloqueioIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultaTiposBloqueio(consultaTiposBloqueioIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewOut consultarPayPerView(br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewIn consultarPayPerViewIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarPayPerView(consultarPayPerViewIn);
  }
  
  public br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoOut desconectarSetTopBoxNaoInstalado(br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoIn desconectarSetTopBoxNaoInstaladoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.desconectarSetTopBoxNaoInstalado(desconectarSetTopBoxNaoInstaladoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVOut resetSenhaSetTopBox(br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVIn resetSenhaIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.resetSenhaSetTopBox(resetSenhaIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut consultaInventario(com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioIn consultaInventarioIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultaInventario(consultaInventarioIn);
  }
  
  public br.com.gvt.www.tv.consultaInfoAssinante.InformacaoAssinanteTv consultarInformacaoAssinanteTV(br.com.gvt.www.tv.consultaInfoAssinante.CriterioBuscaAssinante consultaInfoAssinanteTvIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarInformacaoAssinanteTV(consultaInfoAssinanteTvIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHOut ativarAssinanteDTH(br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHIn ativarAssinanteDTHIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.ativarAssinanteDTH(ativarAssinanteDTHIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaOut resetLinha(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaIn resetLinhaIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.resetLinha(resetLinhaIn);
  }
  
  public br.com.gvt.www.oss.necservice.ConsultElement[] consultaElemento(com.gvt.www.ws.eai.configuradoronline.consultaElemento.ConsultaElementoIn consultaElementoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultaElemento(consultaElementoIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceOut consultaInventarioServicoByResource(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceIn consultaInventarioServicoByResourceIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultaInventarioServicoByResource(consultaInventarioServicoByResourceIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPOut concluirMudancaNumeroSIP(com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPIn concluirMudancaNumeroSIPIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.concluirMudancaNumeroSIP(concluirMudancaNumeroSIPIn);
  }
  
  public br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCOut alterarServicoPFC(br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCIn alterarServicoPFCIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.alterarServicoPFC(alterarServicoPFCIn);
  }
  
  public br.com.gvt.www.CanonicalModel.ResourceFacingService[] getIMSRegistry(com.gvt.www.ws.eai.configuradoronline.getIMSRegistry.GetIMSRegistryIn getIMSRegistryIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.getIMSRegistry(getIMSRegistryIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralOut getTipoCentral(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralIn getTipoCentralIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.getTipoCentral(getTipoCentralIn);
  }
  
  public com.gvt.www.metaData.configuradoronline.DadosExecucao[] consultaHistorico(com.gvt.www.ws.eai.configuradoronline.consultaHistorico.ConsultaHistoricoIn consultaHistoricoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultaHistorico(consultaHistoricoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut alterarServicosDeTV(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn configurarElementoTVIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.alterarServicosDeTV(configurarElementoTVIn);
  }
  
  public br.com.gvt.www.tv.consultaCatalogServico.CatalogodeServicosProdCodeOut obterXGvtProdCodDoCatalogoServicosTV() throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.obterXGvtProdCodDoCatalogoServicosTV();
  }
  
  public br.com.gvt.www.tv.coberturatv.ServicesRegionOut consultarServiceRegionByCEP(br.com.gvt.www.tv.coberturatv.ServiceRegionByCEPIn consultarServiceRegionByCEPIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarServiceRegionByCEP(consultarServiceRegionByCEPIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVOut consultarCoberturaTV(br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVIn consultarCoberturaTVIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarCoberturaTV(consultarCoberturaTVIn);
  }
  
  public void enviaComandoAssincronoNECAtivacao(br.com.gvt.www.oss.necservice.ConfigurarLinhaIn configurarLinhaIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    configuradorOnline.enviaComandoAssincronoNECAtivacao(configurarLinhaIn);
  }
  
  public void enviaComandoSavvion(com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn enviaComandoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    configuradorOnline.enviaComandoSavvion(enviaComandoIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaOut getChaveReserva(com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaIn getChaveReservaIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.getChaveReserva(getChaveReservaIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosOut persistirDadosServicos(com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosIn persistirDadosServicosIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.persistirDadosServicos(persistirDadosServicosIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoOut consultarComprasVoDComExecucao(br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoIn consultarComprasVoDComExecucaoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.consultarComprasVoDComExecucao(consultarComprasVoDComExecucaoIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHOut reconfigurarAssinanteDTH(br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHIn reconfigurarAssinanteDTHIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.reconfigurarAssinanteDTH(reconfigurarAssinanteDTHIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut adicionarServicosDeTV(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn configurarElementoTVIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.adicionarServicosDeTV(configurarElementoTVIn);
  }
  
  public com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoOut atualizarInventarioServico(com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoIn atualizaInventarioServicoIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.atualizarInventarioServico(atualizaInventarioServicoIn);
  }
  
  public br.com.gvt.www.tv.diagnosticoHPNA.ExecutarDiagnosticoHPNAOut executarDiagnosticoHPNA(br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAIn executaDiagnosticoHPNAIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.executarDiagnosticoHPNA(executaDiagnosticoHPNAIn);
  }
  
  public void excluiProtecaoBloqueio(com.gvt.www.ws.eai.configuradoronline.excluiProtecaoBloqueio.ExcluiProtecaoBloqueioIn excluiProtecaoBloqueioIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    configuradorOnline.excluiProtecaoBloqueio(excluiProtecaoBloqueioIn);
  }
  
  public void limpaAssinante(com.gvt.www.ws.eai.configuradoronline.limpaAssinante.LimpaAssinanteIn limpaAssinanteIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    configuradorOnline.limpaAssinante(limpaAssinanteIn);
  }
  
  public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaOut configurarServicosBandaLarga(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaIn configurarElementoBandaLargaIn) throws java.rmi.RemoteException{
    if (configuradorOnline == null)
      _initConfiguradorOnlineProxy();
    return configuradorOnline.configurarServicosBandaLarga(configurarElementoBandaLargaIn);
  }
  
  
}