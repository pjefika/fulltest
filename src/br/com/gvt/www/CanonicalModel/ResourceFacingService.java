/**
 * ResourceFacingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.CanonicalModel;

public class ResourceFacingService  extends br.com.gvt.www.CanonicalModel.Service  implements java.io.Serializable {
    private br.com.gvt.www.CanonicalModel.ResourceFacingServiceSpec serviceSpecification;

    public ResourceFacingService() {
    }

    public ResourceFacingService(
           java.lang.String name,
           br.com.gvt.www.CanonicalModel.BrazilianUrbanPropertyAddress place,
           java.lang.String serviceId,
           java.lang.String status,
           br.com.gvt.www.CanonicalModel.ResourceFacingServiceSpec serviceSpecification) {
        super(
            name,
            place,
            serviceId,
            status);
        this.serviceSpecification = serviceSpecification;
    }


    /**
     * Gets the serviceSpecification value for this ResourceFacingService.
     * 
     * @return serviceSpecification
     */
    public br.com.gvt.www.CanonicalModel.ResourceFacingServiceSpec getServiceSpecification() {
        return serviceSpecification;
    }


    /**
     * Sets the serviceSpecification value for this ResourceFacingService.
     * 
     * @param serviceSpecification
     */
    public void setServiceSpecification(br.com.gvt.www.CanonicalModel.ResourceFacingServiceSpec serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceFacingService)) return false;
        ResourceFacingService other = (ResourceFacingService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceSpecification==null && other.getServiceSpecification()==null) || 
             (this.serviceSpecification!=null &&
              this.serviceSpecification.equals(other.getServiceSpecification())));
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
        if (getServiceSpecification() != null) {
            _hashCode += getServiceSpecification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceFacingService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "ResourceFacingService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "serviceSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "ResourceFacingServiceSpec"));
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
