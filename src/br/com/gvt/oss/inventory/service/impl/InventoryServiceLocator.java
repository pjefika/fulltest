/**
 * InventoryServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.oss.inventory.service.impl;

public class InventoryServiceLocator extends org.apache.axis.client.Service implements br.com.gvt.oss.inventory.service.impl.InventoryService {

    public InventoryServiceLocator() {
    }


    public InventoryServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InventoryServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InventoryImplPort
    private java.lang.String InventoryImplPort_address = "http://esbgvtna2.gvt.net.br:8888/eai/oss/ServiceInventory";

    public java.lang.String getInventoryImplPortAddress() {
        return InventoryImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InventoryImplPortWSDDServiceName = "InventoryImplPort";

    public java.lang.String getInventoryImplPortWSDDServiceName() {
        return InventoryImplPortWSDDServiceName;
    }

    public void setInventoryImplPortWSDDServiceName(java.lang.String name) {
        InventoryImplPortWSDDServiceName = name;
    }

    public br.com.gvt.oss.inventory.service.impl.InventoryImpl getInventoryImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InventoryImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInventoryImplPort(endpoint);
    }

    public br.com.gvt.oss.inventory.service.impl.InventoryImpl getInventoryImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.gvt.oss.inventory.service.impl.InventoryImplPortBindingStub _stub = new br.com.gvt.oss.inventory.service.impl.InventoryImplPortBindingStub(portAddress, this);
            _stub.setPortName(getInventoryImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInventoryImplPortEndpointAddress(java.lang.String address) {
        InventoryImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.gvt.oss.inventory.service.impl.InventoryImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.gvt.oss.inventory.service.impl.InventoryImplPortBindingStub _stub = new br.com.gvt.oss.inventory.service.impl.InventoryImplPortBindingStub(new java.net.URL(InventoryImplPort_address), this);
                _stub.setPortName(getInventoryImplPortWSDDServiceName());
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
        if ("InventoryImplPort".equals(inputPortName)) {
            return getInventoryImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "InventoryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.inventory.oss.gvt.com.br/", "InventoryImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InventoryImplPort".equals(portName)) {
            setInventoryImplPortEndpointAddress(address);
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
