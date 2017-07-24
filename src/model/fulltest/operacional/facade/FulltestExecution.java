/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.DslamNaoImplException;

/**
 *
 * @author G0042204
 */
public abstract class FulltestExecution {

    final void exec(EfikaCustomer cl) throws Exception {
        try {
            iniciar(cl);
            validar();
            encerrar();
        } catch (DslamNaoImplException e) {
            throw e;
        }
    }

    abstract void iniciar(EfikaCustomer cl) throws Exception;

    abstract void validar();

    abstract void encerrar();

    protected abstract void encerramento();

}
