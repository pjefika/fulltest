/**
 * VasParameterVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class VasParameterVO  implements java.io.Serializable {
    private java.lang.String paramRowId;

    private java.lang.String paramName;

    private java.lang.String paramValue;

    public VasParameterVO() {
    }

    public VasParameterVO(
           java.lang.String paramRowId,
           java.lang.String paramName,
           java.lang.String paramValue) {
           this.paramRowId = paramRowId;
           this.paramName = paramName;
           this.paramValue = paramValue;
    }


    /**
     * Gets the paramRowId value for this VasParameterVO.
     * 
     * @return paramRowId
     */
    public java.lang.String getParamRowId() {
        return paramRowId;
    }


    /**
     * Sets the paramRowId value for this VasParameterVO.
     * 
     * @param paramRowId
     */
    public void setParamRowId(java.lang.String paramRowId) {
        this.paramRowId = paramRowId;
    }


    /**
     * Gets the paramName value for this VasParameterVO.
     * 
     * @return paramName
     */
    public java.lang.String getParamName() {
        return paramName;
    }


    /**
     * Sets the paramName value for this VasParameterVO.
     * 
     * @param paramName
     */
    public void setParamName(java.lang.String paramName) {
        this.paramName = paramName;
    }


    /**
     * Gets the paramValue value for this VasParameterVO.
     * 
     * @return paramValue
     */
    public java.lang.String getParamValue() {
        return paramValue;
    }


    /**
     * Sets the paramValue value for this VasParameterVO.
     * 
     * @param paramValue
     */
    public void setParamValue(java.lang.String paramValue) {
        this.paramValue = paramValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VasParameterVO)) return false;
        VasParameterVO other = (VasParameterVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paramRowId==null && other.getParamRowId()==null) || 
             (this.paramRowId!=null &&
              this.paramRowId.equals(other.getParamRowId()))) &&
            ((this.paramName==null && other.getParamName()==null) || 
             (this.paramName!=null &&
              this.paramName.equals(other.getParamName()))) &&
            ((this.paramValue==null && other.getParamValue()==null) || 
             (this.paramValue!=null &&
              this.paramValue.equals(other.getParamValue())));
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
        if (getParamRowId() != null) {
            _hashCode += getParamRowId().hashCode();
        }
        if (getParamName() != null) {
            _hashCode += getParamName().hashCode();
        }
        if (getParamValue() != null) {
            _hashCode += getParamValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VasParameterVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "vasParameterVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramRowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramRowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramValue"));
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
