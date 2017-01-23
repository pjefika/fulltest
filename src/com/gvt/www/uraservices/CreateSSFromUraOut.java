/**
 * CreateSSFromUraOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class CreateSSFromUraOut  implements java.io.Serializable {
    private int pssid;

    private java.lang.String pmsgerr;

    private java.lang.String pssprotocolo;

    public CreateSSFromUraOut() {
    }

    public CreateSSFromUraOut(
           int pssid,
           java.lang.String pmsgerr,
           java.lang.String pssprotocolo) {
           this.pssid = pssid;
           this.pmsgerr = pmsgerr;
           this.pssprotocolo = pssprotocolo;
    }


    /**
     * Gets the pssid value for this CreateSSFromUraOut.
     * 
     * @return pssid
     */
    public int getPssid() {
        return pssid;
    }


    /**
     * Sets the pssid value for this CreateSSFromUraOut.
     * 
     * @param pssid
     */
    public void setPssid(int pssid) {
        this.pssid = pssid;
    }


    /**
     * Gets the pmsgerr value for this CreateSSFromUraOut.
     * 
     * @return pmsgerr
     */
    public java.lang.String getPmsgerr() {
        return pmsgerr;
    }


    /**
     * Sets the pmsgerr value for this CreateSSFromUraOut.
     * 
     * @param pmsgerr
     */
    public void setPmsgerr(java.lang.String pmsgerr) {
        this.pmsgerr = pmsgerr;
    }


    /**
     * Gets the pssprotocolo value for this CreateSSFromUraOut.
     * 
     * @return pssprotocolo
     */
    public java.lang.String getPssprotocolo() {
        return pssprotocolo;
    }


    /**
     * Sets the pssprotocolo value for this CreateSSFromUraOut.
     * 
     * @param pssprotocolo
     */
    public void setPssprotocolo(java.lang.String pssprotocolo) {
        this.pssprotocolo = pssprotocolo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSSFromUraOut)) return false;
        CreateSSFromUraOut other = (CreateSSFromUraOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.pssid == other.getPssid() &&
            ((this.pmsgerr==null && other.getPmsgerr()==null) || 
             (this.pmsgerr!=null &&
              this.pmsgerr.equals(other.getPmsgerr()))) &&
            ((this.pssprotocolo==null && other.getPssprotocolo()==null) || 
             (this.pssprotocolo!=null &&
              this.pssprotocolo.equals(other.getPssprotocolo())));
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
        _hashCode += getPssid();
        if (getPmsgerr() != null) {
            _hashCode += getPmsgerr().hashCode();
        }
        if (getPssprotocolo() != null) {
            _hashCode += getPssprotocolo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSSFromUraOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "createSSFromUraOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pssid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmsgerr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmsgerr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssprotocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pssprotocolo"));
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
