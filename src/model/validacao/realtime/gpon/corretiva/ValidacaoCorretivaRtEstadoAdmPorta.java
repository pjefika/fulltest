/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaGponDefault;
import model.validacao.ValidacaoEstadoPortaAdm;
import model.validacao.realtime.ValidacaoRealtimeGpon;
import model.validacao.realtime.gpon.ValidacaoRtEstadoAdmPorta;

/**
 *
 * @author G0042204
 */
public class ValidacaoCorretivaRtEstadoAdmPorta extends ValidacaoRtEstadoAdmPorta {

    private ValidacaoEstadoPortaAdm valid;

    public ValidacaoCorretivaRtEstadoAdmPorta(ConsultaGponDefault dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoEstadoPortaAdm(dslam.getEstadoDaPorta(cust.getRede()));
            if(valid.validar()){
                setResultado(Boolean.FALSE);
                setMensagem("A porta já estava em UP.");
            }else{
                
            }
            return valid.getResultado();
        } catch (Exception e) {
            return false;
        }
    }

}
