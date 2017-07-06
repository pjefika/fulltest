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
import model.validacao.realtime.ValidacaoRealtimeGpon;

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
                    setMensagem("Vlan de VoIP estava configurado incorretamente e foi corrigido, solicite a reinicialização do modem e execute o teste novamente.");
                }else{
                    setMensagem("Não foi possível corrigir o Vlan de VoIP.");
                }
            }
            return valid.getResultado();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
