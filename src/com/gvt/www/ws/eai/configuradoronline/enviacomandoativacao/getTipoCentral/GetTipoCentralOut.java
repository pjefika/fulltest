/**
 * GetTipoCentralOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.getTipoCentral;

public class GetTipoCentralOut  implements java.io.Serializable {
    /* Vai retornar qual o tipo central a instância está configurada. */
    private java.lang.String nome_switch;

    private int sucesso;

    private java.lang.String mensagem;

    public GetTipoCentralOut() {
    }

    public GetTipoCentralOut(
           java.lang.String nome_switch,
           int sucesso,
           java.lang.String mensagem) {
           this.nome_switch = nome_switch;
           this.sucesso = sucesso;
           this.mensagem = mensagem;
    }


    /**
     * Gets the nome_switch value for this GetTipoCentralOut.
     * 
     * @return nome_switch   * Vai retornar qual o tipo central a instância está configurada.
     */
    public java.lang.String getNome_switch() {
        return nome_switch;
    }


    /**
     * Sets the nome_switch value for this GetTipoCentralOut.
     * 
     * @param nome_switch   * Vai retornar qual o tipo central a instância está configurada.
     */
    public void setNome_switch(java.lang.String nome_switch) {
        this.nome_switch = nome_switch;
    }


    /**
     * Gets the sucesso value for this GetTipoCentralOut.
     * 
     * @return sucesso
     */
    public int getSucesso() {
        return sucesso;
    }


    /**
     * Sets the sucesso value for this GetTipoCentralOut.
     * 
     * @param sucesso
     */
    public void setSucesso(int sucesso) {
        this.sucesso = sucesso;
    }


    /**
     * Gets the mensagem value for this GetTipoCentralOut.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this GetTipoCentralOut.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTipoCentralOut)) return false;
        GetTipoCentralOut other = (GetTipoCentralOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome_switch==null && other.getNome_switch()==null) || 
             (this.nome_switch!=null &&
              this.nome_switch.equals(other.getNome_switch()))) &&
            this.sucesso == other.getSucesso() &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem())));
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
        if (getNome_switch() != null) {
            _hashCode += getNome_switch().hashCode();
        }
        _hashCode += getSucesso();
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTipoCentralOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/getTipoCentral", "GetTipoCentralOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome_switch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/getTipoCentral", "nome_switch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sucesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/getTipoCentral", "sucesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/getTipoCentral", "mensagem"));
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
