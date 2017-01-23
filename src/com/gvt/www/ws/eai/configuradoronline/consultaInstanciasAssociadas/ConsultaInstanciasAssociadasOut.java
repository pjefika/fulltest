/**
 * ConsultaInstanciasAssociadasOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas;

public class ConsultaInstanciasAssociadasOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.InstanciasAssociadas instanciasAssociadas;

    public ConsultaInstanciasAssociadasOut() {
    }

    public ConsultaInstanciasAssociadasOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.InstanciasAssociadas instanciasAssociadas) {
        super(
            codigo,
            mensagem,
            descricao);
        this.instanciasAssociadas = instanciasAssociadas;
    }


    /**
     * Gets the instanciasAssociadas value for this ConsultaInstanciasAssociadasOut.
     * 
     * @return instanciasAssociadas
     */
    public com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.InstanciasAssociadas getInstanciasAssociadas() {
        return instanciasAssociadas;
    }


    /**
     * Sets the instanciasAssociadas value for this ConsultaInstanciasAssociadasOut.
     * 
     * @param instanciasAssociadas
     */
    public void setInstanciasAssociadas(com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.InstanciasAssociadas instanciasAssociadas) {
        this.instanciasAssociadas = instanciasAssociadas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaInstanciasAssociadasOut)) return false;
        ConsultaInstanciasAssociadasOut other = (ConsultaInstanciasAssociadasOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.instanciasAssociadas==null && other.getInstanciasAssociadas()==null) || 
             (this.instanciasAssociadas!=null &&
              this.instanciasAssociadas.equals(other.getInstanciasAssociadas())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getInstanciasAssociadas() != null) {
            _hashCode += getInstanciasAssociadas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaInstanciasAssociadasOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "ConsultaInstanciasAssociadasOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanciasAssociadas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "instanciasAssociadas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "InstanciasAssociadas"));
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
