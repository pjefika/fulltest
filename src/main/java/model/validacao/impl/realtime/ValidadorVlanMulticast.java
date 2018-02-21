/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaTv;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoFake;
import model.validacao.impl.both.ValidacaoVlanMulticast;

/**
 *
 * @author G0042204
 */
public class ValidadorVlanMulticast extends Validador {

    public ValidadorVlanMulticast(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    protected Validacao consultar() throws Exception {
        if (getCust().getServicos().getTipoTv() != null) {
            if (getCust().getServicos().getTipoTv() != TecnologiaTv.DTH) {
                return new ValidacaoVlanMulticast(consulta.getVlanMulticast(cust.getRede()), cust, bundle.getLocale());
            } else {
                return new ValidacaoFake(new VlanMulticast().getNome(), this.locale, "Cliente sem TV Híbrida/IPTV.", Boolean.TRUE);
            }
        } else {
            return new ValidacaoFake(new VlanMulticast().getNome(), this.locale, "Cliente sem TV.", Boolean.TRUE);
        }

    }

}
