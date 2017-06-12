/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.zhone;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.login.LoginLento;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
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

/**
 *
 * @author G0042204
 */
public class ZhoneMetalicoComboDslam extends ZhoneMetalicoDslam {

    public ZhoneMetalicoComboDslam(String ipDslam) {
        super(ipDslam, Credencial.ZHONE, new LoginLento());
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        List<String> leParams = this.getCd().consulta(this.getParams(i)).getRetorno();

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
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        List<String> leRedes = this.getCd().consulta(this.getParams(i)).getRetorno();
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
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        List<String> leEst = this.getCd().consulta(this.getParams(i)).getRetorno();
        return super.getEstadoDaPorta(leEst);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-35", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");

        if (leVlanBanda != null) {
            cvlan = new Integer(leVlanBanda.get(1));
            p100 = new Integer(leVlanBanda.get(0));
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, p100);

        return vlanBanda;
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-36", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");

        if (leVlanBanda != null) {
            cvlan = new Integer(leVlanBanda.get(1));
            p100 = new Integer(leVlanBanda.get(0));
        }
        VlanVoip vlanVoip = new VlanVoip(cvlan, p100);

        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");

        if (leVlanBanda != null) {
            cvlan = new Integer(leVlanBanda.get(1));
            p100 = new Integer(leVlanBanda.get(0));
        }
        VlanVod vlanVod = new VlanVod(cvlan, p100);

        return vlanVod;
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getMult(i)).getRetorno();
        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-38", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Integer cvlan = new Integer("0");

        if (leVlanMult != null) {
            cvlan = new Integer(leVlanMult.get(0));
        }
        VlanMulticast vlanMult = new VlanMulticast();
        vlanMult.setCvlan(cvlan);

        return vlanMult;
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        List<String> leProfDown = this.getCd().consulta(this.getProfDown(i)).getRetorno();
        List<String> leProfUp = this.getCd().consulta(this.getProfUp(i)).getRetorno();

        Profile p = new Profile();
        BigInteger leDown = new BigInteger(TratativaRetornoUtil.tratZhone(leProfDown, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)).divide(new BigInteger("1000"));
        BigInteger leUp = new BigInteger(TratativaRetornoUtil.tratZhone(leProfUp, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)).divide(new BigInteger("1000"));
        p.setProfileDown(leDown.toString());
        p.setProfileUp(leUp.toString());

        return p;
    }

    @Override
    public Modulacao getModulacao(InventarioRede i) throws Exception {
        List<String> leModul = this.getCd().consulta(this.getModul(i)).getRetorno();
        Modulacao m = new Modulacao();
        String modulacao = TratativaRetornoUtil.tratZhone(leModul, "adslTransmissionMode", "\\{([^\\[\\]]+|(R))*\\}").get(0).replace("{", "").replace("}", "");
        m.setModulacao(modulacao);
        return m;
    }

    protected ComandoDslam getMult(InventarioRede i) {
        return new ComandoDslam("bridge show port 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl", 5000);
    }

    protected ComandoDslam getParams(InventarioRede i) {
        return new ComandoDslam("dslstat 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl", 5000, "a");
    }

    protected ComandoDslam getProfDown(InventarioRede i) {
        return new ComandoDslam("get adsl-co-profile 1/" + i.getSlot() + "/" + i.getPorta());
    }

    protected ComandoDslam getProfUp(InventarioRede i) {
        return new ComandoDslam("get adsl-cpe-profile 1/" + i.getSlot() + "/" + i.getPorta());
    }

    protected ComandoDslam getModul(InventarioRede i) {
        return new ComandoDslam("get adsl-profile 1/" + i.getSlot() + "/" + i.getPorta());
    }

}
