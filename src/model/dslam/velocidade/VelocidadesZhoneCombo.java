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
public enum VelocidadesZhoneCombo {

    AAOISDJ(Velocidades.VEL_1024, "128000");

    private Velocidades vel;

    private String sintax;

    private VelocidadesZhoneCombo(Velocidades vel, String sintax) {
        this.vel = vel;
        this.sintax = sintax;
    }

}
