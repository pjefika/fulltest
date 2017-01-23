/**
 * GetProductChildIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.getProductChild;

public class GetProductChildIn  implements java.io.Serializable {
    private java.lang.Integer idProduto;

    private java.lang.String nomeProduto;

    public GetProductChildIn() {
    }

    public GetProductChildIn(
           java.lang.Integer idProduto,
           java.lang.String nomeProduto) {
           this.idProduto = idProduto;
           this.nomeProduto = nomeProduto;
    }


    /**
     * Gets the idProduto value for this GetProductChildIn.
     * 
     * @return idProduto
     */
    public java.lang.Integer getIdProduto() {
        return idProduto;
    }


    /**
     * Sets the idProduto value for this GetProductChildIn.
     * 
     * @param idProduto
     */
    public void setIdProduto(java.lang.Integer idProduto) {
        this.idProduto = idProduto;
    }


    /**
     * Gets the nomeProduto value for this GetProductChildIn.
     * 
     * @return nomeProduto
     */
    public java.lang.String getNomeProduto() {
        return nomeProduto;
    }


    /**
     * Sets the nomeProduto value for this GetProductChildIn.
     * 
     * @param nomeProduto
     */
    public void setNomeProduto(java.lang.String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetProductChildIn)) return false;
        GetProductChildIn other = (GetProductChildIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idProduto==null && other.getIdProduto()==null) || 
             (this.idProduto!=null &&
              this.idProduto.equals(other.getIdProduto()))) &&
            ((this.nomeProduto==null && other.getNomeProduto()==null) || 
             (this.nomeProduto!=null &&
              this.nomeProduto.equals(other.getNomeProduto())));
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
        if (getIdProduto() != null) {
            _hashCode += getIdProduto().hashCode();
        }
        if (getNomeProduto() != null) {
            _hashCode += getNomeProduto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetProductChildIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "getProductChildIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "idProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "nomeProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
