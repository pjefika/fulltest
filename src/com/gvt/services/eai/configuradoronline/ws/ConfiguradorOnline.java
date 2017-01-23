/**
 * ConfiguradorOnline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.services.eai.configuradoronline.ws;

public interface ConfiguradorOnline extends java.rmi.Remote {
    public com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoOut montaComando(com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoIn montaComandoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVOut ativarElementosInventarioTV(br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVIn ativarElementosInventarioTVIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosOut getArvoreEquipamento(br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosIn consultarArvoreEquipamentosIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoOut criarInstanciaServico(com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoIn criarInstanciaServicoIn) throws java.rmi.RemoteException;
    public void ativaDesativaTom(com.gvt.www.ws.eai.configuradoronline.ativaDesativaTom.AtivaDesativaTomIn ativaDesativaTomIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAOut consultarDiagnosticoHPNA(br.com.gvt.www.tv.diagnosticoHPNA.ConsultaDiagnosticoHPNAIn consultaDiagnosticoHPNAIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDOut consultarExecucoesVoD(br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDIn consultarExecucoesVoDIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut removerPayPerView(br.com.gvt.www.tv.configuracaoTV.EventoPayPerViewIn configurarEventoPayPerView) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaInstanciasAssociadasOut consultarInstanciasAssociadas(com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaIntanciasAssociadasIn consultaInstanciasAssociadasIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvOut consultarServicosDeTv(br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvIn consultaServicosDeTvIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.getProductChild.Produto[] getChildProduct(com.gvt.www.ws.eai.configuradoronline.getProductChild.GetProductChildIn getProductChildIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[] consultaInventarioServico(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.ConsultaInventarioServicoIn consultaInventarioServicoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVOut consultarEquipamentosDeTV(br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVIn consultarEquipamentosTVIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelOut atualizaElementoSiebel(com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelIn atualizaElementoSiebelIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.coberturatv.ServicesRegionOut obterTodasServicesRegionTV() throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDOut consultarTopExecucoesVoD(br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDIn consultarTopExecucoesVoDIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPOut ativarAssinanteGVP(br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPIn ativarAssinanteGVPIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoOut criarEventoInventarioServico(com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoIn criarEventoInventarioServicoIn) throws java.rmi.RemoteException;
    public void enviaComandoAssincronoHP(com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn enviaComandoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDOut consultarComprasVoD(br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDIn consultarComprasVoDIn) throws java.rmi.RemoteException;
    public com.gvt.www.metaData.configuradoronline.DadosProcesso[] consultaProcessos(com.gvt.www.ws.eai.configuradoronline.consultaProcessos.ConsultaProcessosIn consultaProcessosIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoOut removerSetTopBoxNaoInstalado(br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoIn removerSetTopBoxNaoInstaladoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVOut alterarEquipamentoDeTV(br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVIn alterarEquipamentosTVIn) throws java.rmi.RemoteException;
    public void enviaComandoAssincronoNEC(com.gvt.www.ws.eai.oss.configurarBloqueio.ConfigurarBloqueioIn configurarBloqueioIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoRecolhidoOut consultarSetTopBoxNaoRecolhido(br.com.gvt.www.tv.consultaSetTopBox.ConsultaEquipamentoSetTopBoxIn inDoc) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoOut consultaProdutoAtivado(com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoIn consultaProdutoAtivadoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPOut consultarEquipamentosSAP(br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPIn consultarEquipamentosSAPIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut adicionarPayPerView(br.com.gvt.www.tv.configuracaoTV.EventoPayPerViewIn configurarEventoPayPerView) throws java.rmi.RemoteException;
    public com.gvt.www.metaData.configuradoronline.DadosArea[] consultaAreas() throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAOut consultarHistoricoDiagnosticoHPNA(br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAIn consultaHistoricoDiagnosticoHPNAIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsOut executarDiagnosticoCPEs(br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsIn diagnosticoCPEsIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoOut consultarDadosServicos(com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoIn consultaDadosServicoIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaOut verificarChavesReserva(com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaIn verificarChavesReservaIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ProdutoCatalogo[] obterHierarquiaProdutosCatalogo(com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ObterHierarquiaProdutosCatalogoIn obterHierarquiaProdutosCatalogoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayOut consultarServicosHomeGateway(br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayIn consultarServicosHomeGatewayIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ServicoDTTOut servicoDTT(br.com.gvt.www.tv.configuracaoTV.ServicoDTTIn servicoDTTIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoOut criarInstanciaProduto(com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoIn criarInstanciaProdutoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayOut alterarServicosHomeGateway(br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayIn alterarServicosHomeGatewayIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVOut corrigirServicosTV(br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVIn corrigirServicosTVIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxOut removerSetTopBox(br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxIn removerSetTopBoxIn) throws java.rmi.RemoteException;
    public void limpaCacheBD() throws java.rmi.RemoteException;
    public void enviaComandoLegado(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.enviaComandoLegado.EnviaComandoLegadoIn enviaComandoLegadoIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaOut criarChavesReserva(com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaIn criarChavesReservaIn) throws java.rmi.RemoteException;
    public void cadastraProtecaoBloqueio(com.gvt.www.ws.eai.configuradoronline.cadastraProtecaoBloqueio.CadastraProtecaoBloqueioIn cadastraProtecaoBloqueioIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoOut gravaHistorico(com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoIn gravaHistoricoIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockOut atualizaBlockUnblock(com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockIn atualizaBlockUnblockIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoInstaladoOut consultarSetTopBoxNaoInstalado(br.com.gvt.www.tv.consultaSetTopBox.ConsultaEquipamentoSetTopBoxIn inDoc) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut desconectarServicosDeTV(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn configurarElementoTVIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.InstServParamHist[] consultarDadosServicosParamHistorico(com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.ConsultaDadosServicoParamIn consultaDadosServicoParamIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioOut atualizaInventario(com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioIn atualizaInventarioIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEOut atualizarFirmwareCPE(br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEIn atualizarFirmwareCPEIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTOut removerFavoritoGVT(com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTIn removerFavoritoGVTIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoOut existeComandoEmProcessamento(com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoIn existeComandoProcessamentoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteOut consultarCanaisAssinante(br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteIn consultarCanaisAssinanteIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaOut iniciarSolicitacaoChavesReserva(com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaIn iniciarSolicitacaoChavesReservaIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut consultaInventarioSmartTool(com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioSmartToolIn consultaInventarioSmartToolIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoOut enviaComando(com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn enviaComandoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewOut reenviarPayPerView(br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewIn reenviarEventoPayPerViewIn) throws java.rmi.RemoteException;
    public com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[] consultaTiposBloqueio(com.gvt.www.ws.eai.configuradoronline.consultaTiposBloqueio.enviaComando.ConsultaTiposBloqueioIn consultaTiposBloqueioIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewOut consultarPayPerView(br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewIn consultarPayPerViewIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoOut desconectarSetTopBoxNaoInstalado(br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoIn desconectarSetTopBoxNaoInstaladoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVOut resetSenhaSetTopBox(br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVIn resetSenhaIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut consultaInventario(com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioIn consultaInventarioIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.consultaInfoAssinante.InformacaoAssinanteTv consultarInformacaoAssinanteTV(br.com.gvt.www.tv.consultaInfoAssinante.CriterioBuscaAssinante consultaInfoAssinanteTvIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHOut ativarAssinanteDTH(br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHIn ativarAssinanteDTHIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaOut resetLinha(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaIn resetLinhaIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.oss.necservice.ConsultElement[] consultaElemento(com.gvt.www.ws.eai.configuradoronline.consultaElemento.ConsultaElementoIn consultaElementoIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceOut consultaInventarioServicoByResource(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceIn consultaInventarioServicoByResourceIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPOut concluirMudancaNumeroSIP(com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPIn concluirMudancaNumeroSIPIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCOut alterarServicoPFC(br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCIn alterarServicoPFCIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.CanonicalModel.ResourceFacingService[] getIMSRegistry(com.gvt.www.ws.eai.configuradoronline.getIMSRegistry.GetIMSRegistryIn getIMSRegistryIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralOut getTipoCentral(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralIn getTipoCentralIn) throws java.rmi.RemoteException;
    public com.gvt.www.metaData.configuradoronline.DadosExecucao[] consultaHistorico(com.gvt.www.ws.eai.configuradoronline.consultaHistorico.ConsultaHistoricoIn consultaHistoricoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut alterarServicosDeTV(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn configurarElementoTVIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.consultaCatalogServico.CatalogodeServicosProdCodeOut obterXGvtProdCodDoCatalogoServicosTV() throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.coberturatv.ServicesRegionOut consultarServiceRegionByCEP(br.com.gvt.www.tv.coberturatv.ServiceRegionByCEPIn consultarServiceRegionByCEPIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVOut consultarCoberturaTV(br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVIn consultarCoberturaTVIn) throws java.rmi.RemoteException;
    public void enviaComandoAssincronoNECAtivacao(br.com.gvt.www.oss.necservice.ConfigurarLinhaIn configurarLinhaIn) throws java.rmi.RemoteException;
    public void enviaComandoSavvion(com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn enviaComandoIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaOut getChaveReserva(com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaIn getChaveReservaIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosOut persistirDadosServicos(com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosIn persistirDadosServicosIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoOut consultarComprasVoDComExecucao(br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoIn consultarComprasVoDComExecucaoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHOut reconfigurarAssinanteDTH(br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHIn reconfigurarAssinanteDTHIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut adicionarServicosDeTV(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn configurarElementoTVIn) throws java.rmi.RemoteException;
    public com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoOut atualizarInventarioServico(com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoIn atualizaInventarioServicoIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.diagnosticoHPNA.ExecutarDiagnosticoHPNAOut executarDiagnosticoHPNA(br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAIn executaDiagnosticoHPNAIn) throws java.rmi.RemoteException;
    public void excluiProtecaoBloqueio(com.gvt.www.ws.eai.configuradoronline.excluiProtecaoBloqueio.ExcluiProtecaoBloqueioIn excluiProtecaoBloqueioIn) throws java.rmi.RemoteException;
    public void limpaAssinante(com.gvt.www.ws.eai.configuradoronline.limpaAssinante.LimpaAssinanteIn limpaAssinanteIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaOut configurarServicosBandaLarga(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaIn configurarElementoBandaLargaIn) throws java.rmi.RemoteException;
}
