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
import java.util.ArrayList;
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

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        String leSet = getCd().consulta(getComandoSetProfileSUAD1(i, v)).getBlob();
        List<String> leResp = new ArrayList<>();
        if (leSet.contains("previously") || leSet.contains("is not compatible")) {
            leResp = getCd().consulta(getComandoSetProfileDefault(i, v)).getRetorno();
        } else {
            String[] parser = leSet.split("\\n");
            for (String string : parser) {
                leResp.add(string);
            }
        }
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        setProfileDown(i, vUp);
    }

    @Override
    public Modulacao setModulacao(InventarioRede i, Velocidades v) throws Exception {
        String leSet = getCd().consulta(setModulSUAD1(i, v)).getBlob();
        List<String> leResp = new ArrayList<>();
        if (leSet.contains("previously") || leSet.contains("is not compatible")) {
            leResp = getCd().consulta(setModulDefault(i, v)).getRetorno();
        } else {
            String[] parser = leSet.split("\\n");
            for (String string : parser) {
                leResp.add(string);
            }
        }
        for (String string : leResp) {
            System.out.println(string);
        }
        
        return getModulacao(i);
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected ComandoDslam getComandoSetProfileDefault(InventarioRede i, Velocidades vDown) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/profilename " + castProfile(vDown).getProfileDown());
    }

    protected ComandoDslam getComandoSetProfileSUAD1(InventarioRede i, Velocidades vDown) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/profilename " + castProfile(vDown).getProfileUp());
    }

    protected ComandoDslam getVelSinc(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/status/status");
    }

    protected ComandoDslam getAtn(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/attenuation");
    }

    protected ComandoDslam getSnr(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/snrmargin");
    }

    protected ComandoDslam getSrvcBanda(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-1/status/servicestatus");
    }

    protected ComandoDslam getSrvcVoip(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-2/status/servicestatus");
    }

    protected ComandoDslam getSrvcVod(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-3/status/servicestatus");
    }

    protected ComandoDslam getSrvcMult(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-4/status/ServiceStatus");
    }

    protected ComandoDslam getProf(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/profilename");
    }

    protected ComandoDslam getModul(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/cfgm/portprofile");
    }

    protected ComandoDslam setModulDefault(InventarioRede i, Velocidades v) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/cfgm/portprofile " + castModulacao(v).getModulacao());
    }

    protected ComandoDslam setModulSUAD1(InventarioRede i, Velocidades v) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/cfgm/portprofile " + castModulacao(v).getModulacao() + "1");
    }

    @Override
    public Profile castProfile(Velocidades v) {
        Profile p = new Profile();
        p.setProfileDown("HSI_" + v.getVel() + "Mb_1Mb");
        p.setProfileUp("HSI_" + v.getVel() + "Mb_1Mb_SUAD1");
        return p;
    }

    @Override
    public Modulacao castModulacao(Velocidades v) {
        Modulacao m = new Modulacao();

        Double leVel = new Double(v.getVel());
        Double autoLimit = 5d;
        Boolean isAdsl2Plus = leVel.compareTo(autoLimit) > 0;
        String leModul = isAdsl2Plus ? "ADSL2PLUS_ONLY_SUAD" : "ADSL2PLUS_AUTO_SUAD";
        m.setModulacao(leModul);

        return m;
    }

}
