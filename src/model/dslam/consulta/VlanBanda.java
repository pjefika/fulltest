/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.math.BigInteger;

/**
 *
 * @author G0041775
 */
public class VlanBanda extends VlanAbstract {
    
    public VlanBanda(BigInteger cvlan, BigInteger p100) {
        super(p100, cvlan);
    }
    
    @Override
    public Boolean validar(EfikaCustomer e) {
        
        BigInteger rin = new BigInteger(e.getRede().getRin().toString());
        Integer soma = e.getRede().getPorta() + 100;
        BigInteger p100 = new BigInteger(soma.toString());
        
        return this.getCvlan().equals(rin) && this.getP100().equals(p100);
    }
}
