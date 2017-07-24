/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.FalhaAoCorrigirException;
import dao.dslam.impl.AbstractDslam;
import model.dslam.velocidade.Velocidades;
import model.validacao.impl.Validacao;
import model.validacao.impl.ValidacaoProfile;
import model.validacao.realtime.Corretor;

/**
 *
 * @author G0041775
 */
public class CorretorProfile extends Corretor {

    public CorretorProfile(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            alter.setProfileDown(cust.getRede(), Velocidades.valueOf("VEL_" + cust.getServicos().getVelDown().toString()));
            alter.setProfileUp(cust.getRede(), Velocidades.valueOf("VEL_" + cust.getServicos().getVelDown().toString()), Velocidades.valueOf("VEL_" + cust.getServicos().getVelUp().toString()));
        } catch (Exception ex) {
            throw new FalhaAoCorrigirException();
        }
    }

    @Override
    protected String fraseCorrecaoOk() {
        return "Profile corrigido, solicite ao cliente que efetue um teste de velocidade.";
    }

    @Override
    protected String fraseFalhaCorrecao() {
        return "Não foi possível corrigir o Profile, que está divergente do serviço contratado. Seguir o fluxo com o problema/sintoma informado pelo cliente.";
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoProfile(consulta.getProfile(cust.getRede()), cust);
    }

}
