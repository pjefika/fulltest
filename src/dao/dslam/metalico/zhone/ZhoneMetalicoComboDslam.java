/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.metalico.zhone;

import dao.dslam.ComandoDslam;
import dao.dslam.ConsultaDslam;
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
import dao.dslam.login.LoginLento;
import model.dslam.retorno.TratativaRetornoUtil;
import model.entity.Cliente;

/**
 *
 * @author G0042204
 */
public class ZhoneMetalicoComboDslam extends ZhoneMetalicoDslam {

    public ZhoneMetalicoComboDslam() {
        this.setCredencial(Credencial.ZHONE);
        this.setLoginStrategy(new LoginLento());
        this.setCd(new ConsultaDslam(this));

    }

    @Override
    public Cliente consultar(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros() throws Exception {
        List<String> leParams = this.getCd().consulta(this.getParams()).getRetorno();

        TabelaParametrosMetalico tab = new TabelaParametrosMetalico();

        tab.setVelSincDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslDownLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tab.setVelSincUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslUpLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tab.setSnrDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAturCurrLineSnrMgn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tab.setSnrUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAtucCurrLineSnrMgn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tab.setAtnDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAturCurrLineAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tab.setAtnUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAtucCurrLineAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);

        return tab;
    }

    @Override
    public TabelaRedeMetalico getTabelaRede() throws Exception {
        List<String> leRedes = this.getCd().consulta(this.getParams()).getRetorno();
        TabelaRedeMetalico tab = new TabelaRedeMetalico();

//        tab.setCrcDown(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "CRC errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
//        tab.setCrcUp(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "CRC errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)));
//        tab.setFecDown(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "FEC corrected errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
//        tab.setFecUp(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "FEC corrected errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)));
        tab.setPctDown(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "In Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tab.setPctUp(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "Out Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
//        tab.setResync(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "Inits", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tab.setCrcDown(BigInteger.ZERO);
        tab.setCrcUp(BigInteger.ZERO);
        tab.setFecDown(BigInteger.ZERO);
        tab.setFecUp(BigInteger.ZERO);
        tab.setResync(BigInteger.ZERO);

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
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-35", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");

        if (leVlanBanda != null) {
            cvlan = new BigInteger(leVlanBanda.get(1));
            p100 = new BigInteger(leVlanBanda.get(0));
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, p100);

        return vlanBanda;
    }

    @Override
    public VlanVoip getVlanVoip() throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-36", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");

        if (leVlanBanda != null) {
            cvlan = new BigInteger(leVlanBanda.get(1));
            p100 = new BigInteger(leVlanBanda.get(0));
        }
        VlanVoip vlanVoip = new VlanVoip(cvlan, p100);

        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod() throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");

        if (leVlanBanda != null) {
            cvlan = new BigInteger(leVlanBanda.get(1));
            p100 = new BigInteger(leVlanBanda.get(0));
        }
        VlanVod vlanVod = new VlanVod(cvlan, p100);

        return vlanVod;
    }

    @Override
    public VlanMulticast getVlanMulticast() throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getMult()).getRetorno();
        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-38", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
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
        BigInteger leDown = new BigInteger(TratativaRetornoUtil.tratZhone(leProfDown, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)).divide(new BigInteger("1000"));
        BigInteger leUp = new BigInteger(TratativaRetornoUtil.tratZhone(leProfUp, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)).divide(new BigInteger("1000"));
        p.setProfileDown(leDown.toString());
        p.setProfileUp(leUp.toString());

        return p;
    }

    @Override
    public Modulacao getModulacao() throws Exception {
        List<String> leModul = this.getCd().consulta(this.getModul()).getRetorno();
        Modulacao m = new Modulacao();
        String modulacao = TratativaRetornoUtil.tratZhone(leModul, "adslTransmissionMode", "\\{([^\\[\\]]+|(R))*\\}").get(0).replace("{", "").replace("}", "");
        m.setModulacao(modulacao);
        return m;
    }

    public ComandoDslam getMult() {
        return new ComandoDslam("bridge show port 1-" + this.getSlot() + "-" + this.getPorta() + "-0/adsl", 5000);
    }

    public ComandoDslam getParams() {
        return new ComandoDslam("dslstat 1-" + this.getSlot() + "-" + this.getPorta() + "-0/adsl", 5000, "a");
    }

    public ComandoDslam getProfDown() {
        return new ComandoDslam("get adsl-co-profile 1/" + this.getSlot() + "/" + this.getPorta());
    }

    public ComandoDslam getProfUp() {
        return new ComandoDslam("get adsl-cpe-profile 1/" + this.getSlot() + "/" + this.getPorta());
    }

    public ComandoDslam getModul() {
        return new ComandoDslam("get adsl-profile 1/" + this.getSlot() + "/" + this.getPorta());
    }

}
