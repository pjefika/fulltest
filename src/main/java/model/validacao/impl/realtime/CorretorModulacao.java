/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.exception.FalhaAoCorrigirException;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoModulacao;

/**
 *
 * @author G0041775
 */
public class CorretorModulacao extends CorretorMetalico {

    public CorretorModulacao(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            ValidacaoModulacao v = new ValidacaoModulacao(am.setModulacao(cust.getRede(), Velocidades.find(cust.getServicos().getVelDown())), cust, bundle.getLocale());
            v.validar();
            this.setValid(v);
        } catch (Exception ex) {
            throw new FalhaAoCorrigirException();
        }
    }

    @Override
    protected String fraseCorrecaoOk() {
        return bundle.getString("correcaoModulacao_ok");
    }

    @Override
    protected String fraseFalhaCorrecao() {
        return bundle.getString("correcaoModulacao_nok");
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoModulacao(cm.getModulacao(cust.getRede()), cust, bundle.getLocale());
    }

}
