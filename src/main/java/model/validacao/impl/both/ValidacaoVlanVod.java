/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import java.util.Locale;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanVod extends ValidacaoValidavel {

    private final transient VlanVod vlan;

    public ValidacaoVlanVod(VlanVod v, EfikaCustomer cust, Locale local) {
        super(cust, v, local);
        this.vlan = v;
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
