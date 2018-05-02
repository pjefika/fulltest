/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaTv;
import br.net.gvt.efika.fulltest.exception.FalhaAoCorrigirException;
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
public class CorretorVlanMulticast extends Corretor {

    public CorretorVlanMulticast(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            getPreresults().add(alter.deleteVlanMulticast(cust.getRede()));
            try {
                valid = new ValidacaoVlanMulticast(alter.createVlanMulticast(cust.getRede()), cust, bundle.getLocale());
            } catch (Exception e) {
                throw new FalhaAoCorrigirException();
            }
        } catch (Exception e) {
            try {
                valid = new ValidacaoVlanMulticast(alter.createVlanMulticast(cust.getRede()), cust, bundle.getLocale());
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
                return new ValidacaoVlanMulticast(consulta.getVlanMulticast(cust.getRede()), cust, bundle.getLocale());
            } else {
                return new ValidacaoFake(new VlanMulticast().getNome(), this.locale, "Cliente sem TV Híbrida/IPTV.", Boolean.TRUE);
            }
        } else {
            return new ValidacaoFake(new VlanMulticast().getNome(), this.locale, "Cliente sem TV.", Boolean.TRUE);
        }

    }

}
