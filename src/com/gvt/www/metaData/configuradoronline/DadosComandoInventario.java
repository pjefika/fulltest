/**
 * DadosComandoInventario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosComandoInventario  extends com.gvt.www.metaData.configuradoronline.DadosComando  implements java.io.Serializable {
    private java.lang.String descricaoTipo;

    private java.lang.String descricaoArea;

    private java.lang.String descricaoProcesso;

    private int id;

    private boolean acumula;

    private java.lang.String origemDestino;

    private java.lang.String cenarioBloqueio;

    private com.gvt.www.metaData.configuradoronline.DadosStatusComando statusComando;

    private com.gvt.www.metaData.configuradoronline.DadosServico[] servico;

    private com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoBloqueio[] comandoAtivacaoBloqueio;

    private com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoLegado comandoAtivacaoLegado;

    private com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoConfigLinha comandoAtivacaoConfigLinha;

    public DadosComandoInventario() {
    }

    public DadosComandoInventario(
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
           java.lang.String descricaoTipo,
           java.lang.String descricaoArea,
           java.lang.String descricaoProcesso,
           int id,
           boolean acumula,
           java.lang.String origemDestino,
           java.lang.String cenarioBloqueio,
           com.gvt.www.metaData.configuradoronline.DadosStatusComando statusComando,
           com.gvt.www.metaData.configuradoronline.DadosServico[] servico,
           com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoBloqueio[] comandoAtivacaoBloqueio,
           com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoLegado comandoAtivacaoLegado,
           com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoConfigLinha comandoAtivacaoConfigLinha) {
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
        this.descricaoTipo = descricaoTipo;
        this.descricaoArea = descricaoArea;
        this.descricaoProcesso = descricaoProcesso;
        this.id = id;
        this.acumula = acumula;
        this.origemDestino = origemDestino;
        this.cenarioBloqueio = cenarioBloqueio;
        this.statusComando = statusComando;
        this.servico = servico;
        this.comandoAtivacaoBloqueio = comandoAtivacaoBloqueio;
        this.comandoAtivacaoLegado = comandoAtivacaoLegado;
        this.comandoAtivacaoConfigLinha = comandoAtivacaoConfigLinha;
    }


    /**
     * Gets the descricaoTipo value for this DadosComandoInventario.
     * 
     * @return descricaoTipo
     */
    public java.lang.String getDescricaoTipo() {
        return descricaoTipo;
    }


    /**
     * Sets the descricaoTipo value for this DadosComandoInventario.
     * 
     * @param descricaoTipo
     */
    public void setDescricaoTipo(java.lang.String descricaoTipo) {
        this.descricaoTipo = descricaoTipo;
    }


    /**
     * Gets the descricaoArea value for this DadosComandoInventario.
     * 
     * @return descricaoArea
     */
    public java.lang.String getDescricaoArea() {
        return descricaoArea;
    }


    /**
     * Sets the descricaoArea value for this DadosComandoInventario.
     * 
     * @param descricaoArea
     */
    public void setDescricaoArea(java.lang.String descricaoArea) {
        this.descricaoArea = descricaoArea;
    }


    /**
     * Gets the descricaoProcesso value for this DadosComandoInventario.
     * 
     * @return descricaoProcesso
     */
    public java.lang.String getDescricaoProcesso() {
        return descricaoProcesso;
    }


    /**
     * Sets the descricaoProcesso value for this DadosComandoInventario.
     * 
     * @param descricaoProcesso
     */
    public void setDescricaoProcesso(java.lang.String descricaoProcesso) {
        this.descricaoProcesso = descricaoProcesso;
    }


    /**
     * Gets the id value for this DadosComandoInventario.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DadosComandoInventario.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the acumula value for this DadosComandoInventario.
     * 
     * @return acumula
     */
    public boolean isAcumula() {
        return acumula;
    }


    /**
     * Sets the acumula value for this DadosComandoInventario.
     * 
     * @param acumula
     */
    public void setAcumula(boolean acumula) {
        this.acumula = acumula;
    }


    /**
     * Gets the origemDestino value for this DadosComandoInventario.
     * 
     * @return origemDestino
     */
    public java.lang.String getOrigemDestino() {
        return origemDestino;
    }


    /**
     * Sets the origemDestino value for this DadosComandoInventario.
     * 
     * @param origemDestino
     */
    public void setOrigemDestino(java.lang.String origemDestino) {
        this.origemDestino = origemDestino;
    }


    /**
     * Gets the cenarioBloqueio value for this DadosComandoInventario.
     * 
     * @return cenarioBloqueio
     */
    public java.lang.String getCenarioBloqueio() {
        return cenarioBloqueio;
    }


    /**
     * Sets the cenarioBloqueio value for this DadosComandoInventario.
     * 
     * @param cenarioBloqueio
     */
    public void setCenarioBloqueio(java.lang.String cenarioBloqueio) {
        this.cenarioBloqueio = cenarioBloqueio;
    }


    /**
     * Gets the statusComando value for this DadosComandoInventario.
     * 
     * @return statusComando
     */
    public com.gvt.www.metaData.configuradoronline.DadosStatusComando getStatusComando() {
        return statusComando;
    }


    /**
     * Sets the statusComando value for this DadosComandoInventario.
     * 
     * @param statusComando
     */
    public void setStatusComando(com.gvt.www.metaData.configuradoronline.DadosStatusComando statusComando) {
        this.statusComando = statusComando;
    }


    /**
     * Gets the servico value for this DadosComandoInventario.
     * 
     * @return servico
     */
    public com.gvt.www.metaData.configuradoronline.DadosServico[] getServico() {
        return servico;
    }


    /**
     * Sets the servico value for this DadosComandoInventario.
     * 
     * @param servico
     */
    public void setServico(com.gvt.www.metaData.configuradoronline.DadosServico[] servico) {
        this.servico = servico;
    }

    public com.gvt.www.metaData.configuradoronline.DadosServico getServico(int i) {
        return this.servico[i];
    }

    public void setServico(int i, com.gvt.www.metaData.configuradoronline.DadosServico _value) {
        this.servico[i] = _value;
    }


    /**
     * Gets the comandoAtivacaoBloqueio value for this DadosComandoInventario.
     * 
     * @return comandoAtivacaoBloqueio
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoBloqueio[] getComandoAtivacaoBloqueio() {
        return comandoAtivacaoBloqueio;
    }


    /**
     * Sets the comandoAtivacaoBloqueio value for this DadosComandoInventario.
     * 
     * @param comandoAtivacaoBloqueio
     */
    public void setComandoAtivacaoBloqueio(com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoBloqueio[] comandoAtivacaoBloqueio) {
        this.comandoAtivacaoBloqueio = comandoAtivacaoBloqueio;
    }

    public com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoBloqueio getComandoAtivacaoBloqueio(int i) {
        return this.comandoAtivacaoBloqueio[i];
    }

    public void setComandoAtivacaoBloqueio(int i, com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoBloqueio _value) {
        this.comandoAtivacaoBloqueio[i] = _value;
    }


    /**
     * Gets the comandoAtivacaoLegado value for this DadosComandoInventario.
     * 
     * @return comandoAtivacaoLegado
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoLegado getComandoAtivacaoLegado() {
        return comandoAtivacaoLegado;
    }


    /**
     * Sets the comandoAtivacaoLegado value for this DadosComandoInventario.
     * 
     * @param comandoAtivacaoLegado
     */
    public void setComandoAtivacaoLegado(com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoLegado comandoAtivacaoLegado) {
        this.comandoAtivacaoLegado = comandoAtivacaoLegado;
    }


    /**
     * Gets the comandoAtivacaoConfigLinha value for this DadosComandoInventario.
     * 
     * @return comandoAtivacaoConfigLinha
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoConfigLinha getComandoAtivacaoConfigLinha() {
        return comandoAtivacaoConfigLinha;
    }


    /**
     * Sets the comandoAtivacaoConfigLinha value for this DadosComandoInventario.
     * 
     * @param comandoAtivacaoConfigLinha
     */
    public void setComandoAtivacaoConfigLinha(com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoConfigLinha comandoAtivacaoConfigLinha) {
        this.comandoAtivacaoConfigLinha = comandoAtivacaoConfigLinha;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosComandoInventario)) return false;
        DadosComandoInventario other = (DadosComandoInventario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.descricaoTipo==null && other.getDescricaoTipo()==null) || 
             (this.descricaoTipo!=null &&
              this.descricaoTipo.equals(other.getDescricaoTipo()))) &&
            ((this.descricaoArea==null && other.getDescricaoArea()==null) || 
             (this.descricaoArea!=null &&
              this.descricaoArea.equals(other.getDescricaoArea()))) &&
            ((this.descricaoProcesso==null && other.getDescricaoProcesso()==null) || 
             (this.descricaoProcesso!=null &&
              this.descricaoProcesso.equals(other.getDescricaoProcesso()))) &&
            this.id == other.getId() &&
            this.acumula == other.isAcumula() &&
            ((this.origemDestino==null && other.getOrigemDestino()==null) || 
             (this.origemDestino!=null &&
              this.origemDestino.equals(other.getOrigemDestino()))) &&
            ((this.cenarioBloqueio==null && other.getCenarioBloqueio()==null) || 
             (this.cenarioBloqueio!=null &&
              this.cenarioBloqueio.equals(other.getCenarioBloqueio()))) &&
            ((this.statusComando==null && other.getStatusComando()==null) || 
             (this.statusComando!=null &&
              this.statusComando.equals(other.getStatusComando()))) &&
            ((this.servico==null && other.getServico()==null) || 
             (this.servico!=null &&
              java.util.Arrays.equals(this.servico, other.getServico()))) &&
            ((this.comandoAtivacaoBloqueio==null && other.getComandoAtivacaoBloqueio()==null) || 
             (this.comandoAtivacaoBloqueio!=null &&
              java.util.Arrays.equals(this.comandoAtivacaoBloqueio, other.getComandoAtivacaoBloqueio()))) &&
            ((this.comandoAtivacaoLegado==null && other.getComandoAtivacaoLegado()==null) || 
             (this.comandoAtivacaoLegado!=null &&
              this.comandoAtivacaoLegado.equals(other.getComandoAtivacaoLegado()))) &&
            ((this.comandoAtivacaoConfigLinha==null && other.getComandoAtivacaoConfigLinha()==null) || 
             (this.comandoAtivacaoConfigLinha!=null &&
              this.comandoAtivacaoConfigLinha.equals(other.getComandoAtivacaoConfigLinha())));
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
        if (getDescricaoTipo() != null) {
            _hashCode += getDescricaoTipo().hashCode();
        }
        if (getDescricaoArea() != null) {
            _hashCode += getDescricaoArea().hashCode();
        }
        if (getDescricaoProcesso() != null) {
            _hashCode += getDescricaoProcesso().hashCode();
        }
        _hashCode += getId();
        _hashCode += (isAcumula() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOrigemDestino() != null) {
            _hashCode += getOrigemDestino().hashCode();
        }
        if (getCenarioBloqueio() != null) {
            _hashCode += getCenarioBloqueio().hashCode();
        }
        if (getStatusComando() != null) {
            _hashCode += getStatusComando().hashCode();
        }
        if (getServico() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServico());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServico(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComandoAtivacaoBloqueio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComandoAtivacaoBloqueio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComandoAtivacaoBloqueio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComandoAtivacaoLegado() != null) {
            _hashCode += getComandoAtivacaoLegado().hashCode();
        }
        if (getComandoAtivacaoConfigLinha() != null) {
            _hashCode += getComandoAtivacaoConfigLinha().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosComandoInventario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoInventario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "descricaoTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "descricaoArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoProcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "descricaoProcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acumula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "acumula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origemDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "origemDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cenarioBloqueio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "cenarioBloqueio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusComando");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "statusComando"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusComando"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "servico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosServico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comandoAtivacaoBloqueio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "comandoAtivacaoBloqueio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoBloqueio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comandoAtivacaoLegado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "comandoAtivacaoLegado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoLegado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comandoAtivacaoConfigLinha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "comandoAtivacaoConfigLinha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoConfigLinha"));
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
