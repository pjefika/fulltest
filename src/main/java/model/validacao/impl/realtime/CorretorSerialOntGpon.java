/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import dao.dslam.factory.exception.FalhaAoCorrigirException;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.realtime.gpon.ValidadorSerialOntGpon;

/**
 *
 * @author G0041775
 */
public class CorretorSerialOntGpon extends CorretorGpon {

    private SerialOntGpon serial;

    public CorretorSerialOntGpon(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    public ValidavelAbs getObject() {
        return serial;
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            this.ag.setOntToOlt(cust.getRede(), new SerialOntGpon(cust.getRede().getIdOnt()));
        } catch (Exception e) {
            throw new FalhaAoCorrigirException();
        }
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidadorSerialOntGpon(this.getDslam(), cust, bundle.getLocale()).getValid();
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
