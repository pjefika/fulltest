/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.FalhaAoCorrigirException;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.dslam.velocidade.Velocidades;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoModulacao;
import model.validacao.impl.both.ValidacaoProfile;

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
            am.setModulacao(cust.getRede(), Velocidades.find(cust.getServicos().getVelDown()));
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
