/**
 * ConsultarCertificacaoTranspondersOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.services;

public class ConsultarCertificacaoTranspondersOut  extends com.gvt.www.ws.eai.configuradoronline.contingent.types.ResponseStatus  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTransponders certificacao;

    public ConsultarCertificacaoTranspondersOut() {
    }

    public ConsultarCertificacaoTranspondersOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTransponders certificacao) {
        super(
            codigo,
            mensagem,
            descricao);
        this.certificacao = certificacao;
    }


    /**
     * Gets the certificacao value for this ConsultarCertificacaoTranspondersOut.
     * 
     * @return certificacao
     */
    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTransponders getCertificacao() {
        return certificacao;
    }


    /**
     * Sets the certificacao value for this ConsultarCertificacaoTranspondersOut.
     * 
     * @param certificacao
     */
    public void setCertificacao(com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTransponders certificacao) {
        this.certificacao = certificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarCertificacaoTranspondersOut)) return false;
        ConsultarCertificacaoTranspondersOut other = (ConsultarCertificacaoTranspondersOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        int _hashCode = super.hashCode();
        if (getCertificacao() != null) {
            _hashCode += getCertificacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarCertificacaoTranspondersOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarCertificacaoTranspondersOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "certificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "CertificacaoTransponders"));
        elemField.setMinOccurs(0);
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
