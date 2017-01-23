/**
 * Status.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico;

public class Status  implements java.io.Serializable {
    private java.math.BigInteger idStatus;

    private java.lang.String nomeStatus;

    public Status() {
    }

    public Status(
           java.math.BigInteger idStatus,
           java.lang.String nomeStatus) {
           this.idStatus = idStatus;
           this.nomeStatus = nomeStatus;
    }


    /**
     * Gets the idStatus value for this Status.
     * 
     * @return idStatus
     */
    public java.math.BigInteger getIdStatus() {
        return idStatus;
    }


    /**
     * Sets the idStatus value for this Status.
     * 
     * @param idStatus
     */
    public void setIdStatus(java.math.BigInteger idStatus) {
        this.idStatus = idStatus;
    }


    /**
     * Gets the nomeStatus value for this Status.
     * 
     * @return nomeStatus
     */
    public java.lang.String getNomeStatus() {
        return nomeStatus;
    }


    /**
     * Sets the nomeStatus value for this Status.
     * 
     * @param nomeStatus
     */
    public void setNomeStatus(java.lang.String nomeStatus) {
        this.nomeStatus = nomeStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Status)) return false;
        Status other = (Status) obj;
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
            ((this.nomeStatus==null && other.getNomeStatus()==null) || 
             (this.nomeStatus!=null &&
              this.nomeStatus.equals(other.getNomeStatus())));
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
        if (getNomeStatus() != null) {
            _hashCode += getNomeStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Status.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "Status"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "idStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "nomeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
