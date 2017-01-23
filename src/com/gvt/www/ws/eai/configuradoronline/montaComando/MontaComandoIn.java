/**
 * MontaComandoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.montaComando;

public class MontaComandoIn  implements java.io.Serializable {
    private com.gvt.www.metaData.configuradoronline.DadosInventario inventario;

    private com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando;

    public MontaComandoIn() {
    }

    public MontaComandoIn(
           com.gvt.www.metaData.configuradoronline.DadosInventario inventario,
           com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando) {
           this.inventario = inventario;
           this.comando = comando;
    }


    /**
     * Gets the inventario value for this MontaComandoIn.
     * 
     * @return inventario
     */
    public com.gvt.www.metaData.configuradoronline.DadosInventario getInventario() {
        return inventario;
    }


    /**
     * Sets the inventario value for this MontaComandoIn.
     * 
     * @param inventario
     */
    public void setInventario(com.gvt.www.metaData.configuradoronline.DadosInventario inventario) {
        this.inventario = inventario;
    }


    /**
     * Gets the comando value for this MontaComandoIn.
     * 
     * @return comando
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoExecucao getComando() {
        return comando;
    }


    /**
     * Sets the comando value for this MontaComandoIn.
     * 
     * @param comando
     */
    public void setComando(com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando) {
        this.comando = comando;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MontaComandoIn)) return false;
        MontaComandoIn other = (MontaComandoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inventario==null && other.getInventario()==null) || 
             (this.inventario!=null &&
              this.inventario.equals(other.getInventario()))) &&
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
        if (getInventario() != null) {
            _hashCode += getInventario().hashCode();
        }
        if (getComando() != null) {
            _hashCode += getComando().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MontaComandoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "MontaComandoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "inventario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosInventario"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comando");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "comando"));
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
