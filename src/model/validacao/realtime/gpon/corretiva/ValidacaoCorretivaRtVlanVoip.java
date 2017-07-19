/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.ValidacaoVlanVoip;
import model.validacao.realtime.ValidacaoRealtimeCorretiveGpon;

/**
 *
 * @author G0042204
 */
public class ValidacaoCorretivaRtVlanVoip extends ValidacaoRealtimeCorretiveGpon {

    private ValidacaoVlanVoip valid;

    public ValidacaoCorretivaRtVlanVoip(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust, "Vlan VoIP");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoVlanVoip(cg.getVlanVoip(cust.getRede()), cust);
            if (valid.validar()) {
                merge(valid);
            } else {
                setResultado(Boolean.FALSE);
                alter.deleteVlanVoip(cust.getRede());
                valid = new ValidacaoVlanVoip(alter.createVlanVoip(cust.getRede()), cust);
                if(valid.validar()){
                    setMensagem("Efetuado correção de bridge, solicite ao cliente que reinicialize o modem e teste novamente.");
                }else{
                    setMensagem("Não foi possível corrigir o a bridge. Seguir o fluxo com o problema/sintoma informado pelo cliente.");
                }
            }
            return getResultado();
        } catch (Exception e) {
            return false;
        }
    }

}
