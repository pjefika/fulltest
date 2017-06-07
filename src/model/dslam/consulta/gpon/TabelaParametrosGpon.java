/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.gpon;

import dao.dslam.impl.AbstractDslam;
import model.dslam.consulta.TabelaParamAbstract;
import model.fulltest.validacao.Validador;

/**
 *
 * @author G0042204
 */
public class TabelaParametrosGpon extends TabelaParamAbstract implements Validador {

    private Double potOnt;

    private Double potOlt;

    public TabelaParametrosGpon() {
    }

    public Double getPotOnt() {
        return potOnt;
    }

    public void setPotOnt(Double potOnt) {
        this.potOnt = potOnt;
    }

    public Double getPotOlt() {
        return potOlt;
    }

    public void setPotOlt(Double potOlt) {
        this.potOlt = potOlt;
    }

    @Override
    public Boolean validar(AbstractDslam ds) {
        return (this.potOlt < -8 && this.potOlt > -25
                && this.potOnt < -8 && this.potOnt > -25);
    }

}
