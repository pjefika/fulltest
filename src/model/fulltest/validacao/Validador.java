/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.validacao;

import model.dslam.AbstractDslam;

/**
 *
 * @author G0041775
 */
public interface Validador {
    
    public Boolean validar(AbstractDslam ds);
    
}
