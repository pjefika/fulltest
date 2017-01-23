/**
 * VasElementVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class VasElementVO  implements java.io.Serializable {
    private java.lang.String elementRowId;

    private java.lang.String gvtProdCode;

    private com.gvt.www.uraservices.VasParameterVO[] parameters;

    public VasElementVO() {
    }

    public VasElementVO(
           java.lang.String elementRowId,
           java.lang.String gvtProdCode,
           com.gvt.www.uraservices.VasParameterVO[] parameters) {
           this.elementRowId = elementRowId;
           this.gvtProdCode = gvtProdCode;
           this.parameters = parameters;
    }


    /**
     * Gets the elementRowId value for this VasElementVO.
     * 
     * @return elementRowId
     */
    public java.lang.String getElementRowId() {
        return elementRowId;
    }


    /**
     * Sets the elementRowId value for this VasElementVO.
     * 
     * @param elementRowId
     */
    public void setElementRowId(java.lang.String elementRowId) {
        this.elementRowId = elementRowId;
    }


    /**
     * Gets the gvtProdCode value for this VasElementVO.
     * 
     * @return gvtProdCode
     */
    public java.lang.String getGvtProdCode() {
        return gvtProdCode;
    }


    /**
     * Sets the gvtProdCode value for this VasElementVO.
     * 
     * @param gvtProdCode
     */
    public void setGvtProdCode(java.lang.String gvtProdCode) {
        this.gvtProdCode = gvtProdCode;
    }


    /**
     * Gets the parameters value for this VasElementVO.
     * 
     * @return parameters
     */
    public com.gvt.www.uraservices.VasParameterVO[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this VasElementVO.
     * 
     * @param parameters
     */
    public void setParameters(com.gvt.www.uraservices.VasParameterVO[] parameters) {
        this.parameters = parameters;
    }

    public com.gvt.www.uraservices.VasParameterVO getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, com.gvt.www.uraservices.VasParameterVO _value) {
        this.parameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VasElementVO)) return false;
        VasElementVO other = (VasElementVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elementRowId==null && other.getElementRowId()==null) || 
             (this.elementRowId!=null &&
              this.elementRowId.equals(other.getElementRowId()))) &&
            ((this.gvtProdCode==null && other.getGvtProdCode()==null) || 
             (this.gvtProdCode!=null &&
              this.gvtProdCode.equals(other.getGvtProdCode()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters())));
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
        if (getElementRowId() != null) {
            _hashCode += getElementRowId().hashCode();
        }
        if (getGvtProdCode() != null) {
            _hashCode += getGvtProdCode().hashCode();
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VasElementVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "vasElementVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementRowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elementRowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gvtProdCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gvtProdCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "vasParameterVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
