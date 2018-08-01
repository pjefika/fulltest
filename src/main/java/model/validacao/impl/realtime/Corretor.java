/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.exception.CorrecaoInterruptoraException;
import br.net.gvt.efika.fulltest.exception.FalhaAoCorrigirException;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.AlteracaoClienteInter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author G0042204
 */
public abstract class Corretor extends Validador {

    protected AlteracaoClienteInter alter;

    protected Validador validador;

    private List<ValidavelAbs> preresults;

    public Corretor(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    public ValidavelAbs getObject() {
        return validador.getObject();
    }

    @Override
    protected void iniciar() throws FuncIndisponivelDslamException {
        super.iniciar();
        if (this.getDslam() instanceof AlteracaoClienteInter) {
            this.alter = (AlteracaoClienteInter) this.getDslam();
        } else {
            throw new FuncIndisponivelDslamException();
        }
    }

    @Override
    public ValidacaoResult validar() throws Exception {
        try {
            iniciar();
            this.valid = consultar();
            processar();
            if (this.valid.getResultado()) {
                return new ValidacaoResult(valid.getNome(), valid.getMensagem(), valid.getResultado(), valid.getObject(), Boolean.FALSE);
            } else {
                getPreresults().add(valid.getObject());
                try {
                    corrigir();
                    return new ValidacaoResult(valid.getNome(), fraseCorrecaoOk(), Boolean.FALSE, valid.getObject(), Boolean.TRUE, getPreresults());
                } catch (FalhaAoCorrigirException e) {
                    return new ValidacaoResult(valid.getNome(), fraseFalhaCorrecao(), Boolean.FALSE, valid.getObject(), Boolean.FALSE, getPreresults());
                }
            }
        } catch (Exception ex) {
            if (ex instanceof CorrecaoInterruptoraException) {
                throw ex;
            }
            ex.printStackTrace();
            return null;
        }
    }

    public List<ValidavelAbs> getPreresults() {
        if (preresults == null) {
            preresults = new ArrayList<>();
        }
        return preresults;
    }

    public void setPreresults(List<ValidavelAbs> preresults) {
        this.preresults = preresults;
    }

    protected abstract void corrigir() throws FalhaAoCorrigirException;

    protected abstract String fraseCorrecaoOk();

    protected abstract String fraseFalhaCorrecao();

}
