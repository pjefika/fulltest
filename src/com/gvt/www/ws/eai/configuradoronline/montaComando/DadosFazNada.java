/**
 * DadosFazNada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.montaComando;

public class DadosFazNada  implements java.io.Serializable {
    private com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusInventario;

    public DadosFazNada() {
    }

    public DadosFazNada(
           com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusInventario) {
           this.statusInventario = statusInventario;
    }


    /**
     * Gets the statusInventario value for this DadosFazNada.
     * 
     * @return statusInventario
     */
    public com.gvt.www.metaData.configuradoronline.DadosStatusExecucao getStatusInventario() {
        return statusInventario;
    }


    /**
     * Sets the statusInventario value for this DadosFazNada.
     * 
     * @param statusInventario
     */
    public void setStatusInventario(com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusInventario) {
        this.statusInventario = statusInventario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosFazNada)) return false;
        DadosFazNada other = (DadosFazNada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusInventario==null && other.getStatusInventario()==null) || 
             (this.statusInventario!=null &&
              this.statusInventario.equals(other.getStatusInventario())));
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
        if (getStatusInventario() != null) {
            _hashCode += getStatusInventario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosFazNada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "DadosFazNada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInventario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "statusInventario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusExecucao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
