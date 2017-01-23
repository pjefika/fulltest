/**
 * ConsultaInventarioServicoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico;

public class ConsultaInventarioServicoIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorServico identificadorServico;

    private com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorProduto identificadorProduto;

    public ConsultaInventarioServicoIn() {
    }

    public ConsultaInventarioServicoIn(
           com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorServico identificadorServico,
           com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorProduto identificadorProduto) {
           this.identificadorServico = identificadorServico;
           this.identificadorProduto = identificadorProduto;
    }


    /**
     * Gets the identificadorServico value for this ConsultaInventarioServicoIn.
     * 
     * @return identificadorServico
     */
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorServico getIdentificadorServico() {
        return identificadorServico;
    }


    /**
     * Sets the identificadorServico value for this ConsultaInventarioServicoIn.
     * 
     * @param identificadorServico
     */
    public void setIdentificadorServico(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorServico identificadorServico) {
        this.identificadorServico = identificadorServico;
    }


    /**
     * Gets the identificadorProduto value for this ConsultaInventarioServicoIn.
     * 
     * @return identificadorProduto
     */
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorProduto getIdentificadorProduto() {
        return identificadorProduto;
    }


    /**
     * Sets the identificadorProduto value for this ConsultaInventarioServicoIn.
     * 
     * @param identificadorProduto
     */
    public void setIdentificadorProduto(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.IdentificadorProduto identificadorProduto) {
        this.identificadorProduto = identificadorProduto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaInventarioServicoIn)) return false;
        ConsultaInventarioServicoIn other = (ConsultaInventarioServicoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificadorServico==null && other.getIdentificadorServico()==null) || 
             (this.identificadorServico!=null &&
              this.identificadorServico.equals(other.getIdentificadorServico()))) &&
            ((this.identificadorProduto==null && other.getIdentificadorProduto()==null) || 
             (this.identificadorProduto!=null &&
              this.identificadorProduto.equals(other.getIdentificadorProduto())));
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
        if (getIdentificadorServico() != null) {
            _hashCode += getIdentificadorServico().hashCode();
        }
        if (getIdentificadorProduto() != null) {
            _hashCode += getIdentificadorProduto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaInventarioServicoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "ConsultaInventarioServicoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "identificadorServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "IdentificadorServico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "identificadorProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "IdentificadorProduto"));
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
