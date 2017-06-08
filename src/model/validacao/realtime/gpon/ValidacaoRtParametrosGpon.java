/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import dao.dslam.impl.ConsultaGponDefault;
import model.validacao.ValidacaoParametrosGpon;
import model.validacao.realtime.ValidacaoRealtimeAbs1;

/**
 *
 * @author G0041775
 */
public class ValidacaoRtParametrosGpon extends ValidacaoRealtimeAbs1 {

    private ValidacaoParametrosGpon valid;
    
    public ValidacaoRtParametrosGpon(ConsultaGponDefault cgd){
       super(cgd);
    }
    
    
    @Override
    public Boolean validar() {
        
        try {
            valid = new ValidacaoParametrosGpon(cg.getTabelaParametros());
            return valid.validar();
        } catch (Exception e) {
        }
        
        return false;
    }
    
}
