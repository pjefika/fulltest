/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.ConsultaGponDefault;

/**
 *
 * @author G0042204
 */
public abstract class ValidadorGpon extends Validador {

    protected ConsultaGponDefault cg;

    public ValidadorGpon(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    protected void iniciar() throws FuncIndisponivelDslamException {
        if (this.getDslam() instanceof ConsultaGponDefault) {
            this.cg = (ConsultaGponDefault) this.getDslam();
        } else {
            throw new FuncIndisponivelDslamException();
        }
        super.iniciar();
    }

}
