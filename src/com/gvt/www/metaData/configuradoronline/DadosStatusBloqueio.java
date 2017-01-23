/**
 * DadosStatusBloqueio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosStatusBloqueio  implements java.io.Serializable {
    private java.lang.String instancia;

    private java.lang.String designador;

    private java.lang.String designadorTv;

    private com.gvt.www.metaData.configuradoronline.DadosDestino destino;

    private com.gvt.www.metaData.configuradoronline.DadosArea[] protecaoBloqueio;

    private com.gvt.www.metaData.configuradoronline.DadosComandoInventario[] comando;

    public DadosStatusBloqueio() {
    }

    public DadosStatusBloqueio(
           java.lang.String instancia,
           java.lang.String designador,
           java.lang.String designadorTv,
           com.gvt.www.metaData.configuradoronline.DadosDestino destino,
           com.gvt.www.metaData.configuradoronline.DadosArea[] protecaoBloqueio,
           com.gvt.www.metaData.configuradoronline.DadosComandoInventario[] comando) {
           this.instancia = instancia;
           this.designador = designador;
           this.designadorTv = designadorTv;
           this.destino = destino;
           this.protecaoBloqueio = protecaoBloqueio;
           this.comando = comando;
    }


    /**
     * Gets the instancia value for this DadosStatusBloqueio.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this DadosStatusBloqueio.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the designador value for this DadosStatusBloqueio.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this DadosStatusBloqueio.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the designadorTv value for this DadosStatusBloqueio.
     * 
     * @return designadorTv
     */
    public java.lang.String getDesignadorTv() {
        return designadorTv;
    }


    /**
     * Sets the designadorTv value for this DadosStatusBloqueio.
     * 
     * @param designadorTv
     */
    public void setDesignadorTv(java.lang.String designadorTv) {
        this.designadorTv = designadorTv;
    }


    /**
     * Gets the destino value for this DadosStatusBloqueio.
     * 
     * @return destino
     */
    public com.gvt.www.metaData.configuradoronline.DadosDestino getDestino() {
        return destino;
    }


    /**
     * Sets the destino value for this DadosStatusBloqueio.
     * 
     * @param destino
     */
    public void setDestino(com.gvt.www.metaData.configuradoronline.DadosDestino destino) {
        this.destino = destino;
    }


    /**
     * Gets the protecaoBloqueio value for this DadosStatusBloqueio.
     * 
     * @return protecaoBloqueio
     */
    public com.gvt.www.metaData.configuradoronline.DadosArea[] getProtecaoBloqueio() {
        return protecaoBloqueio;
    }


    /**
     * Sets the protecaoBloqueio value for this DadosStatusBloqueio.
     * 
     * @param protecaoBloqueio
     */
    public void setProtecaoBloqueio(com.gvt.www.metaData.configuradoronline.DadosArea[] protecaoBloqueio) {
        this.protecaoBloqueio = protecaoBloqueio;
    }

    public com.gvt.www.metaData.configuradoronline.DadosArea getProtecaoBloqueio(int i) {
        return this.protecaoBloqueio[i];
    }

    public void setProtecaoBloqueio(int i, com.gvt.www.metaData.configuradoronline.DadosArea _value) {
        this.protecaoBloqueio[i] = _value;
    }


    /**
     * Gets the comando value for this DadosStatusBloqueio.
     * 
     * @return comando
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoInventario[] getComando() {
        return comando;
    }


    /**
     * Sets the comando value for this DadosStatusBloqueio.
     * 
     * @param comando
     */
    public void setComando(com.gvt.www.metaData.configuradoronline.DadosComandoInventario[] comando) {
        this.comando = comando;
    }

    public com.gvt.www.metaData.configuradoronline.DadosComandoInventario getComando(int i) {
        return this.comando[i];
    }

    public void setComando(int i, com.gvt.www.metaData.configuradoronline.DadosComandoInventario _value) {
        this.comando[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosStatusBloqueio)) return false;
        DadosStatusBloqueio other = (DadosStatusBloqueio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.designadorTv==null && other.getDesignadorTv()==null) || 
             (this.designadorTv!=null &&
              this.designadorTv.equals(other.getDesignadorTv()))) &&
            ((this.destino==null && other.getDestino()==null) || 
             (this.destino!=null &&
              this.destino.equals(other.getDestino()))) &&
            ((this.protecaoBloqueio==null && other.getProtecaoBloqueio()==null) || 
             (this.protecaoBloqueio!=null &&
              java.util.Arrays.equals(this.protecaoBloqueio, other.getProtecaoBloqueio()))) &&
            ((this.comando==null && other.getComando()==null) || 
             (this.comando!=null &&
              java.util.Arrays.equals(this.comando, other.getComando())));
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
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getDesignadorTv() != null) {
            _hashCode += getDesignadorTv().hashCode();
        }
        if (getDestino() != null) {
            _hashCode += getDestino().hashCode();
        }
        if (getProtecaoBloqueio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProtecaoBloqueio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProtecaoBloqueio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComando() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComando());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComando(), i);
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
        new org.apache.axis.description.TypeDesc(DadosStatusBloqueio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusBloqueio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "designadorTv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "destino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosDestino"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protecaoBloqueio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "protecaoBloqueio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosArea"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comando");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "comando"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoInventario"));
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
