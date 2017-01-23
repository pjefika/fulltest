/**
 * DadosStatusExecucao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosStatusExecucao  implements java.io.Serializable {
    private int idStatus;

    private java.lang.String nomeStatus;

    private java.lang.String tipoStatus;

    private java.lang.Integer idComandoAnterior;

    private java.lang.Integer idComandoResultante;

    public DadosStatusExecucao() {
    }

    public DadosStatusExecucao(
           int idStatus,
           java.lang.String nomeStatus,
           java.lang.String tipoStatus,
           java.lang.Integer idComandoAnterior,
           java.lang.Integer idComandoResultante) {
           this.idStatus = idStatus;
           this.nomeStatus = nomeStatus;
           this.tipoStatus = tipoStatus;
           this.idComandoAnterior = idComandoAnterior;
           this.idComandoResultante = idComandoResultante;
    }


    /**
     * Gets the idStatus value for this DadosStatusExecucao.
     * 
     * @return idStatus
     */
    public int getIdStatus() {
        return idStatus;
    }


    /**
     * Sets the idStatus value for this DadosStatusExecucao.
     * 
     * @param idStatus
     */
    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }


    /**
     * Gets the nomeStatus value for this DadosStatusExecucao.
     * 
     * @return nomeStatus
     */
    public java.lang.String getNomeStatus() {
        return nomeStatus;
    }


    /**
     * Sets the nomeStatus value for this DadosStatusExecucao.
     * 
     * @param nomeStatus
     */
    public void setNomeStatus(java.lang.String nomeStatus) {
        this.nomeStatus = nomeStatus;
    }


    /**
     * Gets the tipoStatus value for this DadosStatusExecucao.
     * 
     * @return tipoStatus
     */
    public java.lang.String getTipoStatus() {
        return tipoStatus;
    }


    /**
     * Sets the tipoStatus value for this DadosStatusExecucao.
     * 
     * @param tipoStatus
     */
    public void setTipoStatus(java.lang.String tipoStatus) {
        this.tipoStatus = tipoStatus;
    }


    /**
     * Gets the idComandoAnterior value for this DadosStatusExecucao.
     * 
     * @return idComandoAnterior
     */
    public java.lang.Integer getIdComandoAnterior() {
        return idComandoAnterior;
    }


    /**
     * Sets the idComandoAnterior value for this DadosStatusExecucao.
     * 
     * @param idComandoAnterior
     */
    public void setIdComandoAnterior(java.lang.Integer idComandoAnterior) {
        this.idComandoAnterior = idComandoAnterior;
    }


    /**
     * Gets the idComandoResultante value for this DadosStatusExecucao.
     * 
     * @return idComandoResultante
     */
    public java.lang.Integer getIdComandoResultante() {
        return idComandoResultante;
    }


    /**
     * Sets the idComandoResultante value for this DadosStatusExecucao.
     * 
     * @param idComandoResultante
     */
    public void setIdComandoResultante(java.lang.Integer idComandoResultante) {
        this.idComandoResultante = idComandoResultante;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosStatusExecucao)) return false;
        DadosStatusExecucao other = (DadosStatusExecucao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idStatus == other.getIdStatus() &&
            ((this.nomeStatus==null && other.getNomeStatus()==null) || 
             (this.nomeStatus!=null &&
              this.nomeStatus.equals(other.getNomeStatus()))) &&
            ((this.tipoStatus==null && other.getTipoStatus()==null) || 
             (this.tipoStatus!=null &&
              this.tipoStatus.equals(other.getTipoStatus()))) &&
            ((this.idComandoAnterior==null && other.getIdComandoAnterior()==null) || 
             (this.idComandoAnterior!=null &&
              this.idComandoAnterior.equals(other.getIdComandoAnterior()))) &&
            ((this.idComandoResultante==null && other.getIdComandoResultante()==null) || 
             (this.idComandoResultante!=null &&
              this.idComandoResultante.equals(other.getIdComandoResultante())));
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
        _hashCode += getIdStatus();
        if (getNomeStatus() != null) {
            _hashCode += getNomeStatus().hashCode();
        }
        if (getTipoStatus() != null) {
            _hashCode += getTipoStatus().hashCode();
        }
        if (getIdComandoAnterior() != null) {
            _hashCode += getIdComandoAnterior().hashCode();
        }
        if (getIdComandoResultante() != null) {
            _hashCode += getIdComandoResultante().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosStatusExecucao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusExecucao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "idStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "nomeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "tipoStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idComandoAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "idComandoAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idComandoResultante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "idComandoResultante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
