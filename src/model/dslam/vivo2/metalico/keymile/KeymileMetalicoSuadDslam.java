/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.metalico.keymile;

import dao.dslam.telnet.ComandoDslam;
import dao.dslam.telnet.ConsultaDslam;
import java.math.BigInteger;
import java.util.List;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.dslam.credencial.Credencial;
import model.dslam.login.LoginRapido;
import model.dslam.retorno.TratativaRetornoUtil;
import model.entity.Cliente;

/**
 *
 * @author G0042204
 */
public class KeymileMetalicoSuadDslam extends KeymileMetalicoDslam {

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
        List<String> velSinc = this.getCd().consulta(this.getVelSinc()).getRetorno();
        List<String> atn = this.getCd().consulta(this.getAtn()).getRetorno();
        List<String> snr = this.getCd().consulta(this.getSnr()).getRetorno();
        System.out.println("dei 3 comandos");
        TabelaParametrosMetalico tabParam = new TabelaParametrosMetalico();

        tabParam.setVelSincDown(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate")));
        tabParam.setVelSincUp(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate", 2)));
        tabParam.setSnrDown(new Double(TratativaRetornoUtil.tratKeymile(snr, "Downstream")));
        tabParam.setSnrUp(new Double(TratativaRetornoUtil.tratKeymile(snr, "Upstream")));
        tabParam.setAtnDown(new Double(TratativaRetornoUtil.tratKeymile(atn, "Downstream")));
        tabParam.setAtnUp(new Double(TratativaRetornoUtil.tratKeymile(atn, "Upstream")));

        return tabParam;
    }

    @Override
    public TabelaRedeMetalico getTabelaRede() throws Exception {
        List<String> lTabs = this.getCd().consulta(this.getTabRede()).getRetorno();

        TabelaRedeMetalico tab = new TabelaRedeMetalico();

        tab.setPctDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 11)));
        tab.setPctUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 13)));
        tab.setCrcDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 19)));
        tab.setCrcUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 26)));
        tab.setFecDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 18)));
        tab.setFecUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 25)));
        tab.setResync(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 24)));

        return tab;
    }

    public ComandoDslam getVelSinc() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/status/status");
    }

    public ComandoDslam getAtn() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/status/attenuation");
    }

    public ComandoDslam getSnr() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/status/snrmargin");
    }

    public ComandoDslam getTabRede() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/pm/usercountertable", 3000);
    }
}
