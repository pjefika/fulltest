/**
 * InventoryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.oss.inventory.service.impl;

public interface InventoryService extends javax.xml.rpc.Service {
    public java.lang.String getInventoryImplPortAddress();

    public br.com.gvt.oss.inventory.service.impl.InventoryImpl getInventoryImplPort() throws javax.xml.rpc.ServiceException;

    public br.com.gvt.oss.inventory.service.impl.InventoryImpl getInventoryImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
