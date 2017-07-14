/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import model.validacao.realtime.gpon.*;
import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaGponDefault;
import model.validacao.ValidacaoVlanVoip;

/**
 *
 * @author G0042204
 */
public class ValidacaoCorretivaRtVlanVoip extends ValidacaoRtVlanVoip {

    private ValidacaoVlanVoip valid;

    public ValidacaoCorretivaRtVlanVoip(ConsultaGponDefault dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoVlanVoip(consultaGpon.getVlanVoip(cust.getRede()), cust);
            if (valid.validar()) {
                merge(valid);
            } else {
                setResultado(Boolean.FALSE);
                alteracaoGpon.deleteVlanVoip(cust.getRede());
                valid = new ValidacaoVlanVoip(alteracaoGpon.createVlanVoip(cust.getRede()), cust);
                if(valid.validar()){
                    setMensagem("Efetuado correção de bridge, solicite ao cliente que reinicialize o modem e teste novamente.");
                }else{
                    setMensagem("Não foi possível corrigir o a bridge. Seguir o fluxo com o problema/sintoma informado pelo cliente.");
                }
            }
            return getResultado();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
