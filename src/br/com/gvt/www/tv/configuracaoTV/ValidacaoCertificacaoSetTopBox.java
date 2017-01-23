/**
 * ValidacaoCertificacaoSetTopBox.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ValidacaoCertificacaoSetTopBox  implements java.io.Serializable {
    private br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox;

    private java.lang.String chaveCertificacao;

    private br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBoxStatusCertificacao statusCertificacao;

    private java.lang.String satellite;

    private java.lang.String mensagemCertificacao;

    private int relacaoSinalRuido;

    public ValidacaoCertificacaoSetTopBox() {
    }

    public ValidacaoCertificacaoSetTopBox(
           br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox,
           java.lang.String chaveCertificacao,
           br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBoxStatusCertificacao statusCertificacao,
           java.lang.String satellite,
           java.lang.String mensagemCertificacao,
           int relacaoSinalRuido) {
           this.setTopBox = setTopBox;
           this.chaveCertificacao = chaveCertificacao;
           this.statusCertificacao = statusCertificacao;
           this.satellite = satellite;
           this.mensagemCertificacao = mensagemCertificacao;
           this.relacaoSinalRuido = relacaoSinalRuido;
    }


    /**
     * Gets the setTopBox value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @return setTopBox
     */
    public br.com.gvt.www.tv.configuracaoTV.SetTopBox getSetTopBox() {
        return setTopBox;
    }


    /**
     * Sets the setTopBox value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @param setTopBox
     */
    public void setSetTopBox(br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }


    /**
     * Gets the chaveCertificacao value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @return chaveCertificacao
     */
    public java.lang.String getChaveCertificacao() {
        return chaveCertificacao;
    }


    /**
     * Sets the chaveCertificacao value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @param chaveCertificacao
     */
    public void setChaveCertificacao(java.lang.String chaveCertificacao) {
        this.chaveCertificacao = chaveCertificacao;
    }


    /**
     * Gets the statusCertificacao value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @return statusCertificacao
     */
    public br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBoxStatusCertificacao getStatusCertificacao() {
        return statusCertificacao;
    }


    /**
     * Sets the statusCertificacao value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @param statusCertificacao
     */
    public void setStatusCertificacao(br.com.gvt.www.tv.configuracaoTV.ValidacaoCertificacaoSetTopBoxStatusCertificacao statusCertificacao) {
        this.statusCertificacao = statusCertificacao;
    }


    /**
     * Gets the satellite value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @return satellite
     */
    public java.lang.String getSatellite() {
        return satellite;
    }


    /**
     * Sets the satellite value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @param satellite
     */
    public void setSatellite(java.lang.String satellite) {
        this.satellite = satellite;
    }


    /**
     * Gets the mensagemCertificacao value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @return mensagemCertificacao
     */
    public java.lang.String getMensagemCertificacao() {
        return mensagemCertificacao;
    }


    /**
     * Sets the mensagemCertificacao value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @param mensagemCertificacao
     */
    public void setMensagemCertificacao(java.lang.String mensagemCertificacao) {
        this.mensagemCertificacao = mensagemCertificacao;
    }


    /**
     * Gets the relacaoSinalRuido value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @return relacaoSinalRuido
     */
    public int getRelacaoSinalRuido() {
        return relacaoSinalRuido;
    }


    /**
     * Sets the relacaoSinalRuido value for this ValidacaoCertificacaoSetTopBox.
     * 
     * @param relacaoSinalRuido
     */
    public void setRelacaoSinalRuido(int relacaoSinalRuido) {
        this.relacaoSinalRuido = relacaoSinalRuido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidacaoCertificacaoSetTopBox)) return false;
        ValidacaoCertificacaoSetTopBox other = (ValidacaoCertificacaoSetTopBox) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setTopBox==null && other.getSetTopBox()==null) || 
             (this.setTopBox!=null &&
              this.setTopBox.equals(other.getSetTopBox()))) &&
            ((this.chaveCertificacao==null && other.getChaveCertificacao()==null) || 
             (this.chaveCertificacao!=null &&
              this.chaveCertificacao.equals(other.getChaveCertificacao()))) &&
            ((this.statusCertificacao==null && other.getStatusCertificacao()==null) || 
             (this.statusCertificacao!=null &&
              this.statusCertificacao.equals(other.getStatusCertificacao()))) &&
            ((this.satellite==null && other.getSatellite()==null) || 
             (this.satellite!=null &&
              this.satellite.equals(other.getSatellite()))) &&
            ((this.mensagemCertificacao==null && other.getMensagemCertificacao()==null) || 
             (this.mensagemCertificacao!=null &&
              this.mensagemCertificacao.equals(other.getMensagemCertificacao()))) &&
            this.relacaoSinalRuido == other.getRelacaoSinalRuido();
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
        if (getSetTopBox() != null) {
            _hashCode += getSetTopBox().hashCode();
        }
        if (getChaveCertificacao() != null) {
            _hashCode += getChaveCertificacao().hashCode();
        }
        if (getStatusCertificacao() != null) {
            _hashCode += getStatusCertificacao().hashCode();
        }
        if (getSatellite() != null) {
            _hashCode += getSatellite().hashCode();
        }
        if (getMensagemCertificacao() != null) {
            _hashCode += getMensagemCertificacao().hashCode();
        }
        _hashCode += getRelacaoSinalRuido();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidacaoCertificacaoSetTopBox.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ValidacaoCertificacaoSetTopBox"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCertificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "statusCertificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">ValidacaoCertificacaoSetTopBox>statusCertificacao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("satellite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "satellite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemCertificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "mensagemCertificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relacaoSinalRuido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "relacaoSinalRuido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
