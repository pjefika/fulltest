/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.dslam.velocidade.Velocidades;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.metalico.ValidacaoParametrosMetalico;
import model.validacao.impl.realtime.ValidadorMetalico;

/**
 *
 * @author G0041775
 */
public class ValidadorParametrosMetalico extends ValidadorMetalico {

    public ValidadorParametrosMetalico(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoParametrosMetalico(metalico.getTabelaParametros(cust.getRede()), metalico.getTabelaParametrosIdeal(Velocidades.valueOf("VEL_" + cust.getServicos().getVelDown())), cust);
    }

}
