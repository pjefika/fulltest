/**
 * ValidarChaveCertificacaoDTHIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ValidarChaveCertificacaoDTHIn  implements java.io.Serializable {
    private br.com.gvt.www.tv.configuracaoTV.SmartCard smartCard;

    private br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox;

    private java.lang.String chaveCertificacao;

    public ValidarChaveCertificacaoDTHIn() {
    }

    public ValidarChaveCertificacaoDTHIn(
           br.com.gvt.www.tv.configuracaoTV.SmartCard smartCard,
           br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox,
           java.lang.String chaveCertificacao) {
           this.smartCard = smartCard;
           this.setTopBox = setTopBox;
           this.chaveCertificacao = chaveCertificacao;
    }


    /**
     * Gets the smartCard value for this ValidarChaveCertificacaoDTHIn.
     * 
     * @return smartCard
     */
    public br.com.gvt.www.tv.configuracaoTV.SmartCard getSmartCard() {
        return smartCard;
    }


    /**
     * Sets the smartCard value for this ValidarChaveCertificacaoDTHIn.
     * 
     * @param smartCard
     */
    public void setSmartCard(br.com.gvt.www.tv.configuracaoTV.SmartCard smartCard) {
        this.smartCard = smartCard;
    }


    /**
     * Gets the setTopBox value for this ValidarChaveCertificacaoDTHIn.
     * 
     * @return setTopBox
     */
    public br.com.gvt.www.tv.configuracaoTV.SetTopBox getSetTopBox() {
        return setTopBox;
    }


    /**
     * Sets the setTopBox value for this ValidarChaveCertificacaoDTHIn.
     * 
     * @param setTopBox
     */
    public void setSetTopBox(br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }


    /**
     * Gets the chaveCertificacao value for this ValidarChaveCertificacaoDTHIn.
     * 
     * @return chaveCertificacao
     */
    public java.lang.String getChaveCertificacao() {
        return chaveCertificacao;
    }


    /**
     * Sets the chaveCertificacao value for this ValidarChaveCertificacaoDTHIn.
     * 
     * @param chaveCertificacao
     */
    public void setChaveCertificacao(java.lang.String chaveCertificacao) {
        this.chaveCertificacao = chaveCertificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidarChaveCertificacaoDTHIn)) return false;
        ValidarChaveCertificacaoDTHIn other = (ValidarChaveCertificacaoDTHIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smartCard==null && other.getSmartCard()==null) || 
             (this.smartCard!=null &&
              this.smartCard.equals(other.getSmartCard()))) &&
            ((this.setTopBox==null && other.getSetTopBox()==null) || 
             (this.setTopBox!=null &&
              this.setTopBox.equals(other.getSetTopBox()))) &&
            ((this.chaveCertificacao==null && other.getChaveCertificacao()==null) || 
             (this.chaveCertificacao!=null &&
              this.chaveCertificacao.equals(other.getChaveCertificacao())));
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
        if (getSmartCard() != null) {
            _hashCode += getSmartCard().hashCode();
        }
        if (getSetTopBox() != null) {
            _hashCode += getSetTopBox().hashCode();
        }
        if (getChaveCertificacao() != null) {
            _hashCode += getChaveCertificacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidarChaveCertificacaoDTHIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidarChaveCertificacaoDTHIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "smartCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "SmartCard"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setTopBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "setTopBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "SetTopBox"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chaveCertificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "chaveCertificacao"));
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
