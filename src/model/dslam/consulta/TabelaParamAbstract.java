/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

/**
 *
 * @author G0042204
 */
public class TabelaParamAbstract {

    private Double velSincDown, velSincUp, velMaxDown, velMaxUp;

    public Double getVelSincDown() {
        return velSincDown;
    }

    public Boolean validar(TabelaParamAbstract t) {
        return this.velMaxDown >= t.getVelMaxDown()
                && this.velMaxUp >= t.getVelMaxUp()
                && this.velSincDown >= t.getVelSincDown()
                && this.velSincUp >= t.getVelSincUp();
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

}
