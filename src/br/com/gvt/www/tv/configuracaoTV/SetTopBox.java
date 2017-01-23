/**
 * SetTopBox.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class SetTopBox  implements java.io.Serializable {
    private java.lang.String serial;

    private java.lang.String macAddress;

    private java.lang.Boolean pvr;

    private java.lang.String idEquipmentIap;

    private java.lang.String tipoConectividadeInstalacao;

    private br.com.gvt.www.tv.configuracaoTV.StatusProvisioning statusProvisioning;

    private com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento modeloEquipamento;

    private java.lang.String caId;

    private br.com.gvt.www.tv.ipvodinfo.EquipmentInfo ipvodInfo;

    private br.com.gvt.www.tv.configuracaoTV.SetTopBoxTecnologiaTV tecnologiaTV;

    public SetTopBox() {
    }

    public SetTopBox(
           java.lang.String serial,
           java.lang.String macAddress,
           java.lang.Boolean pvr,
           java.lang.String idEquipmentIap,
           java.lang.String tipoConectividadeInstalacao,
           br.com.gvt.www.tv.configuracaoTV.StatusProvisioning statusProvisioning,
           com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento modeloEquipamento,
           java.lang.String caId,
           br.com.gvt.www.tv.ipvodinfo.EquipmentInfo ipvodInfo,
           br.com.gvt.www.tv.configuracaoTV.SetTopBoxTecnologiaTV tecnologiaTV) {
           this.serial = serial;
           this.macAddress = macAddress;
           this.pvr = pvr;
           this.idEquipmentIap = idEquipmentIap;
           this.tipoConectividadeInstalacao = tipoConectividadeInstalacao;
           this.statusProvisioning = statusProvisioning;
           this.modeloEquipamento = modeloEquipamento;
           this.caId = caId;
           this.ipvodInfo = ipvodInfo;
           this.tecnologiaTV = tecnologiaTV;
    }


    /**
     * Gets the serial value for this SetTopBox.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this SetTopBox.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the macAddress value for this SetTopBox.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this SetTopBox.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the pvr value for this SetTopBox.
     * 
     * @return pvr
     */
    public java.lang.Boolean getPvr() {
        return pvr;
    }


    /**
     * Sets the pvr value for this SetTopBox.
     * 
     * @param pvr
     */
    public void setPvr(java.lang.Boolean pvr) {
        this.pvr = pvr;
    }


    /**
     * Gets the idEquipmentIap value for this SetTopBox.
     * 
     * @return idEquipmentIap
     */
    public java.lang.String getIdEquipmentIap() {
        return idEquipmentIap;
    }


    /**
     * Sets the idEquipmentIap value for this SetTopBox.
     * 
     * @param idEquipmentIap
     */
    public void setIdEquipmentIap(java.lang.String idEquipmentIap) {
        this.idEquipmentIap = idEquipmentIap;
    }


    /**
     * Gets the tipoConectividadeInstalacao value for this SetTopBox.
     * 
     * @return tipoConectividadeInstalacao
     */
    public java.lang.String getTipoConectividadeInstalacao() {
        return tipoConectividadeInstalacao;
    }


    /**
     * Sets the tipoConectividadeInstalacao value for this SetTopBox.
     * 
     * @param tipoConectividadeInstalacao
     */
    public void setTipoConectividadeInstalacao(java.lang.String tipoConectividadeInstalacao) {
        this.tipoConectividadeInstalacao = tipoConectividadeInstalacao;
    }


    /**
     * Gets the statusProvisioning value for this SetTopBox.
     * 
     * @return statusProvisioning
     */
    public br.com.gvt.www.tv.configuracaoTV.StatusProvisioning getStatusProvisioning() {
        return statusProvisioning;
    }


    /**
     * Sets the statusProvisioning value for this SetTopBox.
     * 
     * @param statusProvisioning
     */
    public void setStatusProvisioning(br.com.gvt.www.tv.configuracaoTV.StatusProvisioning statusProvisioning) {
        this.statusProvisioning = statusProvisioning;
    }


    /**
     * Gets the modeloEquipamento value for this SetTopBox.
     * 
     * @return modeloEquipamento
     */
    public com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento getModeloEquipamento() {
        return modeloEquipamento;
    }


    /**
     * Sets the modeloEquipamento value for this SetTopBox.
     * 
     * @param modeloEquipamento
     */
    public void setModeloEquipamento(com.gvt.www.ws.eai.configuradoronline.modeloEquipamento.ModeloEquipamento modeloEquipamento) {
        this.modeloEquipamento = modeloEquipamento;
    }


    /**
     * Gets the caId value for this SetTopBox.
     * 
     * @return caId
     */
    public java.lang.String getCaId() {
        return caId;
    }


    /**
     * Sets the caId value for this SetTopBox.
     * 
     * @param caId
     */
    public void setCaId(java.lang.String caId) {
        this.caId = caId;
    }


    /**
     * Gets the ipvodInfo value for this SetTopBox.
     * 
     * @return ipvodInfo
     */
    public br.com.gvt.www.tv.ipvodinfo.EquipmentInfo getIpvodInfo() {
        return ipvodInfo;
    }


    /**
     * Sets the ipvodInfo value for this SetTopBox.
     * 
     * @param ipvodInfo
     */
    public void setIpvodInfo(br.com.gvt.www.tv.ipvodinfo.EquipmentInfo ipvodInfo) {
        this.ipvodInfo = ipvodInfo;
    }


    /**
     * Gets the tecnologiaTV value for this SetTopBox.
     * 
     * @return tecnologiaTV
     */
    public br.com.gvt.www.tv.configuracaoTV.SetTopBoxTecnologiaTV getTecnologiaTV() {
        return tecnologiaTV;
    }


    /**
     * Sets the tecnologiaTV value for this SetTopBox.
     * 
     * @param tecnologiaTV
     */
    public void setTecnologiaTV(br.com.gvt.www.tv.configuracaoTV.SetTopBoxTecnologiaTV tecnologiaTV) {
        this.tecnologiaTV = tecnologiaTV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetTopBox)) return false;
        SetTopBox other = (SetTopBox) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.pvr==null && other.getPvr()==null) || 
             (this.pvr!=null &&
              this.pvr.equals(other.getPvr()))) &&
            ((this.idEquipmentIap==null && other.getIdEquipmentIap()==null) || 
             (this.idEquipmentIap!=null &&
              this.idEquipmentIap.equals(other.getIdEquipmentIap()))) &&
            ((this.tipoConectividadeInstalacao==null && other.getTipoConectividadeInstalacao()==null) || 
             (this.tipoConectividadeInstalacao!=null &&
              this.tipoConectividadeInstalacao.equals(other.getTipoConectividadeInstalacao()))) &&
            ((this.statusProvisioning==null && other.getStatusProvisioning()==null) || 
             (this.statusProvisioning!=null &&
              this.statusProvisioning.equals(other.getStatusProvisioning()))) &&
            ((this.modeloEquipamento==null && other.getModeloEquipamento()==null) || 
             (this.modeloEquipamento!=null &&
              this.modeloEquipamento.equals(other.getModeloEquipamento()))) &&
            ((this.caId==null && other.getCaId()==null) || 
             (this.caId!=null &&
              this.caId.equals(other.getCaId()))) &&
            ((this.ipvodInfo==null && other.getIpvodInfo()==null) || 
             (this.ipvodInfo!=null &&
              this.ipvodInfo.equals(other.getIpvodInfo()))) &&
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
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getPvr() != null) {
            _hashCode += getPvr().hashCode();
        }
        if (getIdEquipmentIap() != null) {
            _hashCode += getIdEquipmentIap().hashCode();
        }
        if (getTipoConectividadeInstalacao() != null) {
            _hashCode += getTipoConectividadeInstalacao().hashCode();
        }
        if (getStatusProvisioning() != null) {
            _hashCode += getStatusProvisioning().hashCode();
        }
        if (getModeloEquipamento() != null) {
            _hashCode += getModeloEquipamento().hashCode();
        }
        if (getCaId() != null) {
            _hashCode += getCaId().hashCode();
        }
        if (getIpvodInfo() != null) {
            _hashCode += getIpvodInfo().hashCode();
        }
        if (getTecnologiaTV() != null) {
            _hashCode += getTecnologiaTV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetTopBox.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "SetTopBox"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("pvr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "pvr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEquipmentIap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "idEquipmentIap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoConectividadeInstalacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "tipoConectividadeInstalacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeloEquipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "modeloEquipamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/modeloEquipamento", "ModeloEquipamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "caId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipvodInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ipvodInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "EquipmentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tecnologiaTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "tecnologiaTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">SetTopBox>tecnologiaTV"));
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
