/**
 * UraServicesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class UraServicesServiceLocator extends org.apache.axis.client.Service implements com.gvt.www.uraservices.UraServicesService {

    public UraServicesServiceLocator() {
    }


    public UraServicesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UraServicesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UraServicesPort
    private java.lang.String UraServicesPort_address = "http://esbgvtna2.gvt.net.br:8888/eai/UraServices/uraServicesProxy";

    public java.lang.String getUraServicesPortAddress() {
        return UraServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UraServicesPortWSDDServiceName = "UraServicesPort";

    public java.lang.String getUraServicesPortWSDDServiceName() {
        return UraServicesPortWSDDServiceName;
    }

    public void setUraServicesPortWSDDServiceName(java.lang.String name) {
        UraServicesPortWSDDServiceName = name;
    }

    public com.gvt.www.uraservices.UraServices getUraServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UraServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUraServicesPort(endpoint);
    }

    public com.gvt.www.uraservices.UraServices getUraServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gvt.www.uraservices.UraServicesPortBindingStub _stub = new com.gvt.www.uraservices.UraServicesPortBindingStub(portAddress, this);
            _stub.setPortName(getUraServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUraServicesPortEndpointAddress(java.lang.String address) {
        UraServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gvt.www.uraservices.UraServices.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gvt.www.uraservices.UraServicesPortBindingStub _stub = new com.gvt.www.uraservices.UraServicesPortBindingStub(new java.net.URL(UraServicesPort_address), this);
                _stub.setPortName(getUraServicesPortWSDDServiceName());
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
        if ("UraServicesPort".equals(inputPortName)) {
            return getUraServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "UraServicesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "UraServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UraServicesPort".equals(portName)) {
            setUraServicesPortEndpointAddress(address);
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
