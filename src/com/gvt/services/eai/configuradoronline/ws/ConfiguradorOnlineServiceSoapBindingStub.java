/**
 * ConfiguradorOnlineServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnline {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[89];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("montaComando");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "montaComandoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "MontaComandoIn"), com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "MontaComandoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "montaComandoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ativarElementosInventarioTV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ativarElementosInventarioTVIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarElementosInventarioTVIn"), br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarElementosInventarioTVOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ativarElementosInventarioTVOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getArvoreEquipamento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarArvoreEquipamentosIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarArvoreEquipamentosIn"), br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarArvoreEquipamentosOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarArvoreEquipamentosOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("criarInstanciaServico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "criarInstanciaServicoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "criarInstanciaServicoIn"), com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "criarInstanciaServicoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "criarInstanciaServicoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ativaDesativaTom");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ativaDesativaTom", "ativaDesativaTomIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ativaDesativaTom", "AtivaDesativaTomIn"), com.gvt.www.ws.eai.configuradoronline.ativaDesativaTom.AtivaDesativaTomIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarDiagnosticoHPNA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "consultaDiagnosticoHPNAIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "ConsultaDiagnosticoHPNAIn"), br.com.gvt.www.tv.diagnosticoHPNA.ConsultaDiagnosticoHPNAIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "DiagnosticoHPNAOut"));
        oper.setReturnClass(br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "consultaDiagnosticoHPNAOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarExecucoesVoD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarExecucoesVoDIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarExecucoesVoDIn"), br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarExecucoesVoDOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarExecucoesVoDOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removerPayPerView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarEventoPayPerView"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "EventoPayPerViewIn"), br.com.gvt.www.tv.configuracaoTV.EventoPayPerViewIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarElementoTVOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarInstanciasAssociadas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "consultaInstanciasAssociadasIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "ConsultaIntanciasAssociadasIn"), com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaIntanciasAssociadasIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "ConsultaInstanciasAssociadasOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaInstanciasAssociadasOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "consultaInstanciasAssociadasOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarServicosDeTv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultaServicosDeTvIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultaServicosDeTvIn"), br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultaServicosDeTvOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultaServicosDeTvOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getChildProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "getProductChildIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "getProductChildIn"), com.gvt.www.ws.eai.configuradoronline.getProductChild.GetProductChildIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "getProductChildOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.getProductChild.Produto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "getProductChildOut"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "produto"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaInventarioServico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "ConsultaInventarioServicoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "ConsultaInventarioServicoIn"), com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.ConsultaInventarioServicoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "ConsultaInventarioServicoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "consultaInventarioServicoOut"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "instanciaServico"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarEquipamentosDeTV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarEquipamentosTVIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosTVIn"), br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosTVOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarEquipamentosTVOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizaElementoSiebel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaElementoSiebel", "AtualizaElementoSiebelIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaElementoSiebel", "AtualizaElementoSiebelIn"), com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaElementoSiebel", "AtualizaElementoSiebelOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaElementoSiebel", "AtualizaElementoSiebelOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterTodasServicesRegionTV");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "ServicesRegionOut"));
        oper.setReturnClass(br.com.gvt.www.tv.coberturatv.ServicesRegionOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "servicesRegionOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTopExecucoesVoD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarTopExecucoesVoDIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarTopExecucoesVoDIn"), br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarTopExecucoesVoDOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarTopExecucoesVoDOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ativarAssinanteGVP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ativarAssinanteGVPIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarAssinanteGVPIn"), br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarAssinanteGVPOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ativarAssinanteGVPOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("criarEventoInventarioServico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criareventoinventarioservico", "criarEventoInventarioServicoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criareventoinventarioservico", "CriarEventoInventarioServicoIn"), com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criareventoinventarioservico", "CriarEventoInventarioServicoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criareventoinventarioservico", "criarEventoInventarioServicoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enviaComandoAssincronoHP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "enviaComandoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "EnviaComandoIn"), com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarComprasVoD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarComprasVoDIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarComprasVoDIn"), br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarComprasVoDOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarComprasVoDOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaProcessos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "consultaProcessosIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "ConsultaProcessosIn"), com.gvt.www.ws.eai.configuradoronline.consultaProcessos.ConsultaProcessosIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "ConsultaProcessosOut"));
        oper.setReturnClass(com.gvt.www.metaData.configuradoronline.DadosProcesso[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "consultaProcessosOut"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "processo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removerSetTopBoxNaoInstalado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "removerSetTopBoxNaoInstaladoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "RemoverSetTopBoxNaoInstaladoIn"), br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "RemoverSetTopBoxNaoInstaladoOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "removerSetTopBoxNaoInstaladoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarEquipamentoDeTV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "alterarEquipamentosTVIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarEquipamentoDeTVIn"), br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarEquipamentoDeTVOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "alterarEquipamentosTVOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enviaComandoAssincronoNEC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "configurarBloqueioIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "ConfigurarBloqueioIn"), com.gvt.www.ws.eai.oss.configurarBloqueio.ConfigurarBloqueioIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarSetTopBoxNaoRecolhido");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "inDoc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "ConsultaEquipamentoSetTopBoxIn"), br.com.gvt.www.tv.consultaSetTopBox.ConsultaEquipamentoSetTopBoxIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "ConsultaSetTopBoxNaoRecolhidoOut"));
        oper.setReturnClass(br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoRecolhidoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "consultaSetTopBoxNaoRecolhidoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaProdutoAtivado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProdutoAtivado", "consultaProdutoAtivadoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProdutoAtivado", "ConsultaProdutoAtivadoIn"), com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProdutoAtivado", "ConsultaProdutoAtivadoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProdutoAtivado", "consultaProdutoAtivadoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarEquipamentosSAP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarEquipamentosSAPIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosSAPIn"), br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosSAPOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarEquipamentosSAPOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("adicionarPayPerView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarEventoPayPerView"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "EventoPayPerViewIn"), br.com.gvt.www.tv.configuracaoTV.EventoPayPerViewIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarElementoTVOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaAreas");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaAreas", "ConsultaAreasOut"));
        oper.setReturnClass(com.gvt.www.metaData.configuradoronline.DadosArea[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaAreas", "consultaAreasOut"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaAreas", "area"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarHistoricoDiagnosticoHPNA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "consultaHistoricoDiagnosticoHPNAIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "HistoricoDiagnosticoHPNAIn"), br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "HistoricoDiagnosticoHPNAOut"));
        oper.setReturnClass(br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "consultaHistoricoDiagnosticoHPNAOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executarDiagnosticoCPEs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "diagnosticoCPEsIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "DiagnosticoCPEsIn"), br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "DiagnosticoCPEsOut"));
        oper.setReturnClass(br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "diagnosticoCPEsOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarDadosServicos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "consultaDadosServicoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "consultaDadosServicoIn"), com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "consultaDadosServicoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "consultaDadosServicoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verificarChavesReserva");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "verificarChavesReservaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "VerificarChavesReservaIn"), com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "VerificarChavesReservaOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "verificarChavesReservaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterHierarquiaProdutosCatalogo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "obterHierarquiaProdutosCatalogoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "obterHierarquiaProdutosCatalogoIn"), com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ObterHierarquiaProdutosCatalogoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "obterHierarquiaProdutosCatalogoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ProdutoCatalogo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "obterHierarquiaProdutosCatalogoOut"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "produtoCatalogo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarServicosHomeGateway");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarServicosHomeGatewayIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarServicosHomeGatewayIn"), br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarServicosHomeGatewayOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarServicosHomeGatewayOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("servicoDTT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "servicoDTTIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ServicoDTTIn"), br.com.gvt.www.tv.configuracaoTV.ServicoDTTIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ServicoDTTOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ServicoDTTOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "servicoDTTOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("criarInstanciaProduto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "criarInstanciaProdutoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "criarInstanciaProdutoIn"), com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "criarInstanciaProdutoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "criarInstanciaProdutoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarServicosHomeGateway");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "alterarServicosHomeGatewayIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarServicosHomeGatewayIn"), br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarServicosHomeGatewayOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "alterarServicosHomeGatewayOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("corrigirServicosTV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "corrigirServicosTVIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CorrigirServicosTVIn"), br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CorrigirServicosTVOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "corrigirServicosTVOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removerSetTopBox");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "removerSetTopBoxIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "RemoverSetTopBoxIn"), br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "RemoverSetTopBoxOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "removerSetTopBoxOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("limpaCacheBD");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enviaComandoLegado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/enviaComandoLegado", "enviaComandoLegadoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/enviaComandoLegado", "EnviaComandoLegadoIn"), com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.enviaComandoLegado.EnviaComandoLegadoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("criarChavesReserva");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarChavesReserva", "criarChavesReservaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarChavesReserva", "CriarChavesReservaIn"), com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarChavesReserva", "CriarChavesReservaOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarChavesReserva", "criarChavesReservaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastraProtecaoBloqueio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/cadastraProtecaoBloqueio", "cadastraProtecaoBloqueioIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/cadastraProtecaoBloqueio", "CadastraProtecaoBloqueioIn"), com.gvt.www.ws.eai.configuradoronline.cadastraProtecaoBloqueio.CadastraProtecaoBloqueioIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gravaHistorico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/gravaHistorico", "gravaHistoricoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/gravaHistorico", "GravaHistoricoIn"), com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/gravaHistorico", "GravaHistoricoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/gravaHistorico", "gravaHistoricoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizaBlockUnblock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "atualizaBlockUnblockIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "atualizaBlockUnblockIn"), com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "atualizaBlockUnblockOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "atualizaBlockUnblockOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarSetTopBoxNaoInstalado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "inDoc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "ConsultaEquipamentoSetTopBoxIn"), br.com.gvt.www.tv.consultaSetTopBox.ConsultaEquipamentoSetTopBoxIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "ConsultaSetTopBoxNaoInstaladoOut"));
        oper.setReturnClass(br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoInstaladoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "consultaSetTopBoxNaoInstaladoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("desconectarServicosDeTV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarElementoTVIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVIn"), br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarElementoTVOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarDadosServicosParamHistorico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "consultaDadosServicoParamIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "consultaDadosServicoParamIn"), com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.ConsultaDadosServicoParamIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "consultaDadosServicoParamHistoricoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.InstServParamHist[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "consultaDadosServicoParamHistoricoOut"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "instServParamHist"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizaInventario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "atualizaInventarioIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "AtualizaInventarioIn"), com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "AtualizaInventarioOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "atualizaInventarioOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizarFirmwareCPE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "atualizarFirmwareCPEIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtualizarFirmwareCPEIn"), br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtualizarFirmwareCPEOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtualizarFirmwareCPEOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removerFavoritoGVT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/RemoverFavoritoGVT", "removerFavoritoGVTIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/RemoverFavoritoGVT", "RemoverFavoritoGVTIn"), com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/RemoverFavoritoGVT", "RemoverFavoritoGVTOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/RemoverFavoritoGVT", "removerFavoritoGVTOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existeComandoEmProcessamento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/existeComandoProcessamento", "existeComandoProcessamentoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/existeComandoProcessamento", "ExisteComandoProcessamentoIn"), com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/existeComandoProcessamento", "ExisteComandoProcessamentoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/existeComandoProcessamento", "existeComandoProcessamentoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarCanaisAssinante");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarCanaisAssinanteIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCanaisAssinanteIn"), br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCanaisAssinanteOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarCanaisAssinanteOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("iniciarSolicitacaoChavesReserva");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/iniciarSolicitacaoChavesReserva", "iniciarSolicitacaoChavesReservaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/iniciarSolicitacaoChavesReserva", "IniciarSolicitacaoChavesReservaIn"), com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/iniciarSolicitacaoChavesReserva", "IniciarSolicitacaoChavesReservaOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/iniciarSolicitacaoChavesReserva", "iniciarSolicitacaoChavesReservaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaInventarioSmartTool");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInventario", "consultaInventarioSmartToolIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInventario", "ConsultaInventarioSmartToolIn"), com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioSmartToolIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInventario", "ConsultaInventarioOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInventario", "consultaInventarioOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enviaComando");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "enviaComandoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "EnviaComandoIn"), com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "EnviaComandoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "enviaComandoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reenviarPayPerView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "reenviarEventoPayPerViewIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ReenviarEventoPayPerViewIn"), br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ReenviarEventoPayPerViewOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "reenviarEventoPayPerViewOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaTiposBloqueio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "consultaTiposBloqueioIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "ConsultaTiposBloqueioIn"), com.gvt.www.ws.eai.configuradoronline.consultaTiposBloqueio.enviaComando.ConsultaTiposBloqueioIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "ConsultaTiposBloqueioOut"));
        oper.setReturnClass(com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "consultaTiposBloqueioOut"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "tipoBloqueio"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarPayPerView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarPayPerViewIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarPayPerViewIn"), br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarPayPerViewOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarPayPerViewOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("desconectarSetTopBoxNaoInstalado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/desconectarSetTopBoxNaoInstalado", "desconectarSetTopBoxNaoInstaladoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/desconectarSetTopBoxNaoInstalado", "DesconectarSetTopBoxNaoInstaladoIn"), br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/desconectarSetTopBoxNaoInstalado", "DesconectarSetTopBoxNaoInstaladoOut"));
        oper.setReturnClass(br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/desconectarSetTopBoxNaoInstalado", "desconectarSetTopBoxNaoInstaladoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetSenhaSetTopBox");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "resetSenhaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ResetSenhaTVIn"), br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ResetSenhaTVOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "resetSenhaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaInventario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInventario", "consultaInventarioIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInventario", "ConsultaInventarioIn"), com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInventario", "ConsultaInventarioOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInventario", "consultaInventarioOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarInformacaoAssinanteTV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "consultaInfoAssinanteTvIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "CriterioBuscaAssinante"), br.com.gvt.www.tv.consultaInfoAssinante.CriterioBuscaAssinante.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "InformacaoAssinanteTv"));
        oper.setReturnClass(br.com.gvt.www.tv.consultaInfoAssinante.InformacaoAssinanteTv.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "consultaInfoAssinanteTvOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ativarAssinanteDTH");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ativarAssinanteDTHIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarAssinanteDTHIn"), br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarAssinanteDTHOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ativarAssinanteDTHOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetLinha");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/resetLinha", "resetLinhaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/resetLinha", "ResetLinhaIn"), com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/resetLinha", "ResetLinhaOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/resetLinha", "resetLinhaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaElemento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "consultaElementoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "ConsultaElementoIn"), com.gvt.www.ws.eai.configuradoronline.consultaElemento.ConsultaElementoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "ConsultaElementoOut"));
        oper.setReturnClass(br.com.gvt.www.oss.necservice.ConsultElement[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "consultaElementoOut"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "consultElement"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaInventarioServicoByResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "ConsultaInventarioServicoByResourceIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "ConsultaInventarioServicoByResourceIn"), com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "ConsultaInventarioServicoByResourceOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "consultaInventarioServicoByResourceOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("concluirMudancaNumeroSIP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/concluirMudancaNumeroSIP", "concluirMudancaNumeroSIPIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/concluirMudancaNumeroSIP", "ConcluirMudancaNumeroSIPIn"), com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/concluirMudancaNumeroSIP", "ConcluirMudancaNumeroSIPOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/concluirMudancaNumeroSIP", "concluirMudancaNumeroSIPOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarServicoPFC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "alterarServicoPFCIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "AlterarServicoPFCIn"), br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "AlterarServicoPFCOut"));
        oper.setReturnClass(br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "alterarServicoPFCOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getIMSRegistry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getIMSRegistry", "getIMSRegistryIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getIMSRegistry", "GetIMSRegistryIn"), com.gvt.www.ws.eai.configuradoronline.getIMSRegistry.GetIMSRegistryIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getIMSRegistry", "GetIMSRegistryOut"));
        oper.setReturnClass(br.com.gvt.www.CanonicalModel.ResourceFacingService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getIMSRegistry", "getIMSRegistryOut"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getIMSRegistry", "resourceFacingServices"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTipoCentral");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/getTipoCentral", "getTipoCentralIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/getTipoCentral", "GetTipoCentralIn"), com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/getTipoCentral", "GetTipoCentralOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/getTipoCentral", "getTipoCentralOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaHistorico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaHistorico", "consultaHistoricoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaHistorico", "ConsultaHistoricoIn"), com.gvt.www.ws.eai.configuradoronline.consultaHistorico.ConsultaHistoricoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaHistorico", "ConsultaHistoricoOut"));
        oper.setReturnClass(com.gvt.www.metaData.configuradoronline.DadosExecucao[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaHistorico", "consultaHistoricoOut"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaHistorico", "execucao"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarServicosDeTV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarElementoTVIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVIn"), br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarElementoTVOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterXGvtProdCodDoCatalogoServicosTV");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaCatalogServico", "CatalogodeServicosProdCodeOut"));
        oper.setReturnClass(br.com.gvt.www.tv.consultaCatalogServico.CatalogodeServicosProdCodeOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaCatalogServico", "consultaXGvtProdCodedoCatalogoServico"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarServiceRegionByCEP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "consultarServiceRegionByCEPIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "ServiceRegionByCEPIn"), br.com.gvt.www.tv.coberturatv.ServiceRegionByCEPIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "ServicesRegionOut"));
        oper.setReturnClass(br.com.gvt.www.tv.coberturatv.ServicesRegionOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "servicesRegionOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarCoberturaTV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarCoberturaTVIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCoberturaTVIn"), br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCoberturaTVOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarCoberturaTVOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enviaComandoAssincronoNECAtivacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ConfigurarLinhaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ConfigurarLinhaIn"), br.com.gvt.www.oss.necservice.ConfigurarLinhaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enviaComandoSavvion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "enviaComandoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "EnviaComandoIn"), com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getChaveReserva");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getChaveReserva", "getChaveReservaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getChaveReserva", "getChaveReservaIn"), com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getChaveReserva", "getChaveReservaOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getChaveReserva", "getChaveReservaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("persistirDadosServicos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "persistirDadosServicosIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "persistirDadosServicosIn"), com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "persistirDadosServicosOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "persistirDadosServicosOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarComprasVoDComExecucao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarComprasVoDComExecucaoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarComprasVoDComExecucaoIn"), br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarComprasVoDComExecucaoOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "consultarComprasVoDComExecucaoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reconfigurarAssinanteDTH");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "reconfigurarAssinanteDTHIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ReconfigurarAssinanteDTHIn"), br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ReconfigurarAssinanteDTHOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "reconfigurarAssinanteDTHOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("adicionarServicosDeTV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarElementoTVIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVIn"), br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarElementoTVOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizarInventarioServico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "AtualizaInventarioServicoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "AtualizaInventarioServicoIn"), com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "AtualizaInventarioServicoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "AtualizaInventarioServicoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executarDiagnosticoHPNA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "executaDiagnosticoHPNAIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "DiagnosticoHPNAIn"), br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "ExecutarDiagnosticoHPNAOut"));
        oper.setReturnClass(br.com.gvt.www.tv.diagnosticoHPNA.ExecutarDiagnosticoHPNAOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "executaDiagnosticoHPNAOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("excluiProtecaoBloqueio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/excluiProtecaoBloqueio", "excluiProtecaoBloqueioIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/excluiProtecaoBloqueio", "ExcluiProtecaoBloqueioIn"), com.gvt.www.ws.eai.configuradoronline.excluiProtecaoBloqueio.ExcluiProtecaoBloqueioIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("limpaAssinante");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/limpaAssinante", "limpaAssinanteIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/limpaAssinante", "LimpaAssinanteIn"), com.gvt.www.ws.eai.configuradoronline.limpaAssinante.LimpaAssinanteIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configurarServicosBandaLarga");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarElementoBandaLargaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoBandaLargaIn"), br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoBandaLargaOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarElementoBandaLargaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

    }

    public ConfiguradorOnlineServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ConfiguradorOnlineServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ConfiguradorOnlineServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", ">Switch>type");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.SwitchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "BrazilianUrbanPropertyAddress");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.BrazilianUrbanPropertyAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "Cabinet");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.Cabinet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "PhysicalDevice");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.PhysicalDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "PhysicalResource");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.PhysicalResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "PlacePhysicalResourceAssoc");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.Cabinet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "Cabinet");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "Cabinet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "ResourceFacingService");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.ResourceFacingService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "ResourceFacingServiceAtomic");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.ResourceFacingServiceAtomic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "ResourceFacingServiceSpec");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.ResourceFacingServiceSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "RootEntity");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.RootEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "Service");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "ServiceSpecification");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.ServiceSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "Switch");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel._switch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ArrayOfConfigValue");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.ConfigValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ConfigValue");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ConfigValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ArrayOfInfoSiebel");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.InfoSiebel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "InfoSiebel");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "InfoSiebel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ArrayOfItem");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.Item[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Item");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ConfigValue");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.ConfigValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "InfoSiebel");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.InfoSiebel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Item");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "LinhaInfo");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.LinhaInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "NECRequest");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.col.metaData.NECService.NECRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ConfigurarLinhaIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.oss.necservice.ConfigurarLinhaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ConsultElement");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.oss.necservice.ConsultElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "LinhaInfo");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.oss.necservice.LinhaInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "Service");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.oss.necservice.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ServiceParameter");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.oss.necservice.ServiceParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "AlterarServicoPFCIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "AlterarServicoPFCOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "ParametroPFC");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.alterarServicoPFC.ParametroPFC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "ServiceRegion");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.coberturatv.ServiceRegion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "ServiceRegionByCEPIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.coberturatv.ServiceRegionByCEPIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "ServicesRegionOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.coberturatv.ServicesRegionOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">AlterarEquipamentoDeTVIn>codOrdemServico");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">ConfigurarElementoTVIn>categoriaServico");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVInCategoriaServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">ConfigurarElementoTVIn>CEP");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">ConsultarCanaisAssinanteOut>cep");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">ConsultarCoberturaTVIn>cep");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">CorrigirServicosTVIn>cep");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">HeaderExecucaoTV>tecnologiaTV");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.HeaderExecucaoTVTecnologiaTV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">InformacaoTV>cep");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">SetTopBox>tecnologiaTV");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.SetTopBoxTecnologiaTV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">ValidacaoCertificacaoSetTopBox>statusCertificacao");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBoxStatusCertificacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarEquipamentoDeTVIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarEquipamentoDeTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarServicosHomeGatewayIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarServicosHomeGatewayOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarAssinanteDTHIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarAssinanteDTHOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarAssinanteGVPIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarAssinanteGVPOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarElementosInventarioTVIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarElementosInventarioTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtualizarFirmwareCPEIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtualizarFirmwareCPEOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Canais");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.Canal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Canal");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "canal");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Canal");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.Canal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ComprasVoD");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.CompraVoD[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CompraVoD");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "compraVoD");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CompraVoD");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.CompraVoD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoBandaLargaIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoBandaLargaOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarArvoreEquipamentosIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarArvoreEquipamentosOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCanaisAssinanteIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCanaisAssinanteOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCoberturaTVIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCoberturaTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarComprasVoDComExecucaoIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarComprasVoDComExecucaoOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarComprasVoDIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarComprasVoDOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosSAPIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosSAPOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosTVIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarExecucoesVoDIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarExecucoesVoDOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarPayPerViewIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarPayPerViewOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarServicosHomeGatewayIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarServicosHomeGatewayOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarTopExecucoesVoDIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarTopExecucoesVoDOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultaServicosDeTvIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultaServicosDeTvOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CorrigirServicosTVIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CorrigirServicosTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ElementoInventario");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ElementoInventario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ElementoSiebel");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ElementoSiebel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "EquipamentoParaRemocao");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.EquipamentoParaRemocao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "EventoPayPerView");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.EventoPayPerView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "EventoPayPerViewIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.EventoPayPerViewIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ExecucaoVoD");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ExecucaoVoD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ExecucoesVoD");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ExecucaoVoD[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ExecucaoVoD");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "execucaoVoD");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Filme");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.Filme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "GravarChavesCertificacaoOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "HeaderExecucaoTV");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.HeaderExecucaoTV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "HomeGateway");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.HomeGateway.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "InformacaoBandaLarga");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.InformacaoBandaLarga.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "InformacaoTV");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.InformacaoTV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "InstanciaServicos");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.InstanciaServicos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "MensagemRetorno");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.MensagemRetorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Pacote");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.Pacote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Pacotes");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.Pacote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Pacote");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "pacote");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Parametro");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.Parametro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ParametroTV");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ParametroTV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Passport");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.Passport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Periodo");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.Periodo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Produto");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.Produto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ProdutoSAP");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ProdutoSAP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ReconfigurarAssinanteDTHIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ReconfigurarAssinanteDTHOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ReenviarEventoPayPerViewIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ReenviarEventoPayPerViewOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "RemoverSetTopBoxIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "RemoverSetTopBoxNaoInstaladoIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "RemoverSetTopBoxNaoInstaladoOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "RemoverSetTopBoxOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ResetSenhaTVIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ResetSenhaTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ResumoExecucaoVoD");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ResumoExecucaoVoD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ResumosExecucaoVoD");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ResumoExecucaoVoD[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ResumoExecucaoVoD");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "resumoExecucaoVoD");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ServicoDTTIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ServicoDTTIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ServicoDTTOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ServicoDTTOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "SetTopBox");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.SetTopBox.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "SmartCard");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.SmartCard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "StatusProvisioning");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.StatusProvisioning.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidacaoCertificacaoOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidacaoCertificacaoSetTopBox");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBox.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidarChaveCertificacaoDTHOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaCatalogServico", "CatalogodeServicosProdCodeOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.consultaCatalogServico.CatalogodeServicosProdCodeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "CriterioBuscaAssinante");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.consultaInfoAssinante.CriterioBuscaAssinante.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "InformacaoAssinanteTv");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.consultaInfoAssinante.InformacaoAssinanteTv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "ConsultaEquipamentoSetTopBoxIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.consultaSetTopBox.ConsultaEquipamentoSetTopBoxIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "ConsultaSetTopBoxNaoInstaladoOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoInstaladoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "ConsultaSetTopBoxNaoRecolhidoOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoRecolhidoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/desconectarSetTopBoxNaoInstalado", "DesconectarSetTopBoxNaoInstaladoIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/desconectarSetTopBoxNaoInstalado", "DesconectarSetTopBoxNaoInstaladoOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "Diagnostico");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "DiagnosticoParam");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "params");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "DiagnosticoCPEsIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "DiagnosticoCPEsOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "DiagnosticoParam");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "ElementoDiagnostico");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoCPE.ElementoDiagnostico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "ExecucaoTesteHPNA");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoCPE.ExecucaoTesteHPNA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "ConsultaDiagnosticoHPNAIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoHPNA.ConsultaDiagnosticoHPNAIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "DiagnosticoCPEsOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoCPEsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "DiagnosticoHPNA");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "DiagnosticoHPNAIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "DiagnosticoHPNAOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "ExecutarDiagnosticoHPNAOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoHPNA.ExecutarDiagnosticoHPNAOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "HistoricoDiagnosticoHPNAIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "HistoricoDiagnosticoHPNAOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "ConnectivityType");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.ipvodinfo.ConnectivityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "EquipmentInfo");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.ipvodinfo.EquipmentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "status");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.ipvodinfo.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "SubscriberInfo");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.ipvodinfo.SubscriberInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosArea");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComando");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosComando.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosComandoAtivacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoBloqueio");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoBloqueio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoConfigLinha");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoConfigLinha.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoLegado");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoLegado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoNEC");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoNEC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoService");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoServiceParam");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoServiceParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoExecucao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosComandoExecucao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoInventario");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosComandoInventario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosDestino");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosDestino.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosExecucao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosExecucao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosHistorico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosHistorico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosInventario");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosInventario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosOpcoesConfigurarLinha");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosOpcoesConfigurarLinha.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosProcesso");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosProcesso.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosProduto");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosProduto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosRangeInternacional");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosRangeInternacional.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosRangeNacional");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosRangeNacional.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosServicoParametro");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosServicoParametro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusBloqueio");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusComando");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosStatusComando.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusExecucao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosStatusExecucao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosTipoBloqueio");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosWhiteList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "instancia");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "MotivoRetirada");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.MotivoRetirada.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "TipoComando");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.TipoComando.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "TipoServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.TipoServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/smarttool", "Credenciais");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.smarttool.Credenciais.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "atualizaBlockUnblockIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "atualizaBlockUnblockOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/acesso", "Acesso");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.acesso.Acesso.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ativaDesativaTom", "AtivaDesativaTomIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ativaDesativaTom.AtivaDesativaTomIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaElementoSiebel", "AtualizaElementoSiebelIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaElementoSiebel", "AtualizaElementoSiebelOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "AtualizaInventarioServicoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "AtualizaInventarioServicoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "IdentificadorServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.IdentificadorServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "IdInstanciaServicoComposto");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.IdInstanciaServicoComposto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "Parametro");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Parametro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "Resource");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Resource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "Status");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "AtualizaInventarioIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "AtualizaInventarioOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/cadastraProtecaoBloqueio", "CadastraProtecaoBloqueioIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.cadastraProtecaoBloqueio.CadastraProtecaoBloqueioIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/concluirMudancaNumeroSIP", "ConcluirMudancaNumeroSIPIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/concluirMudancaNumeroSIP", "ConcluirMudancaNumeroSIPOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaAreas", "ConsultaAreasOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosArea[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosArea");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaAreas", "area");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "ConsultaElementoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaElemento.ConsultaElementoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "ConsultaElementoOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.oss.necservice.ConsultElement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ConsultElement");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "consultElement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaHistorico", "ConsultaHistoricoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaHistorico.ConsultaHistoricoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaHistorico", "ConsultaHistoricoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosExecucao[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosExecucao");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaHistorico", "execucao");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", ">InstanciasAssociadas>tecnologiaLinha");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.InstanciasAssociadasTecnologiaLinha.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "ConsultaInstanciasAssociadasOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaInstanciasAssociadasOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "ConsultaIntanciasAssociadasIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaIntanciasAssociadasIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "InstanciasAssociadas");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.InstanciasAssociadas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "CatalogoServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.CatalogoServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "CatalogoServicoParam");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.CatalogoServicoParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "ConsultaInventarioServicoByResourceIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "ConsultaInventarioServicoByResourceOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "InstanciaProduto");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaProduto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "InstanciaServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "Parametro");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.Parametro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "Resource");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.Resource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "Status");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "CatalogoServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "CatalogoServicoParam");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServicoParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "ConsultaInventarioServicoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.ConsultaInventarioServicoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "ConsultaInventarioServicoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "InstanciaServico");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "instanciaServico");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "IdentificadorProduto");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorProduto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "IdentificadorProdutoComposto");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorProdutoComposto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "IdentificadorServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "InstanciaServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "Parametro");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Parametro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "Resource");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Resource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "Status");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInventario", "ConsultaInventarioIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInventario", "ConsultaInventarioOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInventario", "ConsultaInventarioSmartToolIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioSmartToolIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "ConsultaProcessosIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaProcessos.ConsultaProcessosIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "ConsultaProcessosOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosProcesso[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosProcesso");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "processo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProdutoAtivado", "ConsultaProdutoAtivadoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProdutoAtivado", "ConsultaProdutoAtivadoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "ConsultaTiposBloqueioIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.consultaTiposBloqueio.enviaComando.ConsultaTiposBloqueioIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "ConsultaTiposBloqueioOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosTipoBloqueio");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "tipoBloqueio");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarChavesReserva", "CriarChavesReservaIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarChavesReserva", "CriarChavesReservaOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criareventoinventarioservico", "CriarEventoInventarioServicoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criareventoinventarioservico", "CriarEventoInventarioServicoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "criarInstanciaProdutoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "criarInstanciaProdutoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "criarInstanciaServicoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "criarInstanciaServicoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "param");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Param.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "resource");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Resource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "consultaDadosServicoParamHistoricoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.InstServParamHist[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "InstServParamHist");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "instServParamHist");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "consultaDadosServicoParamIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.ConsultaDadosServicoParamIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "Filtro");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.Filtro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "InfoCatalago");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.InfoCatalago.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "InstServParamHist");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.InstServParamHist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "CatalogoServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.CatalogoServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "consultaDadosServicoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "consultaDadosServicoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "Filtro");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.Filtro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "InfoCatalago");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.InfoCatalago.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "InfoServicoSiebel");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.InfoServicoSiebel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "InstanciaProduto");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.InstanciaProduto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "ParamInstServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "persistirDadosServicosIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "persistirDadosServicosOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "Produto");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.Servico[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "Servico");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "servico");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "Servico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.Servico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "StatusInstServico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.dadosServico.StatusInstServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/enviaComandoLegado", "EnviaComandoLegadoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.enviaComandoLegado.EnviaComandoLegadoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/getTipoCentral", "GetTipoCentralIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/getTipoCentral", "GetTipoCentralOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/resetLinha", "ResetLinhaIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/resetLinha", "ResetLinhaOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "EnviaComandoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "EnviaComandoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/excluiProtecaoBloqueio", "ExcluiProtecaoBloqueioIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.excluiProtecaoBloqueio.ExcluiProtecaoBloqueioIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/existeComandoProcessamento", "ExisteComandoProcessamentoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/existeComandoProcessamento", "ExisteComandoProcessamentoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getChaveReserva", "getChaveReservaIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getChaveReserva", "getChaveReservaOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getIMSRegistry", "GetIMSRegistryIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.getIMSRegistry.GetIMSRegistryIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getIMSRegistry", "GetIMSRegistryOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.CanonicalModel.ResourceFacingService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "ResourceFacingService");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getIMSRegistry", "resourceFacingServices");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "getProductChildIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.getProductChild.GetProductChildIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "getProductChildOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.getProductChild.Produto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "Produto");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "produto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "Produto");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.getProductChild.Produto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/gravaHistorico", "GravaHistoricoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/gravaHistorico", "GravaHistoricoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/iniciarSolicitacaoChavesReserva", "IniciarSolicitacaoChavesReservaIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/iniciarSolicitacaoChavesReserva", "IniciarSolicitacaoChavesReservaOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/limpaAssinante", "LimpaAssinanteIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.limpaAssinante.LimpaAssinanteIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/modeloEquipamento", "ModeloEquipamento");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "DadosFazNada");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.montaComando.DadosFazNada.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "MontaComandoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "MontaComandoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "obterHierarquiaProdutosCatalogoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ObterHierarquiaProdutosCatalogoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "obterHierarquiaProdutosCatalogoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ProdutoCatalogo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "ProdutoCatalogo");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "produtoCatalogo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "ParamProdutoCatalogo");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ParamProdutoCatalogo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "ProdutoCatalogo");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ProdutoCatalogo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/RemoverFavoritoGVT", "RemoverFavoritoGVTIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/RemoverFavoritoGVT", "RemoverFavoritoGVTOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "VerificarChavesReservaIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "VerificarChavesReservaOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "ConfigurarBloqueioIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.configurarBloqueio.ConfigurarBloqueioIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "NumeroTelefonico");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "PercentagemBloqueio");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.configurarBloqueio.PercentagemBloqueio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "TipoTecnologiaTV");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.configurarBloqueio.TipoTecnologiaTV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoOut montaComando(com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoIn montaComandoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "montaComando"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {montaComandoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.montaComando.MontaComandoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVOut ativarElementosInventarioTV(br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVIn ativarElementosInventarioTVIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ativarElementosInventarioTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ativarElementosInventarioTVIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosOut getArvoreEquipamento(br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosIn consultarArvoreEquipamentosIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "getArvoreEquipamento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarArvoreEquipamentosIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoOut criarInstanciaServico(com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoIn criarInstanciaServicoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "criarInstanciaServico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {criarInstanciaServicoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.CriarInstanciaServicoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ativaDesativaTom(com.gvt.www.ws.eai.configuradoronline.ativaDesativaTom.AtivaDesativaTomIn ativaDesativaTomIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ativaDesativaTom"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ativaDesativaTomIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAOut consultarDiagnosticoHPNA(br.com.gvt.www.tv.diagnosticoHPNA.ConsultaDiagnosticoHPNAIn consultaDiagnosticoHPNAIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarDiagnosticoHPNA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaDiagnosticoHPNAIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDOut consultarExecucoesVoD(br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDIn consultarExecucoesVoDIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarExecucoesVoD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarExecucoesVoDIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut removerPayPerView(br.com.gvt.www.tv.configuracaoTV.EventoPayPerViewIn configurarEventoPayPerView) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "removerPayPerView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarEventoPayPerView});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaInstanciasAssociadasOut consultarInstanciasAssociadas(com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaIntanciasAssociadasIn consultaInstanciasAssociadasIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarInstanciasAssociadas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaInstanciasAssociadasIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaInstanciasAssociadasOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaInstanciasAssociadasOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.ConsultaInstanciasAssociadasOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvOut consultarServicosDeTv(br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvIn consultaServicosDeTvIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarServicosDeTv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaServicosDeTvIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.getProductChild.Produto[] getChildProduct(com.gvt.www.ws.eai.configuradoronline.getProductChild.GetProductChildIn getProductChildIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "getChildProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getProductChildIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.getProductChild.Produto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.getProductChild.Produto[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.getProductChild.Produto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[] consultaInventarioServico(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.ConsultaInventarioServicoIn consultaInventarioServicoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultaInventarioServico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaInventarioServicoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVOut consultarEquipamentosDeTV(br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVIn consultarEquipamentosTVIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarEquipamentosDeTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarEquipamentosTVIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelOut atualizaElementoSiebel(com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelIn atualizaElementoSiebelIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizaElementoSiebel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizaElementoSiebelIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel.AtualizaElementoSiebelOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.coberturatv.ServicesRegionOut obterTodasServicesRegionTV() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "obterTodasServicesRegionTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.coberturatv.ServicesRegionOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.coberturatv.ServicesRegionOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.coberturatv.ServicesRegionOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDOut consultarTopExecucoesVoD(br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDIn consultarTopExecucoesVoDIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarTopExecucoesVoD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarTopExecucoesVoDIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPOut ativarAssinanteGVP(br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPIn ativarAssinanteGVPIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ativarAssinanteGVP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ativarAssinanteGVPIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteGVPOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoOut criarEventoInventarioServico(com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoIn criarEventoInventarioServicoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "criarEventoInventarioServico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {criarEventoInventarioServicoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico.CriarEventoInventarioServicoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enviaComandoAssincronoHP(com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn enviaComandoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "enviaComandoAssincronoHP"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {enviaComandoIn});

    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDOut consultarComprasVoD(br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDIn consultarComprasVoDIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarComprasVoD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarComprasVoDIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.metaData.configuradoronline.DadosProcesso[] consultaProcessos(com.gvt.www.ws.eai.configuradoronline.consultaProcessos.ConsultaProcessosIn consultaProcessosIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultaProcessos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaProcessosIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.metaData.configuradoronline.DadosProcesso[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.metaData.configuradoronline.DadosProcesso[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.metaData.configuradoronline.DadosProcesso[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoOut removerSetTopBoxNaoInstalado(br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoIn removerSetTopBoxNaoInstaladoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "removerSetTopBoxNaoInstalado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {removerSetTopBoxNaoInstaladoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxNaoInstaladoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVOut alterarEquipamentoDeTV(br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVIn alterarEquipamentosTVIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "alterarEquipamentoDeTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {alterarEquipamentosTVIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enviaComandoAssincronoNEC(com.gvt.www.ws.eai.oss.configurarBloqueio.ConfigurarBloqueioIn configurarBloqueioIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "enviaComandoAssincronoNEC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarBloqueioIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoRecolhidoOut consultarSetTopBoxNaoRecolhido(br.com.gvt.www.tv.consultaSetTopBox.ConsultaEquipamentoSetTopBoxIn inDoc) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarSetTopBoxNaoRecolhido"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inDoc});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoRecolhidoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoRecolhidoOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoRecolhidoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoOut consultaProdutoAtivado(com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoIn consultaProdutoAtivadoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultaProdutoAtivado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaProdutoAtivadoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.consultaProdutoAtivado.ConsultaProdutoAtivadoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPOut consultarEquipamentosSAP(br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPIn consultarEquipamentosSAPIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarEquipamentosSAP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarEquipamentosSAPIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut adicionarPayPerView(br.com.gvt.www.tv.configuracaoTV.EventoPayPerViewIn configurarEventoPayPerView) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "adicionarPayPerView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarEventoPayPerView});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.metaData.configuradoronline.DadosArea[] consultaAreas() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultaAreas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.metaData.configuradoronline.DadosArea[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.metaData.configuradoronline.DadosArea[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.metaData.configuradoronline.DadosArea[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAOut consultarHistoricoDiagnosticoHPNA(br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAIn consultaHistoricoDiagnosticoHPNAIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarHistoricoDiagnosticoHPNA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaHistoricoDiagnosticoHPNAIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.diagnosticoHPNA.HistoricoDiagnosticoHPNAOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsOut executarDiagnosticoCPEs(br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsIn diagnosticoCPEsIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "executarDiagnosticoCPEs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {diagnosticoCPEsIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoCPEsOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoOut consultarDadosServicos(com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoIn consultaDadosServicoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarDadosServicos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaDadosServicoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.dadosServico.ConsultaDadosServicoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaOut verificarChavesReserva(com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaIn verificarChavesReservaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "verificarChavesReserva"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verificarChavesReservaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva.VerificarChavesReservaOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ProdutoCatalogo[] obterHierarquiaProdutosCatalogo(com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ObterHierarquiaProdutosCatalogoIn obterHierarquiaProdutosCatalogoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "obterHierarquiaProdutosCatalogo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {obterHierarquiaProdutosCatalogoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ProdutoCatalogo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ProdutoCatalogo[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ProdutoCatalogo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayOut consultarServicosHomeGateway(br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayIn consultarServicosHomeGatewayIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarServicosHomeGateway"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarServicosHomeGatewayIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ServicoDTTOut servicoDTT(br.com.gvt.www.tv.configuracaoTV.ServicoDTTIn servicoDTTIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "servicoDTT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {servicoDTTIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ServicoDTTOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ServicoDTTOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ServicoDTTOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoOut criarInstanciaProduto(com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoIn criarInstanciaProdutoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "criarInstanciaProduto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {criarInstanciaProdutoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto.CriarInstanciaProdutoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayOut alterarServicosHomeGateway(br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayIn alterarServicosHomeGatewayIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "alterarServicosHomeGateway"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {alterarServicosHomeGatewayIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVOut corrigirServicosTV(br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVIn corrigirServicosTVIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "corrigirServicosTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {corrigirServicosTVIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxOut removerSetTopBox(br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxIn removerSetTopBoxIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "removerSetTopBox"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {removerSetTopBoxIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.RemoverSetTopBoxOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void limpaCacheBD() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "limpaCacheBD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enviaComandoLegado(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.enviaComandoLegado.EnviaComandoLegadoIn enviaComandoLegadoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "enviaComandoLegado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enviaComandoLegadoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaOut criarChavesReserva(com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaIn criarChavesReservaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "criarChavesReserva"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {criarChavesReservaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.criarChavesReserva.CriarChavesReservaOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void cadastraProtecaoBloqueio(com.gvt.www.ws.eai.configuradoronline.cadastraProtecaoBloqueio.CadastraProtecaoBloqueioIn cadastraProtecaoBloqueioIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "cadastraProtecaoBloqueio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cadastraProtecaoBloqueioIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoOut gravaHistorico(com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoIn gravaHistoricoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "gravaHistorico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gravaHistoricoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.gravaHistorico.GravaHistoricoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockOut atualizaBlockUnblock(com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockIn atualizaBlockUnblockIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizaBlockUnblock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizaBlockUnblockIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.billing.updateBlockUnblock.AtualizaBlockUnblockOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoInstaladoOut consultarSetTopBoxNaoInstalado(br.com.gvt.www.tv.consultaSetTopBox.ConsultaEquipamentoSetTopBoxIn inDoc) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarSetTopBoxNaoInstalado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inDoc});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoInstaladoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoInstaladoOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.consultaSetTopBox.ConsultaSetTopBoxNaoInstaladoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut desconectarServicosDeTV(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn configurarElementoTVIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "desconectarServicosDeTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarElementoTVIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.InstServParamHist[] consultarDadosServicosParamHistorico(com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.ConsultaDadosServicoParamIn consultaDadosServicoParamIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarDadosServicosParamHistorico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaDadosServicoParamIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.InstServParamHist[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.InstServParamHist[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico.InstServParamHist[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioOut atualizaInventario(com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioIn atualizaInventarioIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizaInventario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizaInventarioIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.atualizaInventario.AtualizaInventarioOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEOut atualizarFirmwareCPE(br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEIn atualizarFirmwareCPEIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizarFirmwareCPE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizarFirmwareCPEIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.AtualizarFirmwareCPEOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTOut removerFavoritoGVT(com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTIn removerFavoritoGVTIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "removerFavoritoGVT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {removerFavoritoGVTIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT.RemoverFavoritoGVTOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoOut existeComandoEmProcessamento(com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoIn existeComandoProcessamentoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "existeComandoEmProcessamento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {existeComandoProcessamentoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento.ExisteComandoProcessamentoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteOut consultarCanaisAssinante(br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteIn consultarCanaisAssinanteIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarCanaisAssinante"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarCanaisAssinanteIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaOut iniciarSolicitacaoChavesReserva(com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaIn iniciarSolicitacaoChavesReservaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "iniciarSolicitacaoChavesReserva"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {iniciarSolicitacaoChavesReservaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.iniciarSolicitacaoChavesReserva.IniciarSolicitacaoChavesReservaOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut consultaInventarioSmartTool(com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioSmartToolIn consultaInventarioSmartToolIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultaInventarioSmartTool"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaInventarioSmartToolIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoOut enviaComando(com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn enviaComandoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "enviaComando"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enviaComandoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewOut reenviarPayPerView(br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewIn reenviarEventoPayPerViewIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "reenviarPayPerView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reenviarEventoPayPerViewIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[] consultaTiposBloqueio(com.gvt.www.ws.eai.configuradoronline.consultaTiposBloqueio.enviaComando.ConsultaTiposBloqueioIn consultaTiposBloqueioIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultaTiposBloqueio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaTiposBloqueioIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewOut consultarPayPerView(br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewIn consultarPayPerViewIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarPayPerView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarPayPerViewIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoOut desconectarSetTopBoxNaoInstalado(br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoIn desconectarSetTopBoxNaoInstaladoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "desconectarSetTopBoxNaoInstalado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {desconectarSetTopBoxNaoInstaladoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.desconectarSetTopBoxNaoInstalado.DesconectarSetTopBoxNaoInstaladoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVOut resetSenhaSetTopBox(br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVIn resetSenhaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "resetSenhaSetTopBox"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetSenhaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ResetSenhaTVOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut consultaInventario(com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioIn consultaInventarioIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultaInventario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaInventarioIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.consultaInventario.ConsultaInventarioOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.consultaInfoAssinante.InformacaoAssinanteTv consultarInformacaoAssinanteTV(br.com.gvt.www.tv.consultaInfoAssinante.CriterioBuscaAssinante consultaInfoAssinanteTvIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarInformacaoAssinanteTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaInfoAssinanteTvIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.consultaInfoAssinante.InformacaoAssinanteTv) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.consultaInfoAssinante.InformacaoAssinanteTv) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.consultaInfoAssinante.InformacaoAssinanteTv.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHOut ativarAssinanteDTH(br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHIn ativarAssinanteDTHIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ativarAssinanteDTH"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ativarAssinanteDTHIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaOut resetLinha(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaIn resetLinhaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "resetLinha"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetLinhaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha.ResetLinhaOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.oss.necservice.ConsultElement[] consultaElemento(com.gvt.www.ws.eai.configuradoronline.consultaElemento.ConsultaElementoIn consultaElementoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultaElemento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaElementoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.oss.necservice.ConsultElement[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.oss.necservice.ConsultElement[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.oss.necservice.ConsultElement[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceOut consultaInventarioServicoByResource(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceIn consultaInventarioServicoByResourceIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultaInventarioServicoByResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaInventarioServicoByResourceIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.ConsultaInventarioServicoByResourceOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPOut concluirMudancaNumeroSIP(com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPIn concluirMudancaNumeroSIPIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "concluirMudancaNumeroSIP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {concluirMudancaNumeroSIPIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP.ConcluirMudancaNumeroSIPOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCOut alterarServicoPFC(br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCIn alterarServicoPFCIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "alterarServicoPFC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {alterarServicoPFCIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.alterarServicoPFC.AlterarServicoPFCOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.CanonicalModel.ResourceFacingService[] getIMSRegistry(com.gvt.www.ws.eai.configuradoronline.getIMSRegistry.GetIMSRegistryIn getIMSRegistryIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "getIMSRegistry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getIMSRegistryIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.CanonicalModel.ResourceFacingService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.CanonicalModel.ResourceFacingService[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.CanonicalModel.ResourceFacingService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralOut getTipoCentral(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralIn getTipoCentralIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "getTipoCentral"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTipoCentralIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral.GetTipoCentralOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.metaData.configuradoronline.DadosExecucao[] consultaHistorico(com.gvt.www.ws.eai.configuradoronline.consultaHistorico.ConsultaHistoricoIn consultaHistoricoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultaHistorico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaHistoricoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.metaData.configuradoronline.DadosExecucao[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.metaData.configuradoronline.DadosExecucao[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.metaData.configuradoronline.DadosExecucao[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut alterarServicosDeTV(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn configurarElementoTVIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "alterarServicosDeTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarElementoTVIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.consultaCatalogServico.CatalogodeServicosProdCodeOut obterXGvtProdCodDoCatalogoServicosTV() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "obterXGvtProdCodDoCatalogoServicosTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.consultaCatalogServico.CatalogodeServicosProdCodeOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.consultaCatalogServico.CatalogodeServicosProdCodeOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.consultaCatalogServico.CatalogodeServicosProdCodeOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.coberturatv.ServicesRegionOut consultarServiceRegionByCEP(br.com.gvt.www.tv.coberturatv.ServiceRegionByCEPIn consultarServiceRegionByCEPIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarServiceRegionByCEP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarServiceRegionByCEPIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.coberturatv.ServicesRegionOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.coberturatv.ServicesRegionOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.coberturatv.ServicesRegionOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVOut consultarCoberturaTV(br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVIn consultarCoberturaTVIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarCoberturaTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarCoberturaTVIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enviaComandoAssincronoNECAtivacao(br.com.gvt.www.oss.necservice.ConfigurarLinhaIn configurarLinhaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "enviaComandoAssincronoNECAtivacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarLinhaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enviaComandoSavvion(com.gvt.www.ws.eai.configuradoronline.enviaComando.EnviaComandoIn enviaComandoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "enviaComandoSavvion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enviaComandoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaOut getChaveReserva(com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaIn getChaveReservaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "getChaveReserva"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getChaveReservaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.getChaveReserva.GetChaveReservaOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosOut persistirDadosServicos(com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosIn persistirDadosServicosIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "persistirDadosServicos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {persistirDadosServicosIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.dadosServico.PersistirDadosServicosOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoOut consultarComprasVoDComExecucao(br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoIn consultarComprasVoDComExecucaoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarComprasVoDComExecucao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarComprasVoDComExecucaoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHOut reconfigurarAssinanteDTH(br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHIn reconfigurarAssinanteDTHIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "reconfigurarAssinanteDTH"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reconfigurarAssinanteDTHIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ReconfigurarAssinanteDTHOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut adicionarServicosDeTV(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVIn configurarElementoTVIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "adicionarServicosDeTV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarElementoTVIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoOut atualizarInventarioServico(com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoIn atualizaInventarioServicoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizarInventarioServico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizaInventarioServicoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.AtualizaInventarioServicoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.diagnosticoHPNA.ExecutarDiagnosticoHPNAOut executarDiagnosticoHPNA(br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNAIn executaDiagnosticoHPNAIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "executarDiagnosticoHPNA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {executaDiagnosticoHPNAIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.diagnosticoHPNA.ExecutarDiagnosticoHPNAOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.diagnosticoHPNA.ExecutarDiagnosticoHPNAOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.diagnosticoHPNA.ExecutarDiagnosticoHPNAOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void excluiProtecaoBloqueio(com.gvt.www.ws.eai.configuradoronline.excluiProtecaoBloqueio.ExcluiProtecaoBloqueioIn excluiProtecaoBloqueioIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "excluiProtecaoBloqueio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {excluiProtecaoBloqueioIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void limpaAssinante(com.gvt.www.ws.eai.configuradoronline.limpaAssinante.LimpaAssinanteIn limpaAssinanteIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "limpaAssinante"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {limpaAssinanteIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaOut configurarServicosBandaLarga(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaIn configurarElementoBandaLargaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "configurarServicosBandaLarga"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarElementoBandaLargaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
