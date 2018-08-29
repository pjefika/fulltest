/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.exception.FalhaAoCorrigirException;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaRedeMetalico;
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
        nome = "Confiabilidade de Rede";
    }

    private transient String fraseOk = "Perda de pacotes acima do aceitável, tabela de rede resetada. Consulte a confiabilidade da rede após a execução de um teste de velocidade.";
    private transient String fraseNok = "Não foi possível resetar a Tabela de Rede.";

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            ValidacaoTabelaRede atual = (ValidacaoTabelaRede) this.getValid();
            TabelaRedeMetalico tab = (TabelaRedeMetalico) atual.getObject();
            if (tab.isPctSuficiente()) {
                getPreresults().add(am.resetTabelaRede(cust.getRede()));
                ValidacaoTabelaRede v = (ValidacaoTabelaRede) this.consultar();
                v.validar();
                this.setValid(v);
            }else{
                fraseOk = atual.getMensagem();
            }
        } catch (Exception ex) {
            throw new FalhaAoCorrigirException();
        }
    }

    @Override
    protected String fraseCorrecaoOk() {
        return fraseOk;
    }

    @Override
    protected String fraseFalhaCorrecao() {
        return fraseNok;
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoTabelaRede(cm.getTabelaRede(cust.getRede()), cust, bundle.getLocale());
    }

}
