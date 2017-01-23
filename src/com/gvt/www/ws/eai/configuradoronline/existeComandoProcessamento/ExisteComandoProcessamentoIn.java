/**
 * ExisteComandoProcessamentoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.existeComandoProcessamento;

public class ExisteComandoProcessamentoIn  implements java.io.Serializable {
    private com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando;

    public ExisteComandoProcessamentoIn() {
    }

    public ExisteComandoProcessamentoIn(
           com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando) {
           this.comando = comando;
    }


    /**
     * Gets the comando value for this ExisteComandoProcessamentoIn.
     * 
     * @return comando
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoExecucao getComando() {
        return comando;
    }


    /**
     * Sets the comando value for this ExisteComandoProcessamentoIn.
     * 
     * @param comando
     */
    public void setComando(com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando) {
        this.comando = comando;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExisteComandoProcessamentoIn)) return false;
        ExisteComandoProcessamentoIn other = (ExisteComandoProcessamentoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comando==null && other.getComando()==null) || 
             (this.comando!=null &&
              this.comando.equals(other.getComando())));
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
        if (getComando() != null) {
            _hashCode += getComando().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExisteComandoProcessamentoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/existeComandoProcessamento", "ExisteComandoProcessamentoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comando");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/existeComandoProcessamento", "comando"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoExecucao"));
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
