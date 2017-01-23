/**
 * RetornoAlterarVelocidade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class RetornoAlterarVelocidade  implements java.io.Serializable {
    private java.lang.String nomeOperacao;

    private boolean sucesso;

    private java.lang.String mensagemRetorno;

    public RetornoAlterarVelocidade() {
    }

    public RetornoAlterarVelocidade(
           java.lang.String nomeOperacao,
           boolean sucesso,
           java.lang.String mensagemRetorno) {
           this.nomeOperacao = nomeOperacao;
           this.sucesso = sucesso;
           this.mensagemRetorno = mensagemRetorno;
    }


    /**
     * Gets the nomeOperacao value for this RetornoAlterarVelocidade.
     * 
     * @return nomeOperacao
     */
    public java.lang.String getNomeOperacao() {
        return nomeOperacao;
    }


    /**
     * Sets the nomeOperacao value for this RetornoAlterarVelocidade.
     * 
     * @param nomeOperacao
     */
    public void setNomeOperacao(java.lang.String nomeOperacao) {
        this.nomeOperacao = nomeOperacao;
    }


    /**
     * Gets the sucesso value for this RetornoAlterarVelocidade.
     * 
     * @return sucesso
     */
    public boolean isSucesso() {
        return sucesso;
    }


    /**
     * Sets the sucesso value for this RetornoAlterarVelocidade.
     * 
     * @param sucesso
     */
    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }


    /**
     * Gets the mensagemRetorno value for this RetornoAlterarVelocidade.
     * 
     * @return mensagemRetorno
     */
    public java.lang.String getMensagemRetorno() {
        return mensagemRetorno;
    }


    /**
     * Sets the mensagemRetorno value for this RetornoAlterarVelocidade.
     * 
     * @param mensagemRetorno
     */
    public void setMensagemRetorno(java.lang.String mensagemRetorno) {
        this.mensagemRetorno = mensagemRetorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoAlterarVelocidade)) return false;
        RetornoAlterarVelocidade other = (RetornoAlterarVelocidade) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomeOperacao==null && other.getNomeOperacao()==null) || 
             (this.nomeOperacao!=null &&
              this.nomeOperacao.equals(other.getNomeOperacao()))) &&
            this.sucesso == other.isSucesso() &&
            ((this.mensagemRetorno==null && other.getMensagemRetorno()==null) || 
             (this.mensagemRetorno!=null &&
              this.mensagemRetorno.equals(other.getMensagemRetorno())));
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
        if (getNomeOperacao() != null) {
            _hashCode += getNomeOperacao().hashCode();
        }
        _hashCode += (isSucesso() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMensagemRetorno() != null) {
            _hashCode += getMensagemRetorno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoAlterarVelocidade.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "RetornoAlterarVelocidade"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "nomeOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sucesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "sucesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "mensagemRetorno"));
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
