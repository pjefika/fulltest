/**
 * Param.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico;

public class Param  implements java.io.Serializable {
    private java.lang.String nomeParam;

    private java.lang.String valorParamStr;

    private java.util.Calendar valorParamDate;

    public Param() {
    }

    public Param(
           java.lang.String nomeParam,
           java.lang.String valorParamStr,
           java.util.Calendar valorParamDate) {
           this.nomeParam = nomeParam;
           this.valorParamStr = valorParamStr;
           this.valorParamDate = valorParamDate;
    }


    /**
     * Gets the nomeParam value for this Param.
     * 
     * @return nomeParam
     */
    public java.lang.String getNomeParam() {
        return nomeParam;
    }


    /**
     * Sets the nomeParam value for this Param.
     * 
     * @param nomeParam
     */
    public void setNomeParam(java.lang.String nomeParam) {
        this.nomeParam = nomeParam;
    }


    /**
     * Gets the valorParamStr value for this Param.
     * 
     * @return valorParamStr
     */
    public java.lang.String getValorParamStr() {
        return valorParamStr;
    }


    /**
     * Sets the valorParamStr value for this Param.
     * 
     * @param valorParamStr
     */
    public void setValorParamStr(java.lang.String valorParamStr) {
        this.valorParamStr = valorParamStr;
    }


    /**
     * Gets the valorParamDate value for this Param.
     * 
     * @return valorParamDate
     */
    public java.util.Calendar getValorParamDate() {
        return valorParamDate;
    }


    /**
     * Sets the valorParamDate value for this Param.
     * 
     * @param valorParamDate
     */
    public void setValorParamDate(java.util.Calendar valorParamDate) {
        this.valorParamDate = valorParamDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Param)) return false;
        Param other = (Param) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomeParam==null && other.getNomeParam()==null) || 
             (this.nomeParam!=null &&
              this.nomeParam.equals(other.getNomeParam()))) &&
            ((this.valorParamStr==null && other.getValorParamStr()==null) || 
             (this.valorParamStr!=null &&
              this.valorParamStr.equals(other.getValorParamStr()))) &&
            ((this.valorParamDate==null && other.getValorParamDate()==null) || 
             (this.valorParamDate!=null &&
              this.valorParamDate.equals(other.getValorParamDate())));
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
        if (getNomeParam() != null) {
            _hashCode += getNomeParam().hashCode();
        }
        if (getValorParamStr() != null) {
            _hashCode += getValorParamStr().hashCode();
        }
        if (getValorParamDate() != null) {
            _hashCode += getValorParamDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Param.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "param"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "nomeParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorParamStr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "valorParamStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorParamDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "valorParamDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
