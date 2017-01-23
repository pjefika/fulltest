/**
 * InformacaoBandaLarga.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class InformacaoBandaLarga  implements java.io.Serializable {
    private java.lang.String designador;

    private java.util.Calendar dataCriacao;

    private int quantidadePontosAtivos;

    private java.lang.String velocidadeDownload;

    private java.lang.String velocidadeUpload;

    private br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] informacoesServicos;

    public InformacaoBandaLarga() {
    }

    public InformacaoBandaLarga(
           java.lang.String designador,
           java.util.Calendar dataCriacao,
           int quantidadePontosAtivos,
           java.lang.String velocidadeDownload,
           java.lang.String velocidadeUpload,
           br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] informacoesServicos) {
           this.designador = designador;
           this.dataCriacao = dataCriacao;
           this.quantidadePontosAtivos = quantidadePontosAtivos;
           this.velocidadeDownload = velocidadeDownload;
           this.velocidadeUpload = velocidadeUpload;
           this.informacoesServicos = informacoesServicos;
    }


    /**
     * Gets the designador value for this InformacaoBandaLarga.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this InformacaoBandaLarga.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the dataCriacao value for this InformacaoBandaLarga.
     * 
     * @return dataCriacao
     */
    public java.util.Calendar getDataCriacao() {
        return dataCriacao;
    }


    /**
     * Sets the dataCriacao value for this InformacaoBandaLarga.
     * 
     * @param dataCriacao
     */
    public void setDataCriacao(java.util.Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }


    /**
     * Gets the quantidadePontosAtivos value for this InformacaoBandaLarga.
     * 
     * @return quantidadePontosAtivos
     */
    public int getQuantidadePontosAtivos() {
        return quantidadePontosAtivos;
    }


    /**
     * Sets the quantidadePontosAtivos value for this InformacaoBandaLarga.
     * 
     * @param quantidadePontosAtivos
     */
    public void setQuantidadePontosAtivos(int quantidadePontosAtivos) {
        this.quantidadePontosAtivos = quantidadePontosAtivos;
    }


    /**
     * Gets the velocidadeDownload value for this InformacaoBandaLarga.
     * 
     * @return velocidadeDownload
     */
    public java.lang.String getVelocidadeDownload() {
        return velocidadeDownload;
    }


    /**
     * Sets the velocidadeDownload value for this InformacaoBandaLarga.
     * 
     * @param velocidadeDownload
     */
    public void setVelocidadeDownload(java.lang.String velocidadeDownload) {
        this.velocidadeDownload = velocidadeDownload;
    }


    /**
     * Gets the velocidadeUpload value for this InformacaoBandaLarga.
     * 
     * @return velocidadeUpload
     */
    public java.lang.String getVelocidadeUpload() {
        return velocidadeUpload;
    }


    /**
     * Sets the velocidadeUpload value for this InformacaoBandaLarga.
     * 
     * @param velocidadeUpload
     */
    public void setVelocidadeUpload(java.lang.String velocidadeUpload) {
        this.velocidadeUpload = velocidadeUpload;
    }


    /**
     * Gets the informacoesServicos value for this InformacaoBandaLarga.
     * 
     * @return informacoesServicos
     */
    public br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] getInformacoesServicos() {
        return informacoesServicos;
    }


    /**
     * Sets the informacoesServicos value for this InformacaoBandaLarga.
     * 
     * @param informacoesServicos
     */
    public void setInformacoesServicos(br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] informacoesServicos) {
        this.informacoesServicos = informacoesServicos;
    }

    public br.com.gvt.www.tv.configuracaoTV.InstanciaServicos getInformacoesServicos(int i) {
        return this.informacoesServicos[i];
    }

    public void setInformacoesServicos(int i, br.com.gvt.www.tv.configuracaoTV.InstanciaServicos _value) {
        this.informacoesServicos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacaoBandaLarga)) return false;
        InformacaoBandaLarga other = (InformacaoBandaLarga) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.dataCriacao==null && other.getDataCriacao()==null) || 
             (this.dataCriacao!=null &&
              this.dataCriacao.equals(other.getDataCriacao()))) &&
            this.quantidadePontosAtivos == other.getQuantidadePontosAtivos() &&
            ((this.velocidadeDownload==null && other.getVelocidadeDownload()==null) || 
             (this.velocidadeDownload!=null &&
              this.velocidadeDownload.equals(other.getVelocidadeDownload()))) &&
            ((this.velocidadeUpload==null && other.getVelocidadeUpload()==null) || 
             (this.velocidadeUpload!=null &&
              this.velocidadeUpload.equals(other.getVelocidadeUpload()))) &&
            ((this.informacoesServicos==null && other.getInformacoesServicos()==null) || 
             (this.informacoesServicos!=null &&
              java.util.Arrays.equals(this.informacoesServicos, other.getInformacoesServicos())));
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
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getDataCriacao() != null) {
            _hashCode += getDataCriacao().hashCode();
        }
        _hashCode += getQuantidadePontosAtivos();
        if (getVelocidadeDownload() != null) {
            _hashCode += getVelocidadeDownload().hashCode();
        }
        if (getVelocidadeUpload() != null) {
            _hashCode += getVelocidadeUpload().hashCode();
        }
        if (getInformacoesServicos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInformacoesServicos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInformacoesServicos(), i);
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
        new org.apache.axis.description.TypeDesc(InformacaoBandaLarga.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "InformacaoBandaLarga"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCriacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "dataCriacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadePontosAtivos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "quantidadePontosAtivos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "velocidadeDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeUpload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "velocidadeUpload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacoesServicos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "informacoesServicos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "InstanciaServicos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
