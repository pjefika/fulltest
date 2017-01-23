/**
 * ConsultarComprasVoDIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultarComprasVoDIn  implements java.io.Serializable {
    private java.lang.String designadorTV;

    private br.com.gvt.www.tv.configuracaoTV.Periodo periodo;

    private com.gvt.www.metaData.smarttool.Credenciais credencial;

    public ConsultarComprasVoDIn() {
    }

    public ConsultarComprasVoDIn(
           java.lang.String designadorTV,
           br.com.gvt.www.tv.configuracaoTV.Periodo periodo,
           com.gvt.www.metaData.smarttool.Credenciais credencial) {
           this.designadorTV = designadorTV;
           this.periodo = periodo;
           this.credencial = credencial;
    }


    /**
     * Gets the designadorTV value for this ConsultarComprasVoDIn.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this ConsultarComprasVoDIn.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the periodo value for this ConsultarComprasVoDIn.
     * 
     * @return periodo
     */
    public br.com.gvt.www.tv.configuracaoTV.Periodo getPeriodo() {
        return periodo;
    }


    /**
     * Sets the periodo value for this ConsultarComprasVoDIn.
     * 
     * @param periodo
     */
    public void setPeriodo(br.com.gvt.www.tv.configuracaoTV.Periodo periodo) {
        this.periodo = periodo;
    }


    /**
     * Gets the credencial value for this ConsultarComprasVoDIn.
     * 
     * @return credencial
     */
    public com.gvt.www.metaData.smarttool.Credenciais getCredencial() {
        return credencial;
    }


    /**
     * Sets the credencial value for this ConsultarComprasVoDIn.
     * 
     * @param credencial
     */
    public void setCredencial(com.gvt.www.metaData.smarttool.Credenciais credencial) {
        this.credencial = credencial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarComprasVoDIn)) return false;
        ConsultarComprasVoDIn other = (ConsultarComprasVoDIn) obj;
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
            ((this.periodo==null && other.getPeriodo()==null) || 
             (this.periodo!=null &&
              this.periodo.equals(other.getPeriodo()))) &&
            ((this.credencial==null && other.getCredencial()==null) || 
             (this.credencial!=null &&
              this.credencial.equals(other.getCredencial())));
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
        if (getPeriodo() != null) {
            _hashCode += getPeriodo().hashCode();
        }
        if (getCredencial() != null) {
            _hashCode += getCredencial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarComprasVoDIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarComprasVoDIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "periodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Periodo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credencial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "credencial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/smarttool", "Credenciais"));
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
