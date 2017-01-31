/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import model.dslam.AbstractDslam;
import model.fulltest.validacao.Validador;

/**
 *
 * @author G0041775
 */
public class ProfileGpon implements Validador {
    
    private String profileUp;
    
    private String profileDown;

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

    @Override
    public Boolean validar(AbstractDslam ds) {
        return (!this.profileDown.isEmpty() && !this.profileUp.isEmpty());
    }
    
}
