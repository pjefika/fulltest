/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.metalico.zhone;

import dao.dslam.telnet.ComandoDslam;
import dao.dslam.telnet.ConsultaDslam;
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
import model.dslam.login.LoginLento;
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
        
        tab.setVelSincDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslDownLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0))/100);
        tab.setVelSincUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslUpLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0))/100);
        tab.setSnrDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAturCurrLineSnrMgn", "-?(\\d+((\\.|,| )\\d+)?)").get(0))/10);
        tab.setSnrUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAtucCurrLineSnrMgn", "-?(\\d+((\\.|,| )\\d+)?)").get(0))/10);
        tab.setAtnDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAturCurrLineAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0))/10);
        tab.setAtnUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAtucCurrLineAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0))/10);
        
        return tab;
    }

    @Override
    public TabelaRedeMetalico getTabelaRede() throws Exception {
        List<String> leRedes = this.getCd().consulta(this.getParams()).getRetorno();
        TabelaRedeMetalico tab = new TabelaRedeMetalico();
        
        tab.setCrcDown(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "CRC errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tab.setCrcUp(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "CRC errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)));
        tab.setFecDown(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "FEC corrected errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tab.setFecUp(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "FEC corrected errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)));
        tab.setPctDown(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "In Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tab.setPctUp(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "Out Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        
        return tab;
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanBanda getVlanBanda() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanVoip getVlanVoip() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanVod getVlanVod() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanMulticast getVlanMulticast() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profile getProfile() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Modulacao getModulacao() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ComandoDslam getComandoConsultaVlan() {
        return new ComandoDslam("bridge show vlan " + this.getP100(), 5000);
    }

    public ComandoDslam getParams() {
        return new ComandoDslam("dslstat 1-" + this.getSlot() + "-" + this.getPorta() + "-0/adsl", 5000, "a");
    }


}
