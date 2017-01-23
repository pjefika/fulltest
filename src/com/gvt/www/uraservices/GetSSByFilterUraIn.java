/**
 * GetSSByFilterUraIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class GetSSByFilterUraIn  implements java.io.Serializable {
    private java.lang.String ptipo;

    private java.lang.String pdescricao;

    private java.lang.String status;

    private java.lang.String pdocumento;

    public GetSSByFilterUraIn() {
    }

    public GetSSByFilterUraIn(
           java.lang.String ptipo,
           java.lang.String pdescricao,
           java.lang.String status,
           java.lang.String pdocumento) {
           this.ptipo = ptipo;
           this.pdescricao = pdescricao;
           this.status = status;
           this.pdocumento = pdocumento;
    }


    /**
     * Gets the ptipo value for this GetSSByFilterUraIn.
     * 
     * @return ptipo
     */
    public java.lang.String getPtipo() {
        return ptipo;
    }


    /**
     * Sets the ptipo value for this GetSSByFilterUraIn.
     * 
     * @param ptipo
     */
    public void setPtipo(java.lang.String ptipo) {
        this.ptipo = ptipo;
    }


    /**
     * Gets the pdescricao value for this GetSSByFilterUraIn.
     * 
     * @return pdescricao
     */
    public java.lang.String getPdescricao() {
        return pdescricao;
    }


    /**
     * Sets the pdescricao value for this GetSSByFilterUraIn.
     * 
     * @param pdescricao
     */
    public void setPdescricao(java.lang.String pdescricao) {
        this.pdescricao = pdescricao;
    }


    /**
     * Gets the status value for this GetSSByFilterUraIn.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetSSByFilterUraIn.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the pdocumento value for this GetSSByFilterUraIn.
     * 
     * @return pdocumento
     */
    public java.lang.String getPdocumento() {
        return pdocumento;
    }


    /**
     * Sets the pdocumento value for this GetSSByFilterUraIn.
     * 
     * @param pdocumento
     */
    public void setPdocumento(java.lang.String pdocumento) {
        this.pdocumento = pdocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSSByFilterUraIn)) return false;
        GetSSByFilterUraIn other = (GetSSByFilterUraIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ptipo==null && other.getPtipo()==null) || 
             (this.ptipo!=null &&
              this.ptipo.equals(other.getPtipo()))) &&
            ((this.pdescricao==null && other.getPdescricao()==null) || 
             (this.pdescricao!=null &&
              this.pdescricao.equals(other.getPdescricao()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.pdocumento==null && other.getPdocumento()==null) || 
             (this.pdocumento!=null &&
              this.pdocumento.equals(other.getPdocumento())));
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
        if (getPtipo() != null) {
            _hashCode += getPtipo().hashCode();
        }
        if (getPdescricao() != null) {
            _hashCode += getPdescricao().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPdocumento() != null) {
            _hashCode += getPdocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSSByFilterUraIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "getSSByFilterUraIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pdescricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pdescricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pdocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pdocumento"));
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
