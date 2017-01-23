/**
 * ConsultaDadosServicoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.dadosServico;

public class ConsultaDadosServicoIn  implements java.io.Serializable {
    private java.lang.String rpon;

    private java.lang.String designador;

    private com.gvt.www.ws.eai.configuradoronline.dadosServico.Filtro filtro;

    public ConsultaDadosServicoIn() {
    }

    public ConsultaDadosServicoIn(
           java.lang.String rpon,
           java.lang.String designador,
           com.gvt.www.ws.eai.configuradoronline.dadosServico.Filtro filtro) {
           this.rpon = rpon;
           this.designador = designador;
           this.filtro = filtro;
    }


    /**
     * Gets the rpon value for this ConsultaDadosServicoIn.
     * 
     * @return rpon
     */
    public java.lang.String getRpon() {
        return rpon;
    }


    /**
     * Sets the rpon value for this ConsultaDadosServicoIn.
     * 
     * @param rpon
     */
    public void setRpon(java.lang.String rpon) {
        this.rpon = rpon;
    }


    /**
     * Gets the designador value for this ConsultaDadosServicoIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this ConsultaDadosServicoIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the filtro value for this ConsultaDadosServicoIn.
     * 
     * @return filtro
     */
    public com.gvt.www.ws.eai.configuradoronline.dadosServico.Filtro getFiltro() {
        return filtro;
    }


    /**
     * Sets the filtro value for this ConsultaDadosServicoIn.
     * 
     * @param filtro
     */
    public void setFiltro(com.gvt.www.ws.eai.configuradoronline.dadosServico.Filtro filtro) {
        this.filtro = filtro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaDadosServicoIn)) return false;
        ConsultaDadosServicoIn other = (ConsultaDadosServicoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rpon==null && other.getRpon()==null) || 
             (this.rpon!=null &&
              this.rpon.equals(other.getRpon()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.filtro==null && other.getFiltro()==null) || 
             (this.filtro!=null &&
              this.filtro.equals(other.getFiltro())));
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
        if (getRpon() != null) {
            _hashCode += getRpon().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getFiltro() != null) {
            _hashCode += getFiltro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaDadosServicoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "consultaDadosServicoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "rpon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filtro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "filtro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "Filtro"));
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
