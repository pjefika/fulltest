/**
 * VelocidadeDownloadUpload.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class VelocidadeDownloadUpload  implements java.io.Serializable {
    private java.lang.String velocidadeConfiguradaDSLAM;

    private java.lang.String velocidadeDeReferencia;

    private com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao;

    public VelocidadeDownloadUpload() {
    }

    public VelocidadeDownloadUpload(
           java.lang.String velocidadeConfiguradaDSLAM,
           java.lang.String velocidadeDeReferencia,
           com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao) {
           this.velocidadeConfiguradaDSLAM = velocidadeConfiguradaDSLAM;
           this.velocidadeDeReferencia = velocidadeDeReferencia;
           this.certificacao = certificacao;
    }


    /**
     * Gets the velocidadeConfiguradaDSLAM value for this VelocidadeDownloadUpload.
     * 
     * @return velocidadeConfiguradaDSLAM
     */
    public java.lang.String getVelocidadeConfiguradaDSLAM() {
        return velocidadeConfiguradaDSLAM;
    }


    /**
     * Sets the velocidadeConfiguradaDSLAM value for this VelocidadeDownloadUpload.
     * 
     * @param velocidadeConfiguradaDSLAM
     */
    public void setVelocidadeConfiguradaDSLAM(java.lang.String velocidadeConfiguradaDSLAM) {
        this.velocidadeConfiguradaDSLAM = velocidadeConfiguradaDSLAM;
    }


    /**
     * Gets the velocidadeDeReferencia value for this VelocidadeDownloadUpload.
     * 
     * @return velocidadeDeReferencia
     */
    public java.lang.String getVelocidadeDeReferencia() {
        return velocidadeDeReferencia;
    }


    /**
     * Sets the velocidadeDeReferencia value for this VelocidadeDownloadUpload.
     * 
     * @param velocidadeDeReferencia
     */
    public void setVelocidadeDeReferencia(java.lang.String velocidadeDeReferencia) {
        this.velocidadeDeReferencia = velocidadeDeReferencia;
    }


    /**
     * Gets the certificacao value for this VelocidadeDownloadUpload.
     * 
     * @return certificacao
     */
    public com.gvt.www.ws.eai.oss.gpon.EnumCertificacao getCertificacao() {
        return certificacao;
    }


    /**
     * Sets the certificacao value for this VelocidadeDownloadUpload.
     * 
     * @param certificacao
     */
    public void setCertificacao(com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao) {
        this.certificacao = certificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VelocidadeDownloadUpload)) return false;
        VelocidadeDownloadUpload other = (VelocidadeDownloadUpload) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.velocidadeConfiguradaDSLAM==null && other.getVelocidadeConfiguradaDSLAM()==null) || 
             (this.velocidadeConfiguradaDSLAM!=null &&
              this.velocidadeConfiguradaDSLAM.equals(other.getVelocidadeConfiguradaDSLAM()))) &&
            ((this.velocidadeDeReferencia==null && other.getVelocidadeDeReferencia()==null) || 
             (this.velocidadeDeReferencia!=null &&
              this.velocidadeDeReferencia.equals(other.getVelocidadeDeReferencia()))) &&
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
        if (getVelocidadeConfiguradaDSLAM() != null) {
            _hashCode += getVelocidadeConfiguradaDSLAM().hashCode();
        }
        if (getVelocidadeDeReferencia() != null) {
            _hashCode += getVelocidadeDeReferencia().hashCode();
        }
        if (getCertificacao() != null) {
            _hashCode += getCertificacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VelocidadeDownloadUpload.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "VelocidadeDownloadUpload"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeConfiguradaDSLAM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "velocidadeConfiguradaDSLAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeDeReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "velocidadeDeReferencia"));
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
