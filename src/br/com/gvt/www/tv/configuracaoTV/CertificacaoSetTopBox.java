/**
 * CertificacaoSetTopBox.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class CertificacaoSetTopBox  implements java.io.Serializable {
    private java.lang.String chaveCertificacao;

    private br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox;

    public CertificacaoSetTopBox() {
    }

    public CertificacaoSetTopBox(
           java.lang.String chaveCertificacao,
           br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox) {
           this.chaveCertificacao = chaveCertificacao;
           this.setTopBox = setTopBox;
    }


    /**
     * Gets the chaveCertificacao value for this CertificacaoSetTopBox.
     * 
     * @return chaveCertificacao
     */
    public java.lang.String getChaveCertificacao() {
        return chaveCertificacao;
    }


    /**
     * Sets the chaveCertificacao value for this CertificacaoSetTopBox.
     * 
     * @param chaveCertificacao
     */
    public void setChaveCertificacao(java.lang.String chaveCertificacao) {
        this.chaveCertificacao = chaveCertificacao;
    }


    /**
     * Gets the setTopBox value for this CertificacaoSetTopBox.
     * 
     * @return setTopBox
     */
    public br.com.gvt.www.tv.configuracaoTV.SetTopBox getSetTopBox() {
        return setTopBox;
    }


    /**
     * Sets the setTopBox value for this CertificacaoSetTopBox.
     * 
     * @param setTopBox
     */
    public void setSetTopBox(br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificacaoSetTopBox)) return false;
        CertificacaoSetTopBox other = (CertificacaoSetTopBox) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chaveCertificacao==null && other.getChaveCertificacao()==null) || 
             (this.chaveCertificacao!=null &&
              this.chaveCertificacao.equals(other.getChaveCertificacao()))) &&
            ((this.setTopBox==null && other.getSetTopBox()==null) || 
             (this.setTopBox!=null &&
              this.setTopBox.equals(other.getSetTopBox())));
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
        if (getChaveCertificacao() != null) {
            _hashCode += getChaveCertificacao().hashCode();
        }
        if (getSetTopBox() != null) {
            _hashCode += getSetTopBox().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificacaoSetTopBox.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CertificacaoSetTopBox"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chaveCertificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "chaveCertificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setTopBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "setTopBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "SetTopBox"));
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
