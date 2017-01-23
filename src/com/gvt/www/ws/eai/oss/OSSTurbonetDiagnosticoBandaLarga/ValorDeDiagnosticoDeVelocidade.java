/**
 * ValorDeDiagnosticoDeVelocidade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga;

public class ValorDeDiagnosticoDeVelocidade  implements java.io.Serializable {
    private java.lang.String velocidadeConfiguradaNoDSLAM;

    private java.lang.String velocidadeDeReferencia;

    private com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao certificacao;

    public ValorDeDiagnosticoDeVelocidade() {
    }

    public ValorDeDiagnosticoDeVelocidade(
           java.lang.String velocidadeConfiguradaNoDSLAM,
           java.lang.String velocidadeDeReferencia,
           com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao certificacao) {
           this.velocidadeConfiguradaNoDSLAM = velocidadeConfiguradaNoDSLAM;
           this.velocidadeDeReferencia = velocidadeDeReferencia;
           this.certificacao = certificacao;
    }


    /**
     * Gets the velocidadeConfiguradaNoDSLAM value for this ValorDeDiagnosticoDeVelocidade.
     * 
     * @return velocidadeConfiguradaNoDSLAM
     */
    public java.lang.String getVelocidadeConfiguradaNoDSLAM() {
        return velocidadeConfiguradaNoDSLAM;
    }


    /**
     * Sets the velocidadeConfiguradaNoDSLAM value for this ValorDeDiagnosticoDeVelocidade.
     * 
     * @param velocidadeConfiguradaNoDSLAM
     */
    public void setVelocidadeConfiguradaNoDSLAM(java.lang.String velocidadeConfiguradaNoDSLAM) {
        this.velocidadeConfiguradaNoDSLAM = velocidadeConfiguradaNoDSLAM;
    }


    /**
     * Gets the velocidadeDeReferencia value for this ValorDeDiagnosticoDeVelocidade.
     * 
     * @return velocidadeDeReferencia
     */
    public java.lang.String getVelocidadeDeReferencia() {
        return velocidadeDeReferencia;
    }


    /**
     * Sets the velocidadeDeReferencia value for this ValorDeDiagnosticoDeVelocidade.
     * 
     * @param velocidadeDeReferencia
     */
    public void setVelocidadeDeReferencia(java.lang.String velocidadeDeReferencia) {
        this.velocidadeDeReferencia = velocidadeDeReferencia;
    }


    /**
     * Gets the certificacao value for this ValorDeDiagnosticoDeVelocidade.
     * 
     * @return certificacao
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao getCertificacao() {
        return certificacao;
    }


    /**
     * Sets the certificacao value for this ValorDeDiagnosticoDeVelocidade.
     * 
     * @param certificacao
     */
    public void setCertificacao(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao certificacao) {
        this.certificacao = certificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValorDeDiagnosticoDeVelocidade)) return false;
        ValorDeDiagnosticoDeVelocidade other = (ValorDeDiagnosticoDeVelocidade) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.velocidadeConfiguradaNoDSLAM==null && other.getVelocidadeConfiguradaNoDSLAM()==null) || 
             (this.velocidadeConfiguradaNoDSLAM!=null &&
              this.velocidadeConfiguradaNoDSLAM.equals(other.getVelocidadeConfiguradaNoDSLAM()))) &&
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
        if (getVelocidadeConfiguradaNoDSLAM() != null) {
            _hashCode += getVelocidadeConfiguradaNoDSLAM().hashCode();
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
        new org.apache.axis.description.TypeDesc(ValorDeDiagnosticoDeVelocidade.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnosticoDeVelocidade"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeConfiguradaNoDSLAM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "velocidadeConfiguradaNoDSLAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeDeReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "velocidadeDeReferencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "certificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "EnumCertificacao"));
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
