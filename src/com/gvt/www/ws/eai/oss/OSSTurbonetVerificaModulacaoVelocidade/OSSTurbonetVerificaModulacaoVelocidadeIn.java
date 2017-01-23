/**
 * OSSTurbonetVerificaModulacaoVelocidadeIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetVerificaModulacaoVelocidade;

public class OSSTurbonetVerificaModulacaoVelocidadeIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn;

    private int velocidadeDownload;

    private java.lang.String modulacao;

    public OSSTurbonetVerificaModulacaoVelocidadeIn() {
    }

    public OSSTurbonetVerificaModulacaoVelocidadeIn(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn,
           int velocidadeDownload,
           java.lang.String modulacao) {
           this.ossTurbonetIn = ossTurbonetIn;
           this.velocidadeDownload = velocidadeDownload;
           this.modulacao = modulacao;
    }


    /**
     * Gets the ossTurbonetIn value for this OSSTurbonetVerificaModulacaoVelocidadeIn.
     * 
     * @return ossTurbonetIn
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn getOssTurbonetIn() {
        return ossTurbonetIn;
    }


    /**
     * Sets the ossTurbonetIn value for this OSSTurbonetVerificaModulacaoVelocidadeIn.
     * 
     * @param ossTurbonetIn
     */
    public void setOssTurbonetIn(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn) {
        this.ossTurbonetIn = ossTurbonetIn;
    }


    /**
     * Gets the velocidadeDownload value for this OSSTurbonetVerificaModulacaoVelocidadeIn.
     * 
     * @return velocidadeDownload
     */
    public int getVelocidadeDownload() {
        return velocidadeDownload;
    }


    /**
     * Sets the velocidadeDownload value for this OSSTurbonetVerificaModulacaoVelocidadeIn.
     * 
     * @param velocidadeDownload
     */
    public void setVelocidadeDownload(int velocidadeDownload) {
        this.velocidadeDownload = velocidadeDownload;
    }


    /**
     * Gets the modulacao value for this OSSTurbonetVerificaModulacaoVelocidadeIn.
     * 
     * @return modulacao
     */
    public java.lang.String getModulacao() {
        return modulacao;
    }


    /**
     * Sets the modulacao value for this OSSTurbonetVerificaModulacaoVelocidadeIn.
     * 
     * @param modulacao
     */
    public void setModulacao(java.lang.String modulacao) {
        this.modulacao = modulacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetVerificaModulacaoVelocidadeIn)) return false;
        OSSTurbonetVerificaModulacaoVelocidadeIn other = (OSSTurbonetVerificaModulacaoVelocidadeIn) obj;
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
            this.velocidadeDownload == other.getVelocidadeDownload() &&
            ((this.modulacao==null && other.getModulacao()==null) || 
             (this.modulacao!=null &&
              this.modulacao.equals(other.getModulacao())));
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
        _hashCode += getVelocidadeDownload();
        if (getModulacao() != null) {
            _hashCode += getModulacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetVerificaModulacaoVelocidadeIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVerificaModulacaoVelocidade", "OSSTurbonetVerificaModulacaoVelocidadeIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ossTurbonetIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ossTurbonetIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVerificaModulacaoVelocidade", "velocidadeDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVerificaModulacaoVelocidade", "modulacao"));
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
