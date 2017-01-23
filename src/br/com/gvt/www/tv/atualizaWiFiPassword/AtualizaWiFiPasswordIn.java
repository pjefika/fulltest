/**
 * AtualizaWiFiPasswordIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.atualizaWiFiPassword;

public class AtualizaWiFiPasswordIn  implements java.io.Serializable {
    private java.lang.String password;

    private com.gvt.www.metaData.smarttool.Credenciais credenciais;

    private java.lang.String designador;

    public AtualizaWiFiPasswordIn() {
    }

    public AtualizaWiFiPasswordIn(
           java.lang.String password,
           com.gvt.www.metaData.smarttool.Credenciais credenciais,
           java.lang.String designador) {
           this.password = password;
           this.credenciais = credenciais;
           this.designador = designador;
    }


    /**
     * Gets the password value for this AtualizaWiFiPasswordIn.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this AtualizaWiFiPasswordIn.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the credenciais value for this AtualizaWiFiPasswordIn.
     * 
     * @return credenciais
     */
    public com.gvt.www.metaData.smarttool.Credenciais getCredenciais() {
        return credenciais;
    }


    /**
     * Sets the credenciais value for this AtualizaWiFiPasswordIn.
     * 
     * @param credenciais
     */
    public void setCredenciais(com.gvt.www.metaData.smarttool.Credenciais credenciais) {
        this.credenciais = credenciais;
    }


    /**
     * Gets the designador value for this AtualizaWiFiPasswordIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this AtualizaWiFiPasswordIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizaWiFiPasswordIn)) return false;
        AtualizaWiFiPasswordIn other = (AtualizaWiFiPasswordIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
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
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
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
        new org.apache.axis.description.TypeDesc(AtualizaWiFiPasswordIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiPassword", "AtualizaWiFiPasswordIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiPassword", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credenciais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiPassword", "credenciais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/smarttool", "Credenciais"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/atualizaWiFiPassword", "designador"));
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
