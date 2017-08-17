/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.produtos;

import model.validacao.impl.VelocidadeMinima;

/**
 *
 * @author G0041775
 */
public class ProdutoBanda {

    private String downCrm;
    private String upCrm;
    private VelocidadeMinima min;

    public VelocidadeMinima getMin() {
        return min;
    }
    
    public void setMin(){
        min = new VelocidadeMinima(downCrm, upCrm);
    }

    public String getDownCrm() {
        return downCrm;
    }

    public void setDownCrm(String downCrm) {
        this.downCrm = downCrm;
    }

    public String getUpCrm() {
        return upCrm;
    }

    public void setUpCrm(String upCrm) {
        this.upCrm = upCrm;
    }

}
