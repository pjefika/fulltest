/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanAbstract;
import java.util.Locale;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanMulticastComPacotes extends ValidacaoPacotesVlan {

    public ValidacaoVlanMulticastComPacotes(VlanAbstract v, EfikaCustomer cust, Locale local) {
        super(v, cust, local);
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
