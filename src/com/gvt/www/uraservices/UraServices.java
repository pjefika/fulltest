/**
 * UraServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public interface UraServices extends java.rmi.Remote {
    public com.gvt.www.uraservices.CheckCustomerCoverageOut verifyCoverageByCEP(com.gvt.www.uraservices.CheckCustomerCoverageIn verifyCoverageByCEPIn) throws java.rmi.RemoteException;
    public int saleTVVas(java.lang.String channel, java.lang.String agent, java.lang.String comQuoteSolutionId, java.lang.String assetNumber, com.gvt.www.uraservices.VasElementVO[] element) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.CertifyOut certificar(com.gvt.www.uraservices.CertifyIn certificarInDocument) throws java.rmi.RemoteException;
    public boolean permiteAlteracaoDataVencimento(java.lang.String conta) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.CancelTTOut cancelarTT(com.gvt.www.uraservices.CancelTTIn cancelarTTIn) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.CreateSSFromUraOut createSSFromUra(com.gvt.www.uraservices.CreateSSFromUraIn createSSFromUraIn) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.GetSSByFilterUraOut getSSByFilterUra(com.gvt.www.uraservices.GetSSByFilterUraIn getSSByFilterUraIn) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.DirectDebitRequestOut solicitarDebitoAutomatico(com.gvt.www.uraservices.DirectDebitRequestIn solicitarDebitoAutomaticoIn) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.RechargeControlPlanOut efetuarRecargaPlanoControle(com.gvt.www.uraservices.RechargeControlPlanIn efetuarRecargaPlanoControleInDocument) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.RechargeCellControlPlanOut efetuarRecargaControleVC(com.gvt.www.uraservices.RechargeCellControlPlanIn efetuarRecargaControleVCInDocument) throws java.rmi.RemoteException;
    public void salesVas(java.lang.String channel, java.lang.String agent, com.gvt.www.uraservices.PhoneVasVO vo) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.GetSwitchInfoOut getInfoSwitch(java.lang.String phonenumber) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.CodeMessageOut validateServiceBlock(java.lang.String phonenumber) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.CodeMessageOut validateChangeAddressInstall(java.lang.String phonenumber) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.CodeMessageOut validateTbsRadiusDivergency(java.lang.String phonenumber) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.SasMassiveResult validateNetworkIncident(java.lang.String phonenumber) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.IsSpecialCellOut verifyIsTroubleTicketSpecialCell(java.lang.String phonenumber) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.AllowOmbudsmanServiceOut allowOmbudsmanService(com.gvt.www.uraservices.AllowOmbudsmanServiceIn allowOmbudsmanServiceIn) throws java.rmi.RemoteException;
    public com.gvt.www.uraservices.ValidateTbsSwitchDivergencyOut validateTbsSwitchDivergency(java.lang.String phonenumber) throws java.rmi.RemoteException;
}
