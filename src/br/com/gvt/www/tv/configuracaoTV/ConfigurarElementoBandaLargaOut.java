/**
 * ConfigurarElementoBandaLargaOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConfigurarElementoBandaLargaOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private int idStatusExecucao;

    private java.lang.String causa;

    public ConfigurarElementoBandaLargaOut() {
    }

    public ConfigurarElementoBandaLargaOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           int idStatusExecucao,
           java.lang.String causa) {
        super(
            codigo,
            mensagem,
            descricao);
        this.idStatusExecucao = idStatusExecucao;
        this.causa = causa;
    }


    /**
     * Gets the idStatusExecucao value for this ConfigurarElementoBandaLargaOut.
     * 
     * @return idStatusExecucao
     */
    public int getIdStatusExecucao() {
        return idStatusExecucao;
    }


    /**
     * Sets the idStatusExecucao value for this ConfigurarElementoBandaLargaOut.
     * 
     * @param idStatusExecucao
     */
    public void setIdStatusExecucao(int idStatusExecucao) {
        this.idStatusExecucao = idStatusExecucao;
    }


    /**
     * Gets the causa value for this ConfigurarElementoBandaLargaOut.
     * 
     * @return causa
     */
    public java.lang.String getCausa() {
        return causa;
    }


    /**
     * Sets the causa value for this ConfigurarElementoBandaLargaOut.
     * 
     * @param causa
     */
    public void setCausa(java.lang.String causa) {
        this.causa = causa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarElementoBandaLargaOut)) return false;
        ConfigurarElementoBandaLargaOut other = (ConfigurarElementoBandaLargaOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.idStatusExecucao == other.getIdStatusExecucao() &&
            ((this.causa==null && other.getCausa()==null) || 
             (this.causa!=null &&
              this.causa.equals(other.getCausa())));
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
        _hashCode += getIdStatusExecucao();
        if (getCausa() != null) {
            _hashCode += getCausa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarElementoBandaLargaOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoBandaLargaOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idStatusExecucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "idStatusExecucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "causa"));
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
