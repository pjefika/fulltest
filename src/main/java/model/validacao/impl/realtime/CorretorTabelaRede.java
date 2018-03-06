/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import dao.dslam.factory.exception.FalhaAoCorrigirException;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoTabelaRede;

/**
 *
 * @author G0041775
 */
public class CorretorTabelaRede extends CorretorMetalico {

    public CorretorTabelaRede(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            am.resetTabelaRede(cust.getRede());
        } catch (Exception ex) {
            throw new FalhaAoCorrigirException();
        }
    }

    @Override
    protected String fraseCorrecaoOk() {
        return "Tabela de Rede resetada. Consulte a confiabilidade da rede após a execução de um teste de velocidade.";
    }

    @Override
    protected String fraseFalhaCorrecao() {
        return "Não foi possível resetar a Tabela de Rede.";
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoTabelaRede(cm.getTabelaRede(cust.getRede()), cust, bundle.getLocale());
    }

}