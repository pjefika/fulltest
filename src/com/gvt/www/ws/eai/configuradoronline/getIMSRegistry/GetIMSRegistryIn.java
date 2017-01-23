/**
 * GetIMSRegistryIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.getIMSRegistry;

public class GetIMSRegistryIn  implements java.io.Serializable {
    private br.com.gvt.www.CanonicalModel.ResourceFacingService resourceFacingServices;

    public GetIMSRegistryIn() {
    }

    public GetIMSRegistryIn(
           br.com.gvt.www.CanonicalModel.ResourceFacingService resourceFacingServices) {
           this.resourceFacingServices = resourceFacingServices;
    }


    /**
     * Gets the resourceFacingServices value for this GetIMSRegistryIn.
     * 
     * @return resourceFacingServices
     */
    public br.com.gvt.www.CanonicalModel.ResourceFacingService getResourceFacingServices() {
        return resourceFacingServices;
    }


    /**
     * Sets the resourceFacingServices value for this GetIMSRegistryIn.
     * 
     * @param resourceFacingServices
     */
    public void setResourceFacingServices(br.com.gvt.www.CanonicalModel.ResourceFacingService resourceFacingServices) {
        this.resourceFacingServices = resourceFacingServices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetIMSRegistryIn)) return false;
        GetIMSRegistryIn other = (GetIMSRegistryIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceFacingServices==null && other.getResourceFacingServices()==null) || 
             (this.resourceFacingServices!=null &&
              this.resourceFacingServices.equals(other.getResourceFacingServices())));
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
        if (getResourceFacingServices() != null) {
            _hashCode += getResourceFacingServices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetIMSRegistryIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getIMSRegistry", "GetIMSRegistryIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceFacingServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getIMSRegistry", "resourceFacingServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "ResourceFacingService"));
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
