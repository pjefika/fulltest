/**
 * ConsultarCPEsOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.services;

public class ConsultarCPEsOut  extends com.gvt.www.ws.eai.configuradoronline.contingent.types.ResponseStatus  implements java.io.Serializable {
    private java.lang.String designadorTV;

    private com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnostico homegateway;

    private com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnostico[] stbs;

    private com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.PortaFXS[] portaFXS;

    public ConsultarCPEsOut() {
    }

    public ConsultarCPEsOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           java.lang.String designadorTV,
           com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnostico homegateway,
           com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnostico[] stbs,
           com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.PortaFXS[] portaFXS) {
        super(
            codigo,
            mensagem,
            descricao);
        this.designadorTV = designadorTV;
        this.homegateway = homegateway;
        this.stbs = stbs;
        this.portaFXS = portaFXS;
    }


    /**
     * Gets the designadorTV value for this ConsultarCPEsOut.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this ConsultarCPEsOut.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the homegateway value for this ConsultarCPEsOut.
     * 
     * @return homegateway
     */
    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnostico getHomegateway() {
        return homegateway;
    }


    /**
     * Sets the homegateway value for this ConsultarCPEsOut.
     * 
     * @param homegateway
     */
    public void setHomegateway(com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnostico homegateway) {
        this.homegateway = homegateway;
    }


    /**
     * Gets the stbs value for this ConsultarCPEsOut.
     * 
     * @return stbs
     */
    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnostico[] getStbs() {
        return stbs;
    }


    /**
     * Sets the stbs value for this ConsultarCPEsOut.
     * 
     * @param stbs
     */
    public void setStbs(com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnostico[] stbs) {
        this.stbs = stbs;
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnostico getStbs(int i) {
        return this.stbs[i];
    }

    public void setStbs(int i, com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.ElementoDiagnostico _value) {
        this.stbs[i] = _value;
    }


    /**
     * Gets the portaFXS value for this ConsultarCPEsOut.
     * 
     * @return portaFXS
     */
    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.PortaFXS[] getPortaFXS() {
        return portaFXS;
    }


    /**
     * Sets the portaFXS value for this ConsultarCPEsOut.
     * 
     * @param portaFXS
     */
    public void setPortaFXS(com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.PortaFXS[] portaFXS) {
        this.portaFXS = portaFXS;
    }

    public com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.PortaFXS getPortaFXS(int i) {
        return this.portaFXS[i];
    }

    public void setPortaFXS(int i, com.gvt.www.ws.eai.configuradoronline.devicemanagement.types.PortaFXS _value) {
        this.portaFXS[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarCPEsOut)) return false;
        ConsultarCPEsOut other = (ConsultarCPEsOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV()))) &&
            ((this.homegateway==null && other.getHomegateway()==null) || 
             (this.homegateway!=null &&
              this.homegateway.equals(other.getHomegateway()))) &&
            ((this.stbs==null && other.getStbs()==null) || 
             (this.stbs!=null &&
              java.util.Arrays.equals(this.stbs, other.getStbs()))) &&
            ((this.portaFXS==null && other.getPortaFXS()==null) || 
             (this.portaFXS!=null &&
              java.util.Arrays.equals(this.portaFXS, other.getPortaFXS())));
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
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        if (getHomegateway() != null) {
            _hashCode += getHomegateway().hashCode();
        }
        if (getStbs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStbs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStbs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPortaFXS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortaFXS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortaFXS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarCPEsOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ConsultarCPEsOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homegateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "homegateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "ElementoDiagnostico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stbs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "stbs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "ElementoDiagnostico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portaFXS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "portaFXS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "PortaFXS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
