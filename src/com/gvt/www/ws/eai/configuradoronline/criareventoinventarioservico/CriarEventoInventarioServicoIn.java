/**
 * CriarEventoInventarioServicoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.criareventoinventarioservico;

public class CriarEventoInventarioServicoIn  implements java.io.Serializable {
    private java.lang.String chave;

    private java.lang.String tipoEvento;

    private java.lang.String valorStr;

    private java.util.Calendar valorDate;

    public CriarEventoInventarioServicoIn() {
    }

    public CriarEventoInventarioServicoIn(
           java.lang.String chave,
           java.lang.String tipoEvento,
           java.lang.String valorStr,
           java.util.Calendar valorDate) {
           this.chave = chave;
           this.tipoEvento = tipoEvento;
           this.valorStr = valorStr;
           this.valorDate = valorDate;
    }


    /**
     * Gets the chave value for this CriarEventoInventarioServicoIn.
     * 
     * @return chave
     */
    public java.lang.String getChave() {
        return chave;
    }


    /**
     * Sets the chave value for this CriarEventoInventarioServicoIn.
     * 
     * @param chave
     */
    public void setChave(java.lang.String chave) {
        this.chave = chave;
    }


    /**
     * Gets the tipoEvento value for this CriarEventoInventarioServicoIn.
     * 
     * @return tipoEvento
     */
    public java.lang.String getTipoEvento() {
        return tipoEvento;
    }


    /**
     * Sets the tipoEvento value for this CriarEventoInventarioServicoIn.
     * 
     * @param tipoEvento
     */
    public void setTipoEvento(java.lang.String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }


    /**
     * Gets the valorStr value for this CriarEventoInventarioServicoIn.
     * 
     * @return valorStr
     */
    public java.lang.String getValorStr() {
        return valorStr;
    }


    /**
     * Sets the valorStr value for this CriarEventoInventarioServicoIn.
     * 
     * @param valorStr
     */
    public void setValorStr(java.lang.String valorStr) {
        this.valorStr = valorStr;
    }


    /**
     * Gets the valorDate value for this CriarEventoInventarioServicoIn.
     * 
     * @return valorDate
     */
    public java.util.Calendar getValorDate() {
        return valorDate;
    }


    /**
     * Sets the valorDate value for this CriarEventoInventarioServicoIn.
     * 
     * @param valorDate
     */
    public void setValorDate(java.util.Calendar valorDate) {
        this.valorDate = valorDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriarEventoInventarioServicoIn)) return false;
        CriarEventoInventarioServicoIn other = (CriarEventoInventarioServicoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chave==null && other.getChave()==null) || 
             (this.chave!=null &&
              this.chave.equals(other.getChave()))) &&
            ((this.tipoEvento==null && other.getTipoEvento()==null) || 
             (this.tipoEvento!=null &&
              this.tipoEvento.equals(other.getTipoEvento()))) &&
            ((this.valorStr==null && other.getValorStr()==null) || 
             (this.valorStr!=null &&
              this.valorStr.equals(other.getValorStr()))) &&
            ((this.valorDate==null && other.getValorDate()==null) || 
             (this.valorDate!=null &&
              this.valorDate.equals(other.getValorDate())));
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
        if (getChave() != null) {
            _hashCode += getChave().hashCode();
        }
        if (getTipoEvento() != null) {
            _hashCode += getTipoEvento().hashCode();
        }
        if (getValorStr() != null) {
            _hashCode += getValorStr().hashCode();
        }
        if (getValorDate() != null) {
            _hashCode += getValorDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriarEventoInventarioServicoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criareventoinventarioservico", "CriarEventoInventarioServicoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chave");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criareventoinventarioservico", "chave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criareventoinventarioservico", "tipoEvento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorStr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criareventoinventarioservico", "valorStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criareventoinventarioservico", "valorDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
