/**
 * EquipmentSimulateGponIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class EquipmentSimulateGponIn  implements java.io.Serializable {
    private java.lang.String clliCode;

    private java.lang.String level1Splitter;

    public EquipmentSimulateGponIn() {
    }

    public EquipmentSimulateGponIn(
           java.lang.String clliCode,
           java.lang.String level1Splitter) {
           this.clliCode = clliCode;
           this.level1Splitter = level1Splitter;
    }


    /**
     * Gets the clliCode value for this EquipmentSimulateGponIn.
     * 
     * @return clliCode
     */
    public java.lang.String getClliCode() {
        return clliCode;
    }


    /**
     * Sets the clliCode value for this EquipmentSimulateGponIn.
     * 
     * @param clliCode
     */
    public void setClliCode(java.lang.String clliCode) {
        this.clliCode = clliCode;
    }


    /**
     * Gets the level1Splitter value for this EquipmentSimulateGponIn.
     * 
     * @return level1Splitter
     */
    public java.lang.String getLevel1Splitter() {
        return level1Splitter;
    }


    /**
     * Sets the level1Splitter value for this EquipmentSimulateGponIn.
     * 
     * @param level1Splitter
     */
    public void setLevel1Splitter(java.lang.String level1Splitter) {
        this.level1Splitter = level1Splitter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EquipmentSimulateGponIn)) return false;
        EquipmentSimulateGponIn other = (EquipmentSimulateGponIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clliCode==null && other.getClliCode()==null) || 
             (this.clliCode!=null &&
              this.clliCode.equals(other.getClliCode()))) &&
            ((this.level1Splitter==null && other.getLevel1Splitter()==null) || 
             (this.level1Splitter!=null &&
              this.level1Splitter.equals(other.getLevel1Splitter())));
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
        if (getClliCode() != null) {
            _hashCode += getClliCode().hashCode();
        }
        if (getLevel1Splitter() != null) {
            _hashCode += getLevel1Splitter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EquipmentSimulateGponIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "EquipmentSimulateGponIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clliCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "clliCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level1Splitter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "level1Splitter"));
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
