/**
 * OSSTurbonetChangeProfileIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetChangeProfile;

public class OSSTurbonetChangeProfileIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn;

    private java.lang.String protocolo;

    private java.lang.String modulacaoAtual;

    private java.lang.String modulacaoNova;

    public OSSTurbonetChangeProfileIn() {
    }

    public OSSTurbonetChangeProfileIn(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn,
           java.lang.String protocolo,
           java.lang.String modulacaoAtual,
           java.lang.String modulacaoNova) {
           this.ossTurbonetIn = ossTurbonetIn;
           this.protocolo = protocolo;
           this.modulacaoAtual = modulacaoAtual;
           this.modulacaoNova = modulacaoNova;
    }


    /**
     * Gets the ossTurbonetIn value for this OSSTurbonetChangeProfileIn.
     * 
     * @return ossTurbonetIn
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn getOssTurbonetIn() {
        return ossTurbonetIn;
    }


    /**
     * Sets the ossTurbonetIn value for this OSSTurbonetChangeProfileIn.
     * 
     * @param ossTurbonetIn
     */
    public void setOssTurbonetIn(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn) {
        this.ossTurbonetIn = ossTurbonetIn;
    }


    /**
     * Gets the protocolo value for this OSSTurbonetChangeProfileIn.
     * 
     * @return protocolo
     */
    public java.lang.String getProtocolo() {
        return protocolo;
    }


    /**
     * Sets the protocolo value for this OSSTurbonetChangeProfileIn.
     * 
     * @param protocolo
     */
    public void setProtocolo(java.lang.String protocolo) {
        this.protocolo = protocolo;
    }


    /**
     * Gets the modulacaoAtual value for this OSSTurbonetChangeProfileIn.
     * 
     * @return modulacaoAtual
     */
    public java.lang.String getModulacaoAtual() {
        return modulacaoAtual;
    }


    /**
     * Sets the modulacaoAtual value for this OSSTurbonetChangeProfileIn.
     * 
     * @param modulacaoAtual
     */
    public void setModulacaoAtual(java.lang.String modulacaoAtual) {
        this.modulacaoAtual = modulacaoAtual;
    }


    /**
     * Gets the modulacaoNova value for this OSSTurbonetChangeProfileIn.
     * 
     * @return modulacaoNova
     */
    public java.lang.String getModulacaoNova() {
        return modulacaoNova;
    }


    /**
     * Sets the modulacaoNova value for this OSSTurbonetChangeProfileIn.
     * 
     * @param modulacaoNova
     */
    public void setModulacaoNova(java.lang.String modulacaoNova) {
        this.modulacaoNova = modulacaoNova;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetChangeProfileIn)) return false;
        OSSTurbonetChangeProfileIn other = (OSSTurbonetChangeProfileIn) obj;
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
            ((this.protocolo==null && other.getProtocolo()==null) || 
             (this.protocolo!=null &&
              this.protocolo.equals(other.getProtocolo()))) &&
            ((this.modulacaoAtual==null && other.getModulacaoAtual()==null) || 
             (this.modulacaoAtual!=null &&
              this.modulacaoAtual.equals(other.getModulacaoAtual()))) &&
            ((this.modulacaoNova==null && other.getModulacaoNova()==null) || 
             (this.modulacaoNova!=null &&
              this.modulacaoNova.equals(other.getModulacaoNova())));
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
        if (getProtocolo() != null) {
            _hashCode += getProtocolo().hashCode();
        }
        if (getModulacaoAtual() != null) {
            _hashCode += getModulacaoAtual().hashCode();
        }
        if (getModulacaoNova() != null) {
            _hashCode += getModulacaoNova().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetChangeProfileIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeProfile", "OSSTurbonetChangeProfileIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ossTurbonetIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ossTurbonetIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeProfile", "protocolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulacaoAtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeProfile", "modulacaoAtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulacaoNova");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeProfile", "modulacaoNova"));
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
