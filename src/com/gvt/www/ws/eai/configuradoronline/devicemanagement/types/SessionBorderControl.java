/**
 * SessionBorderControl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.types;

public class SessionBorderControl  implements java.io.Serializable {
    private java.lang.String proxyServer;

    private java.lang.String userAgentDomain;

    private java.lang.String outboundProxy;

    private java.lang.String registraServer;

    public SessionBorderControl() {
    }

    public SessionBorderControl(
           java.lang.String proxyServer,
           java.lang.String userAgentDomain,
           java.lang.String outboundProxy,
           java.lang.String registraServer) {
           this.proxyServer = proxyServer;
           this.userAgentDomain = userAgentDomain;
           this.outboundProxy = outboundProxy;
           this.registraServer = registraServer;
    }


    /**
     * Gets the proxyServer value for this SessionBorderControl.
     * 
     * @return proxyServer
     */
    public java.lang.String getProxyServer() {
        return proxyServer;
    }


    /**
     * Sets the proxyServer value for this SessionBorderControl.
     * 
     * @param proxyServer
     */
    public void setProxyServer(java.lang.String proxyServer) {
        this.proxyServer = proxyServer;
    }


    /**
     * Gets the userAgentDomain value for this SessionBorderControl.
     * 
     * @return userAgentDomain
     */
    public java.lang.String getUserAgentDomain() {
        return userAgentDomain;
    }


    /**
     * Sets the userAgentDomain value for this SessionBorderControl.
     * 
     * @param userAgentDomain
     */
    public void setUserAgentDomain(java.lang.String userAgentDomain) {
        this.userAgentDomain = userAgentDomain;
    }


    /**
     * Gets the outboundProxy value for this SessionBorderControl.
     * 
     * @return outboundProxy
     */
    public java.lang.String getOutboundProxy() {
        return outboundProxy;
    }


    /**
     * Sets the outboundProxy value for this SessionBorderControl.
     * 
     * @param outboundProxy
     */
    public void setOutboundProxy(java.lang.String outboundProxy) {
        this.outboundProxy = outboundProxy;
    }


    /**
     * Gets the registraServer value for this SessionBorderControl.
     * 
     * @return registraServer
     */
    public java.lang.String getRegistraServer() {
        return registraServer;
    }


    /**
     * Sets the registraServer value for this SessionBorderControl.
     * 
     * @param registraServer
     */
    public void setRegistraServer(java.lang.String registraServer) {
        this.registraServer = registraServer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionBorderControl)) return false;
        SessionBorderControl other = (SessionBorderControl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.proxyServer==null && other.getProxyServer()==null) || 
             (this.proxyServer!=null &&
              this.proxyServer.equals(other.getProxyServer()))) &&
            ((this.userAgentDomain==null && other.getUserAgentDomain()==null) || 
             (this.userAgentDomain!=null &&
              this.userAgentDomain.equals(other.getUserAgentDomain()))) &&
            ((this.outboundProxy==null && other.getOutboundProxy()==null) || 
             (this.outboundProxy!=null &&
              this.outboundProxy.equals(other.getOutboundProxy()))) &&
            ((this.registraServer==null && other.getRegistraServer()==null) || 
             (this.registraServer!=null &&
              this.registraServer.equals(other.getRegistraServer())));
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
        if (getProxyServer() != null) {
            _hashCode += getProxyServer().hashCode();
        }
        if (getUserAgentDomain() != null) {
            _hashCode += getUserAgentDomain().hashCode();
        }
        if (getOutboundProxy() != null) {
            _hashCode += getOutboundProxy().hashCode();
        }
        if (getRegistraServer() != null) {
            _hashCode += getRegistraServer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionBorderControl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "SessionBorderControl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyServer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "proxyServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAgentDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "userAgentDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outboundProxy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "outboundProxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registraServer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "registraServer"));
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
