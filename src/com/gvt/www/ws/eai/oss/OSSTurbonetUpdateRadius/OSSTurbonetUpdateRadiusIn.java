/**
 * OSSTurbonetUpdateRadiusIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetUpdateRadius;

public class OSSTurbonetUpdateRadiusIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn;

    private java.lang.Integer downloadSiebel;

    private java.lang.Integer uploadSiebel;

    public OSSTurbonetUpdateRadiusIn() {
    }

    public OSSTurbonetUpdateRadiusIn(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn,
           java.lang.Integer downloadSiebel,
           java.lang.Integer uploadSiebel) {
           this.ossTurbonetIn = ossTurbonetIn;
           this.downloadSiebel = downloadSiebel;
           this.uploadSiebel = uploadSiebel;
    }


    /**
     * Gets the ossTurbonetIn value for this OSSTurbonetUpdateRadiusIn.
     * 
     * @return ossTurbonetIn
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn getOssTurbonetIn() {
        return ossTurbonetIn;
    }


    /**
     * Sets the ossTurbonetIn value for this OSSTurbonetUpdateRadiusIn.
     * 
     * @param ossTurbonetIn
     */
    public void setOssTurbonetIn(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn) {
        this.ossTurbonetIn = ossTurbonetIn;
    }


    /**
     * Gets the downloadSiebel value for this OSSTurbonetUpdateRadiusIn.
     * 
     * @return downloadSiebel
     */
    public java.lang.Integer getDownloadSiebel() {
        return downloadSiebel;
    }


    /**
     * Sets the downloadSiebel value for this OSSTurbonetUpdateRadiusIn.
     * 
     * @param downloadSiebel
     */
    public void setDownloadSiebel(java.lang.Integer downloadSiebel) {
        this.downloadSiebel = downloadSiebel;
    }


    /**
     * Gets the uploadSiebel value for this OSSTurbonetUpdateRadiusIn.
     * 
     * @return uploadSiebel
     */
    public java.lang.Integer getUploadSiebel() {
        return uploadSiebel;
    }


    /**
     * Sets the uploadSiebel value for this OSSTurbonetUpdateRadiusIn.
     * 
     * @param uploadSiebel
     */
    public void setUploadSiebel(java.lang.Integer uploadSiebel) {
        this.uploadSiebel = uploadSiebel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetUpdateRadiusIn)) return false;
        OSSTurbonetUpdateRadiusIn other = (OSSTurbonetUpdateRadiusIn) obj;
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
            ((this.downloadSiebel==null && other.getDownloadSiebel()==null) || 
             (this.downloadSiebel!=null &&
              this.downloadSiebel.equals(other.getDownloadSiebel()))) &&
            ((this.uploadSiebel==null && other.getUploadSiebel()==null) || 
             (this.uploadSiebel!=null &&
              this.uploadSiebel.equals(other.getUploadSiebel())));
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
        if (getDownloadSiebel() != null) {
            _hashCode += getDownloadSiebel().hashCode();
        }
        if (getUploadSiebel() != null) {
            _hashCode += getUploadSiebel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetUpdateRadiusIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetUpdateRadius", "OSSTurbonetUpdateRadiusIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ossTurbonetIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ossTurbonetIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadSiebel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetUpdateRadius", "downloadSiebel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadSiebel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetUpdateRadius", "uploadSiebel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
