/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import java.util.List;
import model.validacao.Validacao;

/**
 *
 * @author G0041775
 */
public interface FullTestInterface {
    
    public FullTest executar(List<Validacao> bateria) throws Exception;
    
}
