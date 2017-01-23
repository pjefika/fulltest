/**
 * StatusSincronismo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class StatusSincronismo  implements java.io.Serializable {
    private java.lang.String statusSincronismoDSLAM;

    private com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao;

    public StatusSincronismo() {
    }

    public StatusSincronismo(
           java.lang.String statusSincronismoDSLAM,
           com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao) {
           this.statusSincronismoDSLAM = statusSincronismoDSLAM;
           this.certificacao = certificacao;
    }


    /**
     * Gets the statusSincronismoDSLAM value for this StatusSincronismo.
     * 
     * @return statusSincronismoDSLAM
     */
    public java.lang.String getStatusSincronismoDSLAM() {
        return statusSincronismoDSLAM;
    }


    /**
     * Sets the statusSincronismoDSLAM value for this StatusSincronismo.
     * 
     * @param statusSincronismoDSLAM
     */
    public void setStatusSincronismoDSLAM(java.lang.String statusSincronismoDSLAM) {
        this.statusSincronismoDSLAM = statusSincronismoDSLAM;
    }


    /**
     * Gets the certificacao value for this StatusSincronismo.
     * 
     * @return certificacao
     */
    public com.gvt.www.ws.eai.oss.gpon.EnumCertificacao getCertificacao() {
        return certificacao;
    }


    /**
     * Sets the certificacao value for this StatusSincronismo.
     * 
     * @param certificacao
     */
    public void setCertificacao(com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao) {
        this.certificacao = certificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusSincronismo)) return false;
        StatusSincronismo other = (StatusSincronismo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusSincronismoDSLAM==null && other.getStatusSincronismoDSLAM()==null) || 
             (this.statusSincronismoDSLAM!=null &&
              this.statusSincronismoDSLAM.equals(other.getStatusSincronismoDSLAM()))) &&
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
        if (getStatusSincronismoDSLAM() != null) {
            _hashCode += getStatusSincronismoDSLAM().hashCode();
        }
        if (getCertificacao() != null) {
            _hashCode += getCertificacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusSincronismo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "StatusSincronismo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusSincronismoDSLAM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "statusSincronismoDSLAM"));
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
