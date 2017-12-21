/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.filter;

import model.validacao.impl.both.ValidacaoResult;

/**
 *
 * @author G0042204
 */
public class ValidacaoResultResultFalseFilter extends AbstractFilter<ValidacaoResult>{

    @Override
    protected boolean criteria(ValidacaoResult param) {
        return !param.getResultado();
    }
    
}
