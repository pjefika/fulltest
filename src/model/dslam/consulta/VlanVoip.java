/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import java.math.BigInteger;
import dao.dslam.impl.AbstractDslam;


/**
 *
 * @author G0041775
 */
public class VlanVoip extends VlanAbstract{

    public VlanVoip(BigInteger cvlan, BigInteger p100) {
        this.setCvlan(cvlan);
        this.setP100(p100);
    }
    
    @Override
    public Boolean validar(AbstractDslam ds) {
        return (this.getCvlan().equals(new BigInteger(ds.getVlanVoipe())) && this.getP100().equals(new BigInteger(ds.getP100())));
    }
}
