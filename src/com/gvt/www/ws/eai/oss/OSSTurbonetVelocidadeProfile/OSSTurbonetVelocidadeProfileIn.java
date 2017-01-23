/**
 * OSSTurbonetVelocidadeProfileIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeProfile;

public class OSSTurbonetVelocidadeProfileIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn;

    private int velocidadeDownloadSiebel;

    private int velocidadeUploadSiebel;

    public OSSTurbonetVelocidadeProfileIn() {
    }

    public OSSTurbonetVelocidadeProfileIn(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn,
           int velocidadeDownloadSiebel,
           int velocidadeUploadSiebel) {
           this.ossTurbonetIn = ossTurbonetIn;
           this.velocidadeDownloadSiebel = velocidadeDownloadSiebel;
           this.velocidadeUploadSiebel = velocidadeUploadSiebel;
    }


    /**
     * Gets the ossTurbonetIn value for this OSSTurbonetVelocidadeProfileIn.
     * 
     * @return ossTurbonetIn
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn getOssTurbonetIn() {
        return ossTurbonetIn;
    }


    /**
     * Sets the ossTurbonetIn value for this OSSTurbonetVelocidadeProfileIn.
     * 
     * @param ossTurbonetIn
     */
    public void setOssTurbonetIn(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn) {
        this.ossTurbonetIn = ossTurbonetIn;
    }


    /**
     * Gets the velocidadeDownloadSiebel value for this OSSTurbonetVelocidadeProfileIn.
     * 
     * @return velocidadeDownloadSiebel
     */
    public int getVelocidadeDownloadSiebel() {
        return velocidadeDownloadSiebel;
    }


    /**
     * Sets the velocidadeDownloadSiebel value for this OSSTurbonetVelocidadeProfileIn.
     * 
     * @param velocidadeDownloadSiebel
     */
    public void setVelocidadeDownloadSiebel(int velocidadeDownloadSiebel) {
        this.velocidadeDownloadSiebel = velocidadeDownloadSiebel;
    }


    /**
     * Gets the velocidadeUploadSiebel value for this OSSTurbonetVelocidadeProfileIn.
     * 
     * @return velocidadeUploadSiebel
     */
    public int getVelocidadeUploadSiebel() {
        return velocidadeUploadSiebel;
    }


    /**
     * Sets the velocidadeUploadSiebel value for this OSSTurbonetVelocidadeProfileIn.
     * 
     * @param velocidadeUploadSiebel
     */
    public void setVelocidadeUploadSiebel(int velocidadeUploadSiebel) {
        this.velocidadeUploadSiebel = velocidadeUploadSiebel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetVelocidadeProfileIn)) return false;
        OSSTurbonetVelocidadeProfileIn other = (OSSTurbonetVelocidadeProfileIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ossTurbonetIn==null && other.getOssTurbonetIn()==null) || 
             (this.ossTurbonetIn!=null &&
              this.ossTurbonetIn.equals(other.getOssTurbonetIn()))) &&
            this.velocidadeDownloadSiebel == other.getVelocidadeDownloadSiebel() &&
            this.velocidadeUploadSiebel == other.getVelocidadeUploadSiebel();
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
        if (getOssTurbonetIn() != null) {
            _hashCode += getOssTurbonetIn().hashCode();
        }
        _hashCode += getVelocidadeDownloadSiebel();
        _hashCode += getVelocidadeUploadSiebel();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetVelocidadeProfileIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeProfile", "OSSTurbonetVelocidadeProfileIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ossTurbonetIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ossTurbonetIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeDownloadSiebel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeProfile", "velocidadeDownloadSiebel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeUploadSiebel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeProfile", "velocidadeUploadSiebel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
