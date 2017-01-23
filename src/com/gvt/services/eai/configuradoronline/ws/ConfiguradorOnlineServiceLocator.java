/**
 * ConfiguradorOnlineServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineServiceLocator extends org.apache.axis.client.Service implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineService {

    public ConfiguradorOnlineServiceLocator() {
    }


    public ConfiguradorOnlineServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConfiguradorOnlineServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConfiguradorOnlineSoapPort
    private java.lang.String ConfiguradorOnlineSoapPort_address = "http://esbgvtna2.gvt.net.br:8888/eai/configuradorOnline/ConfiguradorOnlineWS";

    public java.lang.String getConfiguradorOnlineSoapPortAddress() {
        return ConfiguradorOnlineSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConfiguradorOnlineSoapPortWSDDServiceName = "ConfiguradorOnlineSoapPort";

    public java.lang.String getConfiguradorOnlineSoapPortWSDDServiceName() {
        return ConfiguradorOnlineSoapPortWSDDServiceName;
    }

    public void setConfiguradorOnlineSoapPortWSDDServiceName(java.lang.String name) {
        ConfiguradorOnlineSoapPortWSDDServiceName = name;
    }

    public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnline getConfiguradorOnlineSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConfiguradorOnlineSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConfiguradorOnlineSoapPort(endpoint);
    }

    public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnline getConfiguradorOnlineSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServiceSoapBindingStub _stub = new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getConfiguradorOnlineSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConfiguradorOnlineSoapPortEndpointAddress(java.lang.String address) {
        ConfiguradorOnlineSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnline.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServiceSoapBindingStub _stub = new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServiceSoapBindingStub(new java.net.URL(ConfiguradorOnlineSoapPort_address), this);
                _stub.setPortName(getConfiguradorOnlineSoapPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConfiguradorOnlineSoapPort".equals(inputPortName)) {
            return getConfiguradorOnlineSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConfiguradorOnlineService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConfiguradorOnlineSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConfiguradorOnlineSoapPort".equals(portName)) {
            setConfiguradorOnlineSoapPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
