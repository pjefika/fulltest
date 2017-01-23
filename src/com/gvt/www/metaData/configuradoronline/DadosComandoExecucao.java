/**
 * DadosComandoExecucao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosComandoExecucao  extends com.gvt.www.metaData.configuradoronline.DadosComando  implements java.io.Serializable {
    private java.lang.String pon;

    private java.lang.String instancia;

    private java.lang.String designador;

    private java.lang.String designadorTv;

    private com.gvt.www.metaData.configuradoronline.DadosDestino destino;

    private java.lang.Boolean force;

    private java.lang.Boolean redisparado;

    private java.lang.Boolean reconciliacao;

    public DadosComandoExecucao() {
    }

    public DadosComandoExecucao(
           com.gvt.www.metaData.configuradoronline.TipoComando codigoTipo,
           java.lang.String codigoArea,
           java.lang.String codigoProcesso,
           java.util.Calendar data,
           java.lang.String responsavel,
           java.lang.String sistemaOrigem,
           java.lang.Integer percentual,
           java.lang.String[] whiteList,
           com.gvt.www.metaData.configuradoronline.DadosOpcoesConfigurarLinha opcoesConfigurarLinha,
           br.com.gvt.www.oss.necservice.ConfigurarLinhaIn opcoesConfigurarLinhaSAS,
           java.math.BigInteger idCaso,
           java.lang.String pon,
           java.lang.String instancia,
           java.lang.String designador,
           java.lang.String designadorTv,
           com.gvt.www.metaData.configuradoronline.DadosDestino destino,
           java.lang.Boolean force,
           java.lang.Boolean redisparado,
           java.lang.Boolean reconciliacao) {
        super(
            codigoTipo,
            codigoArea,
            codigoProcesso,
            data,
            responsavel,
            sistemaOrigem,
            percentual,
            whiteList,
            opcoesConfigurarLinha,
            opcoesConfigurarLinhaSAS,
            idCaso);
        this.pon = pon;
        this.instancia = instancia;
        this.designador = designador;
        this.designadorTv = designadorTv;
        this.destino = destino;
        this.force = force;
        this.redisparado = redisparado;
        this.reconciliacao = reconciliacao;
    }


    /**
     * Gets the pon value for this DadosComandoExecucao.
     * 
     * @return pon
     */
    public java.lang.String getPon() {
        return pon;
    }


    /**
     * Sets the pon value for this DadosComandoExecucao.
     * 
     * @param pon
     */
    public void setPon(java.lang.String pon) {
        this.pon = pon;
    }


    /**
     * Gets the instancia value for this DadosComandoExecucao.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this DadosComandoExecucao.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the designador value for this DadosComandoExecucao.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this DadosComandoExecucao.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the designadorTv value for this DadosComandoExecucao.
     * 
     * @return designadorTv
     */
    public java.lang.String getDesignadorTv() {
        return designadorTv;
    }


    /**
     * Sets the designadorTv value for this DadosComandoExecucao.
     * 
     * @param designadorTv
     */
    public void setDesignadorTv(java.lang.String designadorTv) {
        this.designadorTv = designadorTv;
    }


    /**
     * Gets the destino value for this DadosComandoExecucao.
     * 
     * @return destino
     */
    public com.gvt.www.metaData.configuradoronline.DadosDestino getDestino() {
        return destino;
    }


    /**
     * Sets the destino value for this DadosComandoExecucao.
     * 
     * @param destino
     */
    public void setDestino(com.gvt.www.metaData.configuradoronline.DadosDestino destino) {
        this.destino = destino;
    }


    /**
     * Gets the force value for this DadosComandoExecucao.
     * 
     * @return force
     */
    public java.lang.Boolean getForce() {
        return force;
    }


    /**
     * Sets the force value for this DadosComandoExecucao.
     * 
     * @param force
     */
    public void setForce(java.lang.Boolean force) {
        this.force = force;
    }


    /**
     * Gets the redisparado value for this DadosComandoExecucao.
     * 
     * @return redisparado
     */
    public java.lang.Boolean getRedisparado() {
        return redisparado;
    }


    /**
     * Sets the redisparado value for this DadosComandoExecucao.
     * 
     * @param redisparado
     */
    public void setRedisparado(java.lang.Boolean redisparado) {
        this.redisparado = redisparado;
    }


    /**
     * Gets the reconciliacao value for this DadosComandoExecucao.
     * 
     * @return reconciliacao
     */
    public java.lang.Boolean getReconciliacao() {
        return reconciliacao;
    }


    /**
     * Sets the reconciliacao value for this DadosComandoExecucao.
     * 
     * @param reconciliacao
     */
    public void setReconciliacao(java.lang.Boolean reconciliacao) {
        this.reconciliacao = reconciliacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosComandoExecucao)) return false;
        DadosComandoExecucao other = (DadosComandoExecucao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pon==null && other.getPon()==null) || 
             (this.pon!=null &&
              this.pon.equals(other.getPon()))) &&
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
            ((this.force==null && other.getForce()==null) || 
             (this.force!=null &&
              this.force.equals(other.getForce()))) &&
            ((this.redisparado==null && other.getRedisparado()==null) || 
             (this.redisparado!=null &&
              this.redisparado.equals(other.getRedisparado()))) &&
            ((this.reconciliacao==null && other.getReconciliacao()==null) || 
             (this.reconciliacao!=null &&
              this.reconciliacao.equals(other.getReconciliacao())));
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
        if (getPon() != null) {
            _hashCode += getPon().hashCode();
        }
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
        if (getForce() != null) {
            _hashCode += getForce().hashCode();
        }
        if (getRedisparado() != null) {
            _hashCode += getRedisparado().hashCode();
        }
        if (getReconciliacao() != null) {
            _hashCode += getReconciliacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosComandoExecucao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoExecucao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "pon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("force");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "force"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redisparado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "redisparado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "reconciliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
