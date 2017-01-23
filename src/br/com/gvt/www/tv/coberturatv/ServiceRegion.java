/**
 * ServiceRegion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.coberturatv;

public class ServiceRegion  implements java.io.Serializable {
    private int cepInicio;

    private int cepFim;

    private java.lang.String serviceRegion;

    public ServiceRegion() {
    }

    public ServiceRegion(
           int cepInicio,
           int cepFim,
           java.lang.String serviceRegion) {
           this.cepInicio = cepInicio;
           this.cepFim = cepFim;
           this.serviceRegion = serviceRegion;
    }


    /**
     * Gets the cepInicio value for this ServiceRegion.
     * 
     * @return cepInicio
     */
    public int getCepInicio() {
        return cepInicio;
    }


    /**
     * Sets the cepInicio value for this ServiceRegion.
     * 
     * @param cepInicio
     */
    public void setCepInicio(int cepInicio) {
        this.cepInicio = cepInicio;
    }


    /**
     * Gets the cepFim value for this ServiceRegion.
     * 
     * @return cepFim
     */
    public int getCepFim() {
        return cepFim;
    }


    /**
     * Sets the cepFim value for this ServiceRegion.
     * 
     * @param cepFim
     */
    public void setCepFim(int cepFim) {
        this.cepFim = cepFim;
    }


    /**
     * Gets the serviceRegion value for this ServiceRegion.
     * 
     * @return serviceRegion
     */
    public java.lang.String getServiceRegion() {
        return serviceRegion;
    }


    /**
     * Sets the serviceRegion value for this ServiceRegion.
     * 
     * @param serviceRegion
     */
    public void setServiceRegion(java.lang.String serviceRegion) {
        this.serviceRegion = serviceRegion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRegion)) return false;
        ServiceRegion other = (ServiceRegion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cepInicio == other.getCepInicio() &&
            this.cepFim == other.getCepFim() &&
            ((this.serviceRegion==null && other.getServiceRegion()==null) || 
             (this.serviceRegion!=null &&
              this.serviceRegion.equals(other.getServiceRegion())));
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
        _hashCode += getCepInicio();
        _hashCode += getCepFim();
        if (getServiceRegion() != null) {
            _hashCode += getServiceRegion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRegion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "ServiceRegion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cepInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "cepInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cepFim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "cepFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "serviceRegion"));
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
