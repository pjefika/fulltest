/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.zhone;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.ConsultaDslam;
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
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0042204
 */
public class ZhoneMetalicoMxkDslam extends ZhoneMetalicoDslam {

    public ZhoneMetalicoMxkDslam(String ipDslam) {
        super(ipDslam, Credencial.ZHONE, new LoginLento());
        this.setCd(new ConsultaDslam(this));

    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        List<String> leParams = this.getCd().consulta(this.getParams(i)).getRetorno();

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
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        List<String> leRedes = this.getCd().consulta(this.getParams(i)).getRetorno();
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
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        List<String> leEst = this.getCd().consulta(this.getParams(i)).getRetorno();
        return super.getEstadoDaPorta(leEst);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-35", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");

        if (leVlanBanda != null) {
            cvlan = new Integer(leVlanBanda.get(2));
            p100 = new Integer(leVlanBanda.get(1));
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, p100);

        return vlanBanda;
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        List<String> leVlanVoip = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-36", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");

        if (leVlanVoip != null) {
            cvlan = new Integer(leVlanVoip.get(2));
            p100 = new Integer(leVlanVoip.get(1));
        }
        VlanVoip vlanVoip = new VlanVoip(cvlan, p100);

        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        List<String> leVlanVod = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");

        if (leVlanVod != null) {
            cvlan = new Integer(leVlanVod.get(2));
            p100 = new Integer(leVlanVod.get(1));
        }
        VlanVod vlanVod = new VlanVod(cvlan, p100);

        return vlanVod;
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getMult(i)).getRetorno();
        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-38", "-?(\\d+((\\.|,| )\\d+)?)");
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
        p.setProfileDown(TratativaRetornoUtil.tratZhone(leProfDown, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0));
        p.setProfileUp(TratativaRetornoUtil.tratZhone(leProfUp, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0));

        return p;
    }

    @Override
    public Modulacao getModulacao(InventarioRede i) throws Exception {
        List<String> leModul = this.getCd().consulta(this.getModul(i)).getRetorno();
        Modulacao m = new Modulacao();
        String modulacao = TratativaRetornoUtil.tratZhone(leModul, "transmit-mode", "\\{([^\\[\\]]+|(R))*\\}").get(0).replace("{", "").replace("}", "");
        m.setModulacao(modulacao);
        return m;
    }

    protected ComandoDslam getMult(InventarioRede i) {
        return new ComandoDslam("bridge show port 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl", 5000);
    }

    protected ComandoDslam getParams(InventarioRede i) {
        return new ComandoDslam("dslstat 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl -v", 5000, "a");
    }

    protected ComandoDslam getProfDown(InventarioRede i) {
        return new ComandoDslam("get vdsl-co-config 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
    }

    protected ComandoDslam getProfUp(InventarioRede i) {
        return new ComandoDslam("get vdsl-cpe-config 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
    }

    protected ComandoDslam getModul(InventarioRede i) {
        return new ComandoDslam("get vdsl-config 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametrosIdeal(Velocidades v) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Modulacao setModulacao(InventarioRede i, Velocidades v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public Modulacao castModulacao(Velocidades v) {
        Modulacao m = new Modulacao();
        Boolean isAdsl = new Double(v.getVel()).compareTo(20d) <= 0;
        String leModul = isAdsl ? "adsl2plusmode" : "vdsl2mode";

        m.setModulacao(leModul);

        return m;
    }

    @Override
    public Profile castProfile(Velocidades v) {
        Profile p = new Profile();

        Integer leProfUp = Math.round(new Float(v.getVel()) * 1000);

        return p;
    }
}
