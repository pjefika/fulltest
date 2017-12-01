/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.velocidade;

/**
 *
 * @author G0042204
 */
public class VelocidadeVendor {

    private Velocidades vel;

    private String sintaxVel;

    private String sintaxMod;

    private Modulacoes modul;

    public VelocidadeVendor(Velocidades vel, String sintaxVel, String sintaxMod) {
        this.vel = vel;
        this.sintaxVel = sintaxVel;
        this.sintaxMod = sintaxMod;
    }

    public VelocidadeVendor(Velocidades vel, String sintaxVel, String sintaxMod, Modulacoes modul) {
        this.vel = vel;
        this.sintaxVel = sintaxVel;
        this.sintaxMod = sintaxMod;
        this.modul = modul;
    }

    public VelocidadeVendor(Velocidades vel, String sintaxVel) {
        this.vel = vel;
        this.sintaxVel = sintaxVel;
    }

    public Velocidades getVel() {
        return vel;
    }

    public void setVel(Velocidades vel) {
        this.vel = vel;
    }

    public String getSintaxVel() {
        return sintaxVel;
    }

    public void setSintaxVel(String sintaxVel) {
        this.sintaxVel = sintaxVel;
    }

    public String getSintaxMod() {
        return sintaxMod;
    }

    public void setSintaxMod(String sintaxMod) {
        this.sintaxMod = sintaxMod;
    }

    public Modulacoes getModul() {
        return modul;
    }

    public void setModul(Modulacoes modul) {
        this.modul = modul;
    }

}
