/**
 * ConfiguradorOnlineDeviceManagementServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineDeviceManagementServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagement {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[25];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarHistoricoCertificacaoTransponders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarHistoricoCertificacaoTranspondersIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoCertificacaoTranspondersIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoCertificacaoTranspondersIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoCertificacaoTranspondersOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoCertificacaoTranspondersOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarHistoricoCertificacaoTranspondersOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validacaoCertificacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "validacaoCertificacaoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidacaoCertificacaoIn"), br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidacaoCertificacaoOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "validacaoCertificacaoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizarFirmwareCPEs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "atualizarFirmwareCPEsIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtualizarFirmwareCPEsIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtualizarFirmwareCPEsOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "atualizarFirmwareCPEsOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarStatusAtualizacaoFirmware");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarStatusAtualizacaoFirmwareIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarStatusAtualizacaoFirmwareIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarStatusAtualizacaoFirmwareIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarStatusAtualizacaoFirmwareOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarStatusAtualizacaoFirmwareOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarStatusAtualizacaoFirmwareOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configuraWiFiDns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuraWiFiDns", "configuraWiFiDnsIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuraWiFiDns", "ConfiguraWiFiDnsIn"), br.com.gvt.www.tv.configuraWiFiDns.ConfiguraWiFiDnsIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuraWiFiDns", "ConfiguraWiFiDnsOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuraWiFiDns.ConfiguraWiFiDnsOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuraWiFiDns", "configuraWiFiDnsOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetDevices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "resetDeviceIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ResetDeviceIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ResetDeviceIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ResetDeviceOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ResetDeviceOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "resetDeviceOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ativarModalidadeHomeGateway");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ativarModalidadeHomeGatewayIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtivarModalidadeHomeGatewayIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtivarModalidadeHomeGatewayIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtivarModalidadeHomeGatewayOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtivarModalidadeHomeGatewayOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ativarModalidadeHomeGatewayOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarChaveCertificacaoDTH");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "validarChaveCertificacaoDTHIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidarChaveCertificacaoDTHIn"), br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidarChaveCertificacaoDTHOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "validarChaveCertificacaoDTHOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizarFirmwareCPEsURA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtualizarFirmwareCPEsURAIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtualizarFirmwareCPEsURAIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsURAIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarHistoricoDiagnosticoDVBS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarHistoricoDiagnosticoDVBSIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoDiagnosticoDVBSIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBSIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoDiagnosticoDVBSOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBSOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarHistoricoDiagnosticoDVBSOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarHistoricoDiagnosticoDVBT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarHistoricoDiagnosticoDVBTIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoDiagnosticoDVBTIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBTIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoDiagnosticoDVBTOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBTOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarHistoricoDiagnosticoDVBTOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizaWiFiPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiPassword", "atualizaWiFiPasswordIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiPassword", "AtualizaWiFiPasswordIn"), br.com.gvt.www.tv.atualizaWiFiPassword.AtualizaWiFiPasswordIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiPassword", "AtualizaWiFiPasswordOut"));
        oper.setReturnClass(br.com.gvt.www.tv.atualizaWiFiPassword.AtualizaWiFiPasswordOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiPassword", "atualizaWiFiPasswordOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executarResetSIPAgent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "resetSIPAgentIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "DiagnosticoSIPIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "ResetSIPAgentOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ResetSIPAgentOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "resetSIPAgentOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configurarLinhaSIPnoCPE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "configurarLinhaSIPnoCPEIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConfigurarLinhaSIPnoCPEIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConfigurarLinhaSIPnoCPEOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "configurarLinhaSIPnoCPEOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executarDiagnosticoDVBT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "executarDiagnosticoDVBIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ExecutarDiagnosticoDVBIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ExecutarDiagnosticoDVBOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "executarDiagnosticoDVBOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarCPEs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarCPEsIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarCPEsIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCPEsIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarCPEsOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCPEsOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarCPEsOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarParametrosDSL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosDSLIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosDSLIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosDSLIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosDSLOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosDSLOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosDSLOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizaWiFiSSID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiSSID", "atualizaWiFiSSIDIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiSSID", "AtualizaWiFiSSIDIn"), br.com.gvt.www.tv.atualizaWiFiSSID.AtualizaWiFiSSIDIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiSSID", "AtualizaWiFiSSIDOut"));
        oper.setReturnClass(br.com.gvt.www.tv.atualizaWiFiSSID.AtualizaWiFiSSIDOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiSSID", "atualizaWiFiSSIDOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarCertificacaoTransponders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarCertificacaoTranspondersIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarCertificacaoTranspondersIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCertificacaoTranspondersIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarCertificacaoTranspondersOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCertificacaoTranspondersOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarCertificacaoTranspondersOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executarDiagnosticoDVBS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "executarDiagnosticoDVBIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ExecutarDiagnosticoDVBIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ExecutarDiagnosticoDVBOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "executarDiagnosticoDVBOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gravarChavesCertificacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "gravarChavesCertificacaoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "GravarChavesCertificacaoIn"), br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "GravarChavesCertificacaoOut"));
        oper.setReturnClass(br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "gravarChavesCertificacaoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executarDiagnosticoSIP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "diagnosticoSIPIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "DiagnosticoSIPIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "DiagnosticoSIPOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "diagnosticoSIPOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarFirmwareCPEs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarFirmwareCPEsURAIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarFirmwareCPEsURAIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarFirmwareCPEsURAIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarFirmwareCPEsURAOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarFirmwareCPEsURAOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarFirmwareCPEsURAOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarParamentrosCPE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosCPEIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosCPEIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosCPEIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosCPEOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosCPEOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosCPEOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterInformacoesDispositivo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "obterInformacoesDispositivoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ObterInformacoesDispositivoIn"), com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ObterInformacoesDispositivoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ObterInformacoesDispositivoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ObterInformacoesDispositivoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "obterInformacoesDispositivoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

    }

    public ConfiguradorOnlineDeviceManagementServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ConfiguradorOnlineDeviceManagementServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ConfiguradorOnlineDeviceManagementServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiPassword", "AtualizaWiFiPasswordIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.atualizaWiFiPassword.AtualizaWiFiPasswordIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiPassword", "AtualizaWiFiPasswordOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.atualizaWiFiPassword.AtualizaWiFiPasswordOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiSSID", "AtualizaWiFiSSIDIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.atualizaWiFiSSID.AtualizaWiFiSSIDIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiSSID", "AtualizaWiFiSSIDOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.atualizaWiFiSSID.AtualizaWiFiSSIDOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">ConsultarCanaisAssinanteOut>cep");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

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

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarEquipamentoDeTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AlterarEquipamentoDeTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarServicosHomeGatewayOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AlterarServicosHomeGatewayOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarAssinanteDTHOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AtivarAssinanteDTHOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarElementosInventarioTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.AtivarElementosInventarioTVOut.class;
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

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CertificacaoSetTopBox");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.CertificacaoSetTopBox.class;
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

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoBandaLargaOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoBandaLargaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarArvoreEquipamentosOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarArvoreEquipamentosOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCanaisAssinanteOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarCanaisAssinanteOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCoberturaTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarCoberturaTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarComprasVoDComExecucaoOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDComExecucaoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarComprasVoDOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarComprasVoDOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosSAPOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosSAPOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarEquipamentosTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarExecucoesVoDOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarExecucoesVoDOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarPayPerViewOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarPayPerViewOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarServicosHomeGatewayOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarServicosHomeGatewayOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarTopExecucoesVoDOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultarTopExecucoesVoDOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultaServicosDeTvOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ConsultaServicosDeTvOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CorrigirServicosTVOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.CorrigirServicosTVOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "EventoPayPerView");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.EventoPayPerView.class;
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

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "GravarChavesCertificacaoIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "GravarChavesCertificacaoOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoOut.class;
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

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ReenviarEventoPayPerViewOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ReenviarEventoPayPerViewOut.class;
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

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidacaoCertificacaoIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoIn.class;
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

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidarChaveCertificacaoDTHIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidarChaveCertificacaoDTHOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuraWiFiDns", "ConfiguraWiFiDnsIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuraWiFiDns.ConfiguraWiFiDnsIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuraWiFiDns", "ConfiguraWiFiDnsOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.tv.configuraWiFiDns.ConfiguraWiFiDnsOut.class;
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

            qName = new javax.xml.namespace.QName("http://www.gvt.com/metaData/smarttool", "Credenciais");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.metaData.smarttool.Credenciais.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/contingent/types", "CustomerInfo");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.contingent.types.CustomerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/contingent/types", "ResponseStatus");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.contingent.types.ResponseStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtivarModalidadeHomeGatewayIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtivarModalidadeHomeGatewayIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtivarModalidadeHomeGatewayOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtivarModalidadeHomeGatewayOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtualizarFirmwareCPEsIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtualizarFirmwareCPEsOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtualizarFirmwareCPEsURAIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsURAIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "AtualizarFirmwareCPEsURAOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsURAOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConfigurarLinhaSIPnoCPEIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConfigurarLinhaSIPnoCPEOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarCertificacaoTranspondersIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCertificacaoTranspondersIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarCertificacaoTranspondersOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCertificacaoTranspondersOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarCPEsIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCPEsIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarCPEsOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCPEsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarFirmwareCPEsURAIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarFirmwareCPEsURAIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarFirmwareCPEsURAOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarFirmwareCPEsURAOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoCertificacaoTranspondersIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoCertificacaoTranspondersIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoCertificacaoTranspondersOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoCertificacaoTranspondersOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoDiagnosticoDVBSIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBSIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoDiagnosticoDVBSOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBSOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoDiagnosticoDVBTIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBTIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoDiagnosticoDVBTOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBTOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosCPEIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosCPEIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosCPEOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosCPEOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosDSLIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosDSLIn.class;
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
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosDSLOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosDSLOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarStatusAtualizacaoFirmwareIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarStatusAtualizacaoFirmwareIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarStatusAtualizacaoFirmwareOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarStatusAtualizacaoFirmwareOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ExecutarDiagnosticoDVBIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ExecutarDiagnosticoDVBOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ObterInformacoesDispositivoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ObterInformacoesDispositivoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ObterInformacoesDispositivoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ObterInformacoesDispositivoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ResetDeviceIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ResetDeviceIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ResetDeviceOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ResetDeviceOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "DiagnosticoSIP");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "DiagnosticoSIPIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "DiagnosticoSIPOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "DiagnosticosSIP");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIP[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "DiagnosticoSIP");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "diagnosticoSIP");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "ElementoDiagnosticoSIP");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ElementoDiagnosticoSIP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "ElementoResetSIPAgent");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ElementoResetSIPAgent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "ResetSIPAgentOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ResetSIPAgentOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "ResetSIPAgentResult");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ResetSIPAgentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "ResetSIPAgentResults");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ResetSIPAgentResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "ResetSIPAgentResult");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "ResetSIPAgentResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", ">ElementoDiagnostico>tecnologia");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnosticoTecnologia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "CertificacaoTransponders");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTransponders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "CertificacaoTranspondersHist");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTranspondersHist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "Diagnostico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.DiagnosticoParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "DiagnosticoParam");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "params");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "DiagnosticoDVBSHist");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.DiagnosticoDVBSHist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "DiagnosticoDVBTHist");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.DiagnosticoDVBTHist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "DiagnosticoParam");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.DiagnosticoParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "ElementoDiagnostico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnostico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "PortaFXS");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.PortaFXS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "SessionBorderControl");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.SessionBorderControl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "SmartCard");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.SmartCard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "StatusAtualizacaoFirmware");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.StatusAtualizacaoFirmware.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/modeloEquipamento", "ModeloEquipamento");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoCertificacaoTranspondersOut consultarHistoricoCertificacaoTransponders(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoCertificacaoTranspondersIn consultarHistoricoCertificacaoTranspondersIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarHistoricoCertificacaoTransponders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarHistoricoCertificacaoTranspondersIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoCertificacaoTranspondersOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoCertificacaoTranspondersOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoCertificacaoTranspondersOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoOut validacaoCertificacao(br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoIn validacaoCertificacaoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "validacaoCertificacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {validacaoCertificacaoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsOut atualizarFirmwareCPEs(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsIn atualizarFirmwareCPEsIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizarFirmwareCPEs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizarFirmwareCPEsIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarStatusAtualizacaoFirmwareOut consultarStatusAtualizacaoFirmware(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarStatusAtualizacaoFirmwareIn consultarStatusAtualizacaoFirmwareIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarStatusAtualizacaoFirmware"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarStatusAtualizacaoFirmwareIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarStatusAtualizacaoFirmwareOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarStatusAtualizacaoFirmwareOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarStatusAtualizacaoFirmwareOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuraWiFiDns.ConfiguraWiFiDnsOut configuraWiFiDns(br.com.gvt.www.tv.configuraWiFiDns.ConfiguraWiFiDnsIn configuraWiFiDnsIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "configuraWiFiDns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configuraWiFiDnsIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuraWiFiDns.ConfiguraWiFiDnsOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuraWiFiDns.ConfiguraWiFiDnsOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuraWiFiDns.ConfiguraWiFiDnsOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ResetDeviceOut resetDevices(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ResetDeviceIn resetDeviceIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "resetDevices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetDeviceIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ResetDeviceOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ResetDeviceOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ResetDeviceOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtivarModalidadeHomeGatewayOut ativarModalidadeHomeGateway(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtivarModalidadeHomeGatewayIn ativarModalidadeHomeGatewayIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ativarModalidadeHomeGateway"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ativarModalidadeHomeGatewayIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtivarModalidadeHomeGatewayOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtivarModalidadeHomeGatewayOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtivarModalidadeHomeGatewayOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHOut validarChaveCertificacaoDTH(br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHIn validarChaveCertificacaoDTHIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "validarChaveCertificacaoDTH"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {validarChaveCertificacaoDTHIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.ValidarChaveCertificacaoDTHOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void atualizarFirmwareCPEsURA(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.AtualizarFirmwareCPEsURAIn atualizarFirmwareCPEsURAIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizarFirmwareCPEsURA"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {atualizarFirmwareCPEsURAIn});

    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBSOut consultarHistoricoDiagnosticoDVBS(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBSIn consultarHistoricoDiagnosticoDVBSIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarHistoricoDiagnosticoDVBS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarHistoricoDiagnosticoDVBSIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBSOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBSOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBSOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBTOut consultarHistoricoDiagnosticoDVBT(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBTIn consultarHistoricoDiagnosticoDVBTIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarHistoricoDiagnosticoDVBT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarHistoricoDiagnosticoDVBTIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBTOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBTOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarHistoricoDiagnosticoDVBTOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.atualizaWiFiPassword.AtualizaWiFiPasswordOut atualizaWiFiPassword(br.com.gvt.www.tv.atualizaWiFiPassword.AtualizaWiFiPasswordIn atualizaWiFiPasswordIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizaWiFiPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizaWiFiPasswordIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.atualizaWiFiPassword.AtualizaWiFiPasswordOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.atualizaWiFiPassword.AtualizaWiFiPasswordOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.atualizaWiFiPassword.AtualizaWiFiPasswordOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ResetSIPAgentOut executarResetSIPAgent(com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn resetSIPAgentIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "executarResetSIPAgent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetSIPAgentIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ResetSIPAgentOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ResetSIPAgentOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ResetSIPAgentOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEOut configurarLinhaSIPnoCPE(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEIn configurarLinhaSIPnoCPEIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "configurarLinhaSIPnoCPE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarLinhaSIPnoCPEIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut executarDiagnosticoDVBT(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBIn executarDiagnosticoDVBIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "executarDiagnosticoDVBT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {executarDiagnosticoDVBIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCPEsOut consultarCPEs(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCPEsIn consultarCPEsIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarCPEs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarCPEsIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCPEsOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCPEsOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCPEsOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosDSLOut consultarParametrosDSL(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosDSLIn consultarParametrosDSLIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarParametrosDSL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarParametrosDSLIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosDSLOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosDSLOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosDSLOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.atualizaWiFiSSID.AtualizaWiFiSSIDOut atualizaWiFiSSID(br.com.gvt.www.tv.atualizaWiFiSSID.AtualizaWiFiSSIDIn atualizaWiFiSSIDIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "atualizaWiFiSSID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {atualizaWiFiSSIDIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.atualizaWiFiSSID.AtualizaWiFiSSIDOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.atualizaWiFiSSID.AtualizaWiFiSSIDOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.atualizaWiFiSSID.AtualizaWiFiSSIDOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCertificacaoTranspondersOut consultarCertificacaoTransponders(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCertificacaoTranspondersIn consultarCertificacaoTranspondersIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarCertificacaoTransponders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarCertificacaoTranspondersIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCertificacaoTranspondersOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCertificacaoTranspondersOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarCertificacaoTranspondersOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut executarDiagnosticoDVBS(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBIn executarDiagnosticoDVBIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "executarDiagnosticoDVBS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {executarDiagnosticoDVBIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ExecutarDiagnosticoDVBOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoOut gravarChavesCertificacao(br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoIn gravarChavesCertificacaoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "gravarChavesCertificacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gravarChavesCertificacaoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.tv.configuracaoTV.GravarChavesCertificacaoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut executarDiagnosticoSIP(com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn diagnosticoSIPIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "executarDiagnosticoSIP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {diagnosticoSIPIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarFirmwareCPEsURAOut consultarFirmwareCPEs(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarFirmwareCPEsURAIn consultarFirmwareCPEsURAIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarFirmwareCPEs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarFirmwareCPEsURAIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarFirmwareCPEsURAOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarFirmwareCPEsURAOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarFirmwareCPEsURAOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosCPEOut consultarParamentrosCPE(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosCPEIn consultarParametrosCPEIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "consultarParamentrosCPE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarParametrosCPEIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosCPEOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosCPEOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConsultarParametrosCPEOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ObterInformacoesDispositivoOut obterInformacoesDispositivo(com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ObterInformacoesDispositivoIn obterInformacoesDispositivoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "obterInformacoesDispositivo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {obterInformacoesDispositivoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ObterInformacoesDispositivoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ObterInformacoesDispositivoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ObterInformacoesDispositivoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
