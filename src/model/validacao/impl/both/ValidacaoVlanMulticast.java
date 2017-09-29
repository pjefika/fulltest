/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.VlanMulticast;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanMulticast extends ValidacaoValidavel {
    
    private final transient VlanMulticast vlan;
    
    public ValidacaoVlanMulticast(VlanMulticast v, EfikaCustomer cust) {
        super(cust, v);
        this.vlan = v;
    }
    
    @Override
    protected void processar() {
        if (getCust().getServicos().getIsHib()) {
            super.processar();
        } else {
            this.finalizar("Cliente sem TV Híbrida.", Boolean.TRUE);
        }
    }
    
    @Override
    protected String frasePositiva() {
        return "Vlan de Multicast configurado corretamente.";
    }
    
    @Override
    protected String fraseNegativa() {
        return "Vlan de Multicast configurado incorretamente.";
    }
    
}
