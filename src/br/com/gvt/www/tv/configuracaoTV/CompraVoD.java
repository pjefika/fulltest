/**
 * CompraVoD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class CompraVoD  implements java.io.Serializable {
    private java.util.Calendar data;

    private br.com.gvt.www.tv.configuracaoTV.Filme filme;

    private java.lang.String fornecedor;

    private java.util.Calendar inicioValidade;

    private java.util.Calendar terminoValidade;

    private java.lang.String macAddress;

    private int status;

    private java.lang.String assetKey;

    private java.lang.String assetId;

    private java.lang.String offeringName;

    private double offeringPrice;

    private java.lang.String offeringId;

    private java.lang.String purchaseId;

    public CompraVoD() {
    }

    public CompraVoD(
           java.util.Calendar data,
           br.com.gvt.www.tv.configuracaoTV.Filme filme,
           java.lang.String fornecedor,
           java.util.Calendar inicioValidade,
           java.util.Calendar terminoValidade,
           java.lang.String macAddress,
           int status,
           java.lang.String assetKey,
           java.lang.String assetId,
           java.lang.String offeringName,
           double offeringPrice,
           java.lang.String offeringId,
           java.lang.String purchaseId) {
           this.data = data;
           this.filme = filme;
           this.fornecedor = fornecedor;
           this.inicioValidade = inicioValidade;
           this.terminoValidade = terminoValidade;
           this.macAddress = macAddress;
           this.status = status;
           this.assetKey = assetKey;
           this.assetId = assetId;
           this.offeringName = offeringName;
           this.offeringPrice = offeringPrice;
           this.offeringId = offeringId;
           this.purchaseId = purchaseId;
    }


    /**
     * Gets the data value for this CompraVoD.
     * 
     * @return data
     */
    public java.util.Calendar getData() {
        return data;
    }


    /**
     * Sets the data value for this CompraVoD.
     * 
     * @param data
     */
    public void setData(java.util.Calendar data) {
        this.data = data;
    }


    /**
     * Gets the filme value for this CompraVoD.
     * 
     * @return filme
     */
    public br.com.gvt.www.tv.configuracaoTV.Filme getFilme() {
        return filme;
    }


    /**
     * Sets the filme value for this CompraVoD.
     * 
     * @param filme
     */
    public void setFilme(br.com.gvt.www.tv.configuracaoTV.Filme filme) {
        this.filme = filme;
    }


    /**
     * Gets the fornecedor value for this CompraVoD.
     * 
     * @return fornecedor
     */
    public java.lang.String getFornecedor() {
        return fornecedor;
    }


    /**
     * Sets the fornecedor value for this CompraVoD.
     * 
     * @param fornecedor
     */
    public void setFornecedor(java.lang.String fornecedor) {
        this.fornecedor = fornecedor;
    }


    /**
     * Gets the inicioValidade value for this CompraVoD.
     * 
     * @return inicioValidade
     */
    public java.util.Calendar getInicioValidade() {
        return inicioValidade;
    }


    /**
     * Sets the inicioValidade value for this CompraVoD.
     * 
     * @param inicioValidade
     */
    public void setInicioValidade(java.util.Calendar inicioValidade) {
        this.inicioValidade = inicioValidade;
    }


    /**
     * Gets the terminoValidade value for this CompraVoD.
     * 
     * @return terminoValidade
     */
    public java.util.Calendar getTerminoValidade() {
        return terminoValidade;
    }


    /**
     * Sets the terminoValidade value for this CompraVoD.
     * 
     * @param terminoValidade
     */
    public void setTerminoValidade(java.util.Calendar terminoValidade) {
        this.terminoValidade = terminoValidade;
    }


    /**
     * Gets the macAddress value for this CompraVoD.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this CompraVoD.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the status value for this CompraVoD.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CompraVoD.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the assetKey value for this CompraVoD.
     * 
     * @return assetKey
     */
    public java.lang.String getAssetKey() {
        return assetKey;
    }


    /**
     * Sets the assetKey value for this CompraVoD.
     * 
     * @param assetKey
     */
    public void setAssetKey(java.lang.String assetKey) {
        this.assetKey = assetKey;
    }


    /**
     * Gets the assetId value for this CompraVoD.
     * 
     * @return assetId
     */
    public java.lang.String getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this CompraVoD.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.String assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the offeringName value for this CompraVoD.
     * 
     * @return offeringName
     */
    public java.lang.String getOfferingName() {
        return offeringName;
    }


    /**
     * Sets the offeringName value for this CompraVoD.
     * 
     * @param offeringName
     */
    public void setOfferingName(java.lang.String offeringName) {
        this.offeringName = offeringName;
    }


    /**
     * Gets the offeringPrice value for this CompraVoD.
     * 
     * @return offeringPrice
     */
    public double getOfferingPrice() {
        return offeringPrice;
    }


    /**
     * Sets the offeringPrice value for this CompraVoD.
     * 
     * @param offeringPrice
     */
    public void setOfferingPrice(double offeringPrice) {
        this.offeringPrice = offeringPrice;
    }


    /**
     * Gets the offeringId value for this CompraVoD.
     * 
     * @return offeringId
     */
    public java.lang.String getOfferingId() {
        return offeringId;
    }


    /**
     * Sets the offeringId value for this CompraVoD.
     * 
     * @param offeringId
     */
    public void setOfferingId(java.lang.String offeringId) {
        this.offeringId = offeringId;
    }


    /**
     * Gets the purchaseId value for this CompraVoD.
     * 
     * @return purchaseId
     */
    public java.lang.String getPurchaseId() {
        return purchaseId;
    }


    /**
     * Sets the purchaseId value for this CompraVoD.
     * 
     * @param purchaseId
     */
    public void setPurchaseId(java.lang.String purchaseId) {
        this.purchaseId = purchaseId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompraVoD)) return false;
        CompraVoD other = (CompraVoD) obj;
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
            ((this.inicioValidade==null && other.getInicioValidade()==null) || 
             (this.inicioValidade!=null &&
              this.inicioValidade.equals(other.getInicioValidade()))) &&
            ((this.terminoValidade==null && other.getTerminoValidade()==null) || 
             (this.terminoValidade!=null &&
              this.terminoValidade.equals(other.getTerminoValidade()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            this.status == other.getStatus() &&
            ((this.assetKey==null && other.getAssetKey()==null) || 
             (this.assetKey!=null &&
              this.assetKey.equals(other.getAssetKey()))) &&
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.offeringName==null && other.getOfferingName()==null) || 
             (this.offeringName!=null &&
              this.offeringName.equals(other.getOfferingName()))) &&
            this.offeringPrice == other.getOfferingPrice() &&
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
        if (getInicioValidade() != null) {
            _hashCode += getInicioValidade().hashCode();
        }
        if (getTerminoValidade() != null) {
            _hashCode += getTerminoValidade().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        _hashCode += getStatus();
        if (getAssetKey() != null) {
            _hashCode += getAssetKey().hashCode();
        }
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getOfferingName() != null) {
            _hashCode += getOfferingName().hashCode();
        }
        _hashCode += new Double(getOfferingPrice()).hashCode();
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
        new org.apache.axis.description.TypeDesc(CompraVoD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CompraVoD"));
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
        elemField.setFieldName("inicioValidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "inicioValidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminoValidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "terminoValidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("offeringName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "offeringName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "offeringPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
