/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.VlanVoip;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanVoip extends ValidacaoValidavel {
    
    private final transient VlanVoip vlan;
    
    public ValidacaoVlanVoip(VlanVoip v, EfikaCustomer cust) {
        super(cust, v);
        this.vlan = v;
    }
    
    @Override
    protected void processar() {
        if (getCust().getServicos().getIsSip()) {
            super.processar();
        } else {
            this.finalizar("Cliente sem VoIP.", Boolean.TRUE);
        }
    }
    
    @Override
    protected String frasePositiva() {
        return "Vlan de VoIP configurado corretamente.";
    }
    
    @Override
    protected String fraseNegativa() {
        return "Vlan de VoIP configurado incorretamente.";
    }
    
}
