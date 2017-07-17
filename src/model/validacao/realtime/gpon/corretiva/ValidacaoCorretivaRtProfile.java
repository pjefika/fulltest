/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.dslam.velocidade.Velocidades;
import model.validacao.ValidacaoProfile;
import model.validacao.realtime.ValidacaoRealtimeCorretiveGpon;

/**
 *
 * @author G0041775
 */
public class ValidacaoCorretivaRtProfile extends ValidacaoRealtimeCorretiveGpon {

    private ValidacaoProfile valid;

    public ValidacaoCorretivaRtProfile(AbstractDslam dslam, EfikaCustomer cl) {
        super(dslam, cl, "Estado Administrativo da Porta");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoProfile(cg.getProfile(cust.getRede()), cust);
            if (valid.validar()) {
                this.merge(valid);
            } else {
                setResultado(Boolean.FALSE);
                alter.setProfileDown(cust.getRede(), Velocidades.valueOf("VEL_" + cust.getServicos().getVelDown().toString()));
                alter.setProfileUp(cust.getRede(), Velocidades.valueOf("VEL_" + cust.getServicos().getVelDown().toString()), Velocidades.valueOf("VEL_" + cust.getServicos().getVelUp().toString()));
                valid = new ValidacaoProfile(cg.getProfile(cust.getRede()), cust);
                if (valid.validar()) {
                    setMensagem("Profile corrigido, solicite ao cliente que efetue um teste de velocidade.");
                } else {
                    setMensagem("Não foi possível corrigir o Profile, que está divergente do serviço contratado. Seguir o fluxo com o problema/sintoma informado pelo cliente.");
                }
            }
            return valid.getResultado();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

}
