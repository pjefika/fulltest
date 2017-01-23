/**
 * OSSTurbonetDiagnosticoBandaLargaIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga;

public class OSSTurbonetDiagnosticoBandaLargaIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn;

    private int downstreamCRM;

    private int upstreamCRM;

    public OSSTurbonetDiagnosticoBandaLargaIn() {
    }

    public OSSTurbonetDiagnosticoBandaLargaIn(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn,
           int downstreamCRM,
           int upstreamCRM) {
           this.ossTurbonetIn = ossTurbonetIn;
           this.downstreamCRM = downstreamCRM;
           this.upstreamCRM = upstreamCRM;
    }


    /**
     * Gets the ossTurbonetIn value for this OSSTurbonetDiagnosticoBandaLargaIn.
     * 
     * @return ossTurbonetIn
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn getOssTurbonetIn() {
        return ossTurbonetIn;
    }


    /**
     * Sets the ossTurbonetIn value for this OSSTurbonetDiagnosticoBandaLargaIn.
     * 
     * @param ossTurbonetIn
     */
    public void setOssTurbonetIn(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn) {
        this.ossTurbonetIn = ossTurbonetIn;
    }


    /**
     * Gets the downstreamCRM value for this OSSTurbonetDiagnosticoBandaLargaIn.
     * 
     * @return downstreamCRM
     */
    public int getDownstreamCRM() {
        return downstreamCRM;
    }


    /**
     * Sets the downstreamCRM value for this OSSTurbonetDiagnosticoBandaLargaIn.
     * 
     * @param downstreamCRM
     */
    public void setDownstreamCRM(int downstreamCRM) {
        this.downstreamCRM = downstreamCRM;
    }


    /**
     * Gets the upstreamCRM value for this OSSTurbonetDiagnosticoBandaLargaIn.
     * 
     * @return upstreamCRM
     */
    public int getUpstreamCRM() {
        return upstreamCRM;
    }


    /**
     * Sets the upstreamCRM value for this OSSTurbonetDiagnosticoBandaLargaIn.
     * 
     * @param upstreamCRM
     */
    public void setUpstreamCRM(int upstreamCRM) {
        this.upstreamCRM = upstreamCRM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetDiagnosticoBandaLargaIn)) return false;
        OSSTurbonetDiagnosticoBandaLargaIn other = (OSSTurbonetDiagnosticoBandaLargaIn) obj;
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
            this.downstreamCRM == other.getDownstreamCRM() &&
            this.upstreamCRM == other.getUpstreamCRM();
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
        _hashCode += getDownstreamCRM();
        _hashCode += getUpstreamCRM();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetDiagnosticoBandaLargaIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "OSSTurbonetDiagnosticoBandaLargaIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ossTurbonetIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ossTurbonetIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downstreamCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "downstreamCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upstreamCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "upstreamCRM"));
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
