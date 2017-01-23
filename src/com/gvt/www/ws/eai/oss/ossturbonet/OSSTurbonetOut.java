/**
 * OSSTurbonetOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.ossturbonet;

public class OSSTurbonetOut  implements java.io.Serializable {
    private java.math.BigInteger codigoRetorno;

    private java.lang.String descricaoRetorno;

    public OSSTurbonetOut() {
    }

    public OSSTurbonetOut(
           java.math.BigInteger codigoRetorno,
           java.lang.String descricaoRetorno) {
           this.codigoRetorno = codigoRetorno;
           this.descricaoRetorno = descricaoRetorno;
    }


    /**
     * Gets the codigoRetorno value for this OSSTurbonetOut.
     * 
     * @return codigoRetorno
     */
    public java.math.BigInteger getCodigoRetorno() {
        return codigoRetorno;
    }


    /**
     * Sets the codigoRetorno value for this OSSTurbonetOut.
     * 
     * @param codigoRetorno
     */
    public void setCodigoRetorno(java.math.BigInteger codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }


    /**
     * Gets the descricaoRetorno value for this OSSTurbonetOut.
     * 
     * @return descricaoRetorno
     */
    public java.lang.String getDescricaoRetorno() {
        return descricaoRetorno;
    }


    /**
     * Sets the descricaoRetorno value for this OSSTurbonetOut.
     * 
     * @param descricaoRetorno
     */
    public void setDescricaoRetorno(java.lang.String descricaoRetorno) {
        this.descricaoRetorno = descricaoRetorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetOut)) return false;
        OSSTurbonetOut other = (OSSTurbonetOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoRetorno==null && other.getCodigoRetorno()==null) || 
             (this.codigoRetorno!=null &&
              this.codigoRetorno.equals(other.getCodigoRetorno()))) &&
            ((this.descricaoRetorno==null && other.getDescricaoRetorno()==null) || 
             (this.descricaoRetorno!=null &&
              this.descricaoRetorno.equals(other.getDescricaoRetorno())));
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
        if (getCodigoRetorno() != null) {
            _hashCode += getCodigoRetorno().hashCode();
        }
        if (getDescricaoRetorno() != null) {
            _hashCode += getDescricaoRetorno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "codigoRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "descricaoRetorno"));
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
