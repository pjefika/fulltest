/**
 * ConsultaProcessosIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.consultaProcessos;

public class ConsultaProcessosIn  implements java.io.Serializable {
    private java.lang.String codigoArea;

    private com.gvt.www.metaData.configuradoronline.TipoComando codigoTipo;

    private java.lang.String sistemaOrigem;

    private java.lang.Integer[] codigoPerfil;

    public ConsultaProcessosIn() {
    }

    public ConsultaProcessosIn(
           java.lang.String codigoArea,
           com.gvt.www.metaData.configuradoronline.TipoComando codigoTipo,
           java.lang.String sistemaOrigem,
           java.lang.Integer[] codigoPerfil) {
           this.codigoArea = codigoArea;
           this.codigoTipo = codigoTipo;
           this.sistemaOrigem = sistemaOrigem;
           this.codigoPerfil = codigoPerfil;
    }


    /**
     * Gets the codigoArea value for this ConsultaProcessosIn.
     * 
     * @return codigoArea
     */
    public java.lang.String getCodigoArea() {
        return codigoArea;
    }


    /**
     * Sets the codigoArea value for this ConsultaProcessosIn.
     * 
     * @param codigoArea
     */
    public void setCodigoArea(java.lang.String codigoArea) {
        this.codigoArea = codigoArea;
    }


    /**
     * Gets the codigoTipo value for this ConsultaProcessosIn.
     * 
     * @return codigoTipo
     */
    public com.gvt.www.metaData.configuradoronline.TipoComando getCodigoTipo() {
        return codigoTipo;
    }


    /**
     * Sets the codigoTipo value for this ConsultaProcessosIn.
     * 
     * @param codigoTipo
     */
    public void setCodigoTipo(com.gvt.www.metaData.configuradoronline.TipoComando codigoTipo) {
        this.codigoTipo = codigoTipo;
    }


    /**
     * Gets the sistemaOrigem value for this ConsultaProcessosIn.
     * 
     * @return sistemaOrigem
     */
    public java.lang.String getSistemaOrigem() {
        return sistemaOrigem;
    }


    /**
     * Sets the sistemaOrigem value for this ConsultaProcessosIn.
     * 
     * @param sistemaOrigem
     */
    public void setSistemaOrigem(java.lang.String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }


    /**
     * Gets the codigoPerfil value for this ConsultaProcessosIn.
     * 
     * @return codigoPerfil
     */
    public java.lang.Integer[] getCodigoPerfil() {
        return codigoPerfil;
    }


    /**
     * Sets the codigoPerfil value for this ConsultaProcessosIn.
     * 
     * @param codigoPerfil
     */
    public void setCodigoPerfil(java.lang.Integer[] codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public java.lang.Integer getCodigoPerfil(int i) {
        return this.codigoPerfil[i];
    }

    public void setCodigoPerfil(int i, java.lang.Integer _value) {
        this.codigoPerfil[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaProcessosIn)) return false;
        ConsultaProcessosIn other = (ConsultaProcessosIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoArea==null && other.getCodigoArea()==null) || 
             (this.codigoArea!=null &&
              this.codigoArea.equals(other.getCodigoArea()))) &&
            ((this.codigoTipo==null && other.getCodigoTipo()==null) || 
             (this.codigoTipo!=null &&
              this.codigoTipo.equals(other.getCodigoTipo()))) &&
            ((this.sistemaOrigem==null && other.getSistemaOrigem()==null) || 
             (this.sistemaOrigem!=null &&
              this.sistemaOrigem.equals(other.getSistemaOrigem()))) &&
            ((this.codigoPerfil==null && other.getCodigoPerfil()==null) || 
             (this.codigoPerfil!=null &&
              java.util.Arrays.equals(this.codigoPerfil, other.getCodigoPerfil())));
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
        if (getCodigoArea() != null) {
            _hashCode += getCodigoArea().hashCode();
        }
        if (getCodigoTipo() != null) {
            _hashCode += getCodigoTipo().hashCode();
        }
        if (getSistemaOrigem() != null) {
            _hashCode += getSistemaOrigem().hashCode();
        }
        if (getCodigoPerfil() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodigoPerfil());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodigoPerfil(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaProcessosIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "ConsultaProcessosIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "codigoArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "codigoTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "TipoComando"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "sistemaOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPerfil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaProcessos", "codigoPerfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
