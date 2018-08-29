/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaLinha;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoFake;
import model.validacao.impl.both.ValidacaoVlanVoip;

/**
 *
 * @author G0042204
 */
public class ValidadorVlanVoip extends Validador {

    public ValidadorVlanVoip(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
        nome = "Vlan de VoIP";
    }

    @Override
    protected Validacao consultar() throws Exception {
        if (getCust().getServicos().getTipoLinha() == TecnologiaLinha.SIP) {
            return new ValidacaoVlanVoip(consulta.getVlanVoip(cust.getRede()), cust, bundle.getLocale());
        } else {
            return new ValidacaoFake(new VlanVoip().getNome(), this.locale, "Cliente sem VoIP.", Boolean.TRUE);
        }
    }

}
