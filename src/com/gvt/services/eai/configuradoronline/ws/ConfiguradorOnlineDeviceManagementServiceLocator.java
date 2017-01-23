/**
 * ConfiguradorOnlineDeviceManagementServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.services.eai.configuradoronline.ws;

public class ConfiguradorOnlineDeviceManagementServiceLocator extends org.apache.axis.client.Service implements com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementService {

    public ConfiguradorOnlineDeviceManagementServiceLocator() {
    }


    public ConfiguradorOnlineDeviceManagementServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConfiguradorOnlineDeviceManagementServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConfiguradorOnlineDeviceManagementSoapPort
    private java.lang.String ConfiguradorOnlineDeviceManagementSoapPort_address = "http://esbgvtna2.gvt.net.br:8888/eai/configuradorOnline/ConfiguradorOnlineDeviceManagementWS";

    public java.lang.String getConfiguradorOnlineDeviceManagementSoapPortAddress() {
        return ConfiguradorOnlineDeviceManagementSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConfiguradorOnlineDeviceManagementSoapPortWSDDServiceName = "ConfiguradorOnlineDeviceManagementSoapPort";

    public java.lang.String getConfiguradorOnlineDeviceManagementSoapPortWSDDServiceName() {
        return ConfiguradorOnlineDeviceManagementSoapPortWSDDServiceName;
    }

    public void setConfiguradorOnlineDeviceManagementSoapPortWSDDServiceName(java.lang.String name) {
        ConfiguradorOnlineDeviceManagementSoapPortWSDDServiceName = name;
    }

    public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagement getConfiguradorOnlineDeviceManagementSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConfiguradorOnlineDeviceManagementSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConfiguradorOnlineDeviceManagementSoapPort(endpoint);
    }

    public com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagement getConfiguradorOnlineDeviceManagementSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementServiceSoapBindingStub _stub = new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getConfiguradorOnlineDeviceManagementSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConfiguradorOnlineDeviceManagementSoapPortEndpointAddress(java.lang.String address) {
        ConfiguradorOnlineDeviceManagementSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagement.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementServiceSoapBindingStub _stub = new com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementServiceSoapBindingStub(new java.net.URL(ConfiguradorOnlineDeviceManagementSoapPort_address), this);
                _stub.setPortName(getConfiguradorOnlineDeviceManagementSoapPortWSDDServiceName());
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
        if ("ConfiguradorOnlineDeviceManagementSoapPort".equals(inputPortName)) {
            return getConfiguradorOnlineDeviceManagementSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConfiguradorOnlineDeviceManagementService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com/gvt/services/eai/configuradoronline/ws", "ConfiguradorOnlineDeviceManagementSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConfiguradorOnlineDeviceManagementSoapPort".equals(portName)) {
            setConfiguradorOnlineDeviceManagementSoapPortEndpointAddress(address);
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
