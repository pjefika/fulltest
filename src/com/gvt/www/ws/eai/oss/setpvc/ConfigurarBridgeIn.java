/**
 * ConfigurarBridgeIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.setpvc;

public class ConfigurarBridgeIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn;

    private com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeInAcao acao;

    private com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeInTipoBridge tipoBridge;

    private java.lang.String downloadRate;

    private java.lang.String uploadRate;

    public ConfigurarBridgeIn() {
    }

    public ConfigurarBridgeIn(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn,
           com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeInAcao acao,
           com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeInTipoBridge tipoBridge,
           java.lang.String downloadRate,
           java.lang.String uploadRate) {
           this.ossTurbonetIn = ossTurbonetIn;
           this.acao = acao;
           this.tipoBridge = tipoBridge;
           this.downloadRate = downloadRate;
           this.uploadRate = uploadRate;
    }


    /**
     * Gets the ossTurbonetIn value for this ConfigurarBridgeIn.
     * 
     * @return ossTurbonetIn
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn getOssTurbonetIn() {
        return ossTurbonetIn;
    }


    /**
     * Sets the ossTurbonetIn value for this ConfigurarBridgeIn.
     * 
     * @param ossTurbonetIn
     */
    public void setOssTurbonetIn(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn) {
        this.ossTurbonetIn = ossTurbonetIn;
    }


    /**
     * Gets the acao value for this ConfigurarBridgeIn.
     * 
     * @return acao
     */
    public com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeInAcao getAcao() {
        return acao;
    }


    /**
     * Sets the acao value for this ConfigurarBridgeIn.
     * 
     * @param acao
     */
    public void setAcao(com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeInAcao acao) {
        this.acao = acao;
    }


    /**
     * Gets the tipoBridge value for this ConfigurarBridgeIn.
     * 
     * @return tipoBridge
     */
    public com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeInTipoBridge getTipoBridge() {
        return tipoBridge;
    }


    /**
     * Sets the tipoBridge value for this ConfigurarBridgeIn.
     * 
     * @param tipoBridge
     */
    public void setTipoBridge(com.gvt.www.ws.eai.oss.setpvc.ConfigurarBridgeInTipoBridge tipoBridge) {
        this.tipoBridge = tipoBridge;
    }


    /**
     * Gets the downloadRate value for this ConfigurarBridgeIn.
     * 
     * @return downloadRate
     */
    public java.lang.String getDownloadRate() {
        return downloadRate;
    }


    /**
     * Sets the downloadRate value for this ConfigurarBridgeIn.
     * 
     * @param downloadRate
     */
    public void setDownloadRate(java.lang.String downloadRate) {
        this.downloadRate = downloadRate;
    }


    /**
     * Gets the uploadRate value for this ConfigurarBridgeIn.
     * 
     * @return uploadRate
     */
    public java.lang.String getUploadRate() {
        return uploadRate;
    }


    /**
     * Sets the uploadRate value for this ConfigurarBridgeIn.
     * 
     * @param uploadRate
     */
    public void setUploadRate(java.lang.String uploadRate) {
        this.uploadRate = uploadRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarBridgeIn)) return false;
        ConfigurarBridgeIn other = (ConfigurarBridgeIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ossTurbonetIn==null && other.getOssTurbonetIn()==null) || 
             (this.ossTurbonetIn!=null &&
              this.ossTurbonetIn.equals(other.getOssTurbonetIn()))) &&
            ((this.acao==null && other.getAcao()==null) || 
             (this.acao!=null &&
              this.acao.equals(other.getAcao()))) &&
            ((this.tipoBridge==null && other.getTipoBridge()==null) || 
             (this.tipoBridge!=null &&
              this.tipoBridge.equals(other.getTipoBridge()))) &&
            ((this.downloadRate==null && other.getDownloadRate()==null) || 
             (this.downloadRate!=null &&
              this.downloadRate.equals(other.getDownloadRate()))) &&
            ((this.uploadRate==null && other.getUploadRate()==null) || 
             (this.uploadRate!=null &&
              this.uploadRate.equals(other.getUploadRate())));
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
        if (getOssTurbonetIn() != null) {
            _hashCode += getOssTurbonetIn().hashCode();
        }
        if (getAcao() != null) {
            _hashCode += getAcao().hashCode();
        }
        if (getTipoBridge() != null) {
            _hashCode += getTipoBridge().hashCode();
        }
        if (getDownloadRate() != null) {
            _hashCode += getDownloadRate().hashCode();
        }
        if (getUploadRate() != null) {
            _hashCode += getUploadRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarBridgeIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConfigurarBridgeIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ossTurbonetIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ossTurbonetIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "acao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", ">ConfigurarBridgeIn>acao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoBridge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "tipoBridge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", ">ConfigurarBridgeIn>tipoBridge"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "downloadRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "uploadRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
