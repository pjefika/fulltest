/**
 * OSSTurbonetAdslUseReportIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport;

public class OSSTurbonetAdslUseReportIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn;

    private java.util.Date dataInicio;

    private java.util.Date dataFim;

    public OSSTurbonetAdslUseReportIn() {
    }

    public OSSTurbonetAdslUseReportIn(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn,
           java.util.Date dataInicio,
           java.util.Date dataFim) {
           this.ossTurbonetIn = ossTurbonetIn;
           this.dataInicio = dataInicio;
           this.dataFim = dataFim;
    }


    /**
     * Gets the ossTurbonetIn value for this OSSTurbonetAdslUseReportIn.
     * 
     * @return ossTurbonetIn
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn getOssTurbonetIn() {
        return ossTurbonetIn;
    }


    /**
     * Sets the ossTurbonetIn value for this OSSTurbonetAdslUseReportIn.
     * 
     * @param ossTurbonetIn
     */
    public void setOssTurbonetIn(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn) {
        this.ossTurbonetIn = ossTurbonetIn;
    }


    /**
     * Gets the dataInicio value for this OSSTurbonetAdslUseReportIn.
     * 
     * @return dataInicio
     */
    public java.util.Date getDataInicio() {
        return dataInicio;
    }


    /**
     * Sets the dataInicio value for this OSSTurbonetAdslUseReportIn.
     * 
     * @param dataInicio
     */
    public void setDataInicio(java.util.Date dataInicio) {
        this.dataInicio = dataInicio;
    }


    /**
     * Gets the dataFim value for this OSSTurbonetAdslUseReportIn.
     * 
     * @return dataFim
     */
    public java.util.Date getDataFim() {
        return dataFim;
    }


    /**
     * Sets the dataFim value for this OSSTurbonetAdslUseReportIn.
     * 
     * @param dataFim
     */
    public void setDataFim(java.util.Date dataFim) {
        this.dataFim = dataFim;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetAdslUseReportIn)) return false;
        OSSTurbonetAdslUseReportIn other = (OSSTurbonetAdslUseReportIn) obj;
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
            ((this.dataInicio==null && other.getDataInicio()==null) || 
             (this.dataInicio!=null &&
              this.dataInicio.equals(other.getDataInicio()))) &&
            ((this.dataFim==null && other.getDataFim()==null) || 
             (this.dataFim!=null &&
              this.dataFim.equals(other.getDataFim())));
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
        if (getDataInicio() != null) {
            _hashCode += getDataInicio().hashCode();
        }
        if (getDataFim() != null) {
            _hashCode += getDataFim().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetAdslUseReportIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "OSSTurbonetAdslUseReportIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ossTurbonetIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ossTurbonetIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "dataInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "dataFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
