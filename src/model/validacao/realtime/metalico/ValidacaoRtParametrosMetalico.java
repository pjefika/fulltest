/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaMetalicoDefault;
import model.dslam.velocidade.Velocidades;
import model.validacao.ValidacaoParametrosMetalico;
import model.validacao.realtime.ValidacaoRealtimeMetalico;

/**
 *
 * @author G0041775
 */
public class ValidacaoRtParametrosMetalico extends ValidacaoRealtimeMetalico {

    private ValidacaoParametrosMetalico valid;

    public ValidacaoRtParametrosMetalico(ConsultaMetalicoDefault dslam, EfikaCustomer cl) {
        super(dslam, cl, "Parâmetros Ópticos");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoParametrosMetalico(consultaMetalico.getTabelaParametros(cust.getRede()), consultaMetalico.getTabelaParametrosIdeal(Velocidades.valueOf("VEL_"+cust.getServicos().getVelDown())));
            valid.validar();
            this.merge(valid);
            return valid.getResultado();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

}
