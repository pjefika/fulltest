/**
 * OSSTurbonetServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.ossturbonet;

public class OSSTurbonetServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonet {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[63];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verificaSeClienteAutenticadoNoRelay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "OSSTurbonetClienteAutenticadoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "OSSTurbonetClienteAutenticadoIn"), com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "OSSTurbonetClienteAutenticadoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "OSSTurbonetClienteAutenticadoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configurarPVC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "configurarPVCIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConfigurarPVCIn"), com.gvt.www.ws.eai.oss.setpvc.ConfigurarPVCIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConfigurarPVCOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.setpvc.ConfigurarPVCOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "configurarPVCOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDesignatorByAccessDesignator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "accessDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("certifyTurbonetProcess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "originalSystem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "baNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "baType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "baDispatched"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "allowedToFix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoCertify"));
        oper.setReturnClass(bean.ossturbonet.oss.gvt.com.InfoCertify.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isModemSincronizado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModem", "OSSTurbonetModemIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModem", "OSSTurbonetModemIn"), com.gvt.www.ws.eai.oss.OSSTurbonetModem.OSSTurbonetModemIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModem", "OSSTurbonetModemOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetModem.OSSTurbonetModemOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModem", "OSSTurbonetModemOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("operarCGNAT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "operarCGNATIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "OperarCGNATIn"), com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperarCGNATIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "OperarCGNATOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperarCGNATOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "operarCGNATOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reconfigureModem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetReconfigureModem", "OSSTurbonetReconfigureModemIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetReconfigureModem", "OSSTurbonetReconfigureModemIn"), com.gvt.www.ws.eai.oss.OSSTurbonetReconfigureModem.OSSTurbonetReconfigureModemIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetReconfigureModem", "OSSTurbonetReconfigureModemOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetReconfigureModem.OSSTurbonetReconfigureModemOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetReconfigureModem", "OSSTurbonetReconfigureModemOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterValoresSnrAtenuacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "OSSTurbonetSNRAtenuacaoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "OSSTurbonetSNRAtenuacaoIn"), com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao.OSSTurbonetSNRAtenuacaoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "OSSTurbonetSNRAtenuacaoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao.OSSTurbonetSNRAtenuacaoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "OSSTurbonetSNRAtenuacaoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateRadius");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetUpdateRadius", "OSSTurbonetUpdateRadiusIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetUpdateRadius", "OSSTurbonetUpdateRadiusIn"), com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius.OSSTurbonetUpdateRadiusIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetUpdateRadius", "OSSTurbonetUpdateRadiusOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius.OSSTurbonetUpdateRadiusOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetUpdateRadius", "OSSTurbonetUpdateRadiusOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultInfoGpon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "consultInfoGponIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ConsultInfoGponIn"), com.gvt.www.ws.eai.oss.gpon.ConsultInfoGponIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ConsultInfoGponOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.gpon.ConsultInfoGponOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "consultInfoGponOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoAuthentication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoAuthentication"));
        oper.setReturnClass(bean.ossturbonet.oss.gvt.com.InfoAuthentication.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDefaultVelocity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "downStreamCRM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "dslamVendor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "dslamModel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ArrayOfADSLRate_literal"));
        oper.setReturnClass(bean.ossturbonet.oss.gvt.com.ADSLRate[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ADSLRate"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeProfileWithProtocol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeProfile", "OSSTurbonetChangeProfileIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeProfile", "OSSTurbonetChangeProfileIn"), com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile.OSSTurbonetChangeProfileIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeProfile", "OSSTurbonetChangeProfileOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile.OSSTurbonetChangeProfileOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeProfile", "OSSTurbonetChangeProfileOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarStatusCanaisPVC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/canaispvc", "consultarStatusCanaisPVCIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/canaispvc", "ConsultarStatusCanaisPVCIn"), com.gvt.www.ws.eai.oss.canaispvc.ConsultarStatusCanaisPVCIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/canaispvc", "ConsultarStatusCanaisPVCOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.canaispvc.ConsultarStatusCanaisPVCOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/canaispvc", "consultarStatusCanaisPVCOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("associaSerialOLT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "accessDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "serialOLT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarBridge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "consultarBridgeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConsultarBridgeIn"), com.gvt.www.ws.eai.oss.setpvc.ConsultarBridgeIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConsultarBridgeOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.setpvc.ConsultarBridgeOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "consultarBridgeOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verificaModulacaoVelocidade");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVerificaModulacaoVelocidade", "OSSTurbonetVerificaModulacaoVelocidadeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVerificaModulacaoVelocidade", "OSSTurbonetVerificaModulacaoVelocidadeIn"), com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade.OSSTurbonetVerificaModulacaoVelocidadeIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVerificaModulacaoVelocidade", "OSSTurbonetVerificaModulacaoVelocidadeOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade.OSSTurbonetVerificaModulacaoVelocidadeOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVerificaModulacaoVelocidade", "OSSTurbonetVerificaModulacaoVelocidadeOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAdslUseReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "OSSTurbonetAdslUseReportIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "OSSTurbonetAdslUseReportIn"), com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "OSSTurbonetAdslUseReportOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "OSSTurbonetAdslUseReportOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manobrarDslamGpon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "manobraDslamGponIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ManobraDslamGponIn"), com.gvt.www.ws.eai.oss.gpon.ManobraDslamGponIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ManobraDslamGponOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.gpon.ManobraDslamGponOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "manobraDslamGponOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isClienteAutenticado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "OSSTurbonetClienteAutenticadoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "OSSTurbonetClienteAutenticadoIn"), com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "OSSTurbonetClienteAutenticadoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "OSSTurbonetClienteAutenticadoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "accessDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "newDownRate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "newUpRate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "oldDownUpRate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "pon"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "rpon"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetWithProtocol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeCfg", "OSSTurbonetChangeCfgIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeCfg", "OSSTurbonetChangeCfgIn"), com.gvt.www.ws.eai.oss.OSSTurbonetChangeCfg.OSSTurbonetChangeCfgIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeCfg", "OSSTurbonetChangeCfgOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetChangeCfg.OSSTurbonetChangeCfgOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeCfg", "OSSTurbonetChangeCfgOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verificarInconsistenciaTBSRadius");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "OSSTurbonetInconsistenciaTBSRadiusIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "OSSTurbonetInconsistenciaTBSRadiusIn"), com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "OSSTurbonetInconsistenciaTBSRadiusOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "OSSTurbonetInconsistenciaTBSRadiusOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizarIpProfissional");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAtualizarIpProfissional", "OSSTurbonetAtualizarIpProfissionalIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAtualizarIpProfissional", "OSSTurbonetAtualizarIpProfissionalIn"), com.gvt.www.ws.eai.oss.OSSTurbonetAtualizarIpProfissional.OSSTurbonetAtualizarIpProfissionalIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAtualizarIpProfissional", "OSSTurbonetAtualizarIpProfissionalOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetAtualizarIpProfissional.OSSTurbonetAtualizarIpProfissionalOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAtualizarIpProfissional", "OSSTurbonetAtualizarIpProfissionalOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLogCertify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "ossTurbonetGetLogCertifyIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "OSSTurbonetGetLogCertifyIn"), com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify.OSSTurbonetGetLogCertifyIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "OSSTurbonetGetLogCertifyOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify.OSSTurbonetGetLogCertifyOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "ossTurbonetGetLogCertifyOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("certifyTurbonet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "originalSystem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "baNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "baType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "baDispatched"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "allowedToFix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoCertify"));
        oper.setReturnClass(bean.ossturbonet.oss.gvt.com.InfoCertify.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "newModulation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "oldModulation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccessDesignator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLogTesteVelocidade");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogTesteVelocidade", "ossTurbonetGetLogTesteVelocidadeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogTesteVelocidade", "OSSTurbonetGetLogTesteVelocidadeIn"), com.gvt.www.ws.eai.oss.OSSTurbonetGetLogTesteVelocidade.OSSTurbonetGetLogTesteVelocidadeIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogTesteVelocidade", "OSSTurbonetGetLogTesteVelocidadeOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetGetLogTesteVelocidade.OSSTurbonetGetLogTesteVelocidadeOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogTesteVelocidade", "ossTurbonetGetLogTesteVelocidadeOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSeriaisOLT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "accessDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ArrayOfJavaLangstring_literal"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "JavaLangstring"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDesignators");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ArrayOfDesignators_literal"));
        oper.setReturnClass(bean.ossturbonet.oss.gvt.com.Designators[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "Designators"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSNRAttenLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "upStreamSinc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "downStreamSinc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "upStreamProfile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "downStreamProfile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "upStreamSNR"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "downStreamSNR"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "upStreamSNRRange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "downStreamSNRRange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "attenuationMin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "attenuationMax"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designador"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instancia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "upstreamSincRange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "downstreamSincRange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "tipoSS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "descricaoSS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "detalheSS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "solucaoSS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("desassociaSerialOLT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "accessDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("equipmentSimulationGpon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "equipmentSimulateGponIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "EquipmentSimulateGponIn"), com.gvt.www.ws.eai.oss.gpon.EquipmentSimulateGponIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "EquipmentSimulateGponOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.gpon.EquipmentSimulateGponOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "equipmentSimulateGponOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccessInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "accessDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instancia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "activityInd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "AccessInfo"));
        oper.setReturnClass(bean.ossturbonet.oss.gvt.com.AccessInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastLogTesteVelocidade");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "ossTurbonetLastLogTesteVelocidadeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "OSSTurbonetLastLogTesteVelocidadeIn"), com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade.OSSTurbonetLastLogTesteVelocidadeIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "OSSTurbonetLastLogTesteVelocidadeOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade.OSSTurbonetLastLogTesteVelocidadeOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "ossTurbonetLastLogTesteVelocidadeOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configurarBridge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "configurarBridgeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConfigurarBridgeIn"), com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConfigurarBridgeOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "configurarBridgeOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterPerfilRadius");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetPerfilRadius", "OSSTurbonetPerfilRadiusIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetPerfilRadius", "OSSTurbonetPerfilRadiusIn"), com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius.OSSTurbonetPerfilRadiusIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetPerfilRadius", "OSSTurbonetPerfilRadiusOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius.OSSTurbonetPerfilRadiusOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetPerfilRadius", "OSSTurbonetPerfilRadiusOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRadiusInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "RadiusInfo"));
        oper.setReturnClass(bean.ossturbonet.oss.gvt.com.RadiusInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeRateForRadius");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "oldDownUpRate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeLockAndUnlock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "newstatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "oldstatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("diagnosticoBandaLarga");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "OSSTurbonetDiagnosticoBandaLargaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "OSSTurbonetDiagnosticoBandaLargaIn"), com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.OSSTurbonetDiagnosticoBandaLargaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "OSSTurbonetDiagnosticoBandaLargaOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.OSSTurbonetDiagnosticoBandaLargaOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "OSSTurbonetDiagnosticoBandaLargaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthenticationByIPorMac");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ipOrmac"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "OSSTurbonetStatusConexaoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetStatusConexaoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:javax.xml.rpc", "ServiceException"),
                      "rpc.xml.javax.ServiceException",
                      new javax.xml.namespace.QName("java:javax.xml.rpc", "ServiceException"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "accessDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "downstreamCrm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "upstreamCrm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "GetInfoOut"));
        oper.setReturnClass(bean.ossturbonet.oss.gvt.com.GetInfoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStatusConexao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ossTurbonetStatusConexaoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "OSSTurbonetStatusConexaoIn"), com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "OSSTurbonetStatusConexaoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetStatusConexaoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccountingRelayInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAccountingRelay", "OSSTurbonetAccountingRelayIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAccountingRelay", "OSSTurbonetAccountingRelayIn"), com.gvt.www.ws.eai.oss.OSSTurbonetAccountingRelay.OSSTurbonetAccountingRelayIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAccountingRelay", "OSSTurbonetAccountingRelayOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetAccountingRelay.OSSTurbonetAccountingRelayOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAccountingRelay", "OSSTurbonetAccountingRelayOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("diagnosticoAcessoGPON");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "diagnosticoAcessoGPONIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "DiagnosticoAcessoGPONIn"), com.gvt.www.ws.eai.oss.gpon.DiagnosticoAcessoGPONIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "DiagnosticoAcessoGPONOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.gpon.DiagnosticoAcessoGPONOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "diagnosticoAcessoGPONOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSyncRateByFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "downStreamCRM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ArrayOfADSLRate_literal"));
        oper.setReturnClass(bean.ossturbonet.oss.gvt.com.ADSLRate[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ADSLRate"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logCertify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogCertify", "ossTurbonetLogCertifyIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogCertify", "OSSTurbonetLogCertifyIn"), com.gvt.www.ws.eai.oss.OSSTurbonetLogCertify.OSSTurbonetLogCertifyIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateRateGpon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "updateRateGponIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "UpdateRateGponIn"), com.gvt.www.ws.eai.oss.gpon.UpdateRateGponIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "UpdateRateGponOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.gpon.UpdateRateGponOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "updateRateGponOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("diagnosticoVozGPON");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "diagnosticoVozGPONIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "DiagnosticoVozGPONIn"), com.gvt.www.ws.eai.oss.gpon.DiagnosticoVozGPONIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "DiagnosticoVozGPONOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.gpon.DiagnosticoVozGPONOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "diagnosticoVozGPONOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterMotivosDesconexao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "OSSTurbonetMotivosDesconexaoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "OSSTurbonetMotivosDesconexaoIn"), com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "OSSTurbonetMotivosDesconexaoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "OSSTurbonetMotivosDesconexaoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoShortCircuit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "ossTurbonetShortCircuitIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "OSSTurbonetShortCircuitIn"), com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "OSSTurbonetShortCircuitOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "ossTurbonetShortCircuitOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logTesteVelocidade");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "ossTurbonetLogTesteVelocidadeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "OSSTurbonetLogTesteVelocidadeIn"), com.gvt.www.ws.eai.oss.OSSTurbonetLogTesteVelocidade.OSSTurbonetLogTesteVelocidadeIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isModulacaoCorretaPlano");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModulacaoPlano", "OSSTurbonetModulacaoPlanoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModulacaoPlano", "OSSTurbonetModulacaoPlanoIn"), com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano.OSSTurbonetModulacaoPlanoIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModulacaoPlano", "OSSTurbonetModulacaoPlanoOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano.OSSTurbonetModulacaoPlanoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModulacaoPlano", "OSSTurbonetModulacaoPlanoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterVelocidadeSincronizada");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "OSSTurbonetVelocidadeSincronizadaIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "OSSTurbonetVelocidadeSincronizadaIn"), com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada.OSSTurbonetVelocidadeSincronizadaIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "OSSTurbonetVelocidadeSincronizadaOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada.OSSTurbonetVelocidadeSincronizadaOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "OSSTurbonetVelocidadeSincronizadaOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWiseToolActionReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "numberOfDays"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ArrayOfSmartToolLog_literal"));
        oper.setReturnClass(bean.ossturbonet.oss.gvt.com.SmartToolLog[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "SmartToolLog"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterVelocidadeDeProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeProfile", "OSSTurbonetVelocidadeProfileIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeProfile", "OSSTurbonetVelocidadeProfileIn"), com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile.OSSTurbonetVelocidadeProfileIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeProfile", "OSSTurbonetVelocidadeProfileOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile.OSSTurbonetVelocidadeProfileOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeProfile", "OSSTurbonetVelocidadeProfileOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeRateWithProtocol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeRate", "OSSTurbonetChangeRateIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeRate", "OSSTurbonetChangeRateIn"), com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate.OSSTurbonetChangeRateIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeRate", "OSSTurbonetChangeRateOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate.OSSTurbonetChangeRateOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeRate", "OSSTurbonetChangeRateOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetOnt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ResetOntGPON", "resetOntGPONIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ResetOntGPON", "ResetOntGPONIn"), com.gvt.www.ws.eai.oss.ResetOntGPON.ResetOntGPONIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ResetOntGPON", "ResetOntGPONOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.ResetOntGPON.ResetOntGPONOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ResetOntGPON", "resetOntGPONOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isInBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetBlackList", "OSSTurbonetBlackListIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetBlackList", "OSSTurbonetBlackListIn"), com.gvt.www.ws.eai.oss.OSSTurbonetBlackList.OSSTurbonetBlackListIn.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetBlackList", "OSSTurbonetBlackListOut"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.OSSTurbonetBlackList.OSSTurbonetBlackListOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetBlackList", "OSSTurbonetBlackListOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeDNSReverso");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "strNewDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "strOldDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"),
                      "exception.ossturbonet.oss.gvt.com.DataNotFoundException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"),
                      "exception.ossturbonet.oss.gvt.com.OSSTurbonetException",
                      new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException"), 
                      true
                     ));
        _operations[62] = oper;

    }

    public OSSTurbonetServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public OSSTurbonetServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public OSSTurbonetServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/canaispvc", "ConsultarStatusCanaisPVCIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.canaispvc.ConsultarStatusCanaisPVCIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/canaispvc", "ConsultarStatusCanaisPVCOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.canaispvc.ConsultarStatusCanaisPVCOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "DadosCGNAT");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.CGNAT.DadosCGNAT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "EnumCGNATCodigo");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.CGNAT.EnumCGNATCodigo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "EnumCGNATDescricao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.CGNAT.EnumCGNATDescricao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "StatusCGNAT");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.CGNAT.StatusCGNAT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeDados");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.BridgeDados.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeDadosParametros");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.BridgeDadosParametros.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeMulticast");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.BridgeMulticast.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeMulticastParametros");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.BridgeMulticastParametros.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeTV");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.BridgeTV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeTVParametros");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.BridgeTVParametros.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeVoz");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.BridgeVoz.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeVozParametros");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.BridgeVozParametros.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ConsultInfoGponIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.ConsultInfoGponIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ConsultInfoGponOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.ConsultInfoGponOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "DiagnosticoAcessoGPONIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.DiagnosticoAcessoGPONIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "DiagnosticoAcessoGPONOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.DiagnosticoAcessoGPONOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "DiagnosticoVozGPONIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.DiagnosticoVozGPONIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "DiagnosticoVozGPONOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.DiagnosticoVozGPONOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "EnumCertificacao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.EnumCertificacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "EquipmentSimulateGponIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.EquipmentSimulateGponIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "EquipmentSimulateGponOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.EquipmentSimulateGponOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "InfoEquipamentoGpon");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.InfoEquipamentoGpon.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ManobraDe");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.ManobraDe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ManobraDslamGponIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.ManobraDslamGponIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ManobraDslamGponOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.ManobraDslamGponOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ManobraPara");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.ManobraPara.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "PotenciaOptica");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.PotenciaOptica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "RetornoAlterarVelocidade");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.RetornoAlterarVelocidade.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "RetornoAssociarSerial");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.RetornoAssociarSerial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "RetornoCriarBridge");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.RetornoCriarBridge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "RetornoDesassociarSerial");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.RetornoDesassociarSerial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "SerialONT");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.SerialONT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "StatusACS");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.StatusACS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "StatusIMS");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.StatusIMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "StatusPorta");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.StatusPorta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "StatusSincronismo");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.StatusSincronismo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "UpdateRateGponIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.UpdateRateGponIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "UpdateRateGponOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.UpdateRateGponOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "VelocidadeDownloadUpload");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.gpon.VelocidadeDownloadUpload.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/metadata", "NomeValor");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.metadata.NomeValor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet/certify", "OSSTurbonetLogCertifyItemOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.ossturbonet.certify.OSSTurbonetLogCertifyItemOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet/testevelocidade", "OSSTurbonetLogTesteVelocidadeItemOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.ossturbonet.testevelocidade.OSSTurbonetLogTesteVelocidadeItemOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAccountingRelay", "OSSTurbonetAccountingRelayIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetAccountingRelay.OSSTurbonetAccountingRelayIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAccountingRelay", "OSSTurbonetAccountingRelayOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetAccountingRelay.OSSTurbonetAccountingRelayOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", ">OSSTurbonetAdslUseReportOut>evento");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOutEvento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "OSSTurbonetAdslUseReportIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "OSSTurbonetAdslUseReportOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAtualizarIpProfissional", "OSSTurbonetAtualizarIpProfissionalIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetAtualizarIpProfissional.OSSTurbonetAtualizarIpProfissionalIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAtualizarIpProfissional", "OSSTurbonetAtualizarIpProfissionalOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetAtualizarIpProfissional.OSSTurbonetAtualizarIpProfissionalOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetBlackList", "OSSTurbonetBlackListIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetBlackList.OSSTurbonetBlackListIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetBlackList", "OSSTurbonetBlackListOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetBlackList.OSSTurbonetBlackListOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeCfg", "OSSTurbonetChangeCfgIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetChangeCfg.OSSTurbonetChangeCfgIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeCfg", "OSSTurbonetChangeCfgOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetChangeCfg.OSSTurbonetChangeCfgOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeProfile", "OSSTurbonetChangeProfileIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile.OSSTurbonetChangeProfileIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeProfile", "OSSTurbonetChangeProfileOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile.OSSTurbonetChangeProfileOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeRate", "OSSTurbonetChangeRateIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate.OSSTurbonetChangeRateIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeRate", "OSSTurbonetChangeRateOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate.OSSTurbonetChangeRateOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "OSSTurbonetClienteAutenticadoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "OSSTurbonetClienteAutenticadoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "EnumCertificacao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "OSSTurbonetDiagnosticoBandaLargaIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.OSSTurbonetDiagnosticoBandaLargaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "OSSTurbonetDiagnosticoBandaLargaOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.OSSTurbonetDiagnosticoBandaLargaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnostico");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnosticoDeVelocidade");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoDeVelocidade.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnosticoRadius");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoRadius.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "OSSTurbonetGetLogCertifyIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify.OSSTurbonetGetLogCertifyIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "OSSTurbonetGetLogCertifyOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify.OSSTurbonetGetLogCertifyOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogTesteVelocidade", "OSSTurbonetGetLogTesteVelocidadeIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetGetLogTesteVelocidade.OSSTurbonetGetLogTesteVelocidadeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogTesteVelocidade", "OSSTurbonetGetLogTesteVelocidadeOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetGetLogTesteVelocidade.OSSTurbonetGetLogTesteVelocidadeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "OSSTurbonetInconsistenciaTBSRadiusIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "OSSTurbonetInconsistenciaTBSRadiusOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "OSSTurbonetLastLogTesteVelocidadeIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade.OSSTurbonetLastLogTesteVelocidadeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "OSSTurbonetLastLogTesteVelocidadeOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade.OSSTurbonetLastLogTesteVelocidadeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogCertify", "OSSTurbonetLogCertifyIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetLogCertify.OSSTurbonetLogCertifyIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "OSSTurbonetLogTesteVelocidadeIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetLogTesteVelocidade.OSSTurbonetLogTesteVelocidadeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModem", "OSSTurbonetModemIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetModem.OSSTurbonetModemIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModem", "OSSTurbonetModemOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetModem.OSSTurbonetModemOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModulacaoPlano", "OSSTurbonetModulacaoPlanoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano.OSSTurbonetModulacaoPlanoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModulacaoPlano", "OSSTurbonetModulacaoPlanoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano.OSSTurbonetModulacaoPlanoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", ">OSSTurbonetMotivosDesconexaoOut>motivosDesconexao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "filtroMotivoDesconexao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.FiltroMotivoDesconexao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "OSSTurbonetMotivosDesconexaoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "OSSTurbonetMotivosDesconexaoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "OperacaoCGNAT");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperacaoCGNAT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "OperarCGNATIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperarCGNATIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "OperarCGNATOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperarCGNATOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetPerfilRadius", "OSSTurbonetPerfilRadiusIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius.OSSTurbonetPerfilRadiusIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetPerfilRadius", "OSSTurbonetPerfilRadiusOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius.OSSTurbonetPerfilRadiusOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetReconfigureModem", "OSSTurbonetReconfigureModemIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetReconfigureModem.OSSTurbonetReconfigureModemIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetReconfigureModem", "OSSTurbonetReconfigureModemOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetReconfigureModem.OSSTurbonetReconfigureModemOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "OSSTurbonetShortCircuitIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "OSSTurbonetShortCircuitOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "OSSTurbonetSNRAtenuacaoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao.OSSTurbonetSNRAtenuacaoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "OSSTurbonetSNRAtenuacaoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao.OSSTurbonetSNRAtenuacaoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "CGNAT");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.CGNAT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "OSSTurbonetStatusConexaoIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "OSSTurbonetStatusConexaoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetUpdateRadius", "OSSTurbonetUpdateRadiusIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius.OSSTurbonetUpdateRadiusIn.class;
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
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetUpdateRadius", "OSSTurbonetUpdateRadiusOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius.OSSTurbonetUpdateRadiusOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeProfile", "OSSTurbonetVelocidadeProfileIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile.OSSTurbonetVelocidadeProfileIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeProfile", "OSSTurbonetVelocidadeProfileOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile.OSSTurbonetVelocidadeProfileOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "OSSTurbonetVelocidadeSincronizadaIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada.OSSTurbonetVelocidadeSincronizadaIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "OSSTurbonetVelocidadeSincronizadaOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada.OSSTurbonetVelocidadeSincronizadaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVerificaModulacaoVelocidade", "OSSTurbonetVerificaModulacaoVelocidadeIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade.OSSTurbonetVerificaModulacaoVelocidadeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVerificaModulacaoVelocidade", "OSSTurbonetVerificaModulacaoVelocidadeOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade.OSSTurbonetVerificaModulacaoVelocidadeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ArrayOfADSLRate_literal");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.ADSLRate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "ADSLRate");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ADSLRate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ArrayOfDesignators_literal");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.Designators[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Designators");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "Designators");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ArrayOfJavaLangstring_literal");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "JavaLangstring");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ArrayOfSmartToolLog_literal");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.SmartToolLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "SmartToolLog");
            qName2 = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "SmartToolLog");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ResetOntGPON", "EnumAcao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.ResetOntGPON.EnumAcao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ResetOntGPON", "ResetOntGPONIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.ResetOntGPON.ResetOntGPONIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ResetOntGPON", "ResetOntGPONOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.ResetOntGPON.ResetOntGPONOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", ">ConfigurarBridgeIn>acao");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeInAcao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", ">ConfigurarBridgeIn>tipoBridge");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeInTipoBridge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConfigurarBridgeIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConfigurarBridgeOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConfigurarPVCIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.setpvc.ConfigurarPVCIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConfigurarPVCOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.setpvc.ConfigurarPVCOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConsultarBridgeIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.setpvc.ConsultarBridgeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConsultarBridgeOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.setpvc.ConsultarBridgeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "AccessInfo");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.AccessInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "ADSLRate");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.ADSLRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Designators");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.Designators.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "GetInfoOut");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.GetInfoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoAuthentication");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.InfoAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoCertify");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.InfoCertify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoCricket");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.InfoCricket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoEquipment");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.InfoEquipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoRadius");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.InfoRadius.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoTBS");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.InfoTBS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "RadiusInfo");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.RadiusInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "SmartToolLog");
            cachedSerQNames.add(qName);
            cls = bean.ossturbonet.oss.gvt.com.SmartToolLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "DataNotFoundException");
            cachedSerQNames.add(qName);
            cls = exception.ossturbonet.oss.gvt.com.DataNotFoundException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.exception", "OSSTurbonetException");
            cachedSerQNames.add(qName);
            cls = exception.ossturbonet.oss.gvt.com.OSSTurbonetException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:javax.xml.rpc", "ServiceException");
            cachedSerQNames.add(qName);
            cls = rpc.xml.javax.ServiceException.class;
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

    public com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut verificaSeClienteAutenticadoNoRelay(com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoIn OSSTurbonetClienteAutenticadoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "verificaSeClienteAutenticadoNoRelay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetClienteAutenticadoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.setpvc.ConfigurarPVCOut configurarPVC(com.gvt.www.ws.eai.oss.setpvc.ConfigurarPVCIn configurarPVCIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "configurarPVC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarPVCIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.setpvc.ConfigurarPVCOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.setpvc.ConfigurarPVCOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.setpvc.ConfigurarPVCOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getDesignatorByAccessDesignator(java.lang.String accessDesignator) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getDesignatorByAccessDesignator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accessDesignator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public bean.ossturbonet.oss.gvt.com.InfoCertify certifyTurbonetProcess(java.lang.String designator, java.lang.String instance, java.lang.String login, java.lang.String userName, java.lang.String originalSystem, java.lang.String baNumber, java.lang.String baType, java.lang.String baDispatched, boolean allowedToFix) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "certifyTurbonetProcess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator, instance, login, userName, originalSystem, baNumber, baType, baDispatched, new java.lang.Boolean(allowedToFix)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bean.ossturbonet.oss.gvt.com.InfoCertify) _resp;
            } catch (java.lang.Exception _exception) {
                return (bean.ossturbonet.oss.gvt.com.InfoCertify) org.apache.axis.utils.JavaUtils.convert(_resp, bean.ossturbonet.oss.gvt.com.InfoCertify.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetModem.OSSTurbonetModemOut isModemSincronizado(com.gvt.www.ws.eai.oss.OSSTurbonetModem.OSSTurbonetModemIn OSSTurbonetModemIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "isModemSincronizado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetModemIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetModem.OSSTurbonetModemOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetModem.OSSTurbonetModemOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetModem.OSSTurbonetModemOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperarCGNATOut operarCGNAT(com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperarCGNATIn operarCGNATIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "operarCGNAT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {operarCGNATIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperarCGNATOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperarCGNATOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperarCGNATOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetReconfigureModem.OSSTurbonetReconfigureModemOut reconfigureModem(com.gvt.www.ws.eai.oss.OSSTurbonetReconfigureModem.OSSTurbonetReconfigureModemIn OSSTurbonetReconfigureModemIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "reconfigureModem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetReconfigureModemIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetReconfigureModem.OSSTurbonetReconfigureModemOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetReconfigureModem.OSSTurbonetReconfigureModemOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetReconfigureModem.OSSTurbonetReconfigureModemOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao.OSSTurbonetSNRAtenuacaoOut obterValoresSnrAtenuacao(com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao.OSSTurbonetSNRAtenuacaoIn OSSTurbonetSNRAtenuacaoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "obterValoresSnrAtenuacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetSNRAtenuacaoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao.OSSTurbonetSNRAtenuacaoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao.OSSTurbonetSNRAtenuacaoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao.OSSTurbonetSNRAtenuacaoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius.OSSTurbonetUpdateRadiusOut updateRadius(com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius.OSSTurbonetUpdateRadiusIn OSSTurbonetUpdateRadiusIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "updateRadius"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetUpdateRadiusIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius.OSSTurbonetUpdateRadiusOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius.OSSTurbonetUpdateRadiusOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius.OSSTurbonetUpdateRadiusOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.gpon.ConsultInfoGponOut consultInfoGpon(com.gvt.www.ws.eai.oss.gpon.ConsultInfoGponIn consultInfoGponIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "consultInfoGpon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultInfoGponIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.gpon.ConsultInfoGponOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.gpon.ConsultInfoGponOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.gpon.ConsultInfoGponOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public bean.ossturbonet.oss.gvt.com.InfoAuthentication getInfoAuthentication(java.lang.String designator, java.lang.String instance, java.lang.String login, java.lang.String userName, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getInfoAuthentication"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator, instance, login, userName, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bean.ossturbonet.oss.gvt.com.InfoAuthentication) _resp;
            } catch (java.lang.Exception _exception) {
                return (bean.ossturbonet.oss.gvt.com.InfoAuthentication) org.apache.axis.utils.JavaUtils.convert(_resp, bean.ossturbonet.oss.gvt.com.InfoAuthentication.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public bean.ossturbonet.oss.gvt.com.ADSLRate[] getDefaultVelocity(int downStreamCRM, java.lang.String sistemaOriginario, java.lang.String dslamVendor, java.lang.String dslamModel, java.lang.String designator) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getDefaultVelocity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(downStreamCRM), sistemaOriginario, dslamVendor, dslamModel, designator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bean.ossturbonet.oss.gvt.com.ADSLRate[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (bean.ossturbonet.oss.gvt.com.ADSLRate[]) org.apache.axis.utils.JavaUtils.convert(_resp, bean.ossturbonet.oss.gvt.com.ADSLRate[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile.OSSTurbonetChangeProfileOut changeProfileWithProtocol(com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile.OSSTurbonetChangeProfileIn OSSTurbonetChangeProfileIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "changeProfileWithProtocol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetChangeProfileIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile.OSSTurbonetChangeProfileOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile.OSSTurbonetChangeProfileOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile.OSSTurbonetChangeProfileOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.canaispvc.ConsultarStatusCanaisPVCOut consultarStatusCanaisPVC(com.gvt.www.ws.eai.oss.canaispvc.ConsultarStatusCanaisPVCIn consultarStatusCanaisPVCIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "consultarStatusCanaisPVC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarStatusCanaisPVCIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.canaispvc.ConsultarStatusCanaisPVCOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.canaispvc.ConsultarStatusCanaisPVCOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.canaispvc.ConsultarStatusCanaisPVCOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean associaSerialOLT(java.lang.String accessDesignator, java.lang.String serialOLT, java.lang.String designator, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "associaSerialOLT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accessDesignator, serialOLT, designator, login, userName, instance, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.setpvc.ConsultarBridgeOut consultarBridge(com.gvt.www.ws.eai.oss.setpvc.ConsultarBridgeIn consultarBridgeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "consultarBridge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultarBridgeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.setpvc.ConsultarBridgeOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.setpvc.ConsultarBridgeOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.setpvc.ConsultarBridgeOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade.OSSTurbonetVerificaModulacaoVelocidadeOut verificaModulacaoVelocidade(com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade.OSSTurbonetVerificaModulacaoVelocidadeIn OSSTurbonetVerificaModulacaoVelocidadeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "verificaModulacaoVelocidade"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetVerificaModulacaoVelocidadeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade.OSSTurbonetVerificaModulacaoVelocidadeOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade.OSSTurbonetVerificaModulacaoVelocidadeOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade.OSSTurbonetVerificaModulacaoVelocidadeOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOut getAdslUseReport(com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportIn OSSTurbonetAdslUseReportIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getAdslUseReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetAdslUseReportIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.gpon.ManobraDslamGponOut manobrarDslamGpon(com.gvt.www.ws.eai.oss.gpon.ManobraDslamGponIn manobraDslamGponIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "manobrarDslamGpon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {manobraDslamGponIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.gpon.ManobraDslamGponOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.gpon.ManobraDslamGponOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.gpon.ManobraDslamGponOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut isClienteAutenticado(com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoIn OSSTurbonetClienteAutenticadoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "isClienteAutenticado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetClienteAutenticadoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String changeRate(java.lang.String designator, java.lang.String accessDesignator, java.lang.String instance, java.math.BigInteger newDownRate, java.math.BigInteger newUpRate, java.lang.String oldDownUpRate, java.lang.String pon, java.lang.String rpon, java.lang.String login, java.lang.String userName, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "changeRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator, accessDesignator, instance, newDownRate, newUpRate, oldDownUpRate, pon, rpon, login, userName, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetChangeCfg.OSSTurbonetChangeCfgOut resetWithProtocol(com.gvt.www.ws.eai.oss.OSSTurbonetChangeCfg.OSSTurbonetChangeCfgIn OSSTurbonetChangeCfgIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "resetWithProtocol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetChangeCfgIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetChangeCfg.OSSTurbonetChangeCfgOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetChangeCfg.OSSTurbonetChangeCfgOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetChangeCfg.OSSTurbonetChangeCfgOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusOut verificarInconsistenciaTBSRadius(com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusIn OSSTurbonetInconsistenciaTBSRadiusIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "verificarInconsistenciaTBSRadius"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetInconsistenciaTBSRadiusIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetAtualizarIpProfissional.OSSTurbonetAtualizarIpProfissionalOut atualizarIpProfissional(com.gvt.www.ws.eai.oss.OSSTurbonetAtualizarIpProfissional.OSSTurbonetAtualizarIpProfissionalIn OSSTurbonetAtualizarIpProfissionalIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "atualizarIpProfissional"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetAtualizarIpProfissionalIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetAtualizarIpProfissional.OSSTurbonetAtualizarIpProfissionalOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetAtualizarIpProfissional.OSSTurbonetAtualizarIpProfissionalOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetAtualizarIpProfissional.OSSTurbonetAtualizarIpProfissionalOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify.OSSTurbonetGetLogCertifyOut getLogCertify(com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify.OSSTurbonetGetLogCertifyIn ossTurbonetGetLogCertifyIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getLogCertify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ossTurbonetGetLogCertifyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify.OSSTurbonetGetLogCertifyOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify.OSSTurbonetGetLogCertifyOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify.OSSTurbonetGetLogCertifyOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bean.ossturbonet.oss.gvt.com.InfoCertify certifyTurbonet(java.lang.String designator, java.lang.String instance, java.lang.String login, java.lang.String userName, java.lang.String originalSystem, java.lang.String baNumber, java.lang.String baType, java.lang.String baDispatched, boolean allowedToFix) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "certifyTurbonet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator, instance, login, userName, originalSystem, baNumber, baType, baDispatched, new java.lang.Boolean(allowedToFix)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bean.ossturbonet.oss.gvt.com.InfoCertify) _resp;
            } catch (java.lang.Exception _exception) {
                return (bean.ossturbonet.oss.gvt.com.InfoCertify) org.apache.axis.utils.JavaUtils.convert(_resp, bean.ossturbonet.oss.gvt.com.InfoCertify.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String changeProfile(java.lang.String designator, java.lang.String newModulation, java.lang.String oldModulation, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "changeProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator, newModulation, oldModulation, login, userName, instance, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getAccessDesignator(java.lang.String designator) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getAccessDesignator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetGetLogTesteVelocidade.OSSTurbonetGetLogTesteVelocidadeOut getLogTesteVelocidade(com.gvt.www.ws.eai.oss.OSSTurbonetGetLogTesteVelocidade.OSSTurbonetGetLogTesteVelocidadeIn ossTurbonetGetLogTesteVelocidadeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getLogTesteVelocidade"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ossTurbonetGetLogTesteVelocidadeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetGetLogTesteVelocidade.OSSTurbonetGetLogTesteVelocidadeOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetGetLogTesteVelocidade.OSSTurbonetGetLogTesteVelocidadeOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetGetLogTesteVelocidade.OSSTurbonetGetLogTesteVelocidadeOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String reset(java.lang.String designator, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "reset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator, login, userName, instance, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getSeriaisOLT(java.lang.String accessDesignator, java.lang.String designator, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getSeriaisOLT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accessDesignator, designator, login, userName, instance, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public bean.ossturbonet.oss.gvt.com.Designators[] getDesignators(java.lang.String designator) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getDesignators"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bean.ossturbonet.oss.gvt.com.Designators[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (bean.ossturbonet.oss.gvt.com.Designators[]) org.apache.axis.utils.JavaUtils.convert(_resp, bean.ossturbonet.oss.gvt.com.Designators[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createSNRAttenLog(java.lang.Integer upStreamSinc, java.lang.Integer downStreamSinc, java.lang.Integer upStreamProfile, java.lang.Integer downStreamProfile, java.lang.Integer upStreamSNR, java.lang.Integer downStreamSNR, java.lang.Integer upStreamSNRRange, java.lang.Integer downStreamSNRRange, java.lang.Integer attenuationMin, java.lang.Integer attenuationMax, java.lang.String designador, java.lang.String instancia, java.lang.String upstreamSincRange, java.lang.String downstreamSincRange, java.lang.String tipoSS, java.lang.String descricaoSS, java.lang.String detalheSS, java.lang.String solucaoSS, java.lang.String sistemaOriginario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "createSNRAttenLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {upStreamSinc, downStreamSinc, upStreamProfile, downStreamProfile, upStreamSNR, downStreamSNR, upStreamSNRRange, downStreamSNRRange, attenuationMin, attenuationMax, designador, instancia, upstreamSincRange, downstreamSincRange, tipoSS, descricaoSS, detalheSS, solucaoSS, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean desassociaSerialOLT(java.lang.String accessDesignator, java.lang.String designator, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "desassociaSerialOLT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accessDesignator, designator, login, userName, instance, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.gpon.EquipmentSimulateGponOut equipmentSimulationGpon(com.gvt.www.ws.eai.oss.gpon.EquipmentSimulateGponIn equipmentSimulateGponIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "equipmentSimulationGpon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {equipmentSimulateGponIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.gpon.EquipmentSimulateGponOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.gpon.EquipmentSimulateGponOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.gpon.EquipmentSimulateGponOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public bean.ossturbonet.oss.gvt.com.AccessInfo getAccessInfo(java.lang.String accessDesignator, java.lang.String instancia, java.lang.String activityInd) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getAccessInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accessDesignator, instancia, activityInd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bean.ossturbonet.oss.gvt.com.AccessInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (bean.ossturbonet.oss.gvt.com.AccessInfo) org.apache.axis.utils.JavaUtils.convert(_resp, bean.ossturbonet.oss.gvt.com.AccessInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade.OSSTurbonetLastLogTesteVelocidadeOut getLastLogTesteVelocidade(com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade.OSSTurbonetLastLogTesteVelocidadeIn ossTurbonetLastLogTesteVelocidadeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getLastLogTesteVelocidade"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ossTurbonetLastLogTesteVelocidadeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade.OSSTurbonetLastLogTesteVelocidadeOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade.OSSTurbonetLastLogTesteVelocidadeOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade.OSSTurbonetLastLogTesteVelocidadeOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeOut configurarBridge(com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeIn configurarBridgeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "configurarBridge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {configurarBridgeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius.OSSTurbonetPerfilRadiusOut obterPerfilRadius(com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius.OSSTurbonetPerfilRadiusIn OSSTurbonetPerfilRadiusIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "obterPerfilRadius"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetPerfilRadiusIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius.OSSTurbonetPerfilRadiusOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius.OSSTurbonetPerfilRadiusOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius.OSSTurbonetPerfilRadiusOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bean.ossturbonet.oss.gvt.com.RadiusInfo getRadiusInfo(java.lang.String designator) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getRadiusInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bean.ossturbonet.oss.gvt.com.RadiusInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (bean.ossturbonet.oss.gvt.com.RadiusInfo) org.apache.axis.utils.JavaUtils.convert(_resp, bean.ossturbonet.oss.gvt.com.RadiusInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String changeRateForRadius(java.lang.String designator, java.lang.String instance, java.lang.String oldDownUpRate, java.lang.String login, java.lang.String userName, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "changeRateForRadius"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator, instance, oldDownUpRate, login, userName, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String changeLockAndUnlock(java.lang.String designator, java.lang.String instance, java.lang.String newstatus, java.lang.String oldstatus, java.lang.String login, java.lang.String userName, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "changeLockAndUnlock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator, instance, newstatus, oldstatus, login, userName, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.OSSTurbonetDiagnosticoBandaLargaOut diagnosticoBandaLarga(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.OSSTurbonetDiagnosticoBandaLargaIn OSSTurbonetDiagnosticoBandaLargaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "diagnosticoBandaLarga"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetDiagnosticoBandaLargaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.OSSTurbonetDiagnosticoBandaLargaOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.OSSTurbonetDiagnosticoBandaLargaOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.OSSTurbonetDiagnosticoBandaLargaOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut getAuthenticationByIPorMac(java.lang.String ipOrmac) throws java.rmi.RemoteException, rpc.xml.javax.ServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getAuthenticationByIPorMac"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipOrmac});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof rpc.xml.javax.ServiceException) {
              throw (rpc.xml.javax.ServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public bean.ossturbonet.oss.gvt.com.GetInfoOut getInfo(java.lang.String designator, java.lang.String accessDesignator, java.lang.String login, java.lang.String userName, java.lang.String instance, java.lang.String sistemaOriginario, java.lang.String downstreamCrm, java.lang.String upstreamCrm) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator, accessDesignator, login, userName, instance, sistemaOriginario, downstreamCrm, upstreamCrm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bean.ossturbonet.oss.gvt.com.GetInfoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (bean.ossturbonet.oss.gvt.com.GetInfoOut) org.apache.axis.utils.JavaUtils.convert(_resp, bean.ossturbonet.oss.gvt.com.GetInfoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut getStatusConexao(com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoIn ossTurbonetStatusConexaoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getStatusConexao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ossTurbonetStatusConexaoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetAccountingRelay.OSSTurbonetAccountingRelayOut getAccountingRelayInfo(com.gvt.www.ws.eai.oss.OSSTurbonetAccountingRelay.OSSTurbonetAccountingRelayIn OSSTurbonetAccountingRelayIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getAccountingRelayInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetAccountingRelayIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetAccountingRelay.OSSTurbonetAccountingRelayOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetAccountingRelay.OSSTurbonetAccountingRelayOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetAccountingRelay.OSSTurbonetAccountingRelayOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.gpon.DiagnosticoAcessoGPONOut diagnosticoAcessoGPON(com.gvt.www.ws.eai.oss.gpon.DiagnosticoAcessoGPONIn diagnosticoAcessoGPONIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "diagnosticoAcessoGPON"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {diagnosticoAcessoGPONIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.gpon.DiagnosticoAcessoGPONOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.gpon.DiagnosticoAcessoGPONOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.gpon.DiagnosticoAcessoGPONOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public bean.ossturbonet.oss.gvt.com.ADSLRate[] getSyncRateByFilter(int id, int downStreamCRM, java.lang.String sistemaOriginario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getSyncRateByFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(id), new java.lang.Integer(downStreamCRM), sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bean.ossturbonet.oss.gvt.com.ADSLRate[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (bean.ossturbonet.oss.gvt.com.ADSLRate[]) org.apache.axis.utils.JavaUtils.convert(_resp, bean.ossturbonet.oss.gvt.com.ADSLRate[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut logCertify(com.gvt.www.ws.eai.oss.OSSTurbonetLogCertify.OSSTurbonetLogCertifyIn ossTurbonetLogCertifyIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "logCertify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ossTurbonetLogCertifyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.gpon.UpdateRateGponOut updateRateGpon(com.gvt.www.ws.eai.oss.gpon.UpdateRateGponIn updateRateGponIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "updateRateGpon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateRateGponIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.gpon.UpdateRateGponOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.gpon.UpdateRateGponOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.gpon.UpdateRateGponOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.gpon.DiagnosticoVozGPONOut diagnosticoVozGPON(com.gvt.www.ws.eai.oss.gpon.DiagnosticoVozGPONIn diagnosticoVozGPONIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "diagnosticoVozGPON"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {diagnosticoVozGPONIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.gpon.DiagnosticoVozGPONOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.gpon.DiagnosticoVozGPONOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.gpon.DiagnosticoVozGPONOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOut obterMotivosDesconexao(com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoIn OSSTurbonetMotivosDesconexaoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "obterMotivosDesconexao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetMotivosDesconexaoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitOut getInfoShortCircuit(com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitIn ossTurbonetShortCircuitIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getInfoShortCircuit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ossTurbonetShortCircuitIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut logTesteVelocidade(com.gvt.www.ws.eai.oss.OSSTurbonetLogTesteVelocidade.OSSTurbonetLogTesteVelocidadeIn ossTurbonetLogTesteVelocidadeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "logTesteVelocidade"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ossTurbonetLogTesteVelocidadeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano.OSSTurbonetModulacaoPlanoOut isModulacaoCorretaPlano(com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano.OSSTurbonetModulacaoPlanoIn OSSTurbonetModulacaoPlanoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "isModulacaoCorretaPlano"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetModulacaoPlanoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano.OSSTurbonetModulacaoPlanoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano.OSSTurbonetModulacaoPlanoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano.OSSTurbonetModulacaoPlanoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada.OSSTurbonetVelocidadeSincronizadaOut obterVelocidadeSincronizada(com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada.OSSTurbonetVelocidadeSincronizadaIn OSSTurbonetVelocidadeSincronizadaIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "obterVelocidadeSincronizada"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetVelocidadeSincronizadaIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada.OSSTurbonetVelocidadeSincronizadaOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada.OSSTurbonetVelocidadeSincronizadaOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada.OSSTurbonetVelocidadeSincronizadaOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bean.ossturbonet.oss.gvt.com.SmartToolLog[] getWiseToolActionReport(java.lang.Integer numberOfDays, java.lang.String designator, java.lang.String sistemaOriginario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "getWiseToolActionReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {numberOfDays, designator, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bean.ossturbonet.oss.gvt.com.SmartToolLog[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (bean.ossturbonet.oss.gvt.com.SmartToolLog[]) org.apache.axis.utils.JavaUtils.convert(_resp, bean.ossturbonet.oss.gvt.com.SmartToolLog[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile.OSSTurbonetVelocidadeProfileOut obterVelocidadeDeProfile(com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile.OSSTurbonetVelocidadeProfileIn OSSTurbonetVelocidadeProfileIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "obterVelocidadeDeProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetVelocidadeProfileIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile.OSSTurbonetVelocidadeProfileOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile.OSSTurbonetVelocidadeProfileOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile.OSSTurbonetVelocidadeProfileOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate.OSSTurbonetChangeRateOut changeRateWithProtocol(com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate.OSSTurbonetChangeRateIn OSSTurbonetChangeRateIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "changeRateWithProtocol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetChangeRateIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate.OSSTurbonetChangeRateOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate.OSSTurbonetChangeRateOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate.OSSTurbonetChangeRateOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.ResetOntGPON.ResetOntGPONOut resetOnt(com.gvt.www.ws.eai.oss.ResetOntGPON.ResetOntGPONIn resetOntGPONIn) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "resetOnt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetOntGPONIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.ResetOntGPON.ResetOntGPONOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.ResetOntGPON.ResetOntGPONOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.ResetOntGPON.ResetOntGPONOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetBlackList.OSSTurbonetBlackListOut isInBlackList(com.gvt.www.ws.eai.oss.OSSTurbonetBlackList.OSSTurbonetBlackListIn OSSTurbonetBlackListIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "isInBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OSSTurbonetBlackListIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetBlackList.OSSTurbonetBlackListOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.OSSTurbonetBlackList.OSSTurbonetBlackListOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.OSSTurbonetBlackList.OSSTurbonetBlackListOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String changeDNSReverso(java.lang.String designator, java.lang.String instance, java.lang.String strNewDomain, java.lang.String strOldDomain, java.lang.String login, java.lang.String userName, java.lang.String sistemaOriginario) throws java.rmi.RemoteException, exception.ossturbonet.oss.gvt.com.DataNotFoundException, exception.ossturbonet.oss.gvt.com.OSSTurbonetException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "changeDNSReverso"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator, instance, strNewDomain, strOldDomain, login, userName, sistemaOriginario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.DataNotFoundException) {
              throw (exception.ossturbonet.oss.gvt.com.DataNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof exception.ossturbonet.oss.gvt.com.OSSTurbonetException) {
              throw (exception.ossturbonet.oss.gvt.com.OSSTurbonetException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
