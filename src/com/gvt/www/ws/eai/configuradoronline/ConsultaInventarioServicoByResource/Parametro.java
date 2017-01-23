/**
 * Parametro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource;

public class Parametro  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String valorStr;

    private java.util.Calendar valorDt;

    public Parametro() {
    }

    public Parametro(
           java.lang.String nome,
           java.lang.String valorStr,
           java.util.Calendar valorDt) {
           this.nome = nome;
           this.valorStr = valorStr;
           this.valorDt = valorDt;
    }


    /**
     * Gets the nome value for this Parametro.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Parametro.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the valorStr value for this Parametro.
     * 
     * @return valorStr
     */
    public java.lang.String getValorStr() {
        return valorStr;
    }


    /**
     * Sets the valorStr value for this Parametro.
     * 
     * @param valorStr
     */
    public void setValorStr(java.lang.String valorStr) {
        this.valorStr = valorStr;
    }


    /**
     * Gets the valorDt value for this Parametro.
     * 
     * @return valorDt
     */
    public java.util.Calendar getValorDt() {
        return valorDt;
    }


    /**
     * Sets the valorDt value for this Parametro.
     * 
     * @param valorDt
     */
    public void setValorDt(java.util.Calendar valorDt) {
        this.valorDt = valorDt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Parametro)) return false;
        Parametro other = (Parametro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.valorStr==null && other.getValorStr()==null) || 
             (this.valorStr!=null &&
              this.valorStr.equals(other.getValorStr()))) &&
            ((this.valorDt==null && other.getValorDt()==null) || 
             (this.valorDt!=null &&
              this.valorDt.equals(other.getValorDt())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getValorStr() != null) {
            _hashCode += getValorStr().hashCode();
        }
        if (getValorDt() != null) {
            _hashCode += getValorDt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Parametro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "Parametro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorStr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "valorStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "valorDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
