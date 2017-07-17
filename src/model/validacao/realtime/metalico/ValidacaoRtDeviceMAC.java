/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.ValidacaoDeviceMAC;
import model.validacao.realtime.ValidacaoRealtime;

/**
 *
 * @author G0042204
 */
public class ValidacaoRtDeviceMAC extends ValidacaoRealtime {

    private ValidacaoDeviceMAC valid;

    public ValidacaoRtDeviceMAC(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust, "Mac do Equipamento.");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoDeviceMAC(consulta.getDeviceMac(cust.getRede()), cust);
            valid.validar();
            this.merge(valid);
            return valid.getResultado();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
