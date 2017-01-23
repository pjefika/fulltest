/**
 * DadosComandoAtivacaoConfigLinha.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosComandoAtivacaoConfigLinha  extends com.gvt.www.metaData.configuradoronline.DadosComandoAtivacao  implements java.io.Serializable {
    private java.lang.String clliCode;

    private com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoService[] services;

    public DadosComandoAtivacaoConfigLinha() {
    }

    public DadosComandoAtivacaoConfigLinha(
           long id,
           java.lang.String clliCode,
           com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoService[] services) {
        super(
            id);
        this.clliCode = clliCode;
        this.services = services;
    }


    /**
     * Gets the clliCode value for this DadosComandoAtivacaoConfigLinha.
     * 
     * @return clliCode
     */
    public java.lang.String getClliCode() {
        return clliCode;
    }


    /**
     * Sets the clliCode value for this DadosComandoAtivacaoConfigLinha.
     * 
     * @param clliCode
     */
    public void setClliCode(java.lang.String clliCode) {
        this.clliCode = clliCode;
    }


    /**
     * Gets the services value for this DadosComandoAtivacaoConfigLinha.
     * 
     * @return services
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoService[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this DadosComandoAtivacaoConfigLinha.
     * 
     * @param services
     */
    public void setServices(com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoService[] services) {
        this.services = services;
    }

    public com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoService getServices(int i) {
        return this.services[i];
    }

    public void setServices(int i, com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoService _value) {
        this.services[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosComandoAtivacaoConfigLinha)) return false;
        DadosComandoAtivacaoConfigLinha other = (DadosComandoAtivacaoConfigLinha) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.clliCode==null && other.getClliCode()==null) || 
             (this.clliCode!=null &&
              this.clliCode.equals(other.getClliCode()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getClliCode() != null) {
            _hashCode += getClliCode().hashCode();
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
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
        new org.apache.axis.description.TypeDesc(DadosComandoAtivacaoConfigLinha.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoConfigLinha"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clliCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "clliCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoService"));
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
