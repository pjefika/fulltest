/**
 * ValorDeDiagnosticoRadius.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga;

public class ValorDeDiagnosticoRadius  implements java.io.Serializable {
    private java.lang.String perfilRadius;

    /* O valor de TRUE indica que o perfil é
     * 						rastreador. O valor de FALSE indica que o perfil
     * 						NÃO é rastreador. O perfil definido no Radius é
     * 						informado no campo perfilRadius. */
    private boolean ehRastredor;

    private java.lang.String velocidadeProfileRadius;

    private com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao certificacao;

    public ValorDeDiagnosticoRadius() {
    }

    public ValorDeDiagnosticoRadius(
           java.lang.String perfilRadius,
           boolean ehRastredor,
           java.lang.String velocidadeProfileRadius,
           com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao certificacao) {
           this.perfilRadius = perfilRadius;
           this.ehRastredor = ehRastredor;
           this.velocidadeProfileRadius = velocidadeProfileRadius;
           this.certificacao = certificacao;
    }


    /**
     * Gets the perfilRadius value for this ValorDeDiagnosticoRadius.
     * 
     * @return perfilRadius
     */
    public java.lang.String getPerfilRadius() {
        return perfilRadius;
    }


    /**
     * Sets the perfilRadius value for this ValorDeDiagnosticoRadius.
     * 
     * @param perfilRadius
     */
    public void setPerfilRadius(java.lang.String perfilRadius) {
        this.perfilRadius = perfilRadius;
    }


    /**
     * Gets the ehRastredor value for this ValorDeDiagnosticoRadius.
     * 
     * @return ehRastredor   * O valor de TRUE indica que o perfil é
     * 						rastreador. O valor de FALSE indica que o perfil
     * 						NÃO é rastreador. O perfil definido no Radius é
     * 						informado no campo perfilRadius.
     */
    public boolean isEhRastredor() {
        return ehRastredor;
    }


    /**
     * Sets the ehRastredor value for this ValorDeDiagnosticoRadius.
     * 
     * @param ehRastredor   * O valor de TRUE indica que o perfil é
     * 						rastreador. O valor de FALSE indica que o perfil
     * 						NÃO é rastreador. O perfil definido no Radius é
     * 						informado no campo perfilRadius.
     */
    public void setEhRastredor(boolean ehRastredor) {
        this.ehRastredor = ehRastredor;
    }


    /**
     * Gets the velocidadeProfileRadius value for this ValorDeDiagnosticoRadius.
     * 
     * @return velocidadeProfileRadius
     */
    public java.lang.String getVelocidadeProfileRadius() {
        return velocidadeProfileRadius;
    }


    /**
     * Sets the velocidadeProfileRadius value for this ValorDeDiagnosticoRadius.
     * 
     * @param velocidadeProfileRadius
     */
    public void setVelocidadeProfileRadius(java.lang.String velocidadeProfileRadius) {
        this.velocidadeProfileRadius = velocidadeProfileRadius;
    }


    /**
     * Gets the certificacao value for this ValorDeDiagnosticoRadius.
     * 
     * @return certificacao
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao getCertificacao() {
        return certificacao;
    }


    /**
     * Sets the certificacao value for this ValorDeDiagnosticoRadius.
     * 
     * @param certificacao
     */
    public void setCertificacao(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao certificacao) {
        this.certificacao = certificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValorDeDiagnosticoRadius)) return false;
        ValorDeDiagnosticoRadius other = (ValorDeDiagnosticoRadius) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.perfilRadius==null && other.getPerfilRadius()==null) || 
             (this.perfilRadius!=null &&
              this.perfilRadius.equals(other.getPerfilRadius()))) &&
            this.ehRastredor == other.isEhRastredor() &&
            ((this.velocidadeProfileRadius==null && other.getVelocidadeProfileRadius()==null) || 
             (this.velocidadeProfileRadius!=null &&
              this.velocidadeProfileRadius.equals(other.getVelocidadeProfileRadius()))) &&
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
        if (getPerfilRadius() != null) {
            _hashCode += getPerfilRadius().hashCode();
        }
        _hashCode += (isEhRastredor() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVelocidadeProfileRadius() != null) {
            _hashCode += getVelocidadeProfileRadius().hashCode();
        }
        if (getCertificacao() != null) {
            _hashCode += getCertificacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValorDeDiagnosticoRadius.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnosticoRadius"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfilRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "perfilRadius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ehRastredor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ehRastredor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeProfileRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "velocidadeProfileRadius"));
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
