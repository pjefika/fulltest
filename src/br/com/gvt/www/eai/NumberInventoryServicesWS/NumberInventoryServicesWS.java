/**
 * NumberInventoryServicesWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.eai.NumberInventoryServicesWS;

public interface NumberInventoryServicesWS extends java.rmi.Remote {
    public br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeOut getSwitchesByType(br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchesByTypeIn getSwitchesByTypeIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeOut changeSwichByRange(br.com.gvt.www.eai.NumberInventoryServicesWS.ChangeSwichByRangeIn changeSwichByRangeIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeOut getBDOByRange(br.com.gvt.www.eai.NumberInventoryServicesWS.GetBDOByRangeIn getBDOByRangeIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberOut updateEquipmentNumber(br.com.gvt.www.eai.NumberInventoryServicesWS.UpdateEquipmentNumberIn updateEquipmentNumberIn) throws java.rmi.RemoteException;
    public void liberarNaoLiberado() throws java.rmi.RemoteException;
    public void liberarNaoSeAplica() throws java.rmi.RemoteException;
    public void liberarCancelado() throws java.rmi.RemoteException;
    public void liberarQuarentena() throws java.rmi.RemoteException;
    public void liberarInconsistente() throws java.rmi.RemoteException;
    public void liberarReservado() throws java.rmi.RemoteException;
    public void liberarNumeros(br.com.gvt.www.eai.NumberInventoryServicesWS.LiberarNumerosIn arg0) throws java.rmi.RemoteException;
    public br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterOut getSwitchInfoByFilter(br.com.gvt.www.eai.NumberInventoryServicesWS.GetSwitchInfoByFilterIn getSwitchInfoByFilterIn) throws java.rmi.RemoteException;
    public br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2Out getRouteRN2(br.com.gvt.www.eai.NumberInventoryServicesWS.GetRouteRN2In getRouteRN2In) throws java.rmi.RemoteException;
    public br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut getNumberByFilter(br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterIn getNumberByFilterIn) throws java.rmi.RemoteException;
    public void associateEquipmentNumber(br.com.gvt.www.eai.NumberInventoryServicesWS.AssociateEquipmentNumberIn associateEquipmentNumberIn) throws java.rmi.RemoteException;
}
