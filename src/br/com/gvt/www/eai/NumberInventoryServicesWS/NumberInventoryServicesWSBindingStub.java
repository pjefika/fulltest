/**
 * NumberInventoryServicesWSBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.eai.NumberInventoryServicesWS;

public class NumberInventoryServicesWSBindingStub extends org.apache.axis.client.Stub implements br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWS {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[15];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSwitchesByType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "GetSwitchesByTypeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchesByTypeIn"), br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchesByTypeOut"));
        oper.setReturnClass(br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetSwitchesByTypeOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeSwichByRange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "ChangeSwichByRangeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "changeSwichByRangeIn"), br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "changeSwichByRangeOut"));
        oper.setReturnClass(br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ChangeSwichByRangeOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBDOByRange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "GetBDOByRangeIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getBDOByRangeIn"), br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getBDOByRangeOut"));
        oper.setReturnClass(br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetBDOByRangeOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateEquipmentNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UpdateEquipmentNumberIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "updateEquipmentNumberIn"), br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "updateEquipmentNumberOut"));
        oper.setReturnClass(br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "UpdateEquipmentNumberOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("liberarNaoLiberado");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("liberarNaoSeAplica");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("liberarCancelado");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("liberarQuarentena");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("liberarInconsistente");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("liberarReservado");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("liberarNumeros");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "liberarNumerosIn"), br.com.gvt.www.eai.NumberInventoryServicesWS.LiberarNumerosIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSwitchInfoByFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "GetSwitchInfoByFilterIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchInfoByFilterIn"), br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchInfoByFilterOut"));
        oper.setReturnClass(br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetSwitchInfoByFilterOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRouteRN2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "GetRouteRN2In"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getRouteRN2In"), br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2In.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getRouteRN2Out"));
        oper.setReturnClass(br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2Out.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetRouteRN2Out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNumberByFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "GetNumberByFilterIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getNumberByFilterIn"), br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getNumberByFilterOut"));
        oper.setReturnClass(br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetNumberByFilterOut"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("associateEquipmentNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "AssociateEquipmentNumberIn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "associateEquipmentNumberIn"), br.com.gvt.www.eai.NumberInventoryServicesWS.AssociateEquipmentNumberIn.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

    }

    public NumberInventoryServicesWSBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public NumberInventoryServicesWSBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public NumberInventoryServicesWSBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "associateEquipmentNumberIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.AssociateEquipmentNumberIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "changeSwichByRangeIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "changeSwichByRangeOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getBDOByRangeIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getBDOByRangeOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getNumberByFilterIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getNumberByFilterOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getRouteRN2In");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2In.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getRouteRN2Out");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2Out.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchesByTypeIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchesByTypeOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchInfoByFilterIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchInfoByFilterOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "liberarNumerosIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.LiberarNumerosIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "portados");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.Portados.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "switch");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS._switch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "switchInfo");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.SwitchInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "updateEquipmentNumberIn");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "updateEquipmentNumberOut");
            cachedSerQNames.add(qName);
            cls = br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberOut.class;
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

    public br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeOut getSwitchesByType(br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeIn getSwitchesByTypeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchesByType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSwitchesByTypeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeOut changeSwichByRange(br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeIn changeSwichByRangeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "changeSwichByRange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {changeSwichByRangeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeOut getBDOByRange(br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeIn getBDOByRangeIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getBDOByRange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getBDOByRangeIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberOut updateEquipmentNumber(br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberIn updateEquipmentNumberIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "updateEquipmentNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateEquipmentNumberIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void liberarNaoLiberado() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "liberarNaoLiberado"));

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

    public void liberarNaoSeAplica() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "liberarNaoSeAplica"));

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

    public void liberarCancelado() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "liberarCancelado"));

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

    public void liberarQuarentena() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "liberarQuarentena"));

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

    public void liberarInconsistente() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "liberarInconsistente"));

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

    public void liberarReservado() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "liberarReservado"));

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

    public void liberarNumeros(br.com.gvt.www.eai.NumberInventoryServicesWS.LiberarNumerosIn arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "liberarNumeros"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterOut getSwitchInfoByFilter(br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterIn getSwitchInfoByFilterIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchInfoByFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSwitchInfoByFilterIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2Out getRouteRN2(br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2In getRouteRN2In) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getRouteRN2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getRouteRN2In});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2Out) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2Out) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2Out.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut getNumberByFilter(br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterIn getNumberByFilterIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getNumberByFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getNumberByFilterIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void associateEquipmentNumber(br.com.gvt.www.eai.NumberInventoryServicesWS.AssociateEquipmentNumberIn associateEquipmentNumberIn) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "associateEquipmentNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {associateEquipmentNumberIn});

    }

}
