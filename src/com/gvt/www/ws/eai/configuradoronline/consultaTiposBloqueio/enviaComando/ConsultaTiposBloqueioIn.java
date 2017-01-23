/**
 * ConsultaTiposBloqueioIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.consultaTiposBloqueio.enviaComando;

public class ConsultaTiposBloqueioIn  implements java.io.Serializable {
    private com.gvt.www.metaData.configuradoronline.TipoComando codigoTipo;

    private java.lang.String codigoArea;

    private java.lang.String codigoProcesso;

    private com.gvt.www.metaData.configuradoronline.TipoServico tipoServico;

    public ConsultaTiposBloqueioIn() {
    }

    public ConsultaTiposBloqueioIn(
           com.gvt.www.metaData.configuradoronline.TipoComando codigoTipo,
           java.lang.String codigoArea,
           java.lang.String codigoProcesso,
           com.gvt.www.metaData.configuradoronline.TipoServico tipoServico) {
           this.codigoTipo = codigoTipo;
           this.codigoArea = codigoArea;
           this.codigoProcesso = codigoProcesso;
           this.tipoServico = tipoServico;
    }


    /**
     * Gets the codigoTipo value for this ConsultaTiposBloqueioIn.
     * 
     * @return codigoTipo
     */
    public com.gvt.www.metaData.configuradoronline.TipoComando getCodigoTipo() {
        return codigoTipo;
    }


    /**
     * Sets the codigoTipo value for this ConsultaTiposBloqueioIn.
     * 
     * @param codigoTipo
     */
    public void setCodigoTipo(com.gvt.www.metaData.configuradoronline.TipoComando codigoTipo) {
        this.codigoTipo = codigoTipo;
    }


    /**
     * Gets the codigoArea value for this ConsultaTiposBloqueioIn.
     * 
     * @return codigoArea
     */
    public java.lang.String getCodigoArea() {
        return codigoArea;
    }


    /**
     * Sets the codigoArea value for this ConsultaTiposBloqueioIn.
     * 
     * @param codigoArea
     */
    public void setCodigoArea(java.lang.String codigoArea) {
        this.codigoArea = codigoArea;
    }


    /**
     * Gets the codigoProcesso value for this ConsultaTiposBloqueioIn.
     * 
     * @return codigoProcesso
     */
    public java.lang.String getCodigoProcesso() {
        return codigoProcesso;
    }


    /**
     * Sets the codigoProcesso value for this ConsultaTiposBloqueioIn.
     * 
     * @param codigoProcesso
     */
    public void setCodigoProcesso(java.lang.String codigoProcesso) {
        this.codigoProcesso = codigoProcesso;
    }


    /**
     * Gets the tipoServico value for this ConsultaTiposBloqueioIn.
     * 
     * @return tipoServico
     */
    public com.gvt.www.metaData.configuradoronline.TipoServico getTipoServico() {
        return tipoServico;
    }


    /**
     * Sets the tipoServico value for this ConsultaTiposBloqueioIn.
     * 
     * @param tipoServico
     */
    public void setTipoServico(com.gvt.www.metaData.configuradoronline.TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaTiposBloqueioIn)) return false;
        ConsultaTiposBloqueioIn other = (ConsultaTiposBloqueioIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoTipo==null && other.getCodigoTipo()==null) || 
             (this.codigoTipo!=null &&
              this.codigoTipo.equals(other.getCodigoTipo()))) &&
            ((this.codigoArea==null && other.getCodigoArea()==null) || 
             (this.codigoArea!=null &&
              this.codigoArea.equals(other.getCodigoArea()))) &&
            ((this.codigoProcesso==null && other.getCodigoProcesso()==null) || 
             (this.codigoProcesso!=null &&
              this.codigoProcesso.equals(other.getCodigoProcesso()))) &&
            ((this.tipoServico==null && other.getTipoServico()==null) || 
             (this.tipoServico!=null &&
              this.tipoServico.equals(other.getTipoServico())));
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
        if (getCodigoTipo() != null) {
            _hashCode += getCodigoTipo().hashCode();
        }
        if (getCodigoArea() != null) {
            _hashCode += getCodigoArea().hashCode();
        }
        if (getCodigoProcesso() != null) {
            _hashCode += getCodigoProcesso().hashCode();
        }
        if (getTipoServico() != null) {
            _hashCode += getTipoServico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaTiposBloqueioIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "ConsultaTiposBloqueioIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "codigoTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "TipoComando"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "codigoArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoProcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "codigoProcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaTiposBloqueio/enviaComando", "tipoServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "TipoServico"));
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
