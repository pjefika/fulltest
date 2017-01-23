/**
 * OSSTurbonetLastLogTesteVelocidadeIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade;

public class OSSTurbonetLastLogTesteVelocidadeIn  implements java.io.Serializable {
    private java.lang.String numeroProtocolo;

    private java.lang.String designador;

    public OSSTurbonetLastLogTesteVelocidadeIn() {
    }

    public OSSTurbonetLastLogTesteVelocidadeIn(
           java.lang.String numeroProtocolo,
           java.lang.String designador) {
           this.numeroProtocolo = numeroProtocolo;
           this.designador = designador;
    }


    /**
     * Gets the numeroProtocolo value for this OSSTurbonetLastLogTesteVelocidadeIn.
     * 
     * @return numeroProtocolo
     */
    public java.lang.String getNumeroProtocolo() {
        return numeroProtocolo;
    }


    /**
     * Sets the numeroProtocolo value for this OSSTurbonetLastLogTesteVelocidadeIn.
     * 
     * @param numeroProtocolo
     */
    public void setNumeroProtocolo(java.lang.String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }


    /**
     * Gets the designador value for this OSSTurbonetLastLogTesteVelocidadeIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this OSSTurbonetLastLogTesteVelocidadeIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetLastLogTesteVelocidadeIn)) return false;
        OSSTurbonetLastLogTesteVelocidadeIn other = (OSSTurbonetLastLogTesteVelocidadeIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroProtocolo==null && other.getNumeroProtocolo()==null) || 
             (this.numeroProtocolo!=null &&
              this.numeroProtocolo.equals(other.getNumeroProtocolo()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador())));
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
        if (getNumeroProtocolo() != null) {
            _hashCode += getNumeroProtocolo().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetLastLogTesteVelocidadeIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "OSSTurbonetLastLogTesteVelocidadeIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "numeroProtocolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
