/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaTv;
import br.net.gvt.efika.fulltest.exception.FalhaAoCorrigirException;
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
public class CorretorVlanVod extends Corretor {

    public CorretorVlanVod(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
        nome = "Vlan VoD";
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            getPreresults().add(alter.deleteVlanVod(cust.getRede()));
            try {
                valid = new ValidacaoVlanVod(alter.createVlanVod(cust.getRede()), cust, bundle.getLocale());
            } catch (Exception e) {
                throw new FalhaAoCorrigirException();
            }
        } catch (Exception e) {
            try {
                valid = new ValidacaoVlanVod(alter.createVlanVod(cust.getRede()), cust, bundle.getLocale());
            } catch (Exception ex) {
                throw new FalhaAoCorrigirException();
            }
        }
    }

    @Override
    protected String fraseCorrecaoOk() {
        return bundle.getString("correcaoVlan_ok");
    }

    @Override
    protected String fraseFalhaCorrecao() {
        return bundle.getString("correcaoVlan_nok");
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
