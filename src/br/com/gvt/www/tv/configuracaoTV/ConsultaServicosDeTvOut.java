/**
 * ConsultaServicosDeTvOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultaServicosDeTvOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private br.com.gvt.www.tv.configuracaoTV.InformacaoBandaLarga informacaoBandaLarga;

    private br.com.gvt.www.tv.configuracaoTV.InformacaoTV informacaoTV;

    public ConsultaServicosDeTvOut() {
    }

    public ConsultaServicosDeTvOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           br.com.gvt.www.tv.configuracaoTV.InformacaoBandaLarga informacaoBandaLarga,
           br.com.gvt.www.tv.configuracaoTV.InformacaoTV informacaoTV) {
        super(
            codigo,
            mensagem,
            descricao);
        this.informacaoBandaLarga = informacaoBandaLarga;
        this.informacaoTV = informacaoTV;
    }


    /**
     * Gets the informacaoBandaLarga value for this ConsultaServicosDeTvOut.
     * 
     * @return informacaoBandaLarga
     */
    public br.com.gvt.www.tv.configuracaoTV.InformacaoBandaLarga getInformacaoBandaLarga() {
        return informacaoBandaLarga;
    }


    /**
     * Sets the informacaoBandaLarga value for this ConsultaServicosDeTvOut.
     * 
     * @param informacaoBandaLarga
     */
    public void setInformacaoBandaLarga(br.com.gvt.www.tv.configuracaoTV.InformacaoBandaLarga informacaoBandaLarga) {
        this.informacaoBandaLarga = informacaoBandaLarga;
    }


    /**
     * Gets the informacaoTV value for this ConsultaServicosDeTvOut.
     * 
     * @return informacaoTV
     */
    public br.com.gvt.www.tv.configuracaoTV.InformacaoTV getInformacaoTV() {
        return informacaoTV;
    }


    /**
     * Sets the informacaoTV value for this ConsultaServicosDeTvOut.
     * 
     * @param informacaoTV
     */
    public void setInformacaoTV(br.com.gvt.www.tv.configuracaoTV.InformacaoTV informacaoTV) {
        this.informacaoTV = informacaoTV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaServicosDeTvOut)) return false;
        ConsultaServicosDeTvOut other = (ConsultaServicosDeTvOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.informacaoBandaLarga==null && other.getInformacaoBandaLarga()==null) || 
             (this.informacaoBandaLarga!=null &&
              this.informacaoBandaLarga.equals(other.getInformacaoBandaLarga()))) &&
            ((this.informacaoTV==null && other.getInformacaoTV()==null) || 
             (this.informacaoTV!=null &&
              this.informacaoTV.equals(other.getInformacaoTV())));
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
        if (getInformacaoBandaLarga() != null) {
            _hashCode += getInformacaoBandaLarga().hashCode();
        }
        if (getInformacaoTV() != null) {
            _hashCode += getInformacaoTV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaServicosDeTvOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultaServicosDeTvOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacaoBandaLarga");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "informacaoBandaLarga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "InformacaoBandaLarga"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacaoTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "informacaoTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "InformacaoTV"));
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
