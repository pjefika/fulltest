/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.VlanVod;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanVod extends ValidacaoValidavel {
    
    private final transient VlanVod vlan;
    
    public ValidacaoVlanVod(VlanVod v, EfikaCustomer cust) {
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
        return "Vlan de VoD configurado corretamente.";
    }
    
    @Override
    protected String fraseNegativa() {
        return "Vlan de VoD configurado incorretamente.";
    }
    
}
