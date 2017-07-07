/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaClienteInter;
import model.dslam.velocidade.Velocidades;
import model.validacao.ValidacaoProfile;
import model.validacao.realtime.gpon.ValidacaoRtProfile;

/**
 *
 * @author G0041775
 */
public class ValidacaoCorretivaRtProfile extends ValidacaoRtProfile {

    private ValidacaoProfile valid;

    public ValidacaoCorretivaRtProfile(ConsultaClienteInter dslam, EfikaCustomer cl) {
        super(dslam, cl);
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoProfile(consultaGpon.getProfile(cust.getRede()), cust);
            if(valid.validar()){
                this.merge(valid);
            }else{
                setResultado(Boolean.FALSE);
                alteracaoGpon.setProfileDown(cust.getRede(), Velocidades.valueOf("VEL_"+cust.getServicos().getVelDown().toString()));
                alteracaoGpon.setProfileUp(cust.getRede(), Velocidades.valueOf("VEL_"+cust.getServicos().getVelDown().toString()), Velocidades.valueOf("VEL_"+cust.getServicos().getVelUp().toString()));
                valid = new ValidacaoProfile(consultaGpon.getProfile(cust.getRede()), cust);
                if(valid.validar()){
                    setMensagem("Profile corrigido, solicite ao cliente que efetue um teste de velocidade.");
                }else{
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
