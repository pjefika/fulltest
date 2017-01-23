/**
 * VerificarChavesReservaOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.verificarChavesReserva;

public class VerificarChavesReservaOut  implements java.io.Serializable {
    private java.lang.Integer qtdeChavesAtual;

    private java.lang.Integer qtdeChavesMaxima;

    private java.lang.Integer qtdeChavesMinima;

    private java.lang.Integer qtdeChavesAlarme;

    private java.lang.Boolean solicitacaoEmAndamento;

    private java.util.Calendar dataUltimaSolicitacao;

    public VerificarChavesReservaOut() {
    }

    public VerificarChavesReservaOut(
           java.lang.Integer qtdeChavesAtual,
           java.lang.Integer qtdeChavesMaxima,
           java.lang.Integer qtdeChavesMinima,
           java.lang.Integer qtdeChavesAlarme,
           java.lang.Boolean solicitacaoEmAndamento,
           java.util.Calendar dataUltimaSolicitacao) {
           this.qtdeChavesAtual = qtdeChavesAtual;
           this.qtdeChavesMaxima = qtdeChavesMaxima;
           this.qtdeChavesMinima = qtdeChavesMinima;
           this.qtdeChavesAlarme = qtdeChavesAlarme;
           this.solicitacaoEmAndamento = solicitacaoEmAndamento;
           this.dataUltimaSolicitacao = dataUltimaSolicitacao;
    }


    /**
     * Gets the qtdeChavesAtual value for this VerificarChavesReservaOut.
     * 
     * @return qtdeChavesAtual
     */
    public java.lang.Integer getQtdeChavesAtual() {
        return qtdeChavesAtual;
    }


    /**
     * Sets the qtdeChavesAtual value for this VerificarChavesReservaOut.
     * 
     * @param qtdeChavesAtual
     */
    public void setQtdeChavesAtual(java.lang.Integer qtdeChavesAtual) {
        this.qtdeChavesAtual = qtdeChavesAtual;
    }


    /**
     * Gets the qtdeChavesMaxima value for this VerificarChavesReservaOut.
     * 
     * @return qtdeChavesMaxima
     */
    public java.lang.Integer getQtdeChavesMaxima() {
        return qtdeChavesMaxima;
    }


    /**
     * Sets the qtdeChavesMaxima value for this VerificarChavesReservaOut.
     * 
     * @param qtdeChavesMaxima
     */
    public void setQtdeChavesMaxima(java.lang.Integer qtdeChavesMaxima) {
        this.qtdeChavesMaxima = qtdeChavesMaxima;
    }


    /**
     * Gets the qtdeChavesMinima value for this VerificarChavesReservaOut.
     * 
     * @return qtdeChavesMinima
     */
    public java.lang.Integer getQtdeChavesMinima() {
        return qtdeChavesMinima;
    }


    /**
     * Sets the qtdeChavesMinima value for this VerificarChavesReservaOut.
     * 
     * @param qtdeChavesMinima
     */
    public void setQtdeChavesMinima(java.lang.Integer qtdeChavesMinima) {
        this.qtdeChavesMinima = qtdeChavesMinima;
    }


    /**
     * Gets the qtdeChavesAlarme value for this VerificarChavesReservaOut.
     * 
     * @return qtdeChavesAlarme
     */
    public java.lang.Integer getQtdeChavesAlarme() {
        return qtdeChavesAlarme;
    }


    /**
     * Sets the qtdeChavesAlarme value for this VerificarChavesReservaOut.
     * 
     * @param qtdeChavesAlarme
     */
    public void setQtdeChavesAlarme(java.lang.Integer qtdeChavesAlarme) {
        this.qtdeChavesAlarme = qtdeChavesAlarme;
    }


    /**
     * Gets the solicitacaoEmAndamento value for this VerificarChavesReservaOut.
     * 
     * @return solicitacaoEmAndamento
     */
    public java.lang.Boolean getSolicitacaoEmAndamento() {
        return solicitacaoEmAndamento;
    }


    /**
     * Sets the solicitacaoEmAndamento value for this VerificarChavesReservaOut.
     * 
     * @param solicitacaoEmAndamento
     */
    public void setSolicitacaoEmAndamento(java.lang.Boolean solicitacaoEmAndamento) {
        this.solicitacaoEmAndamento = solicitacaoEmAndamento;
    }


    /**
     * Gets the dataUltimaSolicitacao value for this VerificarChavesReservaOut.
     * 
     * @return dataUltimaSolicitacao
     */
    public java.util.Calendar getDataUltimaSolicitacao() {
        return dataUltimaSolicitacao;
    }


    /**
     * Sets the dataUltimaSolicitacao value for this VerificarChavesReservaOut.
     * 
     * @param dataUltimaSolicitacao
     */
    public void setDataUltimaSolicitacao(java.util.Calendar dataUltimaSolicitacao) {
        this.dataUltimaSolicitacao = dataUltimaSolicitacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerificarChavesReservaOut)) return false;
        VerificarChavesReservaOut other = (VerificarChavesReservaOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qtdeChavesAtual==null && other.getQtdeChavesAtual()==null) || 
             (this.qtdeChavesAtual!=null &&
              this.qtdeChavesAtual.equals(other.getQtdeChavesAtual()))) &&
            ((this.qtdeChavesMaxima==null && other.getQtdeChavesMaxima()==null) || 
             (this.qtdeChavesMaxima!=null &&
              this.qtdeChavesMaxima.equals(other.getQtdeChavesMaxima()))) &&
            ((this.qtdeChavesMinima==null && other.getQtdeChavesMinima()==null) || 
             (this.qtdeChavesMinima!=null &&
              this.qtdeChavesMinima.equals(other.getQtdeChavesMinima()))) &&
            ((this.qtdeChavesAlarme==null && other.getQtdeChavesAlarme()==null) || 
             (this.qtdeChavesAlarme!=null &&
              this.qtdeChavesAlarme.equals(other.getQtdeChavesAlarme()))) &&
            ((this.solicitacaoEmAndamento==null && other.getSolicitacaoEmAndamento()==null) || 
             (this.solicitacaoEmAndamento!=null &&
              this.solicitacaoEmAndamento.equals(other.getSolicitacaoEmAndamento()))) &&
            ((this.dataUltimaSolicitacao==null && other.getDataUltimaSolicitacao()==null) || 
             (this.dataUltimaSolicitacao!=null &&
              this.dataUltimaSolicitacao.equals(other.getDataUltimaSolicitacao())));
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
        if (getQtdeChavesAtual() != null) {
            _hashCode += getQtdeChavesAtual().hashCode();
        }
        if (getQtdeChavesMaxima() != null) {
            _hashCode += getQtdeChavesMaxima().hashCode();
        }
        if (getQtdeChavesMinima() != null) {
            _hashCode += getQtdeChavesMinima().hashCode();
        }
        if (getQtdeChavesAlarme() != null) {
            _hashCode += getQtdeChavesAlarme().hashCode();
        }
        if (getSolicitacaoEmAndamento() != null) {
            _hashCode += getSolicitacaoEmAndamento().hashCode();
        }
        if (getDataUltimaSolicitacao() != null) {
            _hashCode += getDataUltimaSolicitacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerificarChavesReservaOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "VerificarChavesReservaOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeChavesAtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "qtdeChavesAtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeChavesMaxima");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "qtdeChavesMaxima"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeChavesMinima");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "qtdeChavesMinima"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeChavesAlarme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "qtdeChavesAlarme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitacaoEmAndamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "solicitacaoEmAndamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataUltimaSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/verificarChavesReserva", "dataUltimaSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
