/**
 * ConsultarEquipamentosTVIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultarEquipamentosTVIn  implements java.io.Serializable {
    private java.lang.String designadorDeTV;

    public ConsultarEquipamentosTVIn() {
    }

    public ConsultarEquipamentosTVIn(
           java.lang.String designadorDeTV) {
           this.designadorDeTV = designadorDeTV;
    }


    /**
     * Gets the designadorDeTV value for this ConsultarEquipamentosTVIn.
     * 
     * @return designadorDeTV
     */
    public java.lang.String getDesignadorDeTV() {
        return designadorDeTV;
    }


    /**
     * Sets the designadorDeTV value for this ConsultarEquipamentosTVIn.
     * 
     * @param designadorDeTV
     */
    public void setDesignadorDeTV(java.lang.String designadorDeTV) {
        this.designadorDeTV = designadorDeTV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarEquipamentosTVIn)) return false;
        ConsultarEquipamentosTVIn other = (ConsultarEquipamentosTVIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorDeTV==null && other.getDesignadorDeTV()==null) || 
             (this.designadorDeTV!=null &&
              this.designadorDeTV.equals(other.getDesignadorDeTV())));
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
        if (getDesignadorDeTV() != null) {
            _hashCode += getDesignadorDeTV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarEquipamentosTVIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosTVIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorDeTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorDeTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
