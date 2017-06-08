/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.zhone;

import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.ConsultaDslam;
import java.math.BigInteger;
import java.util.List;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.dslam.credencial.Credencial;
import dao.dslam.impl.login.LoginLento;
import model.dslam.retorno.TratativaRetornoUtil;

/**
 *
 * @author G0042204
 */
public class ZhoneMetalicoMxkDslam extends ZhoneMetalicoDslam {

    public ZhoneMetalicoMxkDslam() {
        this.setCredencial(Credencial.ZHONE);
        this.setLoginStrategy(new LoginLento());
        this.setCd(new ConsultaDslam(this));

    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros() throws Exception {
        List<String> leParams = this.getCd().consulta(this.getParams()).getRetorno();

        TabelaParametrosMetalico tab = new TabelaParametrosMetalico();

        tab.setVelSincDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslDownLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tab.setVelSincUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslUpLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tab.setSnrDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "curSnrMargin", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)) / 10);
        tab.setSnrUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "curSnrMargin", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tab.setAtnDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "currAtn", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)) / 10);
        tab.setAtnUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "currAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);

        return tab;
    }

    @Override
    public TabelaRedeMetalico getTabelaRede() throws Exception {
        List<String> leRedes = this.getCd().consulta(this.getParams()).getRetorno();
        TabelaRedeMetalico tab = new TabelaRedeMetalico();

//        tab.setCrcDown(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "CRC Errors", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
//        tab.setCrcUp(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "CRC Errors", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
//        tab.setResync(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "Inits", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tab.setCrcDown(new BigInteger("0"));
        tab.setCrcUp(new BigInteger("0"));
        tab.setResync(new BigInteger("0"));
        tab.setFecDown(new BigInteger("0"));
        tab.setFecUp(new BigInteger("0"));
        tab.setPctDown(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "In Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tab.setPctUp(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "Out Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));

        return tab;
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta() throws Exception {
        List<String> leEst = this.getCd().consulta(this.getParams()).getRetorno();
        return super.getEstadoDaPorta(leEst);
    }

    @Override
    public VlanBanda getVlanBanda() throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-35", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");

        if (leVlanBanda != null) {
            cvlan = new BigInteger(leVlanBanda.get(2));
            p100 = new BigInteger(leVlanBanda.get(1));
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, p100);

        return vlanBanda;
    }

    @Override
    public VlanVoip getVlanVoip() throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
        List<String> leVlanVoip = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-36", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");

        if (leVlanVoip != null) {
            cvlan = new BigInteger(leVlanVoip.get(2));
            p100 = new BigInteger(leVlanVoip.get(1));
        }
        VlanVoip vlanVoip = new VlanVoip(cvlan, p100);

        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod() throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
        List<String> leVlanVod = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");

        if (leVlanVod != null) {
            cvlan = new BigInteger(leVlanVod.get(2));
            p100 = new BigInteger(leVlanVod.get(1));
        }
        VlanVod vlanVod = new VlanVod(cvlan, p100);

        return vlanVod;
    }

    @Override
    public VlanMulticast getVlanMulticast() throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getMult()).getRetorno();
        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-38", "-?(\\d+((\\.|,| )\\d+)?)");
        BigInteger cvlan = new BigInteger("0");

        if (leVlanMult != null) {
            cvlan = new BigInteger(leVlanMult.get(0));
        }
        VlanMulticast vlanMult = new VlanMulticast();
        vlanMult.setCvlan(cvlan);

        return vlanMult;
    }

    @Override
    public Profile getProfile() throws Exception {
        List<String> leProfDown = this.getCd().consulta(this.getProfDown()).getRetorno();
        List<String> leProfUp = this.getCd().consulta(this.getProfUp()).getRetorno();

        Profile p = new Profile();
        p.setProfileDown(TratativaRetornoUtil.tratZhone(leProfDown, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0));
        p.setProfileUp(TratativaRetornoUtil.tratZhone(leProfUp, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0));

        return p;
    }

    @Override
    public Modulacao getModulacao() throws Exception {
        List<String> leModul = this.getCd().consulta(this.getModul()).getRetorno();
        Modulacao m = new Modulacao();
        String modulacao = TratativaRetornoUtil.tratZhone(leModul, "transmit-mode", "\\{([^\\[\\]]+|(R))*\\}").get(0).replace("{", "").replace("}", "");
        m.setModulacao(modulacao);
        return m;
    }

    public ComandoDslam getMult() {
        return new ComandoDslam("bridge show port 1-" + this.getSlot() + "-" + this.getPorta() + "-0/vdsl", 5000);
    }

    public ComandoDslam getParams() {
        return new ComandoDslam("dslstat 1/" + this.getSlot() + "/" + this.getPorta() + "/0/vdsl -v", 5000, "a");
    }

    public ComandoDslam getProfDown() {
        return new ComandoDslam("get vdsl-co-config 1/" + this.getSlot() + "/" + this.getPorta() + "/0/vdsl");
    }

    public ComandoDslam getProfUp() {
        return new ComandoDslam("get vdsl-cpe-config 1/" + this.getSlot() + "/" + this.getPorta() + "/0/vdsl");
    }

    public ComandoDslam getModul() {
        return new ComandoDslam("get vdsl-config 1/" + this.getSlot() + "/" + this.getPorta() + "/0/vdsl");
    }
}
