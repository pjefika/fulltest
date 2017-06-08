/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico;

import java.math.BigInteger;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.ConsultaMetalicoDefault;

/**
 *
 * @author G0041775
 */
public abstract class DslamMetalico extends AbstractDslam
        implements
        ConsultaMetalicoDefault {

    private BigInteger slot;
    private BigInteger porta;
    private BigInteger sequencial;

    public void setSlot(BigInteger slot) {
        this.slot = slot;
    }

    public void setPorta(BigInteger porta) {
        this.porta = porta;
    }

    public void setSequencial(BigInteger sequencial) {
        this.sequencial = sequencial;
    }

    public BigInteger getSlot() {
        return this.slot;
    }

    public BigInteger getPorta() {
        return this.porta;
    }

    public BigInteger getSequencial() {
        return this.sequencial;
    }
}
