/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import dao.dslam.factory.exception.FalhaAoCorrigirException;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.gpon.ValidacaoAssociacaoOnt;
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
            SerialOntGpon s1 = new SerialOntGpon();
            s1.setIdOnt(cust.getRede().getIdOnt());
            this.ag.setOntToOlt(cust.getRede(), s1);
            ValidacaoAssociacaoOnt v = (ValidacaoAssociacaoOnt) this.consultar();
            v.validar();
            this.setValid(v);
        } catch (Exception e) {
            throw new FalhaAoCorrigirException();
        }
    }
    
    @Override
    protected Validacao consultar() throws Exception {
        serial = this.ag.getSerialOnt(cust.getRede());
        return new ValidacaoAssociacaoOnt(serial, cust, bundle.getLocale());
    }
    
    @Override
    protected String fraseCorrecaoOk() {
        return bundle.getString("validacaoSerialOnt_ok") + serial.getSerial() + ".";
    }
    
    @Override
    protected String fraseFalhaCorrecao() {
        return bundle.getString("validacaoSerialOnt_nok");
    }
    
}
