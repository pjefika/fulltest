/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam;

import dao.dslam.Conector;
import dao.dslam.ConsultaDslam;
import java.io.IOException;
import model.dslam.consulta.ConsultaClienteInter;
import model.dslam.credencial.Credencial;
import dao.dslam.login.LoginDslamStrategy;
import model.produtos.ProdutoCliente;

/**
 *
 * @author G0041775
 */
public abstract class AbstractDslam implements Conector, ConsultaClienteInter {

    private String tecnologia;
    private String vendor;
    private String modelo;
    private String ipDslam;
    private String rin;
    private String p100;
    private String vlanVoipe;
    private String vlanVode;
    private String vlanMulticaste;
    private ProdutoCliente prod;

    private Credencial credencial;
    public LoginDslamStrategy loginStrategy;

    private ConsultaDslam cd;

    @Override
    public void conectar() {
        this.loginStrategy.conectar(this.getCd());
    }
    
    public void desconectar() throws IOException{
        this.cd.close();
    }

    public ProdutoCliente getProd() {
        return prod;
    }

    public void setProd(ProdutoCliente prod) {
        this.prod = prod;
    }

    public String getVlanVoipe() {
        return vlanVoipe;
    }

    public void setVlanVoipe(String vlanVoip) {
        this.vlanVoipe = vlanVoip;
    }

    public String getVlanVode() {
        return vlanVode;
    }

    public void setVlanVode(String vlanVod) {
        this.vlanVode = vlanVod;
    }

    public String getVlanMulticaste() {
        return vlanMulticaste;
    }

    public void setVlanMulticaste(String vlanMulticast) {
        this.vlanMulticaste = vlanMulticast;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setIpDslam(String ipDslam) {
        this.ipDslam = ipDslam;
    }

    public String getTecnologia() {
        return this.tecnologia;
    }

    public String getVendor() {
        return this.vendor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getIpDslam() {
        return this.ipDslam;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public LoginDslamStrategy getLoginStrategy() {
        return loginStrategy;
    }

    public void setLoginStrategy(LoginDslamStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public ConsultaDslam getCd() {
        return cd;
    }

    public void setCd(ConsultaDslam cd) {
        this.cd = cd;
    }

    public String getRin() {
        return rin;
    }

    public void setRin(String rin) {
        this.rin = rin;
    }

    public String getP100() {
        return p100;
    }

    public void setP100(String p100) {
        this.p100 = p100;
    }
}
