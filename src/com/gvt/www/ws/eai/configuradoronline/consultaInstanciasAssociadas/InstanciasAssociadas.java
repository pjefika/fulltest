/**
 * InstanciasAssociadas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas;

public class InstanciasAssociadas  implements java.io.Serializable {
    private java.lang.String linha;

    private com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.InstanciasAssociadasTecnologiaLinha tecnologiaLinha;

    private java.lang.String designadorTurbonet;

    private java.lang.String designadorTV;

    public InstanciasAssociadas() {
    }

    public InstanciasAssociadas(
           java.lang.String linha,
           com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.InstanciasAssociadasTecnologiaLinha tecnologiaLinha,
           java.lang.String designadorTurbonet,
           java.lang.String designadorTV) {
           this.linha = linha;
           this.tecnologiaLinha = tecnologiaLinha;
           this.designadorTurbonet = designadorTurbonet;
           this.designadorTV = designadorTV;
    }


    /**
     * Gets the linha value for this InstanciasAssociadas.
     * 
     * @return linha
     */
    public java.lang.String getLinha() {
        return linha;
    }


    /**
     * Sets the linha value for this InstanciasAssociadas.
     * 
     * @param linha
     */
    public void setLinha(java.lang.String linha) {
        this.linha = linha;
    }


    /**
     * Gets the tecnologiaLinha value for this InstanciasAssociadas.
     * 
     * @return tecnologiaLinha
     */
    public com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.InstanciasAssociadasTecnologiaLinha getTecnologiaLinha() {
        return tecnologiaLinha;
    }


    /**
     * Sets the tecnologiaLinha value for this InstanciasAssociadas.
     * 
     * @param tecnologiaLinha
     */
    public void setTecnologiaLinha(com.gvt.www.ws.eai.configuradoronline.consultaInstanciasAssociadas.InstanciasAssociadasTecnologiaLinha tecnologiaLinha) {
        this.tecnologiaLinha = tecnologiaLinha;
    }


    /**
     * Gets the designadorTurbonet value for this InstanciasAssociadas.
     * 
     * @return designadorTurbonet
     */
    public java.lang.String getDesignadorTurbonet() {
        return designadorTurbonet;
    }


    /**
     * Sets the designadorTurbonet value for this InstanciasAssociadas.
     * 
     * @param designadorTurbonet
     */
    public void setDesignadorTurbonet(java.lang.String designadorTurbonet) {
        this.designadorTurbonet = designadorTurbonet;
    }


    /**
     * Gets the designadorTV value for this InstanciasAssociadas.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this InstanciasAssociadas.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstanciasAssociadas)) return false;
        InstanciasAssociadas other = (InstanciasAssociadas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linha==null && other.getLinha()==null) || 
             (this.linha!=null &&
              this.linha.equals(other.getLinha()))) &&
            ((this.tecnologiaLinha==null && other.getTecnologiaLinha()==null) || 
             (this.tecnologiaLinha!=null &&
              this.tecnologiaLinha.equals(other.getTecnologiaLinha()))) &&
            ((this.designadorTurbonet==null && other.getDesignadorTurbonet()==null) || 
             (this.designadorTurbonet!=null &&
              this.designadorTurbonet.equals(other.getDesignadorTurbonet()))) &&
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV())));
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
        if (getLinha() != null) {
            _hashCode += getLinha().hashCode();
        }
        if (getTecnologiaLinha() != null) {
            _hashCode += getTecnologiaLinha().hashCode();
        }
        if (getDesignadorTurbonet() != null) {
            _hashCode += getDesignadorTurbonet().hashCode();
        }
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstanciasAssociadas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "InstanciasAssociadas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "linha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologiaLinha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "tecnologiaLinha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", ">InstanciasAssociadas>tecnologiaLinha"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTurbonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "designadorTurbonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaInstanciasAssociadas", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
