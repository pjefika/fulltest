/**
 * GetSwitchInfoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class GetSwitchInfoOut  extends com.gvt.www.uraservices.CodeMessageOut  implements java.io.Serializable {
    private boolean gpon;

    private boolean ims;

    private boolean sip;

    public GetSwitchInfoOut() {
    }

    public GetSwitchInfoOut(
           int resultCode,
           java.lang.String resultMessage,
           boolean gpon,
           boolean ims,
           boolean sip) {
        super(
            resultCode,
            resultMessage);
        this.gpon = gpon;
        this.ims = ims;
        this.sip = sip;
    }


    /**
     * Gets the gpon value for this GetSwitchInfoOut.
     * 
     * @return gpon
     */
    public boolean isGpon() {
        return gpon;
    }


    /**
     * Sets the gpon value for this GetSwitchInfoOut.
     * 
     * @param gpon
     */
    public void setGpon(boolean gpon) {
        this.gpon = gpon;
    }


    /**
     * Gets the ims value for this GetSwitchInfoOut.
     * 
     * @return ims
     */
    public boolean isIms() {
        return ims;
    }


    /**
     * Sets the ims value for this GetSwitchInfoOut.
     * 
     * @param ims
     */
    public void setIms(boolean ims) {
        this.ims = ims;
    }


    /**
     * Gets the sip value for this GetSwitchInfoOut.
     * 
     * @return sip
     */
    public boolean isSip() {
        return sip;
    }


    /**
     * Sets the sip value for this GetSwitchInfoOut.
     * 
     * @param sip
     */
    public void setSip(boolean sip) {
        this.sip = sip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSwitchInfoOut)) return false;
        GetSwitchInfoOut other = (GetSwitchInfoOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.gpon == other.isGpon() &&
            this.ims == other.isIms() &&
            this.sip == other.isSip();
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
        _hashCode += (isGpon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIms() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSip() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSwitchInfoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "getSwitchInfoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gpon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gpon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ims");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ims"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
