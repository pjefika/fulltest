/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;

/**
 *
 * @author G0042204
 */
public class TabelaParametrosMetalico extends TabelaParametrosAbstract<TabelaParametrosMetalico> {

    private Double snrDown, snrUp, atnDown, atnUp;

    private Double velSincDown, velSincUp, velMaxDown, velMaxUp;

    public TabelaParametrosMetalico() {
    }

    @Override
    public Boolean validar(TabelaParametrosMetalico t) {
        return this.snrDown >= t.getSnrDown()
                && this.snrUp >= t.getSnrUp()
                && this.velSincDown >= t.getVelSincDown()
                && this.velSincUp >= t.getVelSincUp()
                && this.atnDown >= t.getAtnDown()
                && this.atnUp >= t.getAtnUp();
    }

    public Double getVelSincDown() {
        return velSincDown;
    }

    public void setVelSincDown(Double velSincDown) {
        this.velSincDown = velSincDown;
    }

    public Double getVelSincUp() {
        return velSincUp;
    }

    public void setVelSincUp(Double velSincUp) {
        this.velSincUp = velSincUp;
    }

    public Double getVelMaxDown() {
        return velMaxDown;
    }

    public void setVelMaxDown(Double velMaxDown) {
        this.velMaxDown = velMaxDown;
    }

    public Double getVelMaxUp() {
        return velMaxUp;
    }

    public void setVelMaxUp(Double velMaxUp) {
        this.velMaxUp = velMaxUp;
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
