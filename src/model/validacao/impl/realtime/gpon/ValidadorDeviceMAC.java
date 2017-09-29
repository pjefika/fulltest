/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoDeviceMAC;
import model.validacao.impl.realtime.Validador;

/**
 *
 * @author G0042204
 */
public class ValidadorDeviceMAC extends Validador {

    public ValidadorDeviceMAC(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoDeviceMAC(consulta.getDeviceMac(cust.getRede()), cust);
    }

}
