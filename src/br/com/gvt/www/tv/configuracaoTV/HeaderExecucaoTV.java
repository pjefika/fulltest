/**
 * HeaderExecucaoTV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public abstract class HeaderExecucaoTV  implements java.io.Serializable {
    /* Designador de TV (Produto Siebel) */
    private java.lang.String designadorTV;

    private java.lang.String designadorTurbonet;

    private java.lang.String linhaAssinante;

    private java.lang.String tecnologiaVoz;

    private java.lang.String cidade;

    private br.com.gvt.www.tv.configuracaoTV.Passport passport;

    private br.com.gvt.www.tv.configuracaoTV.HeaderExecucaoTVTecnologiaTV tecnologiaTV;

    public HeaderExecucaoTV() {
    }

    public HeaderExecucaoTV(
           java.lang.String designadorTV,
           java.lang.String designadorTurbonet,
           java.lang.String linhaAssinante,
           java.lang.String tecnologiaVoz,
           java.lang.String cidade,
           br.com.gvt.www.tv.configuracaoTV.Passport passport,
           br.com.gvt.www.tv.configuracaoTV.HeaderExecucaoTVTecnologiaTV tecnologiaTV) {
           this.designadorTV = designadorTV;
           this.designadorTurbonet = designadorTurbonet;
           this.linhaAssinante = linhaAssinante;
           this.tecnologiaVoz = tecnologiaVoz;
           this.cidade = cidade;
           this.passport = passport;
           this.tecnologiaTV = tecnologiaTV;
    }


    /**
     * Gets the designadorTV value for this HeaderExecucaoTV.
     * 
     * @return designadorTV   * Designador de TV (Produto Siebel)
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this HeaderExecucaoTV.
     * 
     * @param designadorTV   * Designador de TV (Produto Siebel)
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the designadorTurbonet value for this HeaderExecucaoTV.
     * 
     * @return designadorTurbonet
     */
    public java.lang.String getDesignadorTurbonet() {
        return designadorTurbonet;
    }


    /**
     * Sets the designadorTurbonet value for this HeaderExecucaoTV.
     * 
     * @param designadorTurbonet
     */
    public void setDesignadorTurbonet(java.lang.String designadorTurbonet) {
        this.designadorTurbonet = designadorTurbonet;
    }


    /**
     * Gets the linhaAssinante value for this HeaderExecucaoTV.
     * 
     * @return linhaAssinante
     */
    public java.lang.String getLinhaAssinante() {
        return linhaAssinante;
    }


    /**
     * Sets the linhaAssinante value for this HeaderExecucaoTV.
     * 
     * @param linhaAssinante
     */
    public void setLinhaAssinante(java.lang.String linhaAssinante) {
        this.linhaAssinante = linhaAssinante;
    }


    /**
     * Gets the tecnologiaVoz value for this HeaderExecucaoTV.
     * 
     * @return tecnologiaVoz
     */
    public java.lang.String getTecnologiaVoz() {
        return tecnologiaVoz;
    }


    /**
     * Sets the tecnologiaVoz value for this HeaderExecucaoTV.
     * 
     * @param tecnologiaVoz
     */
    public void setTecnologiaVoz(java.lang.String tecnologiaVoz) {
        this.tecnologiaVoz = tecnologiaVoz;
    }


    /**
     * Gets the cidade value for this HeaderExecucaoTV.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this HeaderExecucaoTV.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the passport value for this HeaderExecucaoTV.
     * 
     * @return passport
     */
    public br.com.gvt.www.tv.configuracaoTV.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this HeaderExecucaoTV.
     * 
     * @param passport
     */
    public void setPassport(br.com.gvt.www.tv.configuracaoTV.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the tecnologiaTV value for this HeaderExecucaoTV.
     * 
     * @return tecnologiaTV
     */
    public br.com.gvt.www.tv.configuracaoTV.HeaderExecucaoTVTecnologiaTV getTecnologiaTV() {
        return tecnologiaTV;
    }


    /**
     * Sets the tecnologiaTV value for this HeaderExecucaoTV.
     * 
     * @param tecnologiaTV
     */
    public void setTecnologiaTV(br.com.gvt.www.tv.configuracaoTV.HeaderExecucaoTVTecnologiaTV tecnologiaTV) {
        this.tecnologiaTV = tecnologiaTV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HeaderExecucaoTV)) return false;
        HeaderExecucaoTV other = (HeaderExecucaoTV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV()))) &&
            ((this.designadorTurbonet==null && other.getDesignadorTurbonet()==null) || 
             (this.designadorTurbonet!=null &&
              this.designadorTurbonet.equals(other.getDesignadorTurbonet()))) &&
            ((this.linhaAssinante==null && other.getLinhaAssinante()==null) || 
             (this.linhaAssinante!=null &&
              this.linhaAssinante.equals(other.getLinhaAssinante()))) &&
            ((this.tecnologiaVoz==null && other.getTecnologiaVoz()==null) || 
             (this.tecnologiaVoz!=null &&
              this.tecnologiaVoz.equals(other.getTecnologiaVoz()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.passport==null && other.getPassport()==null) || 
             (this.passport!=null &&
              this.passport.equals(other.getPassport()))) &&
            ((this.tecnologiaTV==null && other.getTecnologiaTV()==null) || 
             (this.tecnologiaTV!=null &&
              this.tecnologiaTV.equals(other.getTecnologiaTV())));
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
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        if (getDesignadorTurbonet() != null) {
            _hashCode += getDesignadorTurbonet().hashCode();
        }
        if (getLinhaAssinante() != null) {
            _hashCode += getLinhaAssinante().hashCode();
        }
        if (getTecnologiaVoz() != null) {
            _hashCode += getTecnologiaVoz().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getPassport() != null) {
            _hashCode += getPassport().hashCode();
        }
        if (getTecnologiaTV() != null) {
            _hashCode += getTecnologiaTV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HeaderExecucaoTV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "HeaderExecucaoTV"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTurbonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTurbonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linhaAssinante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "linhaAssinante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologiaVoz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "tecnologiaVoz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologiaTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "tecnologiaTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">HeaderExecucaoTV>tecnologiaTV"));
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
