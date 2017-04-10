/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.metalico.keymile;

import dao.dslam.telnet.ComandoDslam;
import dao.dslam.telnet.ConsultaDslam;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.credencial.Credencial;
import model.dslam.login.LoginRapido;
import model.entity.Cliente;

/**
 *
 * @author G0042204
 */
public class KeymileMetalicoSuadDslam extends KeymileMetalicoDslam {

    private String srvc;

    public String getSrvc() {
        return srvc;
    }

    public void setSrvc(String srvc) {
        this.srvc = srvc;
    }

    public KeymileMetalicoSuadDslam() {
        this.setCredencial(Credencial.KEYMILE);
        this.setLoginStrategy(new LoginRapido());
        this.setCd(new ConsultaDslam(this));
    }

    @Override
    public Cliente consultar(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public ComandoDslam getComandoSerialOnt() {
//        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/cfgm/onuCfgTable");
//    }
//    public ComandoDslam getComandoConsultaEstadoAdminDaPorta() {
//        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/main/AdministrativeStatus");
//    }
//    public ComandoDslam getComandoConsultaEstadoOperDaPorta() {
//        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/port-1/main/OperationalStatus");
//    }
//    public ComandoDslam getComandoConsultaVlanBanda1() {
//        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/port-1/interface-1/status/ServiceStatus");
//    }
    public ComandoDslam getComandoConsultaVlan2() {
        return new ComandoDslam("get /services/packet/" + this.getSrvc() + "/cfgm/Service");
    }

//    public ComandoDslam getComandoConsultaVlanVoip1() {
//        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/port-1/interface-2/status/ServiceStatus");
//    }
//    public ComandoDslam getComandoConsultaVlanVod1() {
//        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/port-1/interface-3/status/ServiceStatus");
//    }
//    public ComandoDslam getComandoConsultaVlanMulticast1() {
//        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/port-1/interface-4/status/ServiceStatus");
//    }
//    public ComandoDslam getComandoConsultaAlarmes() {
//        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/fm/alarmstatus");
//    }
//    public ComandoDslam getComandoConsultaProfileUp(){
//        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/cfgm/onuCfgTable");
//    }
//    public ComandoDslam getComandoConsultaProfileDown(){
//        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/port-1/interface-1/cfgm/IfRateLimiting");
//    }
    @Override
    public TabelaParametrosMetalico getTabelaParametros() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
