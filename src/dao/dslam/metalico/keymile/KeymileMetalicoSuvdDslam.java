/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.metalico.keymile;

import dao.dslam.ComandoDslam;
import dao.dslam.ConsultaDslam;
import java.math.BigInteger;
import java.util.List;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaParametrosMetalicoVdsl;
import model.dslam.credencial.Credencial;
import dao.dslam.login.LoginRapido;
import model.dslam.retorno.TratativaRetornoUtil;
import model.entity.Cliente;

/**
 *
 * @author G0042204
 */
public abstract class KeymileMetalicoSuvdDslam extends KeymileMetalicoDslam {

    public KeymileMetalicoSuvdDslam() {
        this.setCredencial(Credencial.KEYMILE);
        this.setLoginStrategy(new LoginRapido());
        this.setCd(new ConsultaDslam(this));
    }

    @Override
    public Cliente consultar(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ComandoDslam getComandoConsultaVlan2() {
        return new ComandoDslam("get /services/packet/" + this.getSrvc() + "/cfgm/Service");
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros() throws Exception {
        List<String> velSinc = this.getCd().consulta(this.getVelSinc()).getRetorno();
        List<String> atnSnr = this.getCd().consulta(this.getSnrAtn()).getRetorno();

        try {
            TabelaParametrosMetalicoVdsl tab = new TabelaParametrosMetalicoVdsl();

            tab.setVelSincDown(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate")));
            tab.setVelSincUp(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate", 2)));
            tab.setAtnUp(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation")));
            tab.setSnrUp(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin")));
            tab.setAtnUp1(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 2)));
            tab.setSnrUp1(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 2)));
            tab.setAtnUp2(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 3)));
            tab.setSnrUp2(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 3)));
            tab.setAtnDown(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 4)));
            tab.setSnrDown(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 4)));
            tab.setAtnDown1(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 5)));
            tab.setSnrDown1(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 5)));
            tab.setAtnDown2(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 6)));
            tab.setSnrDown2(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 6)));

            return tab;

        } catch (Exception e) {

            TabelaParametrosMetalico tab = new TabelaParametrosMetalico();

            try {
                tab.setVelSincDown(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate")));
                tab.setVelSincUp(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate", 2)));
                tab.setAtnUp(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation")));
                tab.setSnrUp(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin")));
                tab.setAtnDown(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 2)));
                tab.setSnrDown(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 2)));

                return tab;
            } catch (Exception ex) {
                tab.setVelSincDown(new Double("0"));
                tab.setVelSincUp(new Double("0"));
                tab.setAtnUp(new Double("0"));
                tab.setSnrUp(new Double("0"));
                tab.setAtnDown(new Double("0"));
                tab.setSnrDown(new Double("0"));

                return tab;
            }
        }

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
        String modul = null;
        Integer i;
        for (i = 0; i < pegaModul.size(); i++) {
            if(pegaModul.get(i).contains("true")){
                modul = pegaModul.get(i+1).replaceAll("\\ # Name", "").replaceAll("\\\\", "").trim();
            }
        }

        Modulacao m = new Modulacao();
        m.setModulacao(modul);

        return m;
    }

    public ComandoDslam getModul() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/cfgm/portprofiles");
    }

    public ComandoDslam getVelSinc() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/status/status");
    }

    public ComandoDslam getSnrAtn() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/status/bandstatus");
    }

    public ComandoDslam getSrvcBanda() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/interface-1/status/servicestatus");
    }

    public ComandoDslam getSrvcVoip() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/interface-2/status/servicestatus");
    }

    public ComandoDslam getSrvcVod() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/interface-3/status/servicestatus");
    }

    public ComandoDslam getSrvcMult() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/interface-4/status/servicestatus");
    }

    public ComandoDslam getProf() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/chan-1/cfgm/chanprofile");
    }
}
