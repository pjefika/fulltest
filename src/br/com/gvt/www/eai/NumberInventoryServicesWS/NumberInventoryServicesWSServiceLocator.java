/**
 * NumberInventoryServicesWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.eai.NumberInventoryServicesWS;

public class NumberInventoryServicesWSServiceLocator extends org.apache.axis.client.Service implements br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWSService {

    public NumberInventoryServicesWSServiceLocator() {
    }


    public NumberInventoryServicesWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NumberInventoryServicesWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NumberInventoryServicesWS
    private java.lang.String NumberInventoryServicesWS_address = "http://esbgvtna2.gvt.net.br:8888/eai/NumberInventoryServices";

    public java.lang.String getNumberInventoryServicesWSAddress() {
        return NumberInventoryServicesWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NumberInventoryServicesWSWSDDServiceName = "NumberInventoryServicesWS";

    public java.lang.String getNumberInventoryServicesWSWSDDServiceName() {
        return NumberInventoryServicesWSWSDDServiceName;
    }

    public void setNumberInventoryServicesWSWSDDServiceName(java.lang.String name) {
        NumberInventoryServicesWSWSDDServiceName = name;
    }

    public br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWS getNumberInventoryServicesWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NumberInventoryServicesWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNumberInventoryServicesWS(endpoint);
    }

    public br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWS getNumberInventoryServicesWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWSBindingStub _stub = new br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWSBindingStub(portAddress, this);
            _stub.setPortName(getNumberInventoryServicesWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNumberInventoryServicesWSEndpointAddress(java.lang.String address) {
        NumberInventoryServicesWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWS.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWSBindingStub _stub = new br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWSBindingStub(new java.net.URL(NumberInventoryServicesWS_address), this);
                _stub.setPortName(getNumberInventoryServicesWSWSDDServiceName());
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
        if ("NumberInventoryServicesWS".equals(inputPortName)) {
            return getNumberInventoryServicesWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "NumberInventoryServicesWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "NumberInventoryServicesWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NumberInventoryServicesWS".equals(portName)) {
            setNumberInventoryServicesWSEndpointAddress(address);
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
