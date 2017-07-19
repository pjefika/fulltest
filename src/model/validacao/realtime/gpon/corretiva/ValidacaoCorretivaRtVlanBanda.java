/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.dslam.velocidade.Velocidades;
import model.validacao.ValidacaoVlanBanda;
import model.validacao.realtime.ValidacaoRealtimeCorretiveGpon;

/**
 *
 * @author G0042204
 */
public class ValidacaoCorretivaRtVlanBanda extends ValidacaoRealtimeCorretiveGpon {

    private ValidacaoVlanBanda valid;

    public ValidacaoCorretivaRtVlanBanda(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust, "Vlan Banda Larga");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoVlanBanda(cg.getVlanBanda(cust.getRede()), cust);
            if (valid.validar()) {
                merge(valid);
            } else {
                setResultado(Boolean.FALSE);
                alter.deleteVlanBanda(cust.getRede());
                valid = new ValidacaoVlanBanda(alter.createVlanBanda(cust.getRede(), Velocidades.valueOf("VEL_" + cust.getServicos().getVelDown()), Velocidades.valueOf("VEL_" + cust.getServicos().getVelUp())), cust);
                if (valid.validar()) {
                    setMensagem("Efetuado correção de bridge, solicite ao cliente que reinicialize o modem e teste novamente.");
                } else {
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
