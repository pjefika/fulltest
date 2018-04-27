/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.ConsultaGponDefault;
import java.util.Locale;

/**
 *
 * @author G0042204
 */
public abstract class ValidadorGpon extends Validador {

    protected ConsultaGponDefault cg;

    public ValidadorGpon(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
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
