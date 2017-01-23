/**
 * ResetOntGPONIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.ResetOntGPON;

public class ResetOntGPONIn  implements java.io.Serializable {
    private java.lang.String designadorAcesso;

    private com.gvt.www.ws.eai.oss.ResetOntGPON.EnumAcao acao;

    public ResetOntGPONIn() {
    }

    public ResetOntGPONIn(
           java.lang.String designadorAcesso,
           com.gvt.www.ws.eai.oss.ResetOntGPON.EnumAcao acao) {
           this.designadorAcesso = designadorAcesso;
           this.acao = acao;
    }


    /**
     * Gets the designadorAcesso value for this ResetOntGPONIn.
     * 
     * @return designadorAcesso
     */
    public java.lang.String getDesignadorAcesso() {
        return designadorAcesso;
    }


    /**
     * Sets the designadorAcesso value for this ResetOntGPONIn.
     * 
     * @param designadorAcesso
     */
    public void setDesignadorAcesso(java.lang.String designadorAcesso) {
        this.designadorAcesso = designadorAcesso;
    }


    /**
     * Gets the acao value for this ResetOntGPONIn.
     * 
     * @return acao
     */
    public com.gvt.www.ws.eai.oss.ResetOntGPON.EnumAcao getAcao() {
        return acao;
    }


    /**
     * Sets the acao value for this ResetOntGPONIn.
     * 
     * @param acao
     */
    public void setAcao(com.gvt.www.ws.eai.oss.ResetOntGPON.EnumAcao acao) {
        this.acao = acao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResetOntGPONIn)) return false;
        ResetOntGPONIn other = (ResetOntGPONIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorAcesso==null && other.getDesignadorAcesso()==null) || 
             (this.designadorAcesso!=null &&
              this.designadorAcesso.equals(other.getDesignadorAcesso()))) &&
            ((this.acao==null && other.getAcao()==null) || 
             (this.acao!=null &&
              this.acao.equals(other.getAcao())));
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
        if (getDesignadorAcesso() != null) {
            _hashCode += getDesignadorAcesso().hashCode();
        }
        if (getAcao() != null) {
            _hashCode += getAcao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResetOntGPONIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ResetOntGPON", "ResetOntGPONIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ResetOntGPON", "designadorAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ResetOntGPON", "acao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ResetOntGPON", "EnumAcao"));
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
