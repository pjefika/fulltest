/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaClienteInter;
import dao.dslam.impl.ConsultaGponDefault;
import model.dslam.consulta.EstadoDaPorta;
import model.validacao.ValidacaoEstadoPortaAdm;
import model.validacao.realtime.gpon.ValidacaoRtEstadoAdmPorta;

/**
 *
 * @author G0042204
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
                setResultado(Boolean.FALSE);
                setMensagem("A porta já estava em UP.");
            }else{
                valid = new ValidacaoEstadoPortaAdm(alteracaoGpon.setEstadoDaPorta(cust.getRede(), eP));
                if(valid.validar()){
                    setResultado(Boolean.TRUE);
                    setMensagem("Estado da Porta alterado.");
                }else{
                    setResultado(Boolean.TRUE);
                    setMensagem("Não foi possível alterar o Estado da Porta.");
                }
            }
            return valid.getResultado();
        } catch (Exception e) {
            return false;
        }
    }

}
