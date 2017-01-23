/**
 * OSSTurbonetServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.ossturbonet;

public class OSSTurbonetServiceLocator extends org.apache.axis.client.Service implements com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetService {

    public OSSTurbonetServiceLocator() {
    }


    public OSSTurbonetServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OSSTurbonetServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OSSTurbonetSoapPort
    private java.lang.String OSSTurbonetSoapPort_address = "http://esbgvtna2.gvt.net.br:8888/eai/oss/ossturbonet";

    public java.lang.String getOSSTurbonetSoapPortAddress() {
        return OSSTurbonetSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OSSTurbonetSoapPortWSDDServiceName = "OSSTurbonetSoapPort";

    public java.lang.String getOSSTurbonetSoapPortWSDDServiceName() {
        return OSSTurbonetSoapPortWSDDServiceName;
    }

    public void setOSSTurbonetSoapPortWSDDServiceName(java.lang.String name) {
        OSSTurbonetSoapPortWSDDServiceName = name;
    }

    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonet getOSSTurbonetSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OSSTurbonetSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOSSTurbonetSoapPort(endpoint);
    }

    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonet getOSSTurbonetSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetServiceSoapBindingStub _stub = new com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getOSSTurbonetSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOSSTurbonetSoapPortEndpointAddress(java.lang.String address) {
        OSSTurbonetSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonet.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetServiceSoapBindingStub _stub = new com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetServiceSoapBindingStub(new java.net.URL(OSSTurbonetSoapPort_address), this);
                _stub.setPortName(getOSSTurbonetSoapPortWSDDServiceName());
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
        if ("OSSTurbonetSoapPort".equals(inputPortName)) {
            return getOSSTurbonetSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OSSTurbonetSoapPort".equals(portName)) {
            setOSSTurbonetSoapPortEndpointAddress(address);
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
