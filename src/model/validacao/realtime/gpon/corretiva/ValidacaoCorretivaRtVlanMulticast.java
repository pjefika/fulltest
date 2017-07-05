/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import model.validacao.realtime.gpon.*;
import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaGponDefault;
import exception.MetodoNaoImplementadoException;
import model.validacao.ValidacaoVlanMulticast;

/**
 *
 * @author G0042204
 */
public class ValidacaoCorretivaRtVlanMulticast extends ValidacaoRtVlanMulticast {

    private ValidacaoVlanMulticast valid;

    public ValidacaoCorretivaRtVlanMulticast(ConsultaGponDefault dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    public Boolean validar() throws Exception {
        try {
            if (cust.getServicos().getIsHib()) {
                valid = new ValidacaoVlanMulticast(consultaGpon.getVlanMulticast(cust.getRede()), cust);
                if (valid.validar()) {
                    this.merge(valid);
                } else {
                    setResultado(Boolean.FALSE);
                    alteracaoGpon.deleteVlanMulticast(cust.getRede());
                    valid = new ValidacaoVlanMulticast(alteracaoGpon.createVlanMulticast(cust.getRede()), cust);
                    if (valid.validar()) {
                        setMensagem("Vlan de Multicast estava configurado incorretamente e foi corrigido, solicite a reinicialização do modem e teste novamente.");
                    } else {
                        setMensagem("Não foi possível corrigir o Vlan de Multicast.");
                    }
                }

                return valid.getResultado();
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
