/**
 * ConsultarParametrosCPEOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.services;

public class ConsultarParametrosCPEOut  extends com.gvt.www.ws.eai.configuradoronline.contingent.types.ResponseStatus  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.DiagnosticoParam[] diagnosticos;

    private java.lang.String statusAcs;

    private int deviceId;

    public ConsultarParametrosCPEOut() {
    }

    public ConsultarParametrosCPEOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.DiagnosticoParam[] diagnosticos,
           java.lang.String statusAcs,
           int deviceId) {
        super(
            codigo,
            mensagem,
            descricao);
        this.diagnosticos = diagnosticos;
        this.statusAcs = statusAcs;
        this.deviceId = deviceId;
    }


    /**
     * Gets the diagnosticos value for this ConsultarParametrosCPEOut.
     * 
     * @return diagnosticos
     */
    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.DiagnosticoParam[] getDiagnosticos() {
        return diagnosticos;
    }


    /**
     * Sets the diagnosticos value for this ConsultarParametrosCPEOut.
     * 
     * @param diagnosticos
     */
    public void setDiagnosticos(com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.DiagnosticoParam[] diagnosticos) {
        this.diagnosticos = diagnosticos;
    }


    /**
     * Gets the statusAcs value for this ConsultarParametrosCPEOut.
     * 
     * @return statusAcs
     */
    public java.lang.String getStatusAcs() {
        return statusAcs;
    }


    /**
     * Sets the statusAcs value for this ConsultarParametrosCPEOut.
     * 
     * @param statusAcs
     */
    public void setStatusAcs(java.lang.String statusAcs) {
        this.statusAcs = statusAcs;
    }


    /**
     * Gets the deviceId value for this ConsultarParametrosCPEOut.
     * 
     * @return deviceId
     */
    public int getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this ConsultarParametrosCPEOut.
     * 
     * @param deviceId
     */
    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarParametrosCPEOut)) return false;
        ConsultarParametrosCPEOut other = (ConsultarParametrosCPEOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diagnosticos==null && other.getDiagnosticos()==null) || 
             (this.diagnosticos!=null &&
              java.util.Arrays.equals(this.diagnosticos, other.getDiagnosticos()))) &&
            ((this.statusAcs==null && other.getStatusAcs()==null) || 
             (this.statusAcs!=null &&
              this.statusAcs.equals(other.getStatusAcs()))) &&
            this.deviceId == other.getDeviceId();
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
        if (getDiagnosticos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiagnosticos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiagnosticos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatusAcs() != null) {
            _hashCode += getStatusAcs().hashCode();
        }
        _hashCode += getDeviceId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarParametrosCPEOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "consultarParametrosCPEOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "diagnosticos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "DiagnosticoParam"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "params"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusAcs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "statusAcs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
