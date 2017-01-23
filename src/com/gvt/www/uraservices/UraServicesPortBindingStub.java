/**
 * UraServicesPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class UraServicesPortBindingStub extends org.apache.axis.client.Stub implements com.gvt.www.uraservices.UraServices {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verifyCoverageByCEP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "VerifyCoverageByCEPIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "checkCustomerCoverageIn"), com.gvt.www.uraservices.CheckCustomerCoverageIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "checkCustomerCoverageOut"));
        oper.setReturnClass(com.gvt.www.uraservices.CheckCustomerCoverageOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "VerifyCoverageByCEPOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saleTVVas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "channel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "agent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "comQuoteSolutionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "assetNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "vasElementVO"), com.gvt.www.uraservices.VasElementVO[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("certificar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "CertificarInDocument"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "certifyIn"), com.gvt.www.uraservices.CertifyIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "certifyOut"));
        oper.setReturnClass(com.gvt.www.uraservices.CertifyOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "CertificarOutDocument"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("permiteAlteracaoDataVencimento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "conta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelarTT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "CancelarTTIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "cancelTTIn"), com.gvt.www.uraservices.CancelTTIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "cancelTTOut"));
        oper.setReturnClass(com.gvt.www.uraservices.CancelTTOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "CancelarTTOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSSFromUra");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "CreateSSFromUraIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "createSSFromUraIn"), com.gvt.www.uraservices.CreateSSFromUraIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "createSSFromUraOut"));
        oper.setReturnClass(com.gvt.www.uraservices.CreateSSFromUraOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "CreateSSFromUraOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSSByFilterUra");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "GetSSByFilterUraIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "getSSByFilterUraIn"), com.gvt.www.uraservices.GetSSByFilterUraIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "getSSByFilterUraOut"));
        oper.setReturnClass(com.gvt.www.uraservices.GetSSByFilterUraOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "GetSSByFilterUraOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("solicitarDebitoAutomatico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "SolicitarDebitoAutomaticoIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "directDebitRequestIn"), com.gvt.www.uraservices.DirectDebitRequestIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "directDebitRequestOut"));
        oper.setReturnClass(com.gvt.www.uraservices.DirectDebitRequestOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "SolicitarDebitoAutomaticoOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("efetuarRecargaPlanoControle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "EfetuarRecargaPlanoControleInDocument"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "rechargeControlPlanIn"), com.gvt.www.uraservices.RechargeControlPlanIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "rechargeControlPlanOut"));
        oper.setReturnClass(com.gvt.www.uraservices.RechargeControlPlanOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "EfetuarRecargaPlanoControleOutDocument"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("efetuarRecargaControleVC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "EfetuarRecargaControleVCInDocument"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "rechargeCellControlPlanIn"), com.gvt.www.uraservices.RechargeCellControlPlanIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "rechargeCellControlPlanOut"));
        oper.setReturnClass(com.gvt.www.uraservices.RechargeCellControlPlanOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "EfetuarRecargaControleVCOutDocument"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salesVas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "channel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "agent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "vo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "phoneVasVO"), com.gvt.www.uraservices.PhoneVasVO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoSwitch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "phonenumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "getSwitchInfoOut"));
        oper.setReturnClass(com.gvt.www.uraservices.GetSwitchInfoOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "GetSwitchInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateServiceBlock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "phonenumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "codeMessageOut"));
        oper.setReturnClass(com.gvt.www.uraservices.CodeMessageOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "BlockInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateChangeAddressInstall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "phonenumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "codeMessageOut"));
        oper.setReturnClass(com.gvt.www.uraservices.CodeMessageOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "ValidateChangeAddressInstallResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateTbsRadiusDivergency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "phonenumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "codeMessageOut"));
        oper.setReturnClass(com.gvt.www.uraservices.CodeMessageOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "ValidateTbsRadiusDivergencyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateNetworkIncident");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "phonenumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "sasMassiveResult"));
        oper.setReturnClass(com.gvt.www.uraservices.SasMassiveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "ValidateNetworkIncidentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verifyIsTroubleTicketSpecialCell");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "phonenumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "isSpecialCellOut"));
        oper.setReturnClass(com.gvt.www.uraservices.IsSpecialCellOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "IsSpecialCellOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allowOmbudsmanService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "AllowOmbudsmanServiceIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "allowOmbudsmanServiceIn"), com.gvt.www.uraservices.AllowOmbudsmanServiceIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "allowOmbudsmanServiceOut"));
        oper.setReturnClass(com.gvt.www.uraservices.AllowOmbudsmanServiceOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "AllowOmbudsmanServiceOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateTbsSwitchDivergency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "phonenumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "validateTbsSwitchDivergencyOut"));
        oper.setReturnClass(com.gvt.www.uraservices.ValidateTbsSwitchDivergencyOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "ValidateTbsSwitchDivergency"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

    }

    public UraServicesPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public UraServicesPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public UraServicesPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "allowOmbudsmanServiceIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.AllowOmbudsmanServiceIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "allowOmbudsmanServiceOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.AllowOmbudsmanServiceOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "cancelTTIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.CancelTTIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "cancelTTOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.CancelTTOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "certifyIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.CertifyIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "certifyOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.CertifyOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "checkCustomerCoverageIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.CheckCustomerCoverageIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "checkCustomerCoverageOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.CheckCustomerCoverageOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "codeMessageOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.CodeMessageOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "createSSFromUraIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.CreateSSFromUraIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "createSSFromUraOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.CreateSSFromUraOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "directDebitRequestIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.DirectDebitRequestIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "directDebitRequestOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.DirectDebitRequestOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "equipament");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.Equipament.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "getSSByFilterUraIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.GetSSByFilterUraIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "getSSByFilterUraOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.GetSSByFilterUraOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "getSwitchInfoOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.GetSwitchInfoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "gpsAction");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.GpsAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "isSpecialCellOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.IsSpecialCellOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "phoneVasVO");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.PhoneVasVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "rechargeCellControlPlanIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.RechargeCellControlPlanIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "rechargeCellControlPlanOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.RechargeCellControlPlanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "rechargeControlPlanIn");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.RechargeControlPlanIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "rechargeControlPlanOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.RechargeControlPlanOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "sasMassiveResult");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.SasMassiveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "validateTbsSwitchDivergencyOut");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.ValidateTbsSwitchDivergencyOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "vasElementVO");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.VasElementVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "vasParameterVO");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.uraservices.VasParameterVO.class;
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

    public com.gvt.www.uraservices.CheckCustomerCoverageOut verifyCoverageByCEP(com.gvt.www.uraservices.CheckCustomerCoverageIn verifyCoverageByCEPIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "verifyCoverageByCEP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifyCoverageByCEPIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.CheckCustomerCoverageOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.CheckCustomerCoverageOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.CheckCustomerCoverageOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int saleTVVas(java.lang.String channel, java.lang.String agent, java.lang.String comQuoteSolutionId, java.lang.String assetNumber, com.gvt.www.uraservices.VasElementVO[] element) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "saleTVVas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {channel, agent, comQuoteSolutionId, assetNumber, element});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.CertifyOut certificar(com.gvt.www.uraservices.CertifyIn certificarInDocument) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "certificar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {certificarInDocument});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.CertifyOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.CertifyOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.CertifyOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean permiteAlteracaoDataVencimento(java.lang.String conta) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "permiteAlteracaoDataVencimento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {conta});

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
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.CancelTTOut cancelarTT(com.gvt.www.uraservices.CancelTTIn cancelarTTIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "cancelarTT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cancelarTTIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.CancelTTOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.CancelTTOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.CancelTTOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.CreateSSFromUraOut createSSFromUra(com.gvt.www.uraservices.CreateSSFromUraIn createSSFromUraIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "createSSFromUra"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createSSFromUraIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.CreateSSFromUraOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.CreateSSFromUraOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.CreateSSFromUraOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.GetSSByFilterUraOut getSSByFilterUra(com.gvt.www.uraservices.GetSSByFilterUraIn getSSByFilterUraIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "getSSByFilterUra"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSSByFilterUraIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.GetSSByFilterUraOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.GetSSByFilterUraOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.GetSSByFilterUraOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.DirectDebitRequestOut solicitarDebitoAutomatico(com.gvt.www.uraservices.DirectDebitRequestIn solicitarDebitoAutomaticoIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "solicitarDebitoAutomatico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {solicitarDebitoAutomaticoIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.DirectDebitRequestOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.DirectDebitRequestOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.DirectDebitRequestOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.RechargeControlPlanOut efetuarRecargaPlanoControle(com.gvt.www.uraservices.RechargeControlPlanIn efetuarRecargaPlanoControleInDocument) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "efetuarRecargaPlanoControle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {efetuarRecargaPlanoControleInDocument});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.RechargeControlPlanOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.RechargeControlPlanOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.RechargeControlPlanOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.RechargeCellControlPlanOut efetuarRecargaControleVC(com.gvt.www.uraservices.RechargeCellControlPlanIn efetuarRecargaControleVCInDocument) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "efetuarRecargaControleVC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {efetuarRecargaControleVCInDocument});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.RechargeCellControlPlanOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.RechargeCellControlPlanOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.RechargeCellControlPlanOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void salesVas(java.lang.String channel, java.lang.String agent, com.gvt.www.uraservices.PhoneVasVO vo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "salesVas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {channel, agent, vo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.GetSwitchInfoOut getInfoSwitch(java.lang.String phonenumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "getInfoSwitch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {phonenumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.GetSwitchInfoOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.GetSwitchInfoOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.GetSwitchInfoOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.CodeMessageOut validateServiceBlock(java.lang.String phonenumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "validateServiceBlock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {phonenumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.CodeMessageOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.CodeMessageOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.CodeMessageOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.CodeMessageOut validateChangeAddressInstall(java.lang.String phonenumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "validateChangeAddressInstall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {phonenumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.CodeMessageOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.CodeMessageOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.CodeMessageOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.CodeMessageOut validateTbsRadiusDivergency(java.lang.String phonenumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "validateTbsRadiusDivergency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {phonenumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.CodeMessageOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.CodeMessageOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.CodeMessageOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.SasMassiveResult validateNetworkIncident(java.lang.String phonenumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "validateNetworkIncident"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {phonenumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.SasMassiveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.SasMassiveResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.SasMassiveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.IsSpecialCellOut verifyIsTroubleTicketSpecialCell(java.lang.String phonenumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "verifyIsTroubleTicketSpecialCell"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {phonenumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.IsSpecialCellOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.IsSpecialCellOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.IsSpecialCellOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.AllowOmbudsmanServiceOut allowOmbudsmanService(com.gvt.www.uraservices.AllowOmbudsmanServiceIn allowOmbudsmanServiceIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "allowOmbudsmanService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {allowOmbudsmanServiceIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.AllowOmbudsmanServiceOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.AllowOmbudsmanServiceOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.AllowOmbudsmanServiceOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.uraservices.ValidateTbsSwitchDivergencyOut validateTbsSwitchDivergency(java.lang.String phonenumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "validateTbsSwitchDivergency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {phonenumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.uraservices.ValidateTbsSwitchDivergencyOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.uraservices.ValidateTbsSwitchDivergencyOut) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.uraservices.ValidateTbsSwitchDivergencyOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
