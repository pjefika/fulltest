/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.config.velocidade;

import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0042204
 */
public class VelocidadeDTO {

    private Velocidades vel;

    private String desc;

    public VelocidadeDTO(Velocidades vel) {
        this.vel = vel;
        this.desc = vel.getValor().concat(" Mbps");
    }

    public Velocidades getVel() {
        return vel;
    }

    public void setVel(Velocidades vel) {
        this.vel = vel;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
