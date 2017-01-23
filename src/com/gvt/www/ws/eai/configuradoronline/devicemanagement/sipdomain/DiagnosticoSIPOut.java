/**
 * DiagnosticoSIPOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain;

public class DiagnosticoSIPOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ElementoDiagnosticoSIP homegateway;

    public DiagnosticoSIPOut() {
    }

    public DiagnosticoSIPOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ElementoDiagnosticoSIP homegateway) {
        super(
            codigo,
            mensagem,
            descricao);
        this.homegateway = homegateway;
    }


    /**
     * Gets the homegateway value for this DiagnosticoSIPOut.
     * 
     * @return homegateway
     */
    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ElementoDiagnosticoSIP getHomegateway() {
        return homegateway;
    }


    /**
     * Sets the homegateway value for this DiagnosticoSIPOut.
     * 
     * @param homegateway
     */
    public void setHomegateway(com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ElementoDiagnosticoSIP homegateway) {
        this.homegateway = homegateway;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnosticoSIPOut)) return false;
        DiagnosticoSIPOut other = (DiagnosticoSIPOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.homegateway==null && other.getHomegateway()==null) || 
             (this.homegateway!=null &&
              this.homegateway.equals(other.getHomegateway())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getHomegateway() != null) {
            _hashCode += getHomegateway().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiagnosticoSIPOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "DiagnosticoSIPOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homegateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "homegateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "ElementoDiagnosticoSIP"));
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
