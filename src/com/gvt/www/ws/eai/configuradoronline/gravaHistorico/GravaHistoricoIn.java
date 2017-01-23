/**
 * GravaHistoricoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.gravaHistorico;

public class GravaHistoricoIn  implements java.io.Serializable {
    private java.lang.Long idExecucao;

    private com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando;

    private com.gvt.www.metaData.configuradoronline.DadosHistorico historico;

    public GravaHistoricoIn() {
    }

    public GravaHistoricoIn(
           java.lang.Long idExecucao,
           com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando,
           com.gvt.www.metaData.configuradoronline.DadosHistorico historico) {
           this.idExecucao = idExecucao;
           this.comando = comando;
           this.historico = historico;
    }


    /**
     * Gets the idExecucao value for this GravaHistoricoIn.
     * 
     * @return idExecucao
     */
    public java.lang.Long getIdExecucao() {
        return idExecucao;
    }


    /**
     * Sets the idExecucao value for this GravaHistoricoIn.
     * 
     * @param idExecucao
     */
    public void setIdExecucao(java.lang.Long idExecucao) {
        this.idExecucao = idExecucao;
    }


    /**
     * Gets the comando value for this GravaHistoricoIn.
     * 
     * @return comando
     */
    public com.gvt.www.metaData.configuradoronline.DadosComandoExecucao getComando() {
        return comando;
    }


    /**
     * Sets the comando value for this GravaHistoricoIn.
     * 
     * @param comando
     */
    public void setComando(com.gvt.www.metaData.configuradoronline.DadosComandoExecucao comando) {
        this.comando = comando;
    }


    /**
     * Gets the historico value for this GravaHistoricoIn.
     * 
     * @return historico
     */
    public com.gvt.www.metaData.configuradoronline.DadosHistorico getHistorico() {
        return historico;
    }


    /**
     * Sets the historico value for this GravaHistoricoIn.
     * 
     * @param historico
     */
    public void setHistorico(com.gvt.www.metaData.configuradoronline.DadosHistorico historico) {
        this.historico = historico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GravaHistoricoIn)) return false;
        GravaHistoricoIn other = (GravaHistoricoIn) obj;
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
            ((this.historico==null && other.getHistorico()==null) || 
             (this.historico!=null &&
              this.historico.equals(other.getHistorico())));
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
        if (getHistorico() != null) {
            _hashCode += getHistorico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GravaHistoricoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/gravaHistorico", "GravaHistoricoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idExecucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/gravaHistorico", "idExecucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comando");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/gravaHistorico", "comando"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoExecucao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/gravaHistorico", "historico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosHistorico"));
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
