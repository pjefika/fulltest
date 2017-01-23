/**
 * PersistirDadosServicosIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.dadosServico;

public class PersistirDadosServicosIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.dadosServico.InstanciaProduto produto;

    public PersistirDadosServicosIn() {
    }

    public PersistirDadosServicosIn(
           com.gvt.www.ws.eai.configuradoronline.dadosServico.InstanciaProduto produto) {
           this.produto = produto;
    }


    /**
     * Gets the produto value for this PersistirDadosServicosIn.
     * 
     * @return produto
     */
    public com.gvt.www.ws.eai.configuradoronline.dadosServico.InstanciaProduto getProduto() {
        return produto;
    }


    /**
     * Sets the produto value for this PersistirDadosServicosIn.
     * 
     * @param produto
     */
    public void setProduto(com.gvt.www.ws.eai.configuradoronline.dadosServico.InstanciaProduto produto) {
        this.produto = produto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersistirDadosServicosIn)) return false;
        PersistirDadosServicosIn other = (PersistirDadosServicosIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.produto==null && other.getProduto()==null) || 
             (this.produto!=null &&
              this.produto.equals(other.getProduto())));
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
        if (getProduto() != null) {
            _hashCode += getProduto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersistirDadosServicosIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "persistirDadosServicosIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "produto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "InstanciaProduto"));
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
