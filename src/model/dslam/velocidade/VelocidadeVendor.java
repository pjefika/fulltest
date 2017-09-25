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

    private String sintax;

    public VelocidadeVendor(Velocidades vel, String sintax) {
        this.vel = vel;
        this.sintax = sintax;
    }

    public Velocidades getVel() {
        return vel;
    }

    public void setVel(Velocidades vel) {
        this.vel = vel;
    }

    public String getSintax() {
        return sintax;
    }

    public void setSintax(String sintax) {
        this.sintax = sintax;
    }

}
