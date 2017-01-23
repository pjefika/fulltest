/**
 * DadosComandoAtivacaoBloqueio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosComandoAtivacaoBloqueio  extends com.gvt.www.metaData.configuradoronline.DadosComandoAtivacao  implements java.io.Serializable {
    private java.lang.String numero;

    private java.lang.String designador;

    private java.lang.String designadorTv;

    private java.lang.String bloqueioAnterior;

    private java.lang.String novoBloqueio;

    public DadosComandoAtivacaoBloqueio() {
    }

    public DadosComandoAtivacaoBloqueio(
           long id,
           java.lang.String numero,
           java.lang.String designador,
           java.lang.String designadorTv,
           java.lang.String bloqueioAnterior,
           java.lang.String novoBloqueio) {
        super(
            id);
        this.numero = numero;
        this.designador = designador;
        this.designadorTv = designadorTv;
        this.bloqueioAnterior = bloqueioAnterior;
        this.novoBloqueio = novoBloqueio;
    }


    /**
     * Gets the numero value for this DadosComandoAtivacaoBloqueio.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this DadosComandoAtivacaoBloqueio.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the designador value for this DadosComandoAtivacaoBloqueio.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this DadosComandoAtivacaoBloqueio.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the designadorTv value for this DadosComandoAtivacaoBloqueio.
     * 
     * @return designadorTv
     */
    public java.lang.String getDesignadorTv() {
        return designadorTv;
    }


    /**
     * Sets the designadorTv value for this DadosComandoAtivacaoBloqueio.
     * 
     * @param designadorTv
     */
    public void setDesignadorTv(java.lang.String designadorTv) {
        this.designadorTv = designadorTv;
    }


    /**
     * Gets the bloqueioAnterior value for this DadosComandoAtivacaoBloqueio.
     * 
     * @return bloqueioAnterior
     */
    public java.lang.String getBloqueioAnterior() {
        return bloqueioAnterior;
    }


    /**
     * Sets the bloqueioAnterior value for this DadosComandoAtivacaoBloqueio.
     * 
     * @param bloqueioAnterior
     */
    public void setBloqueioAnterior(java.lang.String bloqueioAnterior) {
        this.bloqueioAnterior = bloqueioAnterior;
    }


    /**
     * Gets the novoBloqueio value for this DadosComandoAtivacaoBloqueio.
     * 
     * @return novoBloqueio
     */
    public java.lang.String getNovoBloqueio() {
        return novoBloqueio;
    }


    /**
     * Sets the novoBloqueio value for this DadosComandoAtivacaoBloqueio.
     * 
     * @param novoBloqueio
     */
    public void setNovoBloqueio(java.lang.String novoBloqueio) {
        this.novoBloqueio = novoBloqueio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosComandoAtivacaoBloqueio)) return false;
        DadosComandoAtivacaoBloqueio other = (DadosComandoAtivacaoBloqueio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.designadorTv==null && other.getDesignadorTv()==null) || 
             (this.designadorTv!=null &&
              this.designadorTv.equals(other.getDesignadorTv()))) &&
            ((this.bloqueioAnterior==null && other.getBloqueioAnterior()==null) || 
             (this.bloqueioAnterior!=null &&
              this.bloqueioAnterior.equals(other.getBloqueioAnterior()))) &&
            ((this.novoBloqueio==null && other.getNovoBloqueio()==null) || 
             (this.novoBloqueio!=null &&
              this.novoBloqueio.equals(other.getNovoBloqueio())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getDesignadorTv() != null) {
            _hashCode += getDesignadorTv().hashCode();
        }
        if (getBloqueioAnterior() != null) {
            _hashCode += getBloqueioAnterior().hashCode();
        }
        if (getNovoBloqueio() != null) {
            _hashCode += getNovoBloqueio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosComandoAtivacaoBloqueio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoBloqueio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "designadorTv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bloqueioAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "bloqueioAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("novoBloqueio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "novoBloqueio"));
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
