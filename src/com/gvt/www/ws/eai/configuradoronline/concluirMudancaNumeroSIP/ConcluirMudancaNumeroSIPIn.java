/**
 * ConcluirMudancaNumeroSIPIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.concluirMudancaNumeroSIP;

public class ConcluirMudancaNumeroSIPIn  implements java.io.Serializable {
    private java.lang.String numeroAntigo;

    private java.lang.String numeroNovo;

    private com.gvt.www.metaData.smarttool.Credenciais credencial;

    public ConcluirMudancaNumeroSIPIn() {
    }

    public ConcluirMudancaNumeroSIPIn(
           java.lang.String numeroAntigo,
           java.lang.String numeroNovo,
           com.gvt.www.metaData.smarttool.Credenciais credencial) {
           this.numeroAntigo = numeroAntigo;
           this.numeroNovo = numeroNovo;
           this.credencial = credencial;
    }


    /**
     * Gets the numeroAntigo value for this ConcluirMudancaNumeroSIPIn.
     * 
     * @return numeroAntigo
     */
    public java.lang.String getNumeroAntigo() {
        return numeroAntigo;
    }


    /**
     * Sets the numeroAntigo value for this ConcluirMudancaNumeroSIPIn.
     * 
     * @param numeroAntigo
     */
    public void setNumeroAntigo(java.lang.String numeroAntigo) {
        this.numeroAntigo = numeroAntigo;
    }


    /**
     * Gets the numeroNovo value for this ConcluirMudancaNumeroSIPIn.
     * 
     * @return numeroNovo
     */
    public java.lang.String getNumeroNovo() {
        return numeroNovo;
    }


    /**
     * Sets the numeroNovo value for this ConcluirMudancaNumeroSIPIn.
     * 
     * @param numeroNovo
     */
    public void setNumeroNovo(java.lang.String numeroNovo) {
        this.numeroNovo = numeroNovo;
    }


    /**
     * Gets the credencial value for this ConcluirMudancaNumeroSIPIn.
     * 
     * @return credencial
     */
    public com.gvt.www.metaData.smarttool.Credenciais getCredencial() {
        return credencial;
    }


    /**
     * Sets the credencial value for this ConcluirMudancaNumeroSIPIn.
     * 
     * @param credencial
     */
    public void setCredencial(com.gvt.www.metaData.smarttool.Credenciais credencial) {
        this.credencial = credencial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConcluirMudancaNumeroSIPIn)) return false;
        ConcluirMudancaNumeroSIPIn other = (ConcluirMudancaNumeroSIPIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroAntigo==null && other.getNumeroAntigo()==null) || 
             (this.numeroAntigo!=null &&
              this.numeroAntigo.equals(other.getNumeroAntigo()))) &&
            ((this.numeroNovo==null && other.getNumeroNovo()==null) || 
             (this.numeroNovo!=null &&
              this.numeroNovo.equals(other.getNumeroNovo()))) &&
            ((this.credencial==null && other.getCredencial()==null) || 
             (this.credencial!=null &&
              this.credencial.equals(other.getCredencial())));
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
        if (getNumeroAntigo() != null) {
            _hashCode += getNumeroAntigo().hashCode();
        }
        if (getNumeroNovo() != null) {
            _hashCode += getNumeroNovo().hashCode();
        }
        if (getCredencial() != null) {
            _hashCode += getCredencial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConcluirMudancaNumeroSIPIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/concluirMudancaNumeroSIP", "ConcluirMudancaNumeroSIPIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAntigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/concluirMudancaNumeroSIP", "numeroAntigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroNovo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/concluirMudancaNumeroSIP", "numeroNovo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credencial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/concluirMudancaNumeroSIP", "credencial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/smarttool", "Credenciais"));
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
