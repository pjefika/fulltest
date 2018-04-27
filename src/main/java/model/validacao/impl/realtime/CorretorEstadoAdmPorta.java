/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.exception.FalhaAoCorrigirException;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
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
    public ValidavelAbs getObject() {
        return ep;
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            ep = new EstadoDaPorta(Boolean.TRUE);
            ValidacaoEstadoPortaAdm v;
            v = new ValidacaoEstadoPortaAdm(alter.setEstadoDaPorta(cust.getRede(), ep), bundle.getLocale());

            v.validar();
            this.setValid(v);
        } catch (Exception e) {
            e.printStackTrace();
            throw new FalhaAoCorrigirException();
        }
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoEstadoPortaAdm(consulta.getEstadoDaPorta(cust.getRede()), bundle.getLocale());
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
