/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.math.BigInteger;
import model.fulltest.validacao.Validador;

/**
 *
 * @author G0041775
 */
public abstract class VlanAbstract implements Validador {

    private BigInteger p100;

    private BigInteger cvlan;

    public VlanAbstract(BigInteger p100, BigInteger cvlan) {
        this.p100 = p100;
        this.cvlan = cvlan;
    }

    public BigInteger getP100() {
        return p100;
    }

    public void setP100(BigInteger p100) {
        this.p100 = p100;
    }

    public BigInteger getCvlan() {
        return cvlan;
    }

    public void setCvlan(BigInteger cvlan) {
        this.cvlan = cvlan;
    }

    @Override
    public abstract Boolean validar(EfikaCustomer e);

}
