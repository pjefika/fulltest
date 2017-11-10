/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.enums.TecnologiaTv;
import java.util.Locale;
import model.dslam.consulta.VlanMulticast;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanMulticast extends ValidacaoValidavel {

    private final transient VlanMulticast vlan;

    public ValidacaoVlanMulticast(VlanMulticast v, EfikaCustomer cust, Locale local) {
        super(cust, v, local);
        this.vlan = v;
    }

    @Override
    protected void processar() {

        if (getCust().getServicos().getTipoTv() != null) {
            if (getCust().getServicos().getTipoTv() != TecnologiaTv.DTH) {
                super.processar();
            } else {
                this.finalizar("Cliente sem TV Híbrida/IPTV.", Boolean.TRUE);
            }
        } else {
            this.finalizar("Cliente sem TV.", Boolean.TRUE);
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

