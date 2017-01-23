/**
 * IdentificadorProduto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico;

public class IdentificadorProduto  implements java.io.Serializable {
    private java.math.BigInteger idInstanciaProduto;

    private com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorProdutoComposto identificadorProdutoComposto;

    public IdentificadorProduto() {
    }

    public IdentificadorProduto(
           java.math.BigInteger idInstanciaProduto,
           com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorProdutoComposto identificadorProdutoComposto) {
           this.idInstanciaProduto = idInstanciaProduto;
           this.identificadorProdutoComposto = identificadorProdutoComposto;
    }


    /**
     * Gets the idInstanciaProduto value for this IdentificadorProduto.
     * 
     * @return idInstanciaProduto
     */
    public java.math.BigInteger getIdInstanciaProduto() {
        return idInstanciaProduto;
    }


    /**
     * Sets the idInstanciaProduto value for this IdentificadorProduto.
     * 
     * @param idInstanciaProduto
     */
    public void setIdInstanciaProduto(java.math.BigInteger idInstanciaProduto) {
        this.idInstanciaProduto = idInstanciaProduto;
    }


    /**
     * Gets the identificadorProdutoComposto value for this IdentificadorProduto.
     * 
     * @return identificadorProdutoComposto
     */
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorProdutoComposto getIdentificadorProdutoComposto() {
        return identificadorProdutoComposto;
    }


    /**
     * Sets the identificadorProdutoComposto value for this IdentificadorProduto.
     * 
     * @param identificadorProdutoComposto
     */
    public void setIdentificadorProdutoComposto(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorProdutoComposto identificadorProdutoComposto) {
        this.identificadorProdutoComposto = identificadorProdutoComposto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificadorProduto)) return false;
        IdentificadorProduto other = (IdentificadorProduto) obj;
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
              this.idInstanciaProduto.equals(other.getIdInstanciaProduto()))) &&
            ((this.identificadorProdutoComposto==null && other.getIdentificadorProdutoComposto()==null) || 
             (this.identificadorProdutoComposto!=null &&
              this.identificadorProdutoComposto.equals(other.getIdentificadorProdutoComposto())));
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
        if (getIdentificadorProdutoComposto() != null) {
            _hashCode += getIdentificadorProdutoComposto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificadorProduto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "IdentificadorProduto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idInstanciaProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "idInstanciaProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorProdutoComposto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "identificadorProdutoComposto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "IdentificadorProdutoComposto"));
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
