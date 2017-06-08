/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.ConsultaDslam;
import java.math.BigInteger;
import java.util.List;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.credencial.Credencial;
import dao.dslam.impl.login.LoginRapido;
import dao.dslam.impl.retorno.TratativaRetornoUtil;

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
    public TabelaParametrosMetalico getTabelaParametros() throws Exception {
        List<String> velSinc = this.getCd().consulta(this.getVelSinc()).getRetorno();
        List<String> atn = this.getCd().consulta(this.getAtn()).getRetorno();
        List<String> snr = this.getCd().consulta(this.getSnr()).getRetorno();

        TabelaParametrosMetalico tabParam = new TabelaParametrosMetalico();
        try {
            tabParam.setVelSincDown(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate")));
            tabParam.setVelSincUp(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate", 2)));
            tabParam.setSnrDown(new Double(TratativaRetornoUtil.tratKeymile(snr, "Downstream")));
            tabParam.setSnrUp(new Double(TratativaRetornoUtil.tratKeymile(snr, "Upstream")));
            tabParam.setAtnDown(new Double(TratativaRetornoUtil.tratKeymile(atn, "Downstream")));
            tabParam.setAtnUp(new Double(TratativaRetornoUtil.tratKeymile(atn, "Upstream")));
        } catch (Exception e) {
            tabParam.setVelSincDown(new Double("0"));
            tabParam.setVelSincUp(new Double("0"));
            tabParam.setSnrDown(new Double("0"));
            tabParam.setSnrUp(new Double("0"));
            tabParam.setAtnDown(new Double("0"));
            tabParam.setAtnUp(new Double("0"));
        }

        return tabParam;
    }

    @Override
    public VlanBanda getVlanBanda() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcBanda()).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        if (!leSrvc.contentEquals("no service connected")) {
            this.setSrvc(leSrvc);
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
            cvlan = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, p100);

        return vlanBanda;
    }

    @Override
    public VlanVoip getVlanVoip() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcVoip()).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        if (!leSrvc.contentEquals("no service connected")) {
            this.setSrvc(leSrvc);
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
            cvlan = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        VlanVoip vlanVoip = new VlanVoip(cvlan, p100);

        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcVod()).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        if (!leSrvc.contentEquals("no service connected")) {
            this.setSrvc(leSrvc);
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
            cvlan = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        VlanVod vlanVod = new VlanVod(cvlan, p100);

        return vlanVod;
    }

    @Override
    public VlanMulticast getVlanMulticast() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcMult()).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");

        VlanMulticast vlanMult = new VlanMulticast();
        BigInteger cvlan = new BigInteger("0");
        if (!leSrvc.contentEquals("no service connected")) {
            this.setSrvc(leSrvc);
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
            cvlan = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "McastVID"));
        }

        vlanMult.setCvlan(cvlan);

        return vlanMult;
    }

    @Override
    public Profile getProfile() throws Exception {
        List<String> pegaProfile = this.getCd().consulta(this.getProf()).getRetorno();
        String first = TratativaRetornoUtil.tratKeymile(pegaProfile, "Name");
        List<String> leProf = TratativaRetornoUtil.numberFromString(first);

        Profile prof = new Profile();
        prof.setProfileDown(leProf.get(0));
        prof.setProfileUp(leProf.get(1));

        return prof;
    }

    @Override
    public Modulacao getModulacao() throws Exception {
        List<String> pegaModul = this.getCd().consulta(this.getModul()).getRetorno();
        String modul = TratativaRetornoUtil.tratKeymile(pegaModul, "Name");

        Modulacao m = new Modulacao();
        m.setModulacao(modul);

        return m;
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

    public ComandoDslam getSrvcBanda() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/vcc-1/status/servicestatus");
    }

    public ComandoDslam getSrvcVoip() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/vcc-2/status/servicestatus");
    }

    public ComandoDslam getSrvcVod() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/vcc-3/status/servicestatus");
    }

    public ComandoDslam getSrvcMult() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/vcc-4/status/ServiceStatus");
    }

    public ComandoDslam getProf() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/cfgm/profilename");
    }

    public ComandoDslam getModul() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/cfgm/portprofile");
    }
}
