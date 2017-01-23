/**
 * IdentificadorServico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico;

public class IdentificadorServico  implements java.io.Serializable {
    private java.math.BigInteger idInstanciaServico;

    private java.lang.String idElementoCrm;

    public IdentificadorServico() {
    }

    public IdentificadorServico(
           java.math.BigInteger idInstanciaServico,
           java.lang.String idElementoCrm) {
           this.idInstanciaServico = idInstanciaServico;
           this.idElementoCrm = idElementoCrm;
    }


    /**
     * Gets the idInstanciaServico value for this IdentificadorServico.
     * 
     * @return idInstanciaServico
     */
    public java.math.BigInteger getIdInstanciaServico() {
        return idInstanciaServico;
    }


    /**
     * Sets the idInstanciaServico value for this IdentificadorServico.
     * 
     * @param idInstanciaServico
     */
    public void setIdInstanciaServico(java.math.BigInteger idInstanciaServico) {
        this.idInstanciaServico = idInstanciaServico;
    }


    /**
     * Gets the idElementoCrm value for this IdentificadorServico.
     * 
     * @return idElementoCrm
     */
    public java.lang.String getIdElementoCrm() {
        return idElementoCrm;
    }


    /**
     * Sets the idElementoCrm value for this IdentificadorServico.
     * 
     * @param idElementoCrm
     */
    public void setIdElementoCrm(java.lang.String idElementoCrm) {
        this.idElementoCrm = idElementoCrm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificadorServico)) return false;
        IdentificadorServico other = (IdentificadorServico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idInstanciaServico==null && other.getIdInstanciaServico()==null) || 
             (this.idInstanciaServico!=null &&
              this.idInstanciaServico.equals(other.getIdInstanciaServico()))) &&
            ((this.idElementoCrm==null && other.getIdElementoCrm()==null) || 
             (this.idElementoCrm!=null &&
              this.idElementoCrm.equals(other.getIdElementoCrm())));
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
        if (getIdInstanciaServico() != null) {
            _hashCode += getIdInstanciaServico().hashCode();
        }
        if (getIdElementoCrm() != null) {
            _hashCode += getIdElementoCrm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificadorServico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "IdentificadorServico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idInstanciaServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "idInstanciaServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCrm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "idElementoCrm"));
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
