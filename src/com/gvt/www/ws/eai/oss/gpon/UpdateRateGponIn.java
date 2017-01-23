/**
 * UpdateRateGponIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class UpdateRateGponIn  implements java.io.Serializable {
    private java.lang.String designadorAcesso;

    private java.lang.String downloadRate;

    private java.lang.String uploadRate;

    public UpdateRateGponIn() {
    }

    public UpdateRateGponIn(
           java.lang.String designadorAcesso,
           java.lang.String downloadRate,
           java.lang.String uploadRate) {
           this.designadorAcesso = designadorAcesso;
           this.downloadRate = downloadRate;
           this.uploadRate = uploadRate;
    }


    /**
     * Gets the designadorAcesso value for this UpdateRateGponIn.
     * 
     * @return designadorAcesso
     */
    public java.lang.String getDesignadorAcesso() {
        return designadorAcesso;
    }


    /**
     * Sets the designadorAcesso value for this UpdateRateGponIn.
     * 
     * @param designadorAcesso
     */
    public void setDesignadorAcesso(java.lang.String designadorAcesso) {
        this.designadorAcesso = designadorAcesso;
    }


    /**
     * Gets the downloadRate value for this UpdateRateGponIn.
     * 
     * @return downloadRate
     */
    public java.lang.String getDownloadRate() {
        return downloadRate;
    }


    /**
     * Sets the downloadRate value for this UpdateRateGponIn.
     * 
     * @param downloadRate
     */
    public void setDownloadRate(java.lang.String downloadRate) {
        this.downloadRate = downloadRate;
    }


    /**
     * Gets the uploadRate value for this UpdateRateGponIn.
     * 
     * @return uploadRate
     */
    public java.lang.String getUploadRate() {
        return uploadRate;
    }


    /**
     * Sets the uploadRate value for this UpdateRateGponIn.
     * 
     * @param uploadRate
     */
    public void setUploadRate(java.lang.String uploadRate) {
        this.uploadRate = uploadRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateRateGponIn)) return false;
        UpdateRateGponIn other = (UpdateRateGponIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorAcesso==null && other.getDesignadorAcesso()==null) || 
             (this.designadorAcesso!=null &&
              this.designadorAcesso.equals(other.getDesignadorAcesso()))) &&
            ((this.downloadRate==null && other.getDownloadRate()==null) || 
             (this.downloadRate!=null &&
              this.downloadRate.equals(other.getDownloadRate()))) &&
            ((this.uploadRate==null && other.getUploadRate()==null) || 
             (this.uploadRate!=null &&
              this.uploadRate.equals(other.getUploadRate())));
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
        if (getDesignadorAcesso() != null) {
            _hashCode += getDesignadorAcesso().hashCode();
        }
        if (getDownloadRate() != null) {
            _hashCode += getDownloadRate().hashCode();
        }
        if (getUploadRate() != null) {
            _hashCode += getUploadRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateRateGponIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "UpdateRateGponIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "designadorAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "downloadRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "uploadRate"));
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
