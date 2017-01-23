/**
 * DiagnosticoAcessoGPONIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class DiagnosticoAcessoGPONIn  implements java.io.Serializable {
    private java.lang.String designador;

    private java.lang.String designadorAcesso;

    private int downloadRate;

    private int uploadRate;

    private boolean possuiTV;

    public DiagnosticoAcessoGPONIn() {
    }

    public DiagnosticoAcessoGPONIn(
           java.lang.String designador,
           java.lang.String designadorAcesso,
           int downloadRate,
           int uploadRate,
           boolean possuiTV) {
           this.designador = designador;
           this.designadorAcesso = designadorAcesso;
           this.downloadRate = downloadRate;
           this.uploadRate = uploadRate;
           this.possuiTV = possuiTV;
    }


    /**
     * Gets the designador value for this DiagnosticoAcessoGPONIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this DiagnosticoAcessoGPONIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the designadorAcesso value for this DiagnosticoAcessoGPONIn.
     * 
     * @return designadorAcesso
     */
    public java.lang.String getDesignadorAcesso() {
        return designadorAcesso;
    }


    /**
     * Sets the designadorAcesso value for this DiagnosticoAcessoGPONIn.
     * 
     * @param designadorAcesso
     */
    public void setDesignadorAcesso(java.lang.String designadorAcesso) {
        this.designadorAcesso = designadorAcesso;
    }


    /**
     * Gets the downloadRate value for this DiagnosticoAcessoGPONIn.
     * 
     * @return downloadRate
     */
    public int getDownloadRate() {
        return downloadRate;
    }


    /**
     * Sets the downloadRate value for this DiagnosticoAcessoGPONIn.
     * 
     * @param downloadRate
     */
    public void setDownloadRate(int downloadRate) {
        this.downloadRate = downloadRate;
    }


    /**
     * Gets the uploadRate value for this DiagnosticoAcessoGPONIn.
     * 
     * @return uploadRate
     */
    public int getUploadRate() {
        return uploadRate;
    }


    /**
     * Sets the uploadRate value for this DiagnosticoAcessoGPONIn.
     * 
     * @param uploadRate
     */
    public void setUploadRate(int uploadRate) {
        this.uploadRate = uploadRate;
    }


    /**
     * Gets the possuiTV value for this DiagnosticoAcessoGPONIn.
     * 
     * @return possuiTV
     */
    public boolean isPossuiTV() {
        return possuiTV;
    }


    /**
     * Sets the possuiTV value for this DiagnosticoAcessoGPONIn.
     * 
     * @param possuiTV
     */
    public void setPossuiTV(boolean possuiTV) {
        this.possuiTV = possuiTV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnosticoAcessoGPONIn)) return false;
        DiagnosticoAcessoGPONIn other = (DiagnosticoAcessoGPONIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.designadorAcesso==null && other.getDesignadorAcesso()==null) || 
             (this.designadorAcesso!=null &&
              this.designadorAcesso.equals(other.getDesignadorAcesso()))) &&
            this.downloadRate == other.getDownloadRate() &&
            this.uploadRate == other.getUploadRate() &&
            this.possuiTV == other.isPossuiTV();
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
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getDesignadorAcesso() != null) {
            _hashCode += getDesignadorAcesso().hashCode();
        }
        _hashCode += getDownloadRate();
        _hashCode += getUploadRate();
        _hashCode += (isPossuiTV() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiagnosticoAcessoGPONIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "DiagnosticoAcessoGPONIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "designadorAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "downloadRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "uploadRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possuiTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "possuiTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
