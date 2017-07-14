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
import model.dslam.consulta.metalico.TabelaParametrosMetalicoVdsl;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0042204
 */
public abstract class KeymileMetalicoSuvdDslam extends KeymileMetalicoDslam {

    public KeymileMetalicoSuvdDslam(String ipDslam) {
        super(ipDslam);
        this.setCd(new ConsultaDslam(this));
    }

    public ComandoDslam getComandoConsultaVlan2(String srvc) {
        return new ComandoDslam("get /services/packet/" + srvc + "/cfgm/Service");
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        List<String> velSinc = this.getCd().consulta(this.getVelSinc(i)).getRetorno();
        List<String> atnSnr = this.getCd().consulta(this.getSnrAtn(i)).getRetorno();

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
    public Modulacao getModulacao(InventarioRede ir) throws Exception {
        List<String> pegaModul = this.getCd().consulta(this.getModul(ir)).getRetorno();
        String modul = null;
        Integer i;
        for (i = 0; i < pegaModul.size(); i++) {
            if (pegaModul.get(i).contains("true")) {
                modul = pegaModul.get(i + 1).replaceAll("\\ # Name", "").replaceAll("\\\\", "").trim();
            }
        }

        Modulacao m = new Modulacao();
        m.setModulacao(modul);

        return m;
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        String leSet = getCd().consulta(getComandoSetProfileDefault(i, v)).getBlob();
        List<String> leResp = new ArrayList<>();
        if (leSet.contains("previously")) {
            leSet = getCd().consulta(getComandoSetProfileSeco(i, v)).getBlob();
            if (leSet.contains("previously")) {
                leResp = getCd().consulta(getComandoSetProfileSUVD1(i, v)).getRetorno();
            } else {
                String[] parser = leSet.split("\n");
                for (String string : parser) {
                    leResp.add(string);
                }
            }
        } else {
            String[] parser = leSet.split("\n");
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
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/chanprofile " + castProfile(vDown).getProfileDown());
    }

    protected ComandoDslam getComandoSetProfileSeco(InventarioRede i, Velocidades vDown) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/chanprofile " + castProfile(vDown).getProfileUp());
    }

    protected ComandoDslam getComandoSetProfileSUVD1(InventarioRede i, Velocidades vDown) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/chanprofile " + castProfile(vDown).getProfileUp() + "_SUVD1");
    }

    public ComandoDslam getModul(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/cfgm/portprofiles");
    }

    public ComandoDslam getVelSinc(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/status/status");
    }

    public ComandoDslam getSnrAtn(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/bandstatus");
    }

    public ComandoDslam getSrvcBanda(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/interface-1/status/servicestatus");
    }

    public ComandoDslam getSrvcVoip(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/interface-2/status/servicestatus");
    }

    protected ComandoDslam getSrvcVod(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/interface-3/status/servicestatus");
    }

    protected ComandoDslam getSrvcMult(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/interface-4/status/servicestatus");
    }

    protected ComandoDslam getProf(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/chanprofile");
    }

    @Override
    public Profile castProfile(Velocidades v) {
        Profile p = new Profile();
//        p.setProfileDown("HSI_" + v.getVel() + "Mb_1Mb");
//        p.setProfileUp("HSI_" + v.getVel() + "Mb_1Mb_SUAD1");
        return p;
    }

    @Override
    public Modulacao castModulacao(Velocidades v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
