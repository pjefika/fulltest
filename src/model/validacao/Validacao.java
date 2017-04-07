/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import java.util.List;

/**
 *
 * @author G0042204
 */
public abstract class Validacao {
    
    private List<FalhaValidacao> falhas;

    public List<FalhaValidacao> getFalhas() {
        return falhas;
    }
  
}
