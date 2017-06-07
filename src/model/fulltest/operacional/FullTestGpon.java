/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import java.util.List;
import model.dslam.consulta.gpon.ConsultaGponDefault;
import model.validacao.Validacao;

/**
 *
 * @author G0042204
 */
public class FullTestGpon {
    
    private ConsultaGponDefault c;
    
    private List<Validacao> bateria;
    
    public FullTestGpon(ConsultaGponDefault c) {
        this.c = c;
    }
    
    
    
}
