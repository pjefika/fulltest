/**
 * ValorDeDiagnostico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga;

public class ValorDeDiagnostico  implements java.io.Serializable {
    private java.lang.String valorAtual;

    private java.lang.String valorReferencia;

    private java.lang.String valorReferencia2;

    /* O valor do diagnóstico é baseado em três
     *                 		categorias: - OK - o diagnóstico para a medida
     *                 		em questão está correto ou adequado; - NOK - o
     *                 		diagnóstico para a medida em questão NÃO está
     *                 		correto ou adequado; - ND - não foi possível
     *                 		aferir o valor para a medida em questão. */
    private com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao certificacao;

    public ValorDeDiagnostico() {
    }

    public ValorDeDiagnostico(
           java.lang.String valorAtual,
           java.lang.String valorReferencia,
           java.lang.String valorReferencia2,
           com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao certificacao) {
           this.valorAtual = valorAtual;
           this.valorReferencia = valorReferencia;
           this.valorReferencia2 = valorReferencia2;
           this.certificacao = certificacao;
    }


    /**
     * Gets the valorAtual value for this ValorDeDiagnostico.
     * 
     * @return valorAtual
     */
    public java.lang.String getValorAtual() {
        return valorAtual;
    }


    /**
     * Sets the valorAtual value for this ValorDeDiagnostico.
     * 
     * @param valorAtual
     */
    public void setValorAtual(java.lang.String valorAtual) {
        this.valorAtual = valorAtual;
    }


    /**
     * Gets the valorReferencia value for this ValorDeDiagnostico.
     * 
     * @return valorReferencia
     */
    public java.lang.String getValorReferencia() {
        return valorReferencia;
    }


    /**
     * Sets the valorReferencia value for this ValorDeDiagnostico.
     * 
     * @param valorReferencia
     */
    public void setValorReferencia(java.lang.String valorReferencia) {
        this.valorReferencia = valorReferencia;
    }


    /**
     * Gets the valorReferencia2 value for this ValorDeDiagnostico.
     * 
     * @return valorReferencia2
     */
    public java.lang.String getValorReferencia2() {
        return valorReferencia2;
    }


    /**
     * Sets the valorReferencia2 value for this ValorDeDiagnostico.
     * 
     * @param valorReferencia2
     */
    public void setValorReferencia2(java.lang.String valorReferencia2) {
        this.valorReferencia2 = valorReferencia2;
    }


    /**
     * Gets the certificacao value for this ValorDeDiagnostico.
     * 
     * @return certificacao   * O valor do diagnóstico é baseado em três
     *                 		categorias: - OK - o diagnóstico para a medida
     *                 		em questão está correto ou adequado; - NOK - o
     *                 		diagnóstico para a medida em questão NÃO está
     *                 		correto ou adequado; - ND - não foi possível
     *                 		aferir o valor para a medida em questão.
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao getCertificacao() {
        return certificacao;
    }


    /**
     * Sets the certificacao value for this ValorDeDiagnostico.
     * 
     * @param certificacao   * O valor do diagnóstico é baseado em três
     *                 		categorias: - OK - o diagnóstico para a medida
     *                 		em questão está correto ou adequado; - NOK - o
     *                 		diagnóstico para a medida em questão NÃO está
     *                 		correto ou adequado; - ND - não foi possível
     *                 		aferir o valor para a medida em questão.
     */
    public void setCertificacao(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.EnumCertificacao certificacao) {
        this.certificacao = certificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValorDeDiagnostico)) return false;
        ValorDeDiagnostico other = (ValorDeDiagnostico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.valorAtual==null && other.getValorAtual()==null) || 
             (this.valorAtual!=null &&
              this.valorAtual.equals(other.getValorAtual()))) &&
            ((this.valorReferencia==null && other.getValorReferencia()==null) || 
             (this.valorReferencia!=null &&
              this.valorReferencia.equals(other.getValorReferencia()))) &&
            ((this.valorReferencia2==null && other.getValorReferencia2()==null) || 
             (this.valorReferencia2!=null &&
              this.valorReferencia2.equals(other.getValorReferencia2()))) &&
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
        if (getValorAtual() != null) {
            _hashCode += getValorAtual().hashCode();
        }
        if (getValorReferencia() != null) {
            _hashCode += getValorReferencia().hashCode();
        }
        if (getValorReferencia2() != null) {
            _hashCode += getValorReferencia2().hashCode();
        }
        if (getCertificacao() != null) {
            _hashCode += getCertificacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValorDeDiagnostico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnostico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorAtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "valorAtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "valorReferencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorReferencia2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "valorReferencia2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
