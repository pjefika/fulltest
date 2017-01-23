/**
 * ExecucaoVoD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ExecucaoVoD  implements java.io.Serializable {
    private java.util.Calendar data;

    private br.com.gvt.www.tv.configuracaoTV.Filme filme;

    private java.lang.String fornecedor;

    private java.lang.String macAddress;

    private java.util.Calendar inicioSessao;

    private java.util.Calendar terminoSessao;

    private long duracaoSessao;

    private long reasonCode;

    private long responseCode;

    private long rtspReasonCode;

    private java.lang.String rtspReasonText;

    private long minutesPlayed;

    private java.lang.String assetKey;

    private java.lang.String assetId;

    private java.lang.String status;

    private java.lang.String motivo;

    private java.lang.String offeringId;

    private java.lang.String purchaseId;

    public ExecucaoVoD() {
    }

    public ExecucaoVoD(
           java.util.Calendar data,
           br.com.gvt.www.tv.configuracaoTV.Filme filme,
           java.lang.String fornecedor,
           java.lang.String macAddress,
           java.util.Calendar inicioSessao,
           java.util.Calendar terminoSessao,
           long duracaoSessao,
           long reasonCode,
           long responseCode,
           long rtspReasonCode,
           java.lang.String rtspReasonText,
           long minutesPlayed,
           java.lang.String assetKey,
           java.lang.String assetId,
           java.lang.String status,
           java.lang.String motivo,
           java.lang.String offeringId,
           java.lang.String purchaseId) {
           this.data = data;
           this.filme = filme;
           this.fornecedor = fornecedor;
           this.macAddress = macAddress;
           this.inicioSessao = inicioSessao;
           this.terminoSessao = terminoSessao;
           this.duracaoSessao = duracaoSessao;
           this.reasonCode = reasonCode;
           this.responseCode = responseCode;
           this.rtspReasonCode = rtspReasonCode;
           this.rtspReasonText = rtspReasonText;
           this.minutesPlayed = minutesPlayed;
           this.assetKey = assetKey;
           this.assetId = assetId;
           this.status = status;
           this.motivo = motivo;
           this.offeringId = offeringId;
           this.purchaseId = purchaseId;
    }


    /**
     * Gets the data value for this ExecucaoVoD.
     * 
     * @return data
     */
    public java.util.Calendar getData() {
        return data;
    }


    /**
     * Sets the data value for this ExecucaoVoD.
     * 
     * @param data
     */
    public void setData(java.util.Calendar data) {
        this.data = data;
    }


    /**
     * Gets the filme value for this ExecucaoVoD.
     * 
     * @return filme
     */
    public br.com.gvt.www.tv.configuracaoTV.Filme getFilme() {
        return filme;
    }


    /**
     * Sets the filme value for this ExecucaoVoD.
     * 
     * @param filme
     */
    public void setFilme(br.com.gvt.www.tv.configuracaoTV.Filme filme) {
        this.filme = filme;
    }


    /**
     * Gets the fornecedor value for this ExecucaoVoD.
     * 
     * @return fornecedor
     */
    public java.lang.String getFornecedor() {
        return fornecedor;
    }


    /**
     * Sets the fornecedor value for this ExecucaoVoD.
     * 
     * @param fornecedor
     */
    public void setFornecedor(java.lang.String fornecedor) {
        this.fornecedor = fornecedor;
    }


    /**
     * Gets the macAddress value for this ExecucaoVoD.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this ExecucaoVoD.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the inicioSessao value for this ExecucaoVoD.
     * 
     * @return inicioSessao
     */
    public java.util.Calendar getInicioSessao() {
        return inicioSessao;
    }


    /**
     * Sets the inicioSessao value for this ExecucaoVoD.
     * 
     * @param inicioSessao
     */
    public void setInicioSessao(java.util.Calendar inicioSessao) {
        this.inicioSessao = inicioSessao;
    }


    /**
     * Gets the terminoSessao value for this ExecucaoVoD.
     * 
     * @return terminoSessao
     */
    public java.util.Calendar getTerminoSessao() {
        return terminoSessao;
    }


    /**
     * Sets the terminoSessao value for this ExecucaoVoD.
     * 
     * @param terminoSessao
     */
    public void setTerminoSessao(java.util.Calendar terminoSessao) {
        this.terminoSessao = terminoSessao;
    }


    /**
     * Gets the duracaoSessao value for this ExecucaoVoD.
     * 
     * @return duracaoSessao
     */
    public long getDuracaoSessao() {
        return duracaoSessao;
    }


    /**
     * Sets the duracaoSessao value for this ExecucaoVoD.
     * 
     * @param duracaoSessao
     */
    public void setDuracaoSessao(long duracaoSessao) {
        this.duracaoSessao = duracaoSessao;
    }


    /**
     * Gets the reasonCode value for this ExecucaoVoD.
     * 
     * @return reasonCode
     */
    public long getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this ExecucaoVoD.
     * 
     * @param reasonCode
     */
    public void setReasonCode(long reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the responseCode value for this ExecucaoVoD.
     * 
     * @return responseCode
     */
    public long getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this ExecucaoVoD.
     * 
     * @param responseCode
     */
    public void setResponseCode(long responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the rtspReasonCode value for this ExecucaoVoD.
     * 
     * @return rtspReasonCode
     */
    public long getRtspReasonCode() {
        return rtspReasonCode;
    }


    /**
     * Sets the rtspReasonCode value for this ExecucaoVoD.
     * 
     * @param rtspReasonCode
     */
    public void setRtspReasonCode(long rtspReasonCode) {
        this.rtspReasonCode = rtspReasonCode;
    }


    /**
     * Gets the rtspReasonText value for this ExecucaoVoD.
     * 
     * @return rtspReasonText
     */
    public java.lang.String getRtspReasonText() {
        return rtspReasonText;
    }


    /**
     * Sets the rtspReasonText value for this ExecucaoVoD.
     * 
     * @param rtspReasonText
     */
    public void setRtspReasonText(java.lang.String rtspReasonText) {
        this.rtspReasonText = rtspReasonText;
    }


    /**
     * Gets the minutesPlayed value for this ExecucaoVoD.
     * 
     * @return minutesPlayed
     */
    public long getMinutesPlayed() {
        return minutesPlayed;
    }


    /**
     * Sets the minutesPlayed value for this ExecucaoVoD.
     * 
     * @param minutesPlayed
     */
    public void setMinutesPlayed(long minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }


    /**
     * Gets the assetKey value for this ExecucaoVoD.
     * 
     * @return assetKey
     */
    public java.lang.String getAssetKey() {
        return assetKey;
    }


    /**
     * Sets the assetKey value for this ExecucaoVoD.
     * 
     * @param assetKey
     */
    public void setAssetKey(java.lang.String assetKey) {
        this.assetKey = assetKey;
    }


    /**
     * Gets the assetId value for this ExecucaoVoD.
     * 
     * @return assetId
     */
    public java.lang.String getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this ExecucaoVoD.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.String assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the status value for this ExecucaoVoD.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ExecucaoVoD.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the motivo value for this ExecucaoVoD.
     * 
     * @return motivo
     */
    public java.lang.String getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this ExecucaoVoD.
     * 
     * @param motivo
     */
    public void setMotivo(java.lang.String motivo) {
        this.motivo = motivo;
    }


    /**
     * Gets the offeringId value for this ExecucaoVoD.
     * 
     * @return offeringId
     */
    public java.lang.String getOfferingId() {
        return offeringId;
    }


    /**
     * Sets the offeringId value for this ExecucaoVoD.
     * 
     * @param offeringId
     */
    public void setOfferingId(java.lang.String offeringId) {
        this.offeringId = offeringId;
    }


    /**
     * Gets the purchaseId value for this ExecucaoVoD.
     * 
     * @return purchaseId
     */
    public java.lang.String getPurchaseId() {
        return purchaseId;
    }


    /**
     * Sets the purchaseId value for this ExecucaoVoD.
     * 
     * @param purchaseId
     */
    public void setPurchaseId(java.lang.String purchaseId) {
        this.purchaseId = purchaseId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecucaoVoD)) return false;
        ExecucaoVoD other = (ExecucaoVoD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.filme==null && other.getFilme()==null) || 
             (this.filme!=null &&
              this.filme.equals(other.getFilme()))) &&
            ((this.fornecedor==null && other.getFornecedor()==null) || 
             (this.fornecedor!=null &&
              this.fornecedor.equals(other.getFornecedor()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.inicioSessao==null && other.getInicioSessao()==null) || 
             (this.inicioSessao!=null &&
              this.inicioSessao.equals(other.getInicioSessao()))) &&
            ((this.terminoSessao==null && other.getTerminoSessao()==null) || 
             (this.terminoSessao!=null &&
              this.terminoSessao.equals(other.getTerminoSessao()))) &&
            this.duracaoSessao == other.getDuracaoSessao() &&
            this.reasonCode == other.getReasonCode() &&
            this.responseCode == other.getResponseCode() &&
            this.rtspReasonCode == other.getRtspReasonCode() &&
            ((this.rtspReasonText==null && other.getRtspReasonText()==null) || 
             (this.rtspReasonText!=null &&
              this.rtspReasonText.equals(other.getRtspReasonText()))) &&
            this.minutesPlayed == other.getMinutesPlayed() &&
            ((this.assetKey==null && other.getAssetKey()==null) || 
             (this.assetKey!=null &&
              this.assetKey.equals(other.getAssetKey()))) &&
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo()))) &&
            ((this.offeringId==null && other.getOfferingId()==null) || 
             (this.offeringId!=null &&
              this.offeringId.equals(other.getOfferingId()))) &&
            ((this.purchaseId==null && other.getPurchaseId()==null) || 
             (this.purchaseId!=null &&
              this.purchaseId.equals(other.getPurchaseId())));
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
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getFilme() != null) {
            _hashCode += getFilme().hashCode();
        }
        if (getFornecedor() != null) {
            _hashCode += getFornecedor().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getInicioSessao() != null) {
            _hashCode += getInicioSessao().hashCode();
        }
        if (getTerminoSessao() != null) {
            _hashCode += getTerminoSessao().hashCode();
        }
        _hashCode += new Long(getDuracaoSessao()).hashCode();
        _hashCode += new Long(getReasonCode()).hashCode();
        _hashCode += new Long(getResponseCode()).hashCode();
        _hashCode += new Long(getRtspReasonCode()).hashCode();
        if (getRtspReasonText() != null) {
            _hashCode += getRtspReasonText().hashCode();
        }
        _hashCode += new Long(getMinutesPlayed()).hashCode();
        if (getAssetKey() != null) {
            _hashCode += getAssetKey().hashCode();
        }
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        if (getOfferingId() != null) {
            _hashCode += getOfferingId().hashCode();
        }
        if (getPurchaseId() != null) {
            _hashCode += getPurchaseId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecucaoVoD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ExecucaoVoD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "filme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Filme"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "fornecedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inicioSessao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "inicioSessao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminoSessao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "terminoSessao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duracaoSessao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "duracaoSessao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtspReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "rtspReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtspReasonText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "rtspReasonText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesPlayed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "minutesPlayed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "assetKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "assetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "motivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "offeringId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "purchaseId"));
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
