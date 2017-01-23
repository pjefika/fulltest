/**
 * ResetLinhaOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.resetLinha;

public class ResetLinhaOut  implements java.io.Serializable {
    private java.math.BigInteger idStatus;

    private java.lang.String causa;

    public ResetLinhaOut() {
    }

    public ResetLinhaOut(
           java.math.BigInteger idStatus,
           java.lang.String causa) {
           this.idStatus = idStatus;
           this.causa = causa;
    }


    /**
     * Gets the idStatus value for this ResetLinhaOut.
     * 
     * @return idStatus
     */
    public java.math.BigInteger getIdStatus() {
        return idStatus;
    }


    /**
     * Sets the idStatus value for this ResetLinhaOut.
     * 
     * @param idStatus
     */
    public void setIdStatus(java.math.BigInteger idStatus) {
        this.idStatus = idStatus;
    }


    /**
     * Gets the causa value for this ResetLinhaOut.
     * 
     * @return causa
     */
    public java.lang.String getCausa() {
        return causa;
    }


    /**
     * Sets the causa value for this ResetLinhaOut.
     * 
     * @param causa
     */
    public void setCausa(java.lang.String causa) {
        this.causa = causa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResetLinhaOut)) return false;
        ResetLinhaOut other = (ResetLinhaOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idStatus==null && other.getIdStatus()==null) || 
             (this.idStatus!=null &&
              this.idStatus.equals(other.getIdStatus()))) &&
            ((this.causa==null && other.getCausa()==null) || 
             (this.causa!=null &&
              this.causa.equals(other.getCausa())));
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
        if (getIdStatus() != null) {
            _hashCode += getIdStatus().hashCode();
        }
        if (getCausa() != null) {
            _hashCode += getCausa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResetLinhaOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/resetLinha", "ResetLinhaOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/resetLinha", "idStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/resetLinha", "causa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
