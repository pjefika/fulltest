/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaClienteInter;
import model.dslam.consulta.EstadoDaPorta;
import model.validacao.ValidacaoEstadoPortaAdm;
import model.validacao.realtime.gpon.ValidacaoRtEstadoAdmPorta;

/**
 *
 * @author G0041775
 */
public class ValidacaoCorretivaRtEstadoAdmPorta extends ValidacaoRtEstadoAdmPorta {

    private ValidacaoEstadoPortaAdm valid;

    public ValidacaoCorretivaRtEstadoAdmPorta(ConsultaClienteInter dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    public Boolean validar() {
        try {
            EstadoDaPorta eP = consultaGpon.getEstadoDaPorta(cust.getRede());
            valid = new ValidacaoEstadoPortaAdm(eP);
            if(valid.validar()){
                merge(valid);
            }else{
                valid = new ValidacaoEstadoPortaAdm(alteracaoGpon.setEstadoDaPorta(cust.getRede(), eP));
                if(valid.validar()){
                    setResultado(Boolean.FALSE);
                    setMensagem("A porta estava desativada e foi ativada com sucesso, aguarde alguns instantes e teste novamente.");
                }else{
                    setResultado(Boolean.FALSE);
                    setMensagem("Não foi possível ativar a Porta.");
                }
            }
            return valid.getResultado();
        } catch (Exception e) {
            return false;
        }
    }

}
