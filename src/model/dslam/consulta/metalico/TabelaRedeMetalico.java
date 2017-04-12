/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.metalico;

import java.math.BigInteger;

public class TabelaRedeMetalico {

    private BigInteger pctDown, pctUp, crcDown, crcUp, fecDown, fecUp, resync;

    public BigInteger getResync() {
        return resync;
    }

    public void setResync(BigInteger resync) {
        this.resync = resync;
    }

    public BigInteger getPctDown() {
        return pctDown;
    }

    public void setPctDown(BigInteger pctDown) {
        this.pctDown = pctDown;
    }

    public BigInteger getPctUp() {
        return pctUp;
    }

    public void setPctUp(BigInteger pctUp) {
        this.pctUp = pctUp;
    }

    public BigInteger getCrcDown() {
        return crcDown;
    }

    public void setCrcDown(BigInteger crcDown) {
        this.crcDown = crcDown;
    }

    public BigInteger getCrcUp() {
        return crcUp;
    }

    public void setCrcUp(BigInteger crcUp) {
        this.crcUp = crcUp;
    }

    public BigInteger getFecDown() {
        return fecDown;
    }

    public void setFecDown(BigInteger fecDown) {
        this.fecDown = fecDown;
    }

    public BigInteger getFecUp() {
        return fecUp;
    }

    public void setFecUp(BigInteger fecUp) {
        this.fecUp = fecUp;
    }
}
