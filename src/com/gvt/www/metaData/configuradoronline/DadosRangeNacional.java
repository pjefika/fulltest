/**
 * DadosRangeNacional.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosRangeNacional  implements java.io.Serializable {
    private java.lang.String cn;

    private java.lang.String prefixo;

    private java.lang.String mcduInicial;

    private java.lang.String mcduFinal;

    public DadosRangeNacional() {
    }

    public DadosRangeNacional(
           java.lang.String cn,
           java.lang.String prefixo,
           java.lang.String mcduInicial,
           java.lang.String mcduFinal) {
           this.cn = cn;
           this.prefixo = prefixo;
           this.mcduInicial = mcduInicial;
           this.mcduFinal = mcduFinal;
    }


    /**
     * Gets the cn value for this DadosRangeNacional.
     * 
     * @return cn
     */
    public java.lang.String getCn() {
        return cn;
    }


    /**
     * Sets the cn value for this DadosRangeNacional.
     * 
     * @param cn
     */
    public void setCn(java.lang.String cn) {
        this.cn = cn;
    }


    /**
     * Gets the prefixo value for this DadosRangeNacional.
     * 
     * @return prefixo
     */
    public java.lang.String getPrefixo() {
        return prefixo;
    }


    /**
     * Sets the prefixo value for this DadosRangeNacional.
     * 
     * @param prefixo
     */
    public void setPrefixo(java.lang.String prefixo) {
        this.prefixo = prefixo;
    }


    /**
     * Gets the mcduInicial value for this DadosRangeNacional.
     * 
     * @return mcduInicial
     */
    public java.lang.String getMcduInicial() {
        return mcduInicial;
    }


    /**
     * Sets the mcduInicial value for this DadosRangeNacional.
     * 
     * @param mcduInicial
     */
    public void setMcduInicial(java.lang.String mcduInicial) {
        this.mcduInicial = mcduInicial;
    }


    /**
     * Gets the mcduFinal value for this DadosRangeNacional.
     * 
     * @return mcduFinal
     */
    public java.lang.String getMcduFinal() {
        return mcduFinal;
    }


    /**
     * Sets the mcduFinal value for this DadosRangeNacional.
     * 
     * @param mcduFinal
     */
    public void setMcduFinal(java.lang.String mcduFinal) {
        this.mcduFinal = mcduFinal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosRangeNacional)) return false;
        DadosRangeNacional other = (DadosRangeNacional) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn==null && other.getCn()==null) || 
             (this.cn!=null &&
              this.cn.equals(other.getCn()))) &&
            ((this.prefixo==null && other.getPrefixo()==null) || 
             (this.prefixo!=null &&
              this.prefixo.equals(other.getPrefixo()))) &&
            ((this.mcduInicial==null && other.getMcduInicial()==null) || 
             (this.mcduInicial!=null &&
              this.mcduInicial.equals(other.getMcduInicial()))) &&
            ((this.mcduFinal==null && other.getMcduFinal()==null) || 
             (this.mcduFinal!=null &&
              this.mcduFinal.equals(other.getMcduFinal())));
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
        if (getCn() != null) {
            _hashCode += getCn().hashCode();
        }
        if (getPrefixo() != null) {
            _hashCode += getPrefixo().hashCode();
        }
        if (getMcduInicial() != null) {
            _hashCode += getMcduInicial().hashCode();
        }
        if (getMcduFinal() != null) {
            _hashCode += getMcduFinal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosRangeNacional.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosRangeNacional"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "cn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "prefixo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mcduInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "mcduInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mcduFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "mcduFinal"));
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
