/**
 * CertificacaoTranspondersHist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.types;

public class CertificacaoTranspondersHist  implements java.io.Serializable {
    private int id;

    private java.lang.String dataCertificacao;

    private java.lang.String statusCertificacao;

    public CertificacaoTranspondersHist() {
    }

    public CertificacaoTranspondersHist(
           int id,
           java.lang.String dataCertificacao,
           java.lang.String statusCertificacao) {
           this.id = id;
           this.dataCertificacao = dataCertificacao;
           this.statusCertificacao = statusCertificacao;
    }


    /**
     * Gets the id value for this CertificacaoTranspondersHist.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CertificacaoTranspondersHist.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the dataCertificacao value for this CertificacaoTranspondersHist.
     * 
     * @return dataCertificacao
     */
    public java.lang.String getDataCertificacao() {
        return dataCertificacao;
    }


    /**
     * Sets the dataCertificacao value for this CertificacaoTranspondersHist.
     * 
     * @param dataCertificacao
     */
    public void setDataCertificacao(java.lang.String dataCertificacao) {
        this.dataCertificacao = dataCertificacao;
    }


    /**
     * Gets the statusCertificacao value for this CertificacaoTranspondersHist.
     * 
     * @return statusCertificacao
     */
    public java.lang.String getStatusCertificacao() {
        return statusCertificacao;
    }


    /**
     * Sets the statusCertificacao value for this CertificacaoTranspondersHist.
     * 
     * @param statusCertificacao
     */
    public void setStatusCertificacao(java.lang.String statusCertificacao) {
        this.statusCertificacao = statusCertificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificacaoTranspondersHist)) return false;
        CertificacaoTranspondersHist other = (CertificacaoTranspondersHist) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.dataCertificacao==null && other.getDataCertificacao()==null) || 
             (this.dataCertificacao!=null &&
              this.dataCertificacao.equals(other.getDataCertificacao()))) &&
            ((this.statusCertificacao==null && other.getStatusCertificacao()==null) || 
             (this.statusCertificacao!=null &&
              this.statusCertificacao.equals(other.getStatusCertificacao())));
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
        _hashCode += getId();
        if (getDataCertificacao() != null) {
            _hashCode += getDataCertificacao().hashCode();
        }
        if (getStatusCertificacao() != null) {
            _hashCode += getStatusCertificacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificacaoTranspondersHist.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "CertificacaoTranspondersHist"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCertificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "dataCertificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCertificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "statusCertificacao"));
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
