/**
 * CheckCustomerCoverageOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class CheckCustomerCoverageOut  implements java.io.Serializable {
    private int error;

    private java.lang.String errorMessage;

    private boolean cidadeAtendida;

    private boolean temCobertura;

    private boolean bloqueado;

    private java.lang.String cidadeOrigem;

    private java.lang.String estadoOrigem;

    public CheckCustomerCoverageOut() {
    }

    public CheckCustomerCoverageOut(
           int error,
           java.lang.String errorMessage,
           boolean cidadeAtendida,
           boolean temCobertura,
           boolean bloqueado,
           java.lang.String cidadeOrigem,
           java.lang.String estadoOrigem) {
           this.error = error;
           this.errorMessage = errorMessage;
           this.cidadeAtendida = cidadeAtendida;
           this.temCobertura = temCobertura;
           this.bloqueado = bloqueado;
           this.cidadeOrigem = cidadeOrigem;
           this.estadoOrigem = estadoOrigem;
    }


    /**
     * Gets the error value for this CheckCustomerCoverageOut.
     * 
     * @return error
     */
    public int getError() {
        return error;
    }


    /**
     * Sets the error value for this CheckCustomerCoverageOut.
     * 
     * @param error
     */
    public void setError(int error) {
        this.error = error;
    }


    /**
     * Gets the errorMessage value for this CheckCustomerCoverageOut.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this CheckCustomerCoverageOut.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the cidadeAtendida value for this CheckCustomerCoverageOut.
     * 
     * @return cidadeAtendida
     */
    public boolean isCidadeAtendida() {
        return cidadeAtendida;
    }


    /**
     * Sets the cidadeAtendida value for this CheckCustomerCoverageOut.
     * 
     * @param cidadeAtendida
     */
    public void setCidadeAtendida(boolean cidadeAtendida) {
        this.cidadeAtendida = cidadeAtendida;
    }


    /**
     * Gets the temCobertura value for this CheckCustomerCoverageOut.
     * 
     * @return temCobertura
     */
    public boolean isTemCobertura() {
        return temCobertura;
    }


    /**
     * Sets the temCobertura value for this CheckCustomerCoverageOut.
     * 
     * @param temCobertura
     */
    public void setTemCobertura(boolean temCobertura) {
        this.temCobertura = temCobertura;
    }


    /**
     * Gets the bloqueado value for this CheckCustomerCoverageOut.
     * 
     * @return bloqueado
     */
    public boolean isBloqueado() {
        return bloqueado;
    }


    /**
     * Sets the bloqueado value for this CheckCustomerCoverageOut.
     * 
     * @param bloqueado
     */
    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }


    /**
     * Gets the cidadeOrigem value for this CheckCustomerCoverageOut.
     * 
     * @return cidadeOrigem
     */
    public java.lang.String getCidadeOrigem() {
        return cidadeOrigem;
    }


    /**
     * Sets the cidadeOrigem value for this CheckCustomerCoverageOut.
     * 
     * @param cidadeOrigem
     */
    public void setCidadeOrigem(java.lang.String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }


    /**
     * Gets the estadoOrigem value for this CheckCustomerCoverageOut.
     * 
     * @return estadoOrigem
     */
    public java.lang.String getEstadoOrigem() {
        return estadoOrigem;
    }


    /**
     * Sets the estadoOrigem value for this CheckCustomerCoverageOut.
     * 
     * @param estadoOrigem
     */
    public void setEstadoOrigem(java.lang.String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckCustomerCoverageOut)) return false;
        CheckCustomerCoverageOut other = (CheckCustomerCoverageOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.error == other.getError() &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            this.cidadeAtendida == other.isCidadeAtendida() &&
            this.temCobertura == other.isTemCobertura() &&
            this.bloqueado == other.isBloqueado() &&
            ((this.cidadeOrigem==null && other.getCidadeOrigem()==null) || 
             (this.cidadeOrigem!=null &&
              this.cidadeOrigem.equals(other.getCidadeOrigem()))) &&
            ((this.estadoOrigem==null && other.getEstadoOrigem()==null) || 
             (this.estadoOrigem!=null &&
              this.estadoOrigem.equals(other.getEstadoOrigem())));
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
        _hashCode += getError();
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        _hashCode += (isCidadeAtendida() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTemCobertura() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBloqueado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCidadeOrigem() != null) {
            _hashCode += getCidadeOrigem().hashCode();
        }
        if (getEstadoOrigem() != null) {
            _hashCode += getEstadoOrigem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckCustomerCoverageOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "checkCustomerCoverageOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeAtendida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidadeAtendida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temCobertura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "temCobertura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bloqueado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bloqueado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidadeOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
