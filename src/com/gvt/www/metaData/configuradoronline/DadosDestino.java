/**
 * DadosDestino.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosDestino  implements java.io.Serializable {
    private com.gvt.www.metaData.configuradoronline.DadosRangeNacional rangeNacional;

    private com.gvt.www.metaData.configuradoronline.DadosRangeInternacional rangeInternacional;

    private java.lang.String numero;

    public DadosDestino() {
    }

    public DadosDestino(
           com.gvt.www.metaData.configuradoronline.DadosRangeNacional rangeNacional,
           com.gvt.www.metaData.configuradoronline.DadosRangeInternacional rangeInternacional,
           java.lang.String numero) {
           this.rangeNacional = rangeNacional;
           this.rangeInternacional = rangeInternacional;
           this.numero = numero;
    }


    /**
     * Gets the rangeNacional value for this DadosDestino.
     * 
     * @return rangeNacional
     */
    public com.gvt.www.metaData.configuradoronline.DadosRangeNacional getRangeNacional() {
        return rangeNacional;
    }


    /**
     * Sets the rangeNacional value for this DadosDestino.
     * 
     * @param rangeNacional
     */
    public void setRangeNacional(com.gvt.www.metaData.configuradoronline.DadosRangeNacional rangeNacional) {
        this.rangeNacional = rangeNacional;
    }


    /**
     * Gets the rangeInternacional value for this DadosDestino.
     * 
     * @return rangeInternacional
     */
    public com.gvt.www.metaData.configuradoronline.DadosRangeInternacional getRangeInternacional() {
        return rangeInternacional;
    }


    /**
     * Sets the rangeInternacional value for this DadosDestino.
     * 
     * @param rangeInternacional
     */
    public void setRangeInternacional(com.gvt.www.metaData.configuradoronline.DadosRangeInternacional rangeInternacional) {
        this.rangeInternacional = rangeInternacional;
    }


    /**
     * Gets the numero value for this DadosDestino.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this DadosDestino.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosDestino)) return false;
        DadosDestino other = (DadosDestino) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rangeNacional==null && other.getRangeNacional()==null) || 
             (this.rangeNacional!=null &&
              this.rangeNacional.equals(other.getRangeNacional()))) &&
            ((this.rangeInternacional==null && other.getRangeInternacional()==null) || 
             (this.rangeInternacional!=null &&
              this.rangeInternacional.equals(other.getRangeInternacional()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero())));
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
        if (getRangeNacional() != null) {
            _hashCode += getRangeNacional().hashCode();
        }
        if (getRangeInternacional() != null) {
            _hashCode += getRangeInternacional().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosDestino.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosDestino"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "rangeNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosRangeNacional"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "rangeInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosRangeInternacional"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "numero"));
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
