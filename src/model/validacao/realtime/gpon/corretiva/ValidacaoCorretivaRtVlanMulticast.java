/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import model.validacao.realtime.gpon.*;
import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.ConsultaGponDefault;
import exception.MetodoNaoImplementadoException;
import model.validacao.ValidacaoVlanMulticast;
import model.validacao.realtime.ValidacaoRealtimeCorretiveGpon;

/**
 *
 * @author G0042204
 */
public class ValidacaoCorretivaRtVlanMulticast extends ValidacaoRealtimeCorretiveGpon {

    private ValidacaoVlanMulticast valid;

    public ValidacaoCorretivaRtVlanMulticast(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust, "Vlan Multicast");
    }

    @Override
    public Boolean validar() throws Exception {
        try {
            if (cust.getServicos().getIsHib()) {
                valid = new ValidacaoVlanMulticast(cg.getVlanMulticast(cust.getRede()), cust);
                if (valid.validar()) {
                    this.merge(valid);
                } else {
                    setResultado(Boolean.FALSE);
                    alter.deleteVlanMulticast(cust.getRede());
                    valid = new ValidacaoVlanMulticast(alter.createVlanMulticast(cust.getRede()), cust);
                    if (valid.validar()) {
                        setMensagem("Efetuado correção de bridge, solicite ao cliente que reinicialize o modem e teste novamente.");
                    } else {
                        setMensagem("Não foi possível corrigir o a bridge. Seguir o fluxo com o problema/sintoma informado pelo cliente.");
                    }
                }

                return getResultado();
            } else {
                setMensagem("Cliente sem TV Híbrida.");
                setResultado(Boolean.TRUE);
                return getResultado();
            }

        } catch (MetodoNaoImplementadoException ex) {
            throw ex;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
