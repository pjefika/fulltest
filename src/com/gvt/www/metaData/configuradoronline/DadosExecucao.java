/**
 * DadosExecucao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosExecucao  implements java.io.Serializable {
    private java.lang.String tipoRegistro;

    private java.lang.String registro;

    private com.gvt.www.metaData.configuradoronline.DadosProcesso processo;

    private java.lang.String sistemaOrigem;

    private java.lang.String responsavelSolicitacao;

    private com.gvt.www.metaData.configuradoronline.DadosArea areaSolicitacao;

    private java.lang.String descricaoTipo;

    private boolean reconciliacao;

    private java.lang.Integer percentual;

    private com.gvt.www.metaData.configuradoronline.DadosHistorico[] historico;

    public DadosExecucao() {
    }

    public DadosExecucao(
           java.lang.String tipoRegistro,
           java.lang.String registro,
           com.gvt.www.metaData.configuradoronline.DadosProcesso processo,
           java.lang.String sistemaOrigem,
           java.lang.String responsavelSolicitacao,
           com.gvt.www.metaData.configuradoronline.DadosArea areaSolicitacao,
           java.lang.String descricaoTipo,
           boolean reconciliacao,
           java.lang.Integer percentual,
           com.gvt.www.metaData.configuradoronline.DadosHistorico[] historico) {
           this.tipoRegistro = tipoRegistro;
           this.registro = registro;
           this.processo = processo;
           this.sistemaOrigem = sistemaOrigem;
           this.responsavelSolicitacao = responsavelSolicitacao;
           this.areaSolicitacao = areaSolicitacao;
           this.descricaoTipo = descricaoTipo;
           this.reconciliacao = reconciliacao;
           this.percentual = percentual;
           this.historico = historico;
    }


    /**
     * Gets the tipoRegistro value for this DadosExecucao.
     * 
     * @return tipoRegistro
     */
    public java.lang.String getTipoRegistro() {
        return tipoRegistro;
    }


    /**
     * Sets the tipoRegistro value for this DadosExecucao.
     * 
     * @param tipoRegistro
     */
    public void setTipoRegistro(java.lang.String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }


    /**
     * Gets the registro value for this DadosExecucao.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this DadosExecucao.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the processo value for this DadosExecucao.
     * 
     * @return processo
     */
    public com.gvt.www.metaData.configuradoronline.DadosProcesso getProcesso() {
        return processo;
    }


    /**
     * Sets the processo value for this DadosExecucao.
     * 
     * @param processo
     */
    public void setProcesso(com.gvt.www.metaData.configuradoronline.DadosProcesso processo) {
        this.processo = processo;
    }


    /**
     * Gets the sistemaOrigem value for this DadosExecucao.
     * 
     * @return sistemaOrigem
     */
    public java.lang.String getSistemaOrigem() {
        return sistemaOrigem;
    }


    /**
     * Sets the sistemaOrigem value for this DadosExecucao.
     * 
     * @param sistemaOrigem
     */
    public void setSistemaOrigem(java.lang.String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }


    /**
     * Gets the responsavelSolicitacao value for this DadosExecucao.
     * 
     * @return responsavelSolicitacao
     */
    public java.lang.String getResponsavelSolicitacao() {
        return responsavelSolicitacao;
    }


    /**
     * Sets the responsavelSolicitacao value for this DadosExecucao.
     * 
     * @param responsavelSolicitacao
     */
    public void setResponsavelSolicitacao(java.lang.String responsavelSolicitacao) {
        this.responsavelSolicitacao = responsavelSolicitacao;
    }


    /**
     * Gets the areaSolicitacao value for this DadosExecucao.
     * 
     * @return areaSolicitacao
     */
    public com.gvt.www.metaData.configuradoronline.DadosArea getAreaSolicitacao() {
        return areaSolicitacao;
    }


    /**
     * Sets the areaSolicitacao value for this DadosExecucao.
     * 
     * @param areaSolicitacao
     */
    public void setAreaSolicitacao(com.gvt.www.metaData.configuradoronline.DadosArea areaSolicitacao) {
        this.areaSolicitacao = areaSolicitacao;
    }


    /**
     * Gets the descricaoTipo value for this DadosExecucao.
     * 
     * @return descricaoTipo
     */
    public java.lang.String getDescricaoTipo() {
        return descricaoTipo;
    }


    /**
     * Sets the descricaoTipo value for this DadosExecucao.
     * 
     * @param descricaoTipo
     */
    public void setDescricaoTipo(java.lang.String descricaoTipo) {
        this.descricaoTipo = descricaoTipo;
    }


    /**
     * Gets the reconciliacao value for this DadosExecucao.
     * 
     * @return reconciliacao
     */
    public boolean isReconciliacao() {
        return reconciliacao;
    }


    /**
     * Sets the reconciliacao value for this DadosExecucao.
     * 
     * @param reconciliacao
     */
    public void setReconciliacao(boolean reconciliacao) {
        this.reconciliacao = reconciliacao;
    }


    /**
     * Gets the percentual value for this DadosExecucao.
     * 
     * @return percentual
     */
    public java.lang.Integer getPercentual() {
        return percentual;
    }


    /**
     * Sets the percentual value for this DadosExecucao.
     * 
     * @param percentual
     */
    public void setPercentual(java.lang.Integer percentual) {
        this.percentual = percentual;
    }


    /**
     * Gets the historico value for this DadosExecucao.
     * 
     * @return historico
     */
    public com.gvt.www.metaData.configuradoronline.DadosHistorico[] getHistorico() {
        return historico;
    }


    /**
     * Sets the historico value for this DadosExecucao.
     * 
     * @param historico
     */
    public void setHistorico(com.gvt.www.metaData.configuradoronline.DadosHistorico[] historico) {
        this.historico = historico;
    }

    public com.gvt.www.metaData.configuradoronline.DadosHistorico getHistorico(int i) {
        return this.historico[i];
    }

    public void setHistorico(int i, com.gvt.www.metaData.configuradoronline.DadosHistorico _value) {
        this.historico[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosExecucao)) return false;
        DadosExecucao other = (DadosExecucao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoRegistro==null && other.getTipoRegistro()==null) || 
             (this.tipoRegistro!=null &&
              this.tipoRegistro.equals(other.getTipoRegistro()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.processo==null && other.getProcesso()==null) || 
             (this.processo!=null &&
              this.processo.equals(other.getProcesso()))) &&
            ((this.sistemaOrigem==null && other.getSistemaOrigem()==null) || 
             (this.sistemaOrigem!=null &&
              this.sistemaOrigem.equals(other.getSistemaOrigem()))) &&
            ((this.responsavelSolicitacao==null && other.getResponsavelSolicitacao()==null) || 
             (this.responsavelSolicitacao!=null &&
              this.responsavelSolicitacao.equals(other.getResponsavelSolicitacao()))) &&
            ((this.areaSolicitacao==null && other.getAreaSolicitacao()==null) || 
             (this.areaSolicitacao!=null &&
              this.areaSolicitacao.equals(other.getAreaSolicitacao()))) &&
            ((this.descricaoTipo==null && other.getDescricaoTipo()==null) || 
             (this.descricaoTipo!=null &&
              this.descricaoTipo.equals(other.getDescricaoTipo()))) &&
            this.reconciliacao == other.isReconciliacao() &&
            ((this.percentual==null && other.getPercentual()==null) || 
             (this.percentual!=null &&
              this.percentual.equals(other.getPercentual()))) &&
            ((this.historico==null && other.getHistorico()==null) || 
             (this.historico!=null &&
              java.util.Arrays.equals(this.historico, other.getHistorico())));
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
        if (getTipoRegistro() != null) {
            _hashCode += getTipoRegistro().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getProcesso() != null) {
            _hashCode += getProcesso().hashCode();
        }
        if (getSistemaOrigem() != null) {
            _hashCode += getSistemaOrigem().hashCode();
        }
        if (getResponsavelSolicitacao() != null) {
            _hashCode += getResponsavelSolicitacao().hashCode();
        }
        if (getAreaSolicitacao() != null) {
            _hashCode += getAreaSolicitacao().hashCode();
        }
        if (getDescricaoTipo() != null) {
            _hashCode += getDescricaoTipo().hashCode();
        }
        _hashCode += (isReconciliacao() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPercentual() != null) {
            _hashCode += getPercentual().hashCode();
        }
        if (getHistorico() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistorico());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistorico(), i);
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
        new org.apache.axis.description.TypeDesc(DadosExecucao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosExecucao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "tipoRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "processo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosProcesso"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "sistemaOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavelSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "responsavelSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "areaSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosArea"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "descricaoTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "reconciliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "percentual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "historico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosHistorico"));
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
