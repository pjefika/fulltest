/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.metalico.zhone;

import dao.dslam.telnet.ComandoDslam;
import dao.dslam.telnet.ConsultaDslam;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.dslam.credencial.Credencial;
import model.dslam.login.LoginLento;
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

//    private BigInteger getL500(){
//        return this.getLogica().add(new BigInteger("500"));
//    }
//    private BigInteger getL700(){
//        return this.getLogica().add(new BigInteger("700"));
//    }
//    private BigInteger getL900(){
//        return this.getLogica().add(new BigInteger("900"));
//    }
//    private BigInteger getL1100(){
//        return this.getLogica().add(new BigInteger("1100"));
//    }
//    public ComandoDslam getComandoTabelaParametros() {
//        return new ComandoDslam("onu status "+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica(), 5000);
//    }
//
//    public ComandoDslam getComandoSerialOnt() {
//        return new ComandoDslam("onu inventory 1-"+this.getSlot()+"-"+this.getPorta()+"-"+this.getLogica(), 3000);
//    }
//
//    public ComandoDslam getComandoConsultaEstadoDaPorta() {
//        return new ComandoDslam("port show 1/"+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica()+"/gpononu", 5000); //To change body of generated methods, choose Tools | Templates.
//    }
    public ComandoDslam getComandoConsultaVlan() {
        return new ComandoDslam("bridge show vlan " + this.getP100(), 5000);
    }

//    public ComandoDslam getComandoConsultaVlanMulticast() {
//        return new ComandoDslam("bridge show port 1/"+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica()+"/gpononu", 45000);
//    }
//    public ComandoDslam getComandoConsultaAlarmes() {
//        return new ComandoDslam("onu alarms "+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica(), 5000);
//    }
//
//    public ComandoDslam getComandoConsultaProfileDown(){
//        return new ComandoDslam("get bridge-interface-record 1-"+this.getSlot()+"-"+this.getPorta()+"-"+this.getL500()+"-gponport-"+this.getP100()+"-"+this.getRin()+"/bridge", 3000);
//    }
//    public ComandoDslam getComandoConsultaProfileUp(){
//        return new ComandoDslam("onu gemports "+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica(), 3000);
//    }
    @Override
    public Cliente consultar(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TabelaRedeMetalico getTabelaRede() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
