/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.fulltest.model.telecom.config.VelocidadeViewModel;
import br.net.gvt.efika.fulltest.model.telecom.config.velocidade.VelocidadeDTO;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Modulacoes;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.factory.ConsultaDslamFactory;
import dao.dslam.impl.login.LoginDslamStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dslam.credencial.Credencial;
import org.mongodb.morphia.annotations.Transient;

/**
 *
 * @author G0041775
 */
public abstract class AbstractDslam implements ConsultaClienteInter, VelocidadeViewModel {

    private final String ipDslam;
    private Credencial credencial;
    public LoginDslamStrategy loginStrategy;
    @Transient
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
        this.enableCommandsInDslam();
    }

    protected void enableCommandsInDslam() throws Exception {

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

    protected Velocidades compareV1Metalico(String sintaxVendor, Boolean isDown) {
        String wichone = isDown ? "D" : "U";
        String checkType = isDown ? "D_" : "U_";
        if (sintaxVendor.contains(checkType)) {
            String[] leprof = sintaxVendor.split("_");
            Double profVendor = 0d;

            for (int i = 0; i < leprof.length; i++) {
                if (leprof[i].contains(wichone)) {
                    try {
                    profVendor = new Double(leprof[i - 1]) / 1000;

                    } catch (Exception e) {
                        profVendor = new Double(leprof[i]) / 1000;
                    }

                    System.out.println("profVendor->" + profVendor);
                }
            }
            Velocidades[] vels = Velocidades.values();
            for (int i = 0; i < vels.length; i++) {
                Double leVel = new Double(vels[i].getValor());
                System.out.println("leVel->" + leVel);
                if (leVel.compareTo(profVendor) > 0) {
                    return vels[i - 1];
                }
            }
        } else {
            String[] leprof = sintaxVendor.replaceAll("[a-z]?[A-Z]", "").split("_");
            List<Integer> vals = new ArrayList<>();
            for (String string : leprof) {
                if (!string.isEmpty()) {
                    vals.add(new Integer(string));
                }
            }
            Collections.sort(vals);
            Integer qual = isDown ? vals.get(vals.size() - 1) : vals.get(vals.size() - 2);
            Double profVendor = new Double(qual) / 1000;
            System.out.println("profVendor->" + profVendor);
            Velocidades[] vels = Velocidades.values();
            for (int i = 0; i < vels.length; i++) {
                Double leVel = new Double(vels[i].getValor());
                System.out.println("leVel->" + leVel);
                if (leVel.compareTo(profVendor) > 0) {
                    return vels[i - 1];
                }
            }
        }

        return null;
    }

    protected Modulacoes compare(String sintaxVendor) {
        List<VelocidadeVendor> vels = obterVelocidadesDownVendor();
        for (VelocidadeVendor v : vels) {
            if (v.getSintaxMod().contains(sintaxVendor) || sintaxVendor.contains(v.getSintaxMod())) {
                return v.getModul();
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
