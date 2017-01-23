/**
 * ConsultarEquipamentosSAPIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultarEquipamentosSAPIn  implements java.io.Serializable {
    private java.lang.String ordemSiebel;

    public ConsultarEquipamentosSAPIn() {
    }

    public ConsultarEquipamentosSAPIn(
           java.lang.String ordemSiebel) {
           this.ordemSiebel = ordemSiebel;
    }


    /**
     * Gets the ordemSiebel value for this ConsultarEquipamentosSAPIn.
     * 
     * @return ordemSiebel
     */
    public java.lang.String getOrdemSiebel() {
        return ordemSiebel;
    }


    /**
     * Sets the ordemSiebel value for this ConsultarEquipamentosSAPIn.
     * 
     * @param ordemSiebel
     */
    public void setOrdemSiebel(java.lang.String ordemSiebel) {
        this.ordemSiebel = ordemSiebel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarEquipamentosSAPIn)) return false;
        ConsultarEquipamentosSAPIn other = (ConsultarEquipamentosSAPIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ordemSiebel==null && other.getOrdemSiebel()==null) || 
             (this.ordemSiebel!=null &&
              this.ordemSiebel.equals(other.getOrdemSiebel())));
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
        if (getOrdemSiebel() != null) {
            _hashCode += getOrdemSiebel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarEquipamentosSAPIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosSAPIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordemSiebel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ordemSiebel"));
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
