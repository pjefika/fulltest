/**
 * HomeGateway.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class HomeGateway  implements java.io.Serializable {
    private java.lang.String designadorTurbonet;

    private java.lang.String designadorTV;

    private java.lang.String serial;

    private java.lang.String macAddress;

    private com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento modeloEquipamento;

    private br.com.gvt.www.tv.configuracaoTV.StatusProvisioning statusProvisioning;

    public HomeGateway() {
    }

    public HomeGateway(
           java.lang.String designadorTurbonet,
           java.lang.String designadorTV,
           java.lang.String serial,
           java.lang.String macAddress,
           com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento modeloEquipamento,
           br.com.gvt.www.tv.configuracaoTV.StatusProvisioning statusProvisioning) {
           this.designadorTurbonet = designadorTurbonet;
           this.designadorTV = designadorTV;
           this.serial = serial;
           this.macAddress = macAddress;
           this.modeloEquipamento = modeloEquipamento;
           this.statusProvisioning = statusProvisioning;
    }


    /**
     * Gets the designadorTurbonet value for this HomeGateway.
     * 
     * @return designadorTurbonet
     */
    public java.lang.String getDesignadorTurbonet() {
        return designadorTurbonet;
    }


    /**
     * Sets the designadorTurbonet value for this HomeGateway.
     * 
     * @param designadorTurbonet
     */
    public void setDesignadorTurbonet(java.lang.String designadorTurbonet) {
        this.designadorTurbonet = designadorTurbonet;
    }


    /**
     * Gets the designadorTV value for this HomeGateway.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this HomeGateway.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the serial value for this HomeGateway.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this HomeGateway.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the macAddress value for this HomeGateway.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this HomeGateway.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the modeloEquipamento value for this HomeGateway.
     * 
     * @return modeloEquipamento
     */
    public com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento getModeloEquipamento() {
        return modeloEquipamento;
    }


    /**
     * Sets the modeloEquipamento value for this HomeGateway.
     * 
     * @param modeloEquipamento
     */
    public void setModeloEquipamento(com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento modeloEquipamento) {
        this.modeloEquipamento = modeloEquipamento;
    }


    /**
     * Gets the statusProvisioning value for this HomeGateway.
     * 
     * @return statusProvisioning
     */
    public br.com.gvt.www.tv.configuracaoTV.StatusProvisioning getStatusProvisioning() {
        return statusProvisioning;
    }


    /**
     * Sets the statusProvisioning value for this HomeGateway.
     * 
     * @param statusProvisioning
     */
    public void setStatusProvisioning(br.com.gvt.www.tv.configuracaoTV.StatusProvisioning statusProvisioning) {
        this.statusProvisioning = statusProvisioning;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HomeGateway)) return false;
        HomeGateway other = (HomeGateway) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorTurbonet==null && other.getDesignadorTurbonet()==null) || 
             (this.designadorTurbonet!=null &&
              this.designadorTurbonet.equals(other.getDesignadorTurbonet()))) &&
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.modeloEquipamento==null && other.getModeloEquipamento()==null) || 
             (this.modeloEquipamento!=null &&
              this.modeloEquipamento.equals(other.getModeloEquipamento()))) &&
            ((this.statusProvisioning==null && other.getStatusProvisioning()==null) || 
             (this.statusProvisioning!=null &&
              this.statusProvisioning.equals(other.getStatusProvisioning())));
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
        if (getDesignadorTurbonet() != null) {
            _hashCode += getDesignadorTurbonet().hashCode();
        }
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getModeloEquipamento() != null) {
            _hashCode += getModeloEquipamento().hashCode();
        }
        if (getStatusProvisioning() != null) {
            _hashCode += getStatusProvisioning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HomeGateway.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "HomeGateway"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTurbonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTurbonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeloEquipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "modeloEquipamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/modeloEquipamento", "ModeloEquipamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusProvisioning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "statusProvisioning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "StatusProvisioning"));
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
