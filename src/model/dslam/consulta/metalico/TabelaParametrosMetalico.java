/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.metalico;

import model.dslam.consulta.TabelaParamAbstract;

/**
 *
 * @author G0042204
 */
public class TabelaParametrosMetalico extends TabelaParamAbstract {

    private Double snrDown, snrUp, atnDown, atnUp;

    public TabelaParametrosMetalico() {
    }

    public Boolean validar(TabelaParametrosMetalico t) {
        return this.snrDown >= t.getSnrDown()
                && this.snrUp >= t.getSnrUp()
                && this.atnDown >= t.getAtnDown()
                && this.atnUp >= t.getAtnUp()
                && super.validar(t);
    }

    public Double getSnrDown() {
        return snrDown;
    }

    public void setSnrDown(Double snrDown) {
        this.snrDown = snrDown;
    }

    public Double getSnrUp() {
        return snrUp;
    }

    public void setSnrUp(Double snrUp) {
        this.snrUp = snrUp;
    }

    public Double getAtnDown() {
        return atnDown;
    }

    public void setAtnDown(Double atnDown) {
        this.atnDown = atnDown;
    }

    public Double getAtnUp() {
        return atnUp;
    }

    public void setAtnUp(Double atnUp) {
        this.atnUp = atnUp;
    }
}
