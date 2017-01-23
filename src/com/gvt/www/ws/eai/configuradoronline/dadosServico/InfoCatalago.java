/**
 * InfoCatalago.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.dadosServico;

public class InfoCatalago  implements java.io.Serializable {
    private java.lang.Integer idCatalogoCol;

    private java.lang.Integer xGvtProdCod;

    public InfoCatalago() {
    }

    public InfoCatalago(
           java.lang.Integer idCatalogoCol,
           java.lang.Integer xGvtProdCod) {
           this.idCatalogoCol = idCatalogoCol;
           this.xGvtProdCod = xGvtProdCod;
    }


    /**
     * Gets the idCatalogoCol value for this InfoCatalago.
     * 
     * @return idCatalogoCol
     */
    public java.lang.Integer getIdCatalogoCol() {
        return idCatalogoCol;
    }


    /**
     * Sets the idCatalogoCol value for this InfoCatalago.
     * 
     * @param idCatalogoCol
     */
    public void setIdCatalogoCol(java.lang.Integer idCatalogoCol) {
        this.idCatalogoCol = idCatalogoCol;
    }


    /**
     * Gets the xGvtProdCod value for this InfoCatalago.
     * 
     * @return xGvtProdCod
     */
    public java.lang.Integer getXGvtProdCod() {
        return xGvtProdCod;
    }


    /**
     * Sets the xGvtProdCod value for this InfoCatalago.
     * 
     * @param xGvtProdCod
     */
    public void setXGvtProdCod(java.lang.Integer xGvtProdCod) {
        this.xGvtProdCod = xGvtProdCod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoCatalago)) return false;
        InfoCatalago other = (InfoCatalago) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idCatalogoCol==null && other.getIdCatalogoCol()==null) || 
             (this.idCatalogoCol!=null &&
              this.idCatalogoCol.equals(other.getIdCatalogoCol()))) &&
            ((this.xGvtProdCod==null && other.getXGvtProdCod()==null) || 
             (this.xGvtProdCod!=null &&
              this.xGvtProdCod.equals(other.getXGvtProdCod())));
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
        if (getIdCatalogoCol() != null) {
            _hashCode += getIdCatalogoCol().hashCode();
        }
        if (getXGvtProdCod() != null) {
            _hashCode += getXGvtProdCod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoCatalago.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "InfoCatalago"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCatalogoCol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "idCatalogoCol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XGvtProdCod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "xGvtProdCod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
