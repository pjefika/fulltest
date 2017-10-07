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
import model.dslam.consulta.EstadoDaPorta;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoEstadoPortaAdm;

/**
 *
 * @author G0041775
 */
public class CorretorEstadoAdmPorta extends Corretor {

    private EstadoDaPorta ep;

    public CorretorEstadoAdmPorta(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    public Object getObject() {
        return ep;
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            ep.setAdminState(Boolean.TRUE);
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
        return bundle.getString("correcaoEstadoAdm_ok");
    }

    @Override
    protected String fraseFalhaCorrecao() {
        return bundle.getString("correcaoEstadoAdm_nok");
    }

}
