/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.FalhaAoCorrigirException;
import dao.dslam.impl.AbstractDslam;
import model.dslam.consulta.EstadoDaPorta;
import model.validacao.impl.Validacao;
import model.validacao.impl.ValidacaoEstadoPortaAdm;
import model.validacao.realtime.Corretor;

/**
 *
 * @author G0041775
 */
public class CorretorEstadoAdmPorta extends Corretor {

    private EstadoDaPorta ep;

    public CorretorEstadoAdmPorta(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException{
        try {
            ValidacaoEstadoPortaAdm v = new ValidacaoEstadoPortaAdm(alter.setEstadoDaPorta(cust.getRede(), ep));
            v.validar();
            this.setValid(v);
        } catch (Exception e) {
            throw new FalhaAoCorrigirException();
        }
    }

    @Override
    protected Validacao consultar() throws Exception {
        ep = consulta.getEstadoDaPorta(cust.getRede());
        return new ValidacaoEstadoPortaAdm(ep);
    }

    @Override
    protected String fraseCorrecaoOk() {
        return "Corrigido estado da porta, aguarde 3 minutos para estabilização do modem e teste novamente.";
    }

    @Override
    protected String fraseFalhaCorrecao() {
        return "Não foi possível corrigir o estado da porta. Seguir o fluxo com o problema/sintoma informado pelo cliente.";
    }

}
