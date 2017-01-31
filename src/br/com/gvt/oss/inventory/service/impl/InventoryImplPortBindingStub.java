/**
 * InventoryImplPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.oss.inventory.service.impl;

public class InventoryImplPortBindingStub extends org.apache.axis.client.Stub implements br.com.gvt.oss.inventory.service.impl.InventoryImpl {
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
        oper.setName("getItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "itemKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "ItemKey"), com.gvt.www.ws.eai.oss.inventory.api.ItemKey.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "includeHistory"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cascade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "statusList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "InventoryItemResponse"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.inventory.api.InventoryItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccountItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "accountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addressId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "networkOwnerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inactiveCancelled"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "InventoryAccountResponse"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.inventory.api.InventoryAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deactivateItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "ItemKey"), com.gvt.www.ws.eai.oss.inventory.api.ItemKey[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cascade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finalStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "statusList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "deactivateItemResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.DeactivateItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "deactivateItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("suspendItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "suspendItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "suspendItem"), br.com.gvt.oss.inventory.service.impl.SuspendItem.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "suspendItemResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.SuspendItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "suspendItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateAccessDesignator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "generateAccessDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "generateAccessDesignator"), br.com.gvt.oss.inventory.service.impl.GenerateAccessDesignator.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "generateAccessDesignatorResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.GenerateAccessDesignatorResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "generateAccessDesignatorResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAssociatedDesignators");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "designator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Filter"), com.gvt.www.ws.eai.oss.inventory.api.Filter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "InventoryDesignatorsResponse"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("provisionOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Account"), com.gvt.www.ws.eai.oss.inventory.api.Account.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "provisionOrderResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.ProvisionOrderResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "provisionOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("releaseAccessDesignator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "releaseAccessDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "releaseAccessDesignator"), br.com.gvt.oss.inventory.service.impl.ReleaseAccessDesignator.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "releaseAccessDesignatorResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.ReleaseAccessDesignatorResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "releaseAccessDesignatorResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addSubItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "addSubItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "addSubItem"), br.com.gvt.oss.inventory.service.impl.AddSubItem.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "addSubItemResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.AddSubItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "addSubItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePhoneNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changePhoneNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changePhoneNumber"), br.com.gvt.oss.inventory.service.impl.ChangePhoneNumber.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changePhoneNumberResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.ChangePhoneNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changePhoneNumberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeAccount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeAccount"), br.com.gvt.oss.inventory.service.impl.ChangeAccount.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeAccountResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.ChangeAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeAddressId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeAddressId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeAddressId"), br.com.gvt.oss.inventory.service.impl.ChangeAddressId.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeAddressIdResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.ChangeAddressIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeAddressIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addItemParameters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "addItemParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "addItemParameters"), br.com.gvt.oss.inventory.service.impl.AddItemParameters.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "addItemParametersResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.AddItemParametersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "addItemParametersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeItemParameters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeItemParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeItemParameters"), br.com.gvt.oss.inventory.service.impl.ChangeItemParameters.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeItemParametersResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.ChangeItemParametersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "changeItemParametersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeItemParameters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "removeItemParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "removeItemParameters"), br.com.gvt.oss.inventory.service.impl.RemoveItemParameters.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "removeItemParametersResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.RemoveItemParametersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "removeItemParametersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "activateItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "activateItem"), br.com.gvt.oss.inventory.service.impl.ActivateItem.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "activateItemResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.ActivateItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "activateItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmAddressChange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "confirmAddressChange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "confirmAddressChange"), br.com.gvt.oss.inventory.service.impl.ConfirmAddressChange.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "confirmAddressChangeResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.ConfirmAddressChangeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "confirmAddressChangeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelAddressChange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "cancelAddressChange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "cancelAddressChange"), br.com.gvt.oss.inventory.service.impl.CancelAddressChange.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "orderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "cancelAddressChangeResponse"));
        oper.setReturnClass(br.com.gvt.oss.inventory.service.impl.CancelAddressChangeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "cancelAddressChangeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateNetworkOwnerId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cnl"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "prefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sufix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "InventoryDesignatorsResponse"));
        oper.setReturnClass(com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

    }

    public InventoryImplPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public InventoryImplPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public InventoryImplPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Account");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.Account.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Address");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Designator");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.Designator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Filter");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.Filter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "InventoryAccessDesignatorResponse");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.InventoryAccessDesignatorResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "InventoryAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.InventoryAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "InventoryDesignatorsResponse");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "InventoryItemResponse");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.InventoryItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "InventoryResponse");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.InventoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Item");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "ItemKey");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.ItemKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "ItemStatus");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.ItemStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Param");
            cachedSerQNames.add(qName);
            cls = com.gvt.www.ws.eai.oss.inventory.api.Param.class;
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

    public com.gvt.www.ws.eai.oss.inventory.api.InventoryItemResponse getItem(com.gvt.www.ws.eai.oss.inventory.api.ItemKey itemKey, boolean includeHistory, boolean cascade, long[] statusList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "getItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {itemKey, new java.lang.Boolean(includeHistory), new java.lang.Boolean(cascade), statusList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.inventory.api.InventoryItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.inventory.api.InventoryItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.inventory.api.InventoryItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.inventory.api.InventoryAccountResponse getAccountItems(java.lang.String accountId, java.lang.String addressId, java.lang.String designator, java.lang.String networkOwnerId, boolean inactiveCancelled) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "getAccountItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountId, addressId, designator, networkOwnerId, new java.lang.Boolean(inactiveCancelled)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.inventory.api.InventoryAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.inventory.api.InventoryAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.inventory.api.InventoryAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.DeactivateItemResponse deactivateItem(java.lang.String orderId, long systemId, com.gvt.www.ws.eai.oss.inventory.api.ItemKey[] items, boolean cascade, boolean finalStatus, long[] statusList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderId, new java.lang.Long(systemId), items, new java.lang.Boolean(cascade), new java.lang.Boolean(finalStatus), statusList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.DeactivateItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.DeactivateItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.DeactivateItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.SuspendItemResponse suspendItem(br.com.gvt.oss.inventory.service.impl.SuspendItem parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.SuspendItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.SuspendItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.SuspendItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.GenerateAccessDesignatorResponse generateAccessDesignator(br.com.gvt.oss.inventory.service.impl.GenerateAccessDesignator parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.GenerateAccessDesignatorResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.GenerateAccessDesignatorResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.GenerateAccessDesignatorResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse getAssociatedDesignators(java.lang.String designator, com.gvt.www.ws.eai.oss.inventory.api.Filter filter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "getAssociatedDesignators"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {designator, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.ProvisionOrderResponse provisionOrder(java.lang.String orderId, long systemId, com.gvt.www.ws.eai.oss.inventory.api.Account account) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderId, new java.lang.Long(systemId), account});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.ProvisionOrderResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.ProvisionOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.ProvisionOrderResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.ReleaseAccessDesignatorResponse releaseAccessDesignator(br.com.gvt.oss.inventory.service.impl.ReleaseAccessDesignator parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.ReleaseAccessDesignatorResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.ReleaseAccessDesignatorResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.ReleaseAccessDesignatorResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.AddSubItemResponse addSubItem(br.com.gvt.oss.inventory.service.impl.AddSubItem parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.AddSubItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.AddSubItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.AddSubItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.ChangePhoneNumberResponse changePhoneNumber(br.com.gvt.oss.inventory.service.impl.ChangePhoneNumber parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.ChangePhoneNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.ChangePhoneNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.ChangePhoneNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.ChangeAccountResponse changeAccount(br.com.gvt.oss.inventory.service.impl.ChangeAccount parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.ChangeAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.ChangeAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.ChangeAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.ChangeAddressIdResponse changeAddressId(br.com.gvt.oss.inventory.service.impl.ChangeAddressId parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.ChangeAddressIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.ChangeAddressIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.ChangeAddressIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.AddItemParametersResponse addItemParameters(br.com.gvt.oss.inventory.service.impl.AddItemParameters parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.AddItemParametersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.AddItemParametersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.AddItemParametersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.ChangeItemParametersResponse changeItemParameters(br.com.gvt.oss.inventory.service.impl.ChangeItemParameters parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.ChangeItemParametersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.ChangeItemParametersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.ChangeItemParametersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.RemoveItemParametersResponse removeItemParameters(br.com.gvt.oss.inventory.service.impl.RemoveItemParameters parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.RemoveItemParametersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.RemoveItemParametersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.RemoveItemParametersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.ActivateItemResponse activateItem(br.com.gvt.oss.inventory.service.impl.ActivateItem parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.ActivateItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.ActivateItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.ActivateItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.ConfirmAddressChangeResponse confirmAddressChange(br.com.gvt.oss.inventory.service.impl.ConfirmAddressChange parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.ConfirmAddressChangeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.ConfirmAddressChangeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.ConfirmAddressChangeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.gvt.oss.inventory.service.impl.CancelAddressChangeResponse cancelAddressChange(br.com.gvt.oss.inventory.service.impl.CancelAddressChange parameters, java.lang.String orderId, long systemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "systemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, orderId, new java.lang.Long(systemId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.gvt.oss.inventory.service.impl.CancelAddressChangeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.gvt.oss.inventory.service.impl.CancelAddressChangeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.gvt.oss.inventory.service.impl.CancelAddressChangeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse generateNetworkOwnerId(java.lang.String cnl, java.lang.String prefix, java.lang.String sufix) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "generateNetworkOwnerId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cnl, prefix, sufix});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.gvt.www.ws.eai.oss.inventory.api.InventoryDesignatorsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
