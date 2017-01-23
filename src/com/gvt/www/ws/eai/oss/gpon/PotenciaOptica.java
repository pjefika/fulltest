/**
 * PotenciaOptica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class PotenciaOptica  implements java.io.Serializable {
    private java.lang.String potenciaOpticaDSLAM;

    private java.lang.String potenciaOpticaReferencia;

    private com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao;

    public PotenciaOptica() {
    }

    public PotenciaOptica(
           java.lang.String potenciaOpticaDSLAM,
           java.lang.String potenciaOpticaReferencia,
           com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao) {
           this.potenciaOpticaDSLAM = potenciaOpticaDSLAM;
           this.potenciaOpticaReferencia = potenciaOpticaReferencia;
           this.certificacao = certificacao;
    }


    /**
     * Gets the potenciaOpticaDSLAM value for this PotenciaOptica.
     * 
     * @return potenciaOpticaDSLAM
     */
    public java.lang.String getPotenciaOpticaDSLAM() {
        return potenciaOpticaDSLAM;
    }


    /**
     * Sets the potenciaOpticaDSLAM value for this PotenciaOptica.
     * 
     * @param potenciaOpticaDSLAM
     */
    public void setPotenciaOpticaDSLAM(java.lang.String potenciaOpticaDSLAM) {
        this.potenciaOpticaDSLAM = potenciaOpticaDSLAM;
    }


    /**
     * Gets the potenciaOpticaReferencia value for this PotenciaOptica.
     * 
     * @return potenciaOpticaReferencia
     */
    public java.lang.String getPotenciaOpticaReferencia() {
        return potenciaOpticaReferencia;
    }


    /**
     * Sets the potenciaOpticaReferencia value for this PotenciaOptica.
     * 
     * @param potenciaOpticaReferencia
     */
    public void setPotenciaOpticaReferencia(java.lang.String potenciaOpticaReferencia) {
        this.potenciaOpticaReferencia = potenciaOpticaReferencia;
    }


    /**
     * Gets the certificacao value for this PotenciaOptica.
     * 
     * @return certificacao
     */
    public com.gvt.www.ws.eai.oss.gpon.EnumCertificacao getCertificacao() {
        return certificacao;
    }


    /**
     * Sets the certificacao value for this PotenciaOptica.
     * 
     * @param certificacao
     */
    public void setCertificacao(com.gvt.www.ws.eai.oss.gpon.EnumCertificacao certificacao) {
        this.certificacao = certificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PotenciaOptica)) return false;
        PotenciaOptica other = (PotenciaOptica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.potenciaOpticaDSLAM==null && other.getPotenciaOpticaDSLAM()==null) || 
             (this.potenciaOpticaDSLAM!=null &&
              this.potenciaOpticaDSLAM.equals(other.getPotenciaOpticaDSLAM()))) &&
            ((this.potenciaOpticaReferencia==null && other.getPotenciaOpticaReferencia()==null) || 
             (this.potenciaOpticaReferencia!=null &&
              this.potenciaOpticaReferencia.equals(other.getPotenciaOpticaReferencia()))) &&
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
        if (getPotenciaOpticaDSLAM() != null) {
            _hashCode += getPotenciaOpticaDSLAM().hashCode();
        }
        if (getPotenciaOpticaReferencia() != null) {
            _hashCode += getPotenciaOpticaReferencia().hashCode();
        }
        if (getCertificacao() != null) {
            _hashCode += getCertificacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PotenciaOptica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "PotenciaOptica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potenciaOpticaDSLAM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "potenciaOpticaDSLAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potenciaOpticaReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "potenciaOpticaReferencia"));
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
