/**
 * ConfigurarBloqueioIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.configurarBloqueio;

public class ConfigurarBloqueioIn  implements java.io.Serializable {
    private java.math.BigInteger identificadorSolicitacao;

    private java.lang.String numeroTelefonico;

    private java.lang.String designador;

    private java.lang.String designadorTV;

    private java.math.BigInteger prioridade;

    private java.lang.String bloqueioAnterior;

    private java.lang.String novoBloqueio;

    private com.gvt.www.ws.eai.oss.configurarBloqueio.PercentagemBloqueio percentagemBloqueio;

    private java.lang.String identificadorLista;

    private java.lang.String tecnologia;

    private java.lang.String tecnologiaVoz;

    private com.gvt.www.ws.eai.oss.configurarBloqueio.TipoTecnologiaTV tecnologiaTV;

    public ConfigurarBloqueioIn() {
    }

    public ConfigurarBloqueioIn(
           java.math.BigInteger identificadorSolicitacao,
           java.lang.String numeroTelefonico,
           java.lang.String designador,
           java.lang.String designadorTV,
           java.math.BigInteger prioridade,
           java.lang.String bloqueioAnterior,
           java.lang.String novoBloqueio,
           com.gvt.www.ws.eai.oss.configurarBloqueio.PercentagemBloqueio percentagemBloqueio,
           java.lang.String identificadorLista,
           java.lang.String tecnologia,
           java.lang.String tecnologiaVoz,
           com.gvt.www.ws.eai.oss.configurarBloqueio.TipoTecnologiaTV tecnologiaTV) {
           this.identificadorSolicitacao = identificadorSolicitacao;
           this.numeroTelefonico = numeroTelefonico;
           this.designador = designador;
           this.designadorTV = designadorTV;
           this.prioridade = prioridade;
           this.bloqueioAnterior = bloqueioAnterior;
           this.novoBloqueio = novoBloqueio;
           this.percentagemBloqueio = percentagemBloqueio;
           this.identificadorLista = identificadorLista;
           this.tecnologia = tecnologia;
           this.tecnologiaVoz = tecnologiaVoz;
           this.tecnologiaTV = tecnologiaTV;
    }


    /**
     * Gets the identificadorSolicitacao value for this ConfigurarBloqueioIn.
     * 
     * @return identificadorSolicitacao
     */
    public java.math.BigInteger getIdentificadorSolicitacao() {
        return identificadorSolicitacao;
    }


    /**
     * Sets the identificadorSolicitacao value for this ConfigurarBloqueioIn.
     * 
     * @param identificadorSolicitacao
     */
    public void setIdentificadorSolicitacao(java.math.BigInteger identificadorSolicitacao) {
        this.identificadorSolicitacao = identificadorSolicitacao;
    }


    /**
     * Gets the numeroTelefonico value for this ConfigurarBloqueioIn.
     * 
     * @return numeroTelefonico
     */
    public java.lang.String getNumeroTelefonico() {
        return numeroTelefonico;
    }


    /**
     * Sets the numeroTelefonico value for this ConfigurarBloqueioIn.
     * 
     * @param numeroTelefonico
     */
    public void setNumeroTelefonico(java.lang.String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }


    /**
     * Gets the designador value for this ConfigurarBloqueioIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this ConfigurarBloqueioIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the designadorTV value for this ConfigurarBloqueioIn.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this ConfigurarBloqueioIn.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the prioridade value for this ConfigurarBloqueioIn.
     * 
     * @return prioridade
     */
    public java.math.BigInteger getPrioridade() {
        return prioridade;
    }


    /**
     * Sets the prioridade value for this ConfigurarBloqueioIn.
     * 
     * @param prioridade
     */
    public void setPrioridade(java.math.BigInteger prioridade) {
        this.prioridade = prioridade;
    }


    /**
     * Gets the bloqueioAnterior value for this ConfigurarBloqueioIn.
     * 
     * @return bloqueioAnterior
     */
    public java.lang.String getBloqueioAnterior() {
        return bloqueioAnterior;
    }


    /**
     * Sets the bloqueioAnterior value for this ConfigurarBloqueioIn.
     * 
     * @param bloqueioAnterior
     */
    public void setBloqueioAnterior(java.lang.String bloqueioAnterior) {
        this.bloqueioAnterior = bloqueioAnterior;
    }


    /**
     * Gets the novoBloqueio value for this ConfigurarBloqueioIn.
     * 
     * @return novoBloqueio
     */
    public java.lang.String getNovoBloqueio() {
        return novoBloqueio;
    }


    /**
     * Sets the novoBloqueio value for this ConfigurarBloqueioIn.
     * 
     * @param novoBloqueio
     */
    public void setNovoBloqueio(java.lang.String novoBloqueio) {
        this.novoBloqueio = novoBloqueio;
    }


    /**
     * Gets the percentagemBloqueio value for this ConfigurarBloqueioIn.
     * 
     * @return percentagemBloqueio
     */
    public com.gvt.www.ws.eai.oss.configurarBloqueio.PercentagemBloqueio getPercentagemBloqueio() {
        return percentagemBloqueio;
    }


    /**
     * Sets the percentagemBloqueio value for this ConfigurarBloqueioIn.
     * 
     * @param percentagemBloqueio
     */
    public void setPercentagemBloqueio(com.gvt.www.ws.eai.oss.configurarBloqueio.PercentagemBloqueio percentagemBloqueio) {
        this.percentagemBloqueio = percentagemBloqueio;
    }


    /**
     * Gets the identificadorLista value for this ConfigurarBloqueioIn.
     * 
     * @return identificadorLista
     */
    public java.lang.String getIdentificadorLista() {
        return identificadorLista;
    }


    /**
     * Sets the identificadorLista value for this ConfigurarBloqueioIn.
     * 
     * @param identificadorLista
     */
    public void setIdentificadorLista(java.lang.String identificadorLista) {
        this.identificadorLista = identificadorLista;
    }


    /**
     * Gets the tecnologia value for this ConfigurarBloqueioIn.
     * 
     * @return tecnologia
     */
    public java.lang.String getTecnologia() {
        return tecnologia;
    }


    /**
     * Sets the tecnologia value for this ConfigurarBloqueioIn.
     * 
     * @param tecnologia
     */
    public void setTecnologia(java.lang.String tecnologia) {
        this.tecnologia = tecnologia;
    }


    /**
     * Gets the tecnologiaVoz value for this ConfigurarBloqueioIn.
     * 
     * @return tecnologiaVoz
     */
    public java.lang.String getTecnologiaVoz() {
        return tecnologiaVoz;
    }


    /**
     * Sets the tecnologiaVoz value for this ConfigurarBloqueioIn.
     * 
     * @param tecnologiaVoz
     */
    public void setTecnologiaVoz(java.lang.String tecnologiaVoz) {
        this.tecnologiaVoz = tecnologiaVoz;
    }


    /**
     * Gets the tecnologiaTV value for this ConfigurarBloqueioIn.
     * 
     * @return tecnologiaTV
     */
    public com.gvt.www.ws.eai.oss.configurarBloqueio.TipoTecnologiaTV getTecnologiaTV() {
        return tecnologiaTV;
    }


    /**
     * Sets the tecnologiaTV value for this ConfigurarBloqueioIn.
     * 
     * @param tecnologiaTV
     */
    public void setTecnologiaTV(com.gvt.www.ws.eai.oss.configurarBloqueio.TipoTecnologiaTV tecnologiaTV) {
        this.tecnologiaTV = tecnologiaTV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarBloqueioIn)) return false;
        ConfigurarBloqueioIn other = (ConfigurarBloqueioIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificadorSolicitacao==null && other.getIdentificadorSolicitacao()==null) || 
             (this.identificadorSolicitacao!=null &&
              this.identificadorSolicitacao.equals(other.getIdentificadorSolicitacao()))) &&
            ((this.numeroTelefonico==null && other.getNumeroTelefonico()==null) || 
             (this.numeroTelefonico!=null &&
              this.numeroTelefonico.equals(other.getNumeroTelefonico()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV()))) &&
            ((this.prioridade==null && other.getPrioridade()==null) || 
             (this.prioridade!=null &&
              this.prioridade.equals(other.getPrioridade()))) &&
            ((this.bloqueioAnterior==null && other.getBloqueioAnterior()==null) || 
             (this.bloqueioAnterior!=null &&
              this.bloqueioAnterior.equals(other.getBloqueioAnterior()))) &&
            ((this.novoBloqueio==null && other.getNovoBloqueio()==null) || 
             (this.novoBloqueio!=null &&
              this.novoBloqueio.equals(other.getNovoBloqueio()))) &&
            ((this.percentagemBloqueio==null && other.getPercentagemBloqueio()==null) || 
             (this.percentagemBloqueio!=null &&
              this.percentagemBloqueio.equals(other.getPercentagemBloqueio()))) &&
            ((this.identificadorLista==null && other.getIdentificadorLista()==null) || 
             (this.identificadorLista!=null &&
              this.identificadorLista.equals(other.getIdentificadorLista()))) &&
            ((this.tecnologia==null && other.getTecnologia()==null) || 
             (this.tecnologia!=null &&
              this.tecnologia.equals(other.getTecnologia()))) &&
            ((this.tecnologiaVoz==null && other.getTecnologiaVoz()==null) || 
             (this.tecnologiaVoz!=null &&
              this.tecnologiaVoz.equals(other.getTecnologiaVoz()))) &&
            ((this.tecnologiaTV==null && other.getTecnologiaTV()==null) || 
             (this.tecnologiaTV!=null &&
              this.tecnologiaTV.equals(other.getTecnologiaTV())));
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
        if (getIdentificadorSolicitacao() != null) {
            _hashCode += getIdentificadorSolicitacao().hashCode();
        }
        if (getNumeroTelefonico() != null) {
            _hashCode += getNumeroTelefonico().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        if (getPrioridade() != null) {
            _hashCode += getPrioridade().hashCode();
        }
        if (getBloqueioAnterior() != null) {
            _hashCode += getBloqueioAnterior().hashCode();
        }
        if (getNovoBloqueio() != null) {
            _hashCode += getNovoBloqueio().hashCode();
        }
        if (getPercentagemBloqueio() != null) {
            _hashCode += getPercentagemBloqueio().hashCode();
        }
        if (getIdentificadorLista() != null) {
            _hashCode += getIdentificadorLista().hashCode();
        }
        if (getTecnologia() != null) {
            _hashCode += getTecnologia().hashCode();
        }
        if (getTecnologiaVoz() != null) {
            _hashCode += getTecnologiaVoz().hashCode();
        }
        if (getTecnologiaTV() != null) {
            _hashCode += getTecnologiaTV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarBloqueioIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "ConfigurarBloqueioIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "identificadorSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTelefonico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "numeroTelefonico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioridade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "prioridade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bloqueioAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "bloqueioAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("novoBloqueio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "novoBloqueio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentagemBloqueio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "percentagemBloqueio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "PercentagemBloqueio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorLista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "identificadorLista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "tecnologia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologiaVoz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "tecnologiaVoz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologiaTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "tecnologiaTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "TipoTecnologiaTV"));
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
