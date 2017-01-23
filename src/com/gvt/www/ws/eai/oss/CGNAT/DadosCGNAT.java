/**
 * DadosCGNAT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.CGNAT;

public class DadosCGNAT  implements java.io.Serializable {
    /* IPV4 Público compartilhado por até 16 clientes */
    private java.lang.String ipV4Publico;

    /* IPV4 Atribuido ao modem do cliente pelo CGNAT
     * 						(100.64) */
    private java.lang.String ipCGNAT;

    public DadosCGNAT() {
    }

    public DadosCGNAT(
           java.lang.String ipV4Publico,
           java.lang.String ipCGNAT) {
           this.ipV4Publico = ipV4Publico;
           this.ipCGNAT = ipCGNAT;
    }


    /**
     * Gets the ipV4Publico value for this DadosCGNAT.
     * 
     * @return ipV4Publico   * IPV4 Público compartilhado por até 16 clientes
     */
    public java.lang.String getIpV4Publico() {
        return ipV4Publico;
    }


    /**
     * Sets the ipV4Publico value for this DadosCGNAT.
     * 
     * @param ipV4Publico   * IPV4 Público compartilhado por até 16 clientes
     */
    public void setIpV4Publico(java.lang.String ipV4Publico) {
        this.ipV4Publico = ipV4Publico;
    }


    /**
     * Gets the ipCGNAT value for this DadosCGNAT.
     * 
     * @return ipCGNAT   * IPV4 Atribuido ao modem do cliente pelo CGNAT
     * 						(100.64)
     */
    public java.lang.String getIpCGNAT() {
        return ipCGNAT;
    }


    /**
     * Sets the ipCGNAT value for this DadosCGNAT.
     * 
     * @param ipCGNAT   * IPV4 Atribuido ao modem do cliente pelo CGNAT
     * 						(100.64)
     */
    public void setIpCGNAT(java.lang.String ipCGNAT) {
        this.ipCGNAT = ipCGNAT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosCGNAT)) return false;
        DadosCGNAT other = (DadosCGNAT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipV4Publico==null && other.getIpV4Publico()==null) || 
             (this.ipV4Publico!=null &&
              this.ipV4Publico.equals(other.getIpV4Publico()))) &&
            ((this.ipCGNAT==null && other.getIpCGNAT()==null) || 
             (this.ipCGNAT!=null &&
              this.ipCGNAT.equals(other.getIpCGNAT())));
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
        if (getIpV4Publico() != null) {
            _hashCode += getIpV4Publico().hashCode();
        }
        if (getIpCGNAT() != null) {
            _hashCode += getIpCGNAT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosCGNAT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "DadosCGNAT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipV4Publico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "IpV4Publico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipCGNAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "IpCGNAT"));
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
