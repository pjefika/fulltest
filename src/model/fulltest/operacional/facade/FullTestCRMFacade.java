/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.fulltest.operacional.FullTest;
import model.fulltest.operacional.strategy.FactoryExecutionStrategy;
import model.validacao.factory.FactoryValidador;

/**
 *
 * @author G0042204
 */
public class FullTestCRMFacade extends FullTestGenericFacade implements FullTestInterface {

    @Override
    public FullTest executar(EfikaCustomer cl) throws Exception {
        super.exec(cl);
        return cast();
    }

    @Override
    void iniciar(EfikaCustomer e) throws Exception {
        super.iniciar(e);
        this.exec = FactoryExecutionStrategy.forced();
        this.setBateria(FactoryValidador.crm(dslam, cl));
    }

    @Override
    void validar() {
        super.validar();

        // Adaptação de Fraseologia
        getValids().forEach((t) -> {
            if (!t.getResultado()) {
                this.setResultado(Boolean.FALSE);
                this.setMensagem(t.getMensagem());
            }
        });
    }

}
