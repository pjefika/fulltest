/**
 * PhoneVasVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class PhoneVasVO  implements java.io.Serializable {
    private java.lang.String assetNumber;

    private java.lang.String comQuoteSolutionId;

    private java.lang.String elementRowId;

    private java.lang.String gvtProdCode;

    private java.lang.String parentAccountId;

    private java.lang.String serviceAccountId;

    public PhoneVasVO() {
    }

    public PhoneVasVO(
           java.lang.String assetNumber,
           java.lang.String comQuoteSolutionId,
           java.lang.String elementRowId,
           java.lang.String gvtProdCode,
           java.lang.String parentAccountId,
           java.lang.String serviceAccountId) {
           this.assetNumber = assetNumber;
           this.comQuoteSolutionId = comQuoteSolutionId;
           this.elementRowId = elementRowId;
           this.gvtProdCode = gvtProdCode;
           this.parentAccountId = parentAccountId;
           this.serviceAccountId = serviceAccountId;
    }


    /**
     * Gets the assetNumber value for this PhoneVasVO.
     * 
     * @return assetNumber
     */
    public java.lang.String getAssetNumber() {
        return assetNumber;
    }


    /**
     * Sets the assetNumber value for this PhoneVasVO.
     * 
     * @param assetNumber
     */
    public void setAssetNumber(java.lang.String assetNumber) {
        this.assetNumber = assetNumber;
    }


    /**
     * Gets the comQuoteSolutionId value for this PhoneVasVO.
     * 
     * @return comQuoteSolutionId
     */
    public java.lang.String getComQuoteSolutionId() {
        return comQuoteSolutionId;
    }


    /**
     * Sets the comQuoteSolutionId value for this PhoneVasVO.
     * 
     * @param comQuoteSolutionId
     */
    public void setComQuoteSolutionId(java.lang.String comQuoteSolutionId) {
        this.comQuoteSolutionId = comQuoteSolutionId;
    }


    /**
     * Gets the elementRowId value for this PhoneVasVO.
     * 
     * @return elementRowId
     */
    public java.lang.String getElementRowId() {
        return elementRowId;
    }


    /**
     * Sets the elementRowId value for this PhoneVasVO.
     * 
     * @param elementRowId
     */
    public void setElementRowId(java.lang.String elementRowId) {
        this.elementRowId = elementRowId;
    }


    /**
     * Gets the gvtProdCode value for this PhoneVasVO.
     * 
     * @return gvtProdCode
     */
    public java.lang.String getGvtProdCode() {
        return gvtProdCode;
    }


    /**
     * Sets the gvtProdCode value for this PhoneVasVO.
     * 
     * @param gvtProdCode
     */
    public void setGvtProdCode(java.lang.String gvtProdCode) {
        this.gvtProdCode = gvtProdCode;
    }


    /**
     * Gets the parentAccountId value for this PhoneVasVO.
     * 
     * @return parentAccountId
     */
    public java.lang.String getParentAccountId() {
        return parentAccountId;
    }


    /**
     * Sets the parentAccountId value for this PhoneVasVO.
     * 
     * @param parentAccountId
     */
    public void setParentAccountId(java.lang.String parentAccountId) {
        this.parentAccountId = parentAccountId;
    }


    /**
     * Gets the serviceAccountId value for this PhoneVasVO.
     * 
     * @return serviceAccountId
     */
    public java.lang.String getServiceAccountId() {
        return serviceAccountId;
    }


    /**
     * Sets the serviceAccountId value for this PhoneVasVO.
     * 
     * @param serviceAccountId
     */
    public void setServiceAccountId(java.lang.String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhoneVasVO)) return false;
        PhoneVasVO other = (PhoneVasVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetNumber==null && other.getAssetNumber()==null) || 
             (this.assetNumber!=null &&
              this.assetNumber.equals(other.getAssetNumber()))) &&
            ((this.comQuoteSolutionId==null && other.getComQuoteSolutionId()==null) || 
             (this.comQuoteSolutionId!=null &&
              this.comQuoteSolutionId.equals(other.getComQuoteSolutionId()))) &&
            ((this.elementRowId==null && other.getElementRowId()==null) || 
             (this.elementRowId!=null &&
              this.elementRowId.equals(other.getElementRowId()))) &&
            ((this.gvtProdCode==null && other.getGvtProdCode()==null) || 
             (this.gvtProdCode!=null &&
              this.gvtProdCode.equals(other.getGvtProdCode()))) &&
            ((this.parentAccountId==null && other.getParentAccountId()==null) || 
             (this.parentAccountId!=null &&
              this.parentAccountId.equals(other.getParentAccountId()))) &&
            ((this.serviceAccountId==null && other.getServiceAccountId()==null) || 
             (this.serviceAccountId!=null &&
              this.serviceAccountId.equals(other.getServiceAccountId())));
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
        if (getAssetNumber() != null) {
            _hashCode += getAssetNumber().hashCode();
        }
        if (getComQuoteSolutionId() != null) {
            _hashCode += getComQuoteSolutionId().hashCode();
        }
        if (getElementRowId() != null) {
            _hashCode += getElementRowId().hashCode();
        }
        if (getGvtProdCode() != null) {
            _hashCode += getGvtProdCode().hashCode();
        }
        if (getParentAccountId() != null) {
            _hashCode += getParentAccountId().hashCode();
        }
        if (getServiceAccountId() != null) {
            _hashCode += getServiceAccountId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhoneVasVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "phoneVasVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comQuoteSolutionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comQuoteSolutionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("parentAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceAccountId"));
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
