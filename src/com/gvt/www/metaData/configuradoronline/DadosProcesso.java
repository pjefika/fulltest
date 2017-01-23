/**
 * DadosProcesso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosProcesso  implements java.io.Serializable {
    private java.lang.String codigoProcesso;

    private java.lang.String descricaoProcesso;

    private com.gvt.www.metaData.configuradoronline.DadosArea area;

    private java.lang.String[] permite;

    public DadosProcesso() {
    }

    public DadosProcesso(
           java.lang.String codigoProcesso,
           java.lang.String descricaoProcesso,
           com.gvt.www.metaData.configuradoronline.DadosArea area,
           java.lang.String[] permite) {
           this.codigoProcesso = codigoProcesso;
           this.descricaoProcesso = descricaoProcesso;
           this.area = area;
           this.permite = permite;
    }


    /**
     * Gets the codigoProcesso value for this DadosProcesso.
     * 
     * @return codigoProcesso
     */
    public java.lang.String getCodigoProcesso() {
        return codigoProcesso;
    }


    /**
     * Sets the codigoProcesso value for this DadosProcesso.
     * 
     * @param codigoProcesso
     */
    public void setCodigoProcesso(java.lang.String codigoProcesso) {
        this.codigoProcesso = codigoProcesso;
    }


    /**
     * Gets the descricaoProcesso value for this DadosProcesso.
     * 
     * @return descricaoProcesso
     */
    public java.lang.String getDescricaoProcesso() {
        return descricaoProcesso;
    }


    /**
     * Sets the descricaoProcesso value for this DadosProcesso.
     * 
     * @param descricaoProcesso
     */
    public void setDescricaoProcesso(java.lang.String descricaoProcesso) {
        this.descricaoProcesso = descricaoProcesso;
    }


    /**
     * Gets the area value for this DadosProcesso.
     * 
     * @return area
     */
    public com.gvt.www.metaData.configuradoronline.DadosArea getArea() {
        return area;
    }


    /**
     * Sets the area value for this DadosProcesso.
     * 
     * @param area
     */
    public void setArea(com.gvt.www.metaData.configuradoronline.DadosArea area) {
        this.area = area;
    }


    /**
     * Gets the permite value for this DadosProcesso.
     * 
     * @return permite
     */
    public java.lang.String[] getPermite() {
        return permite;
    }


    /**
     * Sets the permite value for this DadosProcesso.
     * 
     * @param permite
     */
    public void setPermite(java.lang.String[] permite) {
        this.permite = permite;
    }

    public java.lang.String getPermite(int i) {
        return this.permite[i];
    }

    public void setPermite(int i, java.lang.String _value) {
        this.permite[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosProcesso)) return false;
        DadosProcesso other = (DadosProcesso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoProcesso==null && other.getCodigoProcesso()==null) || 
             (this.codigoProcesso!=null &&
              this.codigoProcesso.equals(other.getCodigoProcesso()))) &&
            ((this.descricaoProcesso==null && other.getDescricaoProcesso()==null) || 
             (this.descricaoProcesso!=null &&
              this.descricaoProcesso.equals(other.getDescricaoProcesso()))) &&
            ((this.area==null && other.getArea()==null) || 
             (this.area!=null &&
              this.area.equals(other.getArea()))) &&
            ((this.permite==null && other.getPermite()==null) || 
             (this.permite!=null &&
              java.util.Arrays.equals(this.permite, other.getPermite())));
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
        if (getCodigoProcesso() != null) {
            _hashCode += getCodigoProcesso().hashCode();
        }
        if (getDescricaoProcesso() != null) {
            _hashCode += getDescricaoProcesso().hashCode();
        }
        if (getArea() != null) {
            _hashCode += getArea().hashCode();
        }
        if (getPermite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermite(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosProcesso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosProcesso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoProcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "codigoProcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoProcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "descricaoProcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("area");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosArea"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "permite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
