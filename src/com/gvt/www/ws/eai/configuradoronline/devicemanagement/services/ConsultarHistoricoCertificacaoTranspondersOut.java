/**
 * ConsultarHistoricoCertificacaoTranspondersOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.services;

public class ConsultarHistoricoCertificacaoTranspondersOut  extends com.gvt.www.ws.eai.configuradoronline.contingent.types.ResponseStatus  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTranspondersHist[] historico;

    public ConsultarHistoricoCertificacaoTranspondersOut() {
    }

    public ConsultarHistoricoCertificacaoTranspondersOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTranspondersHist[] historico) {
        super(
            codigo,
            mensagem,
            descricao);
        this.historico = historico;
    }


    /**
     * Gets the historico value for this ConsultarHistoricoCertificacaoTranspondersOut.
     * 
     * @return historico
     */
    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTranspondersHist[] getHistorico() {
        return historico;
    }


    /**
     * Sets the historico value for this ConsultarHistoricoCertificacaoTranspondersOut.
     * 
     * @param historico
     */
    public void setHistorico(com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTranspondersHist[] historico) {
        this.historico = historico;
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTranspondersHist getHistorico(int i) {
        return this.historico[i];
    }

    public void setHistorico(int i, com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.CertificacaoTranspondersHist _value) {
        this.historico[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarHistoricoCertificacaoTranspondersOut)) return false;
        ConsultarHistoricoCertificacaoTranspondersOut other = (ConsultarHistoricoCertificacaoTranspondersOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.historico==null && other.getHistorico()==null) || 
             (this.historico!=null &&
              java.util.Arrays.equals(this.historico, other.getHistorico())));
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
        if (getHistorico() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistorico());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistorico(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultarHistoricoCertificacaoTranspondersOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarHistoricoCertificacaoTranspondersOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "historico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "CertificacaoTranspondersHist"));
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
