/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import model.validacao.realtime.gpon.*;
import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaGponDefault;
import model.dslam.velocidade.Velocidades;
import model.validacao.ValidacaoVlanBanda;

/**
 *
 * @author G0042204
 */
public class ValidacaoCorretivaRtVlanBanda extends ValidacaoRtVlanBanda {

    private ValidacaoVlanBanda valid;

    public ValidacaoCorretivaRtVlanBanda(ConsultaGponDefault dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoVlanBanda(consultaGpon.getVlanBanda(cust.getRede()), cust);
            if (valid.validar()) {
                merge(valid);
            } else {
                setResultado(Boolean.FALSE);
                alteracaoGpon.deleteVlanBanda(cust.getRede());
                valid = new ValidacaoVlanBanda(alteracaoGpon.createVlanBanda(cust.getRede(), Velocidades.valueOf("VEL_" + cust.getServicos().getVelDown()), Velocidades.valueOf("VEL_" + cust.getServicos().getVelUp())), cust);
                if(valid.validar()){
                    setMensagem("Vlan de Banda estava configurado incorretamente e foi corrigido, solicite a reinicialização do modem e teste novamente.");
                }else{
                    setMensagem("Não foi possível corrigir o Vlan de Banda.");
                }
            }
            return valid.getResultado();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
