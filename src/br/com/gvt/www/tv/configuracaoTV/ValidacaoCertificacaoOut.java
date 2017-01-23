/**
 * ValidacaoCertificacaoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ValidacaoCertificacaoOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private java.lang.String designadorTV;

    private java.lang.String satellite;

    private br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBox[] certificacoes;

    public ValidacaoCertificacaoOut() {
    }

    public ValidacaoCertificacaoOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           java.lang.String designadorTV,
           java.lang.String satellite,
           br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBox[] certificacoes) {
        super(
            codigo,
            mensagem,
            descricao);
        this.designadorTV = designadorTV;
        this.satellite = satellite;
        this.certificacoes = certificacoes;
    }


    /**
     * Gets the designadorTV value for this ValidacaoCertificacaoOut.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this ValidacaoCertificacaoOut.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the satellite value for this ValidacaoCertificacaoOut.
     * 
     * @return satellite
     */
    public java.lang.String getSatellite() {
        return satellite;
    }


    /**
     * Sets the satellite value for this ValidacaoCertificacaoOut.
     * 
     * @param satellite
     */
    public void setSatellite(java.lang.String satellite) {
        this.satellite = satellite;
    }


    /**
     * Gets the certificacoes value for this ValidacaoCertificacaoOut.
     * 
     * @return certificacoes
     */
    public br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBox[] getCertificacoes() {
        return certificacoes;
    }


    /**
     * Sets the certificacoes value for this ValidacaoCertificacaoOut.
     * 
     * @param certificacoes
     */
    public void setCertificacoes(br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBox[] certificacoes) {
        this.certificacoes = certificacoes;
    }

    public br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBox getCertificacoes(int i) {
        return this.certificacoes[i];
    }

    public void setCertificacoes(int i, br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBox _value) {
        this.certificacoes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidacaoCertificacaoOut)) return false;
        ValidacaoCertificacaoOut other = (ValidacaoCertificacaoOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV()))) &&
            ((this.satellite==null && other.getSatellite()==null) || 
             (this.satellite!=null &&
              this.satellite.equals(other.getSatellite()))) &&
            ((this.certificacoes==null && other.getCertificacoes()==null) || 
             (this.certificacoes!=null &&
              java.util.Arrays.equals(this.certificacoes, other.getCertificacoes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        if (getSatellite() != null) {
            _hashCode += getSatellite().hashCode();
        }
        if (getCertificacoes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificacoes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificacoes(), i);
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
        new org.apache.axis.description.TypeDesc(ValidacaoCertificacaoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidacaoCertificacaoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("satellite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "satellite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificacoes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "certificacoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidacaoCertificacaoSetTopBox"));
        elemField.setNillable(false);
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
