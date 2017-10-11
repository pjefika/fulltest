/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.ConsultaMetalicoDefault;
import java.util.Locale;

/**
 *
 * @author G0042204
 */
public abstract class ValidadorMetalico extends Validador {

    protected ConsultaMetalicoDefault metalico;

    public ValidadorMetalico(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    protected void iniciar() throws FuncIndisponivelDslamException {
        if (this.getDslam() instanceof ConsultaMetalicoDefault) {
            this.metalico = (ConsultaMetalicoDefault) this.getDslam();
        } else {
            throw new FuncIndisponivelDslamException();
        }
        super.iniciar(); //To change body of generated methods, choose Tools | Templates.
    }

}
