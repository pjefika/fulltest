/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.OrigemPlanta;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0041775
 */
public class Profile extends ValidavelAbs implements Validavel {

    private String profileUp;

    private String profileDown;

    private Velocidades down, up;

    private static final String NOME = "Profile";

    public Profile() {
        super(NOME);
    }

    public String getProfileUp() {
        return profileUp;
    }

    public void setProfileUp(String profileUp) {
        this.profileUp = profileUp;
    }

    public String getProfileDown() {
        return profileDown;
    }

    public void setProfileDown(String profileDown) {
        this.profileDown = profileDown;
    }

    public Velocidades getDown() {
        return down;
    }

    public void setDown(Velocidades down) {
        this.down = down;
    }

    public Velocidades getUp() {
        return up;
    }

    public void setUp(Velocidades up) {
        this.up = up;
    }

    @Override
    public Boolean validar(EfikaCustomer ec) {
        return (down == Velocidades.find(ec.getServicos().getVelDown())
                && up == Velocidades.find(ec.getServicos().getVelUp()));
    }

}
