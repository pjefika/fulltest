/**
 * AtualizaWiFiSSIDIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.atualizaWiFiSSID;

public class AtualizaWiFiSSIDIn  implements java.io.Serializable {
    private java.lang.String ssid;

    private com.gvt.www.metaData.smarttool.Credenciais credenciais;

    private java.lang.String designador;

    public AtualizaWiFiSSIDIn() {
    }

    public AtualizaWiFiSSIDIn(
           java.lang.String ssid,
           com.gvt.www.metaData.smarttool.Credenciais credenciais,
           java.lang.String designador) {
           this.ssid = ssid;
           this.credenciais = credenciais;
           this.designador = designador;
    }


    /**
     * Gets the ssid value for this AtualizaWiFiSSIDIn.
     * 
     * @return ssid
     */
    public java.lang.String getSsid() {
        return ssid;
    }


    /**
     * Sets the ssid value for this AtualizaWiFiSSIDIn.
     * 
     * @param ssid
     */
    public void setSsid(java.lang.String ssid) {
        this.ssid = ssid;
    }


    /**
     * Gets the credenciais value for this AtualizaWiFiSSIDIn.
     * 
     * @return credenciais
     */
    public com.gvt.www.metaData.smarttool.Credenciais getCredenciais() {
        return credenciais;
    }


    /**
     * Sets the credenciais value for this AtualizaWiFiSSIDIn.
     * 
     * @param credenciais
     */
    public void setCredenciais(com.gvt.www.metaData.smarttool.Credenciais credenciais) {
        this.credenciais = credenciais;
    }


    /**
     * Gets the designador value for this AtualizaWiFiSSIDIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this AtualizaWiFiSSIDIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizaWiFiSSIDIn)) return false;
        AtualizaWiFiSSIDIn other = (AtualizaWiFiSSIDIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ssid==null && other.getSsid()==null) || 
             (this.ssid!=null &&
              this.ssid.equals(other.getSsid()))) &&
            ((this.credenciais==null && other.getCredenciais()==null) || 
             (this.credenciais!=null &&
              this.credenciais.equals(other.getCredenciais()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador())));
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
        if (getSsid() != null) {
            _hashCode += getSsid().hashCode();
        }
        if (getCredenciais() != null) {
            _hashCode += getCredenciais().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtualizaWiFiSSIDIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiSSID", "AtualizaWiFiSSIDIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiSSID", "ssid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credenciais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiSSID", "credenciais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/smarttool", "Credenciais"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiSSID", "designador"));
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
