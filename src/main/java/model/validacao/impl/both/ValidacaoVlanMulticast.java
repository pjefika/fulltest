/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaTv;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanAbstract;
import java.util.Locale;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanMulticast extends ValidacaoValidavel {

    public ValidacaoVlanMulticast(VlanAbstract v, EfikaCustomer cust, Locale local) {
        super(cust, v, local);
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
        return bundle.getString("validacaoVlan_ok");
    }

    @Override
    protected String fraseNegativa() {
        return bundle.getString("validacaoVlan_nok"); 
    }

}
