/**
 * ConfigurarLinhaSIPnoCPEIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.services;

public class ConfigurarLinhaSIPnoCPEIn  implements java.io.Serializable {
    private com.gvt.www.metaData.smarttool.Credenciais credencial;

    private java.lang.String designadorTurbonet;

    private int idCPE;

    private java.lang.String tipo;

    private java.lang.String serialNumber;

    public ConfigurarLinhaSIPnoCPEIn() {
    }

    public ConfigurarLinhaSIPnoCPEIn(
           com.gvt.www.metaData.smarttool.Credenciais credencial,
           java.lang.String designadorTurbonet,
           int idCPE,
           java.lang.String tipo,
           java.lang.String serialNumber) {
           this.credencial = credencial;
           this.designadorTurbonet = designadorTurbonet;
           this.idCPE = idCPE;
           this.tipo = tipo;
           this.serialNumber = serialNumber;
    }


    /**
     * Gets the credencial value for this ConfigurarLinhaSIPnoCPEIn.
     * 
     * @return credencial
     */
    public com.gvt.www.metaData.smarttool.Credenciais getCredencial() {
        return credencial;
    }


    /**
     * Sets the credencial value for this ConfigurarLinhaSIPnoCPEIn.
     * 
     * @param credencial
     */
    public void setCredencial(com.gvt.www.metaData.smarttool.Credenciais credencial) {
        this.credencial = credencial;
    }


    /**
     * Gets the designadorTurbonet value for this ConfigurarLinhaSIPnoCPEIn.
     * 
     * @return designadorTurbonet
     */
    public java.lang.String getDesignadorTurbonet() {
        return designadorTurbonet;
    }


    /**
     * Sets the designadorTurbonet value for this ConfigurarLinhaSIPnoCPEIn.
     * 
     * @param designadorTurbonet
     */
    public void setDesignadorTurbonet(java.lang.String designadorTurbonet) {
        this.designadorTurbonet = designadorTurbonet;
    }


    /**
     * Gets the idCPE value for this ConfigurarLinhaSIPnoCPEIn.
     * 
     * @return idCPE
     */
    public int getIdCPE() {
        return idCPE;
    }


    /**
     * Sets the idCPE value for this ConfigurarLinhaSIPnoCPEIn.
     * 
     * @param idCPE
     */
    public void setIdCPE(int idCPE) {
        this.idCPE = idCPE;
    }


    /**
     * Gets the tipo value for this ConfigurarLinhaSIPnoCPEIn.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this ConfigurarLinhaSIPnoCPEIn.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the serialNumber value for this ConfigurarLinhaSIPnoCPEIn.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this ConfigurarLinhaSIPnoCPEIn.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarLinhaSIPnoCPEIn)) return false;
        ConfigurarLinhaSIPnoCPEIn other = (ConfigurarLinhaSIPnoCPEIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credencial==null && other.getCredencial()==null) || 
             (this.credencial!=null &&
              this.credencial.equals(other.getCredencial()))) &&
            ((this.designadorTurbonet==null && other.getDesignadorTurbonet()==null) || 
             (this.designadorTurbonet!=null &&
              this.designadorTurbonet.equals(other.getDesignadorTurbonet()))) &&
            this.idCPE == other.getIdCPE() &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber())));
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
        if (getCredencial() != null) {
            _hashCode += getCredencial().hashCode();
        }
        if (getDesignadorTurbonet() != null) {
            _hashCode += getDesignadorTurbonet().hashCode();
        }
        _hashCode += getIdCPE();
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarLinhaSIPnoCPEIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConfigurarLinhaSIPnoCPEIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credencial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "credencial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/smarttool", "Credenciais"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTurbonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "designadorTurbonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "idCPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
