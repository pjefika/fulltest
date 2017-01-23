/**
 * AtivarAssinanteDTHIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class AtivarAssinanteDTHIn  implements java.io.Serializable {
    private java.lang.String designadorTV;

    private java.lang.String satellite;

    private java.lang.String cep;

    private br.com.gvt.www.tv.configuracaoTV.SmartCard smartCard;

    private br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox;

    private java.lang.String codOrdemServico;

    public AtivarAssinanteDTHIn() {
    }

    public AtivarAssinanteDTHIn(
           java.lang.String designadorTV,
           java.lang.String satellite,
           java.lang.String cep,
           br.com.gvt.www.tv.configuracaoTV.SmartCard smartCard,
           br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox,
           java.lang.String codOrdemServico) {
           this.designadorTV = designadorTV;
           this.satellite = satellite;
           this.cep = cep;
           this.smartCard = smartCard;
           this.setTopBox = setTopBox;
           this.codOrdemServico = codOrdemServico;
    }


    /**
     * Gets the designadorTV value for this AtivarAssinanteDTHIn.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this AtivarAssinanteDTHIn.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the satellite value for this AtivarAssinanteDTHIn.
     * 
     * @return satellite
     */
    public java.lang.String getSatellite() {
        return satellite;
    }


    /**
     * Sets the satellite value for this AtivarAssinanteDTHIn.
     * 
     * @param satellite
     */
    public void setSatellite(java.lang.String satellite) {
        this.satellite = satellite;
    }


    /**
     * Gets the cep value for this AtivarAssinanteDTHIn.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this AtivarAssinanteDTHIn.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }


    /**
     * Gets the smartCard value for this AtivarAssinanteDTHIn.
     * 
     * @return smartCard
     */
    public br.com.gvt.www.tv.configuracaoTV.SmartCard getSmartCard() {
        return smartCard;
    }


    /**
     * Sets the smartCard value for this AtivarAssinanteDTHIn.
     * 
     * @param smartCard
     */
    public void setSmartCard(br.com.gvt.www.tv.configuracaoTV.SmartCard smartCard) {
        this.smartCard = smartCard;
    }


    /**
     * Gets the setTopBox value for this AtivarAssinanteDTHIn.
     * 
     * @return setTopBox
     */
    public br.com.gvt.www.tv.configuracaoTV.SetTopBox getSetTopBox() {
        return setTopBox;
    }


    /**
     * Sets the setTopBox value for this AtivarAssinanteDTHIn.
     * 
     * @param setTopBox
     */
    public void setSetTopBox(br.com.gvt.www.tv.configuracaoTV.SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }


    /**
     * Gets the codOrdemServico value for this AtivarAssinanteDTHIn.
     * 
     * @return codOrdemServico
     */
    public java.lang.String getCodOrdemServico() {
        return codOrdemServico;
    }


    /**
     * Sets the codOrdemServico value for this AtivarAssinanteDTHIn.
     * 
     * @param codOrdemServico
     */
    public void setCodOrdemServico(java.lang.String codOrdemServico) {
        this.codOrdemServico = codOrdemServico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtivarAssinanteDTHIn)) return false;
        AtivarAssinanteDTHIn other = (AtivarAssinanteDTHIn) obj;
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
            ((this.satellite==null && other.getSatellite()==null) || 
             (this.satellite!=null &&
              this.satellite.equals(other.getSatellite()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep()))) &&
            ((this.smartCard==null && other.getSmartCard()==null) || 
             (this.smartCard!=null &&
              this.smartCard.equals(other.getSmartCard()))) &&
            ((this.setTopBox==null && other.getSetTopBox()==null) || 
             (this.setTopBox!=null &&
              this.setTopBox.equals(other.getSetTopBox()))) &&
            ((this.codOrdemServico==null && other.getCodOrdemServico()==null) || 
             (this.codOrdemServico!=null &&
              this.codOrdemServico.equals(other.getCodOrdemServico())));
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
        if (getSatellite() != null) {
            _hashCode += getSatellite().hashCode();
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        if (getSmartCard() != null) {
            _hashCode += getSmartCard().hashCode();
        }
        if (getSetTopBox() != null) {
            _hashCode += getSetTopBox().hashCode();
        }
        if (getCodOrdemServico() != null) {
            _hashCode += getCodOrdemServico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtivarAssinanteDTHIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarAssinanteDTHIn"));
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
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "cep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("codOrdemServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "codOrdemServico"));
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
