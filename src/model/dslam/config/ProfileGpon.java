/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.config;

import java.util.List;
import model.dslam.config.velocidade.VelocidadeDTO;
import model.dslam.consulta.Profile;

/**
 *
 * @author G0042204
 */
public class ProfileGpon {

    private Profile atual;

    private List<VelocidadeDTO> downValues;

    private List<VelocidadeDTO> upValues;

    public ProfileGpon() {
    }

    public Profile getAtual() {
        return atual;
    }

    public void setAtual(Profile atual) {
        this.atual = atual;
    }

    public List<VelocidadeDTO> getDownValues() {
        return downValues;
    }

    public void setDownValues(List<VelocidadeDTO> downValues) {
        this.downValues = downValues;
    }

    public List<VelocidadeDTO> getUpValues() {
        return upValues;
    }

    public void setUpValues(List<VelocidadeDTO> upValues) {
        this.upValues = upValues;
    }

}
