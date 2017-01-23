/**
 * MontaComandoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.montaComando;

public class MontaComandoOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.montaComando.DadosFazNada fazNada;

    private com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoNEC comandoAtivacao;

    private com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao;

    public MontaComandoOut() {
    }

    public MontaComandoOut(
           com.gvt.www.ws.eai.configuradoronline.montaComando.DadosFazNada fazNada,
           com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoNEC comandoAtivacao,
           com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao) {
           this.fazNada = fazNada;
           this.comandoAtivacao = comandoAtivacao;
           this.statusExecucao = statusExecucao;
    }


    /**
     * Gets the fazNada value for this MontaComandoOut.
     * 
     * @return fazNada
     */
    public com.gvt.www.ws.eai.configuradoronline.montaComando.DadosFazNada getFazNada() {
        return fazNada;
    }


    /**
     * Sets the fazNada value for this MontaComandoOut.
     * 
     * @param fazNada
     */
    public void setFazNada(com.gvt.www.ws.eai.configuradoronline.montaComando.DadosFazNada fazNada) {
        this.fazNada = fazNada;
    }


    /**
     * Gets the comandoAtivacao value for this MontaComandoOut.
     * 
     * @return comandoAtivacao
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoNEC getComandoAtivacao() {
        return comandoAtivacao;
    }


    /**
     * Sets the comandoAtivacao value for this MontaComandoOut.
     * 
     * @param comandoAtivacao
     */
    public void setComandoAtivacao(com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoNEC comandoAtivacao) {
        this.comandoAtivacao = comandoAtivacao;
    }


    /**
     * Gets the statusExecucao value for this MontaComandoOut.
     * 
     * @return statusExecucao
     */
    public com.gvt.www.metaData.configuradoronline.DadosStatusExecucao getStatusExecucao() {
        return statusExecucao;
    }


    /**
     * Sets the statusExecucao value for this MontaComandoOut.
     * 
     * @param statusExecucao
     */
    public void setStatusExecucao(com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao) {
        this.statusExecucao = statusExecucao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MontaComandoOut)) return false;
        MontaComandoOut other = (MontaComandoOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fazNada==null && other.getFazNada()==null) || 
             (this.fazNada!=null &&
              this.fazNada.equals(other.getFazNada()))) &&
            ((this.comandoAtivacao==null && other.getComandoAtivacao()==null) || 
             (this.comandoAtivacao!=null &&
              this.comandoAtivacao.equals(other.getComandoAtivacao()))) &&
            ((this.statusExecucao==null && other.getStatusExecucao()==null) || 
             (this.statusExecucao!=null &&
              this.statusExecucao.equals(other.getStatusExecucao())));
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
        if (getFazNada() != null) {
            _hashCode += getFazNada().hashCode();
        }
        if (getComandoAtivacao() != null) {
            _hashCode += getComandoAtivacao().hashCode();
        }
        if (getStatusExecucao() != null) {
            _hashCode += getStatusExecucao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MontaComandoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "MontaComandoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fazNada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "fazNada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "DadosFazNada"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comandoAtivacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "comandoAtivacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoNEC"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusExecucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/montaComando", "statusExecucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusExecucao"));
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
