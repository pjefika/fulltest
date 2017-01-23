/**
 * CancelTTIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class CancelTTIn  implements java.io.Serializable {
    private boolean linha;

    private java.lang.String rowIdContaSiebel;

    private java.lang.String idOs;

    private java.lang.String codOs;

    public CancelTTIn() {
    }

    public CancelTTIn(
           boolean linha,
           java.lang.String rowIdContaSiebel,
           java.lang.String idOs,
           java.lang.String codOs) {
           this.linha = linha;
           this.rowIdContaSiebel = rowIdContaSiebel;
           this.idOs = idOs;
           this.codOs = codOs;
    }


    /**
     * Gets the linha value for this CancelTTIn.
     * 
     * @return linha
     */
    public boolean isLinha() {
        return linha;
    }


    /**
     * Sets the linha value for this CancelTTIn.
     * 
     * @param linha
     */
    public void setLinha(boolean linha) {
        this.linha = linha;
    }


    /**
     * Gets the rowIdContaSiebel value for this CancelTTIn.
     * 
     * @return rowIdContaSiebel
     */
    public java.lang.String getRowIdContaSiebel() {
        return rowIdContaSiebel;
    }


    /**
     * Sets the rowIdContaSiebel value for this CancelTTIn.
     * 
     * @param rowIdContaSiebel
     */
    public void setRowIdContaSiebel(java.lang.String rowIdContaSiebel) {
        this.rowIdContaSiebel = rowIdContaSiebel;
    }


    /**
     * Gets the idOs value for this CancelTTIn.
     * 
     * @return idOs
     */
    public java.lang.String getIdOs() {
        return idOs;
    }


    /**
     * Sets the idOs value for this CancelTTIn.
     * 
     * @param idOs
     */
    public void setIdOs(java.lang.String idOs) {
        this.idOs = idOs;
    }


    /**
     * Gets the codOs value for this CancelTTIn.
     * 
     * @return codOs
     */
    public java.lang.String getCodOs() {
        return codOs;
    }


    /**
     * Sets the codOs value for this CancelTTIn.
     * 
     * @param codOs
     */
    public void setCodOs(java.lang.String codOs) {
        this.codOs = codOs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelTTIn)) return false;
        CancelTTIn other = (CancelTTIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.linha == other.isLinha() &&
            ((this.rowIdContaSiebel==null && other.getRowIdContaSiebel()==null) || 
             (this.rowIdContaSiebel!=null &&
              this.rowIdContaSiebel.equals(other.getRowIdContaSiebel()))) &&
            ((this.idOs==null && other.getIdOs()==null) || 
             (this.idOs!=null &&
              this.idOs.equals(other.getIdOs()))) &&
            ((this.codOs==null && other.getCodOs()==null) || 
             (this.codOs!=null &&
              this.codOs.equals(other.getCodOs())));
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
        _hashCode += (isLinha() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRowIdContaSiebel() != null) {
            _hashCode += getRowIdContaSiebel().hashCode();
        }
        if (getIdOs() != null) {
            _hashCode += getIdOs().hashCode();
        }
        if (getCodOs() != null) {
            _hashCode += getCodOs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelTTIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "cancelTTIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowIdContaSiebel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowIdContaSiebel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idOs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codOs"));
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
