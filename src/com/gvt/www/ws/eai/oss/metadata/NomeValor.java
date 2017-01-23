/**
 * NomeValor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.metadata;

public class NomeValor  implements java.io.Serializable {
    private java.lang.String nameparam;

    private java.lang.String valueparam;

    public NomeValor() {
    }

    public NomeValor(
           java.lang.String nameparam,
           java.lang.String valueparam) {
           this.nameparam = nameparam;
           this.valueparam = valueparam;
    }


    /**
     * Gets the nameparam value for this NomeValor.
     * 
     * @return nameparam
     */
    public java.lang.String getNameparam() {
        return nameparam;
    }


    /**
     * Sets the nameparam value for this NomeValor.
     * 
     * @param nameparam
     */
    public void setNameparam(java.lang.String nameparam) {
        this.nameparam = nameparam;
    }


    /**
     * Gets the valueparam value for this NomeValor.
     * 
     * @return valueparam
     */
    public java.lang.String getValueparam() {
        return valueparam;
    }


    /**
     * Sets the valueparam value for this NomeValor.
     * 
     * @param valueparam
     */
    public void setValueparam(java.lang.String valueparam) {
        this.valueparam = valueparam;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NomeValor)) return false;
        NomeValor other = (NomeValor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nameparam==null && other.getNameparam()==null) || 
             (this.nameparam!=null &&
              this.nameparam.equals(other.getNameparam()))) &&
            ((this.valueparam==null && other.getValueparam()==null) || 
             (this.valueparam!=null &&
              this.valueparam.equals(other.getValueparam())));
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
        if (getNameparam() != null) {
            _hashCode += getNameparam().hashCode();
        }
        if (getValueparam() != null) {
            _hashCode += getValueparam().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NomeValor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/metadata", "NomeValor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameparam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/metadata", "nameparam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueparam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/metadata", "valueparam"));
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
