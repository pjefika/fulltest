/**
 * CriarInstanciaProdutoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto;

public class CriarInstanciaProdutoOut  implements java.io.Serializable {
    private java.lang.Integer idInstanciaProduto;

    public CriarInstanciaProdutoOut() {
    }

    public CriarInstanciaProdutoOut(
           java.lang.Integer idInstanciaProduto) {
           this.idInstanciaProduto = idInstanciaProduto;
    }


    /**
     * Gets the idInstanciaProduto value for this CriarInstanciaProdutoOut.
     * 
     * @return idInstanciaProduto
     */
    public java.lang.Integer getIdInstanciaProduto() {
        return idInstanciaProduto;
    }


    /**
     * Sets the idInstanciaProduto value for this CriarInstanciaProdutoOut.
     * 
     * @param idInstanciaProduto
     */
    public void setIdInstanciaProduto(java.lang.Integer idInstanciaProduto) {
        this.idInstanciaProduto = idInstanciaProduto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriarInstanciaProdutoOut)) return false;
        CriarInstanciaProdutoOut other = (CriarInstanciaProdutoOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idInstanciaProduto==null && other.getIdInstanciaProduto()==null) || 
             (this.idInstanciaProduto!=null &&
              this.idInstanciaProduto.equals(other.getIdInstanciaProduto())));
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
        if (getIdInstanciaProduto() != null) {
            _hashCode += getIdInstanciaProduto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriarInstanciaProdutoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "criarInstanciaProdutoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idInstanciaProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "idInstanciaProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
