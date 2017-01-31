/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import java.math.BigInteger;
import model.dslam.AbstractDslam;
import model.fulltest.validacao.Validador;

/**
 *
 * @author G0041775
 */
public class VlanMulticast implements Validador{
    private BigInteger cvlan;

    public BigInteger getCvlan() {
        return cvlan;
    }

    public void setCvlan(BigInteger cvlan) {
        this.cvlan = cvlan;
    }

    @Override
    public Boolean validar(AbstractDslam ds) {
        return this.cvlan.equals(ds.getVlanMulticaste());
    }
    
    
}
