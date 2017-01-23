/**
 * DadosArea.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosArea  implements java.io.Serializable {
    private java.lang.String codigoArea;

    private java.lang.String descricaoArea;

    public DadosArea() {
    }

    public DadosArea(
           java.lang.String codigoArea,
           java.lang.String descricaoArea) {
           this.codigoArea = codigoArea;
           this.descricaoArea = descricaoArea;
    }


    /**
     * Gets the codigoArea value for this DadosArea.
     * 
     * @return codigoArea
     */
    public java.lang.String getCodigoArea() {
        return codigoArea;
    }


    /**
     * Sets the codigoArea value for this DadosArea.
     * 
     * @param codigoArea
     */
    public void setCodigoArea(java.lang.String codigoArea) {
        this.codigoArea = codigoArea;
    }


    /**
     * Gets the descricaoArea value for this DadosArea.
     * 
     * @return descricaoArea
     */
    public java.lang.String getDescricaoArea() {
        return descricaoArea;
    }


    /**
     * Sets the descricaoArea value for this DadosArea.
     * 
     * @param descricaoArea
     */
    public void setDescricaoArea(java.lang.String descricaoArea) {
        this.descricaoArea = descricaoArea;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosArea)) return false;
        DadosArea other = (DadosArea) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoArea==null && other.getCodigoArea()==null) || 
             (this.codigoArea!=null &&
              this.codigoArea.equals(other.getCodigoArea()))) &&
            ((this.descricaoArea==null && other.getDescricaoArea()==null) || 
             (this.descricaoArea!=null &&
              this.descricaoArea.equals(other.getDescricaoArea())));
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
        if (getCodigoArea() != null) {
            _hashCode += getCodigoArea().hashCode();
        }
        if (getDescricaoArea() != null) {
            _hashCode += getDescricaoArea().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosArea.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosArea"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "codigoArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "descricaoArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
