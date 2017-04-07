/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

/**
 *
 * @author G0042204
 */
public class FalhaValidacao {
    
    private String fraseologia;

    public FalhaValidacao(String fraseologia) {
        this.fraseologia = fraseologia;
    }

    public String getFraseologia() {
        return fraseologia;
    }

    public void setFraseologia(String fraseologia) {
        this.fraseologia = fraseologia;
    }

}
