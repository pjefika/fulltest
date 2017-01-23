/**
 * DadosComandoAtivacaoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosComandoAtivacaoService  implements java.io.Serializable {
    private int itemCode;

    private java.lang.String status;

    private com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoServiceParam[] serviceParams;

    public DadosComandoAtivacaoService() {
    }

    public DadosComandoAtivacaoService(
           int itemCode,
           java.lang.String status,
           com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoServiceParam[] serviceParams) {
           this.itemCode = itemCode;
           this.status = status;
           this.serviceParams = serviceParams;
    }


    /**
     * Gets the itemCode value for this DadosComandoAtivacaoService.
     * 
     * @return itemCode
     */
    public int getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this DadosComandoAtivacaoService.
     * 
     * @param itemCode
     */
    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the status value for this DadosComandoAtivacaoService.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DadosComandoAtivacaoService.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the serviceParams value for this DadosComandoAtivacaoService.
     * 
     * @return serviceParams
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoServiceParam[] getServiceParams() {
        return serviceParams;
    }


    /**
     * Sets the serviceParams value for this DadosComandoAtivacaoService.
     * 
     * @param serviceParams
     */
    public void setServiceParams(com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoServiceParam[] serviceParams) {
        this.serviceParams = serviceParams;
    }

    public com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoServiceParam getServiceParams(int i) {
        return this.serviceParams[i];
    }

    public void setServiceParams(int i, com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoServiceParam _value) {
        this.serviceParams[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosComandoAtivacaoService)) return false;
        DadosComandoAtivacaoService other = (DadosComandoAtivacaoService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemCode == other.getItemCode() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.serviceParams==null && other.getServiceParams()==null) || 
             (this.serviceParams!=null &&
              java.util.Arrays.equals(this.serviceParams, other.getServiceParams())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getItemCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getServiceParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosComandoAtivacaoService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "itemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceParams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "serviceParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoServiceParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
