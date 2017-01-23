/**
 * ResumoExecucaoVoD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ResumoExecucaoVoD  implements java.io.Serializable {
    private java.lang.String assetId;

    private br.com.gvt.www.tv.configuracaoTV.Filme filme;

    private long totalExecucoes;

    private java.lang.String offeringId;

    public ResumoExecucaoVoD() {
    }

    public ResumoExecucaoVoD(
           java.lang.String assetId,
           br.com.gvt.www.tv.configuracaoTV.Filme filme,
           long totalExecucoes,
           java.lang.String offeringId) {
           this.assetId = assetId;
           this.filme = filme;
           this.totalExecucoes = totalExecucoes;
           this.offeringId = offeringId;
    }


    /**
     * Gets the assetId value for this ResumoExecucaoVoD.
     * 
     * @return assetId
     */
    public java.lang.String getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this ResumoExecucaoVoD.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.String assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the filme value for this ResumoExecucaoVoD.
     * 
     * @return filme
     */
    public br.com.gvt.www.tv.configuracaoTV.Filme getFilme() {
        return filme;
    }


    /**
     * Sets the filme value for this ResumoExecucaoVoD.
     * 
     * @param filme
     */
    public void setFilme(br.com.gvt.www.tv.configuracaoTV.Filme filme) {
        this.filme = filme;
    }


    /**
     * Gets the totalExecucoes value for this ResumoExecucaoVoD.
     * 
     * @return totalExecucoes
     */
    public long getTotalExecucoes() {
        return totalExecucoes;
    }


    /**
     * Sets the totalExecucoes value for this ResumoExecucaoVoD.
     * 
     * @param totalExecucoes
     */
    public void setTotalExecucoes(long totalExecucoes) {
        this.totalExecucoes = totalExecucoes;
    }


    /**
     * Gets the offeringId value for this ResumoExecucaoVoD.
     * 
     * @return offeringId
     */
    public java.lang.String getOfferingId() {
        return offeringId;
    }


    /**
     * Sets the offeringId value for this ResumoExecucaoVoD.
     * 
     * @param offeringId
     */
    public void setOfferingId(java.lang.String offeringId) {
        this.offeringId = offeringId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResumoExecucaoVoD)) return false;
        ResumoExecucaoVoD other = (ResumoExecucaoVoD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.filme==null && other.getFilme()==null) || 
             (this.filme!=null &&
              this.filme.equals(other.getFilme()))) &&
            this.totalExecucoes == other.getTotalExecucoes() &&
            ((this.offeringId==null && other.getOfferingId()==null) || 
             (this.offeringId!=null &&
              this.offeringId.equals(other.getOfferingId())));
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
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getFilme() != null) {
            _hashCode += getFilme().hashCode();
        }
        _hashCode += new Long(getTotalExecucoes()).hashCode();
        if (getOfferingId() != null) {
            _hashCode += getOfferingId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResumoExecucaoVoD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ResumoExecucaoVoD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "assetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "filme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Filme"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalExecucoes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "totalExecucoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "offeringId"));
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
