/**
 * AlterarEquipamentoDeTVIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class AlterarEquipamentoDeTVIn  implements java.io.Serializable {
    private java.lang.String designadorTV;

    private java.lang.String designadorTurbonet;

    private br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBoxAtual;

    private br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBoxNovo;

    private br.com.gvt.www.tv.configuracaoTV.HomeGateway homeGateway;

    private java.lang.String codOrdemServico;

    private com.gvt.www.metaData.configuradoronline.MotivoRetirada motivoRetirada;

    public AlterarEquipamentoDeTVIn() {
    }

    public AlterarEquipamentoDeTVIn(
           java.lang.String designadorTV,
           java.lang.String designadorTurbonet,
           br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBoxAtual,
           br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBoxNovo,
           br.com.gvt.www.tv.configuracaoTV.HomeGateway homeGateway,
           java.lang.String codOrdemServico,
           com.gvt.www.metaData.configuradoronline.MotivoRetirada motivoRetirada) {
           this.designadorTV = designadorTV;
           this.designadorTurbonet = designadorTurbonet;
           this.setTopBoxAtual = setTopBoxAtual;
           this.setTopBoxNovo = setTopBoxNovo;
           this.homeGateway = homeGateway;
           this.codOrdemServico = codOrdemServico;
           this.motivoRetirada = motivoRetirada;
    }


    /**
     * Gets the designadorTV value for this AlterarEquipamentoDeTVIn.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this AlterarEquipamentoDeTVIn.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the designadorTurbonet value for this AlterarEquipamentoDeTVIn.
     * 
     * @return designadorTurbonet
     */
    public java.lang.String getDesignadorTurbonet() {
        return designadorTurbonet;
    }


    /**
     * Sets the designadorTurbonet value for this AlterarEquipamentoDeTVIn.
     * 
     * @param designadorTurbonet
     */
    public void setDesignadorTurbonet(java.lang.String designadorTurbonet) {
        this.designadorTurbonet = designadorTurbonet;
    }


    /**
     * Gets the setTopBoxAtual value for this AlterarEquipamentoDeTVIn.
     * 
     * @return setTopBoxAtual
     */
    public br.com.gvt.www.tv.configuracaoTV.SetTopBox getSetTopBoxAtual() {
        return setTopBoxAtual;
    }


    /**
     * Sets the setTopBoxAtual value for this AlterarEquipamentoDeTVIn.
     * 
     * @param setTopBoxAtual
     */
    public void setSetTopBoxAtual(br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBoxAtual) {
        this.setTopBoxAtual = setTopBoxAtual;
    }


    /**
     * Gets the setTopBoxNovo value for this AlterarEquipamentoDeTVIn.
     * 
     * @return setTopBoxNovo
     */
    public br.com.gvt.www.tv.configuracaoTV.SetTopBox getSetTopBoxNovo() {
        return setTopBoxNovo;
    }


    /**
     * Sets the setTopBoxNovo value for this AlterarEquipamentoDeTVIn.
     * 
     * @param setTopBoxNovo
     */
    public void setSetTopBoxNovo(br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBoxNovo) {
        this.setTopBoxNovo = setTopBoxNovo;
    }


    /**
     * Gets the homeGateway value for this AlterarEquipamentoDeTVIn.
     * 
     * @return homeGateway
     */
    public br.com.gvt.www.tv.configuracaoTV.HomeGateway getHomeGateway() {
        return homeGateway;
    }


    /**
     * Sets the homeGateway value for this AlterarEquipamentoDeTVIn.
     * 
     * @param homeGateway
     */
    public void setHomeGateway(br.com.gvt.www.tv.configuracaoTV.HomeGateway homeGateway) {
        this.homeGateway = homeGateway;
    }


    /**
     * Gets the codOrdemServico value for this AlterarEquipamentoDeTVIn.
     * 
     * @return codOrdemServico
     */
    public java.lang.String getCodOrdemServico() {
        return codOrdemServico;
    }


    /**
     * Sets the codOrdemServico value for this AlterarEquipamentoDeTVIn.
     * 
     * @param codOrdemServico
     */
    public void setCodOrdemServico(java.lang.String codOrdemServico) {
        this.codOrdemServico = codOrdemServico;
    }


    /**
     * Gets the motivoRetirada value for this AlterarEquipamentoDeTVIn.
     * 
     * @return motivoRetirada
     */
    public com.gvt.www.metaData.configuradoronline.MotivoRetirada getMotivoRetirada() {
        return motivoRetirada;
    }


    /**
     * Sets the motivoRetirada value for this AlterarEquipamentoDeTVIn.
     * 
     * @param motivoRetirada
     */
    public void setMotivoRetirada(com.gvt.www.metaData.configuradoronline.MotivoRetirada motivoRetirada) {
        this.motivoRetirada = motivoRetirada;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlterarEquipamentoDeTVIn)) return false;
        AlterarEquipamentoDeTVIn other = (AlterarEquipamentoDeTVIn) obj;
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
            ((this.setTopBoxAtual==null && other.getSetTopBoxAtual()==null) || 
             (this.setTopBoxAtual!=null &&
              this.setTopBoxAtual.equals(other.getSetTopBoxAtual()))) &&
            ((this.setTopBoxNovo==null && other.getSetTopBoxNovo()==null) || 
             (this.setTopBoxNovo!=null &&
              this.setTopBoxNovo.equals(other.getSetTopBoxNovo()))) &&
            ((this.homeGateway==null && other.getHomeGateway()==null) || 
             (this.homeGateway!=null &&
              this.homeGateway.equals(other.getHomeGateway()))) &&
            ((this.codOrdemServico==null && other.getCodOrdemServico()==null) || 
             (this.codOrdemServico!=null &&
              this.codOrdemServico.equals(other.getCodOrdemServico()))) &&
            ((this.motivoRetirada==null && other.getMotivoRetirada()==null) || 
             (this.motivoRetirada!=null &&
              this.motivoRetirada.equals(other.getMotivoRetirada())));
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
        if (getSetTopBoxAtual() != null) {
            _hashCode += getSetTopBoxAtual().hashCode();
        }
        if (getSetTopBoxNovo() != null) {
            _hashCode += getSetTopBoxNovo().hashCode();
        }
        if (getHomeGateway() != null) {
            _hashCode += getHomeGateway().hashCode();
        }
        if (getCodOrdemServico() != null) {
            _hashCode += getCodOrdemServico().hashCode();
        }
        if (getMotivoRetirada() != null) {
            _hashCode += getMotivoRetirada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlterarEquipamentoDeTVIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarEquipamentoDeTVIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTurbonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTurbonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setTopBoxAtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "setTopBoxAtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "SetTopBox"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setTopBoxNovo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "setTopBoxNovo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "SetTopBox"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeGateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "homeGateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "HomeGateway"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOrdemServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "codOrdemServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoRetirada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "motivoRetirada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "MotivoRetirada"));
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
