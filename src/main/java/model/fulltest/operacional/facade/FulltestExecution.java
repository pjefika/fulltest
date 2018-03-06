/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;

/**
 *
 * @author G0042204
 */
public abstract class FulltestExecution {

    final void exec(EfikaCustomer cl) throws Exception {
        iniciar(cl);
        validar();
        encerrar();
    }

    abstract void iniciar(EfikaCustomer cl) throws Exception;

    abstract void validar() throws Exception;

    abstract void encerrar();

    protected abstract void encerramento();

}
