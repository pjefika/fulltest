/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.exception.FalhaAoCorrigirException;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.gpon.ValidacaoAssociacaoOnt;

/**
 *
 * @author G0041775
 */
public class CorretorSerialOntGpon extends CorretorGpon {
    
    private SerialOntGpon serial;
    
    public CorretorSerialOntGpon(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
        nome = "Associação ONT à OLT";
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
            InventarioRede inv = cust.getRede();
            inv.setTerminal(cust.getInstancia());
            serial = this.ag.setOntToOlt(cust.getRede(), s1);
            getPreresults().add(serial);
            //fix so that the serial ValidacaoAssociacaoOnt receives doesn't have the same interacoes as the preresults
            
            ValidacaoAssociacaoOnt v = new ValidacaoAssociacaoOnt(serial, cust, bundle.getLocale());
            v.validar();
            if (!v.getResultado()) {
                v.setMensagem(bundle.getString("correcaoSerialOnt_nok"));
            } else {
                v.setMensagem(bundle.getString("correcaoSerialOnt_ok") + " " + v.getMensagem().split(" ")[v.getMensagem().split(" ").length - 1]);
            }
            
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
        String serialOuId = cust.getRede().getIdOnt() == null ? serial.getSerial() : serial.getIdOnt();
        return "Associado ONT:" + serialOuId + ".";
    }
    
    @Override
    protected String fraseFalhaCorrecao() {
        return "Não foi possível associar ONT.";
    }
    
}
