/**
 * ItemKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.inventory.api;

public class ItemKey  implements java.io.Serializable {
    private java.lang.Integer specId;

    private java.lang.String designatorKey;

    public ItemKey() {
    }

    public ItemKey(
           java.lang.Integer specId,
           java.lang.String designatorKey) {
           this.specId = specId;
           this.designatorKey = designatorKey;
    }


    /**
     * Gets the specId value for this ItemKey.
     * 
     * @return specId
     */
    public java.lang.Integer getSpecId() {
        return specId;
    }


    /**
     * Sets the specId value for this ItemKey.
     * 
     * @param specId
     */
    public void setSpecId(java.lang.Integer specId) {
        this.specId = specId;
    }


    /**
     * Gets the designatorKey value for this ItemKey.
     * 
     * @return designatorKey
     */
    public java.lang.String getDesignatorKey() {
        return designatorKey;
    }


    /**
     * Sets the designatorKey value for this ItemKey.
     * 
     * @param designatorKey
     */
    public void setDesignatorKey(java.lang.String designatorKey) {
        this.designatorKey = designatorKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemKey)) return false;
        ItemKey other = (ItemKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.specId==null && other.getSpecId()==null) || 
             (this.specId!=null &&
              this.specId.equals(other.getSpecId()))) &&
            ((this.designatorKey==null && other.getDesignatorKey()==null) || 
             (this.designatorKey!=null &&
              this.designatorKey.equals(other.getDesignatorKey())));
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
        if (getSpecId() != null) {
            _hashCode += getSpecId().hashCode();
        }
        if (getDesignatorKey() != null) {
            _hashCode += getDesignatorKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "ItemKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "specId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designatorKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "designatorKey"));
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
