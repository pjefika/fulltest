/**
 * Filtro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.dadosServico;

public class Filtro  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.dadosServico.InfoCatalago catalogo;

    private java.lang.String[] nomeParametro;

    public Filtro() {
    }

    public Filtro(
           com.gvt.www.ws.eai.configuradoronline.dadosServico.InfoCatalago catalogo,
           java.lang.String[] nomeParametro) {
           this.catalogo = catalogo;
           this.nomeParametro = nomeParametro;
    }


    /**
     * Gets the catalogo value for this Filtro.
     * 
     * @return catalogo
     */
    public com.gvt.www.ws.eai.configuradoronline.dadosServico.InfoCatalago getCatalogo() {
        return catalogo;
    }


    /**
     * Sets the catalogo value for this Filtro.
     * 
     * @param catalogo
     */
    public void setCatalogo(com.gvt.www.ws.eai.configuradoronline.dadosServico.InfoCatalago catalogo) {
        this.catalogo = catalogo;
    }


    /**
     * Gets the nomeParametro value for this Filtro.
     * 
     * @return nomeParametro
     */
    public java.lang.String[] getNomeParametro() {
        return nomeParametro;
    }


    /**
     * Sets the nomeParametro value for this Filtro.
     * 
     * @param nomeParametro
     */
    public void setNomeParametro(java.lang.String[] nomeParametro) {
        this.nomeParametro = nomeParametro;
    }

    public java.lang.String getNomeParametro(int i) {
        return this.nomeParametro[i];
    }

    public void setNomeParametro(int i, java.lang.String _value) {
        this.nomeParametro[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filtro)) return false;
        Filtro other = (Filtro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.catalogo==null && other.getCatalogo()==null) || 
             (this.catalogo!=null &&
              this.catalogo.equals(other.getCatalogo()))) &&
            ((this.nomeParametro==null && other.getNomeParametro()==null) || 
             (this.nomeParametro!=null &&
              java.util.Arrays.equals(this.nomeParametro, other.getNomeParametro())));
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
        if (getCatalogo() != null) {
            _hashCode += getCatalogo().hashCode();
        }
        if (getNomeParametro() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNomeParametro());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNomeParametro(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Filtro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "Filtro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "catalogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "InfoCatalago"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeParametro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "nomeParametro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
