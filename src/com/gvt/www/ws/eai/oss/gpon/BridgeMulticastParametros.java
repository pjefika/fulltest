/**
 * BridgeMulticastParametros.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class BridgeMulticastParametros  implements java.io.Serializable {
    private java.lang.String bridge;

    private java.lang.String parametros;

    private com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao;

    public BridgeMulticastParametros() {
    }

    public BridgeMulticastParametros(
           java.lang.String bridge,
           java.lang.String parametros,
           com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao) {
           this.bridge = bridge;
           this.parametros = parametros;
           this.certificacao = certificacao;
    }


    /**
     * Gets the bridge value for this BridgeMulticastParametros.
     * 
     * @return bridge
     */
    public java.lang.String getBridge() {
        return bridge;
    }


    /**
     * Sets the bridge value for this BridgeMulticastParametros.
     * 
     * @param bridge
     */
    public void setBridge(java.lang.String bridge) {
        this.bridge = bridge;
    }


    /**
     * Gets the parametros value for this BridgeMulticastParametros.
     * 
     * @return parametros
     */
    public java.lang.String getParametros() {
        return parametros;
    }


    /**
     * Sets the parametros value for this BridgeMulticastParametros.
     * 
     * @param parametros
     */
    public void setParametros(java.lang.String parametros) {
        this.parametros = parametros;
    }


    /**
     * Gets the certificacao value for this BridgeMulticastParametros.
     * 
     * @return certificacao
     */
    public com.gvt.www.ws.eai.oss.gpon.EnumCertificacao getCertificacao() {
        return certificacao;
    }


    /**
     * Sets the certificacao value for this BridgeMulticastParametros.
     * 
     * @param certificacao
     */
    public void setCertificacao(com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao) {
        this.certificacao = certificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BridgeMulticastParametros)) return false;
        BridgeMulticastParametros other = (BridgeMulticastParametros) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bridge==null && other.getBridge()==null) || 
             (this.bridge!=null &&
              this.bridge.equals(other.getBridge()))) &&
            ((this.parametros==null && other.getParametros()==null) || 
             (this.parametros!=null &&
              this.parametros.equals(other.getParametros()))) &&
            ((this.certificacao==null && other.getCertificacao()==null) || 
             (this.certificacao!=null &&
              this.certificacao.equals(other.getCertificacao())));
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
        if (getBridge() != null) {
            _hashCode += getBridge().hashCode();
        }
        if (getParametros() != null) {
            _hashCode += getParametros().hashCode();
        }
        if (getCertificacao() != null) {
            _hashCode += getCertificacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BridgeMulticastParametros.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeMulticastParametros"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "bridge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "parametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "certificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "EnumCertificacao"));
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
