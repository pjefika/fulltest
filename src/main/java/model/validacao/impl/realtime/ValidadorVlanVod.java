/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaTv;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoFake;
import model.validacao.impl.both.ValidacaoVlanVod;

/**
 *
 * @author G0042204
 */
public class ValidadorVlanVod extends Validador {

    public ValidadorVlanVod(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
        nome = "Vlan de VoD";
    }

    @Override
    protected Validacao consultar() throws Exception {
        if (getCust().getServicos().getTipoTv() != null) {
            if (getCust().getServicos().getTipoTv() != TecnologiaTv.DTH) {
                return new ValidacaoVlanVod(consulta.getVlanVod(cust.getRede()), cust, bundle.getLocale());
            } else {
                return new ValidacaoFake(new VlanVod().getNome(), this.locale, "Cliente sem TV Híbrida/IPTV.", Boolean.TRUE);
            }
        } else {
            return new ValidacaoFake(new VlanVod().getNome(), this.locale, "Cliente sem TV.", Boolean.TRUE);
        }
    }
}
