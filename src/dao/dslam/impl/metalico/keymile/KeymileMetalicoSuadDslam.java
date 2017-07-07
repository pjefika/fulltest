/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.ConsultaDslam;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.List;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0042204
 */
public abstract class KeymileMetalicoSuadDslam extends KeymileMetalicoDslam {

    public KeymileMetalicoSuadDslam(String ipDslam) {
        super(ipDslam);
        this.setCd(new ConsultaDslam(this));
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        List<String> velSinc = this.getCd().consulta(this.getVelSinc(i)).getRetorno();
        List<String> atn = this.getCd().consulta(this.getAtn(i)).getRetorno();
        List<String> snr = this.getCd().consulta(this.getSnr(i)).getRetorno();

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
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcBanda(i)).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan(leSrvc)).getRetorno();
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, p100);

        return vlanBanda;
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcVoip(i)).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan(leSrvc)).getRetorno();
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        VlanVoip vlanVoip = new VlanVoip(cvlan, p100);

        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcVod(i)).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan(leSrvc)).getRetorno();
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        VlanVod vlanVod = new VlanVod(cvlan, p100);

        return vlanVod;
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcMult(i)).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");

        VlanMulticast vlanMult = new VlanMulticast();
        Integer cvlan = new Integer("0");
        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan(leSrvc)).getRetorno();
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "McastVID"));
        }

        vlanMult.setCvlan(cvlan);

        return vlanMult;
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        List<String> pegaProfile = this.getCd().consulta(this.getProf(i)).getRetorno();
        String first = TratativaRetornoUtil.tratKeymile(pegaProfile, "Name");
        List<String> leProf = TratativaRetornoUtil.numberFromString(first);

        Profile prof = new Profile();
        prof.setProfileDown(leProf.get(0));
        prof.setProfileUp(leProf.get(1));

        return prof;
    }

    @Override
    public Modulacao getModulacao(InventarioRede i) throws Exception {
        List<String> pegaModul = this.getCd().consulta(this.getModul(i)).getRetorno();
        String modul = TratativaRetornoUtil.tratKeymile(pegaModul, "Name");

        Modulacao m = new Modulacao();
        m.setModulacao(modul);

        return m;
    }

    public ComandoDslam getVelSinc(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/status/status");
    }

    public ComandoDslam getAtn(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/attenuation");
    }

    public ComandoDslam getSnr(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/snrmargin");
    }

    public ComandoDslam getSrvcBanda(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-1/status/servicestatus");
    }

    public ComandoDslam getSrvcVoip(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-2/status/servicestatus");
    }

    public ComandoDslam getSrvcVod(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-3/status/servicestatus");
    }

    public ComandoDslam getSrvcMult(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-4/status/ServiceStatus");
    }

    public ComandoDslam getProf(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/profilename");
    }

    public ComandoDslam getModul(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/cfgm/portprofile");
    }

    @Override
    public Profile castProfile(Velocidades v) {
        Profile p = new Profile();
        p.setProfileDown("HSI_" + v.getVel() + "Mb_1Mb");
        p.setProfileUp("HSI_" + v.getVel() + "Mb_1Mb_SUAD1");
        return p;
    }

   
}
