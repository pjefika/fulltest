/**
 * SubscriberInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.ipvodinfo;

public class SubscriberInfo  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.String authInfo;

    private java.lang.String serviceRegion;

    private br.com.gvt.www.tv.ipvodinfo.Status status;

    public SubscriberInfo() {
    }

    public SubscriberInfo(
           java.lang.String userId,
           java.lang.String authInfo,
           java.lang.String serviceRegion,
           br.com.gvt.www.tv.ipvodinfo.Status status) {
           this.userId = userId;
           this.authInfo = authInfo;
           this.serviceRegion = serviceRegion;
           this.status = status;
    }


    /**
     * Gets the userId value for this SubscriberInfo.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SubscriberInfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the authInfo value for this SubscriberInfo.
     * 
     * @return authInfo
     */
    public java.lang.String getAuthInfo() {
        return authInfo;
    }


    /**
     * Sets the authInfo value for this SubscriberInfo.
     * 
     * @param authInfo
     */
    public void setAuthInfo(java.lang.String authInfo) {
        this.authInfo = authInfo;
    }


    /**
     * Gets the serviceRegion value for this SubscriberInfo.
     * 
     * @return serviceRegion
     */
    public java.lang.String getServiceRegion() {
        return serviceRegion;
    }


    /**
     * Sets the serviceRegion value for this SubscriberInfo.
     * 
     * @param serviceRegion
     */
    public void setServiceRegion(java.lang.String serviceRegion) {
        this.serviceRegion = serviceRegion;
    }


    /**
     * Gets the status value for this SubscriberInfo.
     * 
     * @return status
     */
    public br.com.gvt.www.tv.ipvodinfo.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SubscriberInfo.
     * 
     * @param status
     */
    public void setStatus(br.com.gvt.www.tv.ipvodinfo.Status status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberInfo)) return false;
        SubscriberInfo other = (SubscriberInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.authInfo==null && other.getAuthInfo()==null) || 
             (this.authInfo!=null &&
              this.authInfo.equals(other.getAuthInfo()))) &&
            ((this.serviceRegion==null && other.getServiceRegion()==null) || 
             (this.serviceRegion!=null &&
              this.serviceRegion.equals(other.getServiceRegion()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getAuthInfo() != null) {
            _hashCode += getAuthInfo().hashCode();
        }
        if (getServiceRegion() != null) {
            _hashCode += getServiceRegion().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "SubscriberInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "authInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "serviceRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "status"));
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
