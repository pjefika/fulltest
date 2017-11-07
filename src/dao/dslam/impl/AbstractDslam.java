/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import dao.dslam.factory.ConsultaDslamFactory;
import dao.dslam.impl.login.LoginDslamStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dslam.config.VelocidadeViewModel;
import model.dslam.config.velocidade.VelocidadeDTO;
import model.dslam.credencial.Credencial;
import model.dslam.velocidade.VelocidadeVendor;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0041775
 */
public abstract class AbstractDslam implements ConsultaClienteInter, VelocidadeViewModel {

    private final String ipDslam;
    private Credencial credencial;
    public LoginDslamStrategy loginStrategy;
    private Conector cd;
    protected List<VelocidadeVendor> velsDown, velsUp;

    public AbstractDslam(String ipDslam, Credencial credencial, LoginDslamStrategy loginStrategy) {
        this.ipDslam = ipDslam;
        this.credencial = credencial;
        this.loginStrategy = loginStrategy;
        this.cd = ConsultaDslamFactory.create(this);
        this.velsDown = new ArrayList<>();
        this.velsUp = new ArrayList<>();
    }

    public void conectar() throws Exception {
        this.loginStrategy.conectar(this.getCd());
    }

    @Override
    public void desconectar() {
        try {
            this.cd.close();
        } catch (Exception ex) {
            Logger.getLogger(AbstractDslam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<VelocidadeDTO> listarVelocidadesDown() {
        List<VelocidadeDTO> ar = new ArrayList<>();
        this.obterVelocidadesDownVendor().forEach((vd) -> {
            ar.add(new VelocidadeDTO(vd.getVel()));
        });
        return ar;
    }

    @Override
    public List<VelocidadeDTO> listarVelocidadesUp() {
        List<VelocidadeDTO> ar = new ArrayList<>();
        this.obterVelocidadesUpVendor().forEach((vd) -> {
            ar.add(new VelocidadeDTO(vd.getVel()));
        });
        return ar;
    }

    public abstract List<VelocidadeVendor> obterVelocidadesDownVendor();

    public abstract List<VelocidadeVendor> obterVelocidadesUpVendor();

    protected Velocidades compare(String sintaxVendor, Boolean isDown) {
        List<VelocidadeVendor> vels = isDown ? obterVelocidadesDownVendor() : obterVelocidadesUpVendor();
        for (VelocidadeVendor v : vels) {
            if (v.getSintaxVel().equalsIgnoreCase(sintaxVendor)) {
                return v.getVel();
            }
        }
        return null;
    }

    protected VelocidadeVendor compare(Velocidades vel, Boolean isDown) {
        List<VelocidadeVendor> vels = isDown ? obterVelocidadesDownVendor() : obterVelocidadesUpVendor();
        for (VelocidadeVendor v : vels) {
            if (v.getVel() == vel) {
                return v;
            }
        }
        return null;
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

    public Conector getCd() {
        return cd;
    }

    public void setCd(Conector cd) {
        this.cd = cd;
    }

}
