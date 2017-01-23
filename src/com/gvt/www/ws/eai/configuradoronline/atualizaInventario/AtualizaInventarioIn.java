/**
 * AtualizaInventarioIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.atualizaInventario;

public class AtualizaInventarioIn  implements java.io.Serializable {
    private java.lang.Long idExecucao;

    private com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando;

    private com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoNEC comandoAtivacao;

    private com.gvt.www.metaData.configuradoronline.DadosStatusExecucao status;

    private java.lang.Long idInventario;

    public AtualizaInventarioIn() {
    }

    public AtualizaInventarioIn(
           java.lang.Long idExecucao,
           com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando,
           com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoNEC comandoAtivacao,
           com.gvt.www.metaData.configuradoronline.DadosStatusExecucao status,
           java.lang.Long idInventario) {
           this.idExecucao = idExecucao;
           this.comando = comando;
           this.comandoAtivacao = comandoAtivacao;
           this.status = status;
           this.idInventario = idInventario;
    }


    /**
     * Gets the idExecucao value for this AtualizaInventarioIn.
     * 
     * @return idExecucao
     */
    public java.lang.Long getIdExecucao() {
        return idExecucao;
    }


    /**
     * Sets the idExecucao value for this AtualizaInventarioIn.
     * 
     * @param idExecucao
     */
    public void setIdExecucao(java.lang.Long idExecucao) {
        this.idExecucao = idExecucao;
    }


    /**
     * Gets the comando value for this AtualizaInventarioIn.
     * 
     * @return comando
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoExecucao getComando() {
        return comando;
    }


    /**
     * Sets the comando value for this AtualizaInventarioIn.
     * 
     * @param comando
     */
    public void setComando(com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando) {
        this.comando = comando;
    }


    /**
     * Gets the comandoAtivacao value for this AtualizaInventarioIn.
     * 
     * @return comandoAtivacao
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoNEC getComandoAtivacao() {
        return comandoAtivacao;
    }


    /**
     * Sets the comandoAtivacao value for this AtualizaInventarioIn.
     * 
     * @param comandoAtivacao
     */
    public void setComandoAtivacao(com.gvt.www.metaData.configuradoronline.DadosComandoAtivacaoNEC comandoAtivacao) {
        this.comandoAtivacao = comandoAtivacao;
    }


    /**
     * Gets the status value for this AtualizaInventarioIn.
     * 
     * @return status
     */
    public com.gvt.www.metaData.configuradoronline.DadosStatusExecucao getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AtualizaInventarioIn.
     * 
     * @param status
     */
    public void setStatus(com.gvt.www.metaData.configuradoronline.DadosStatusExecucao status) {
        this.status = status;
    }


    /**
     * Gets the idInventario value for this AtualizaInventarioIn.
     * 
     * @return idInventario
     */
    public java.lang.Long getIdInventario() {
        return idInventario;
    }


    /**
     * Sets the idInventario value for this AtualizaInventarioIn.
     * 
     * @param idInventario
     */
    public void setIdInventario(java.lang.Long idInventario) {
        this.idInventario = idInventario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizaInventarioIn)) return false;
        AtualizaInventarioIn other = (AtualizaInventarioIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idExecucao==null && other.getIdExecucao()==null) || 
             (this.idExecucao!=null &&
              this.idExecucao.equals(other.getIdExecucao()))) &&
            ((this.comando==null && other.getComando()==null) || 
             (this.comando!=null &&
              this.comando.equals(other.getComando()))) &&
            ((this.comandoAtivacao==null && other.getComandoAtivacao()==null) || 
             (this.comandoAtivacao!=null &&
              this.comandoAtivacao.equals(other.getComandoAtivacao()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.idInventario==null && other.getIdInventario()==null) || 
             (this.idInventario!=null &&
              this.idInventario.equals(other.getIdInventario())));
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
        if (getIdExecucao() != null) {
            _hashCode += getIdExecucao().hashCode();
        }
        if (getComando() != null) {
            _hashCode += getComando().hashCode();
        }
        if (getComandoAtivacao() != null) {
            _hashCode += getComandoAtivacao().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIdInventario() != null) {
            _hashCode += getIdInventario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtualizaInventarioIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "AtualizaInventarioIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idExecucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "idExecucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comando");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "comando"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoExecucao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comandoAtivacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "comandoAtivacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoNEC"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusExecucao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idInventario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaInventario", "idInventario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
