/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import model.validacao.impl.both.ValidacaoResult;

/**
 *
 * @author G0041775
 */
public interface ConfigGetterMetalicoService extends ConfigGetterService{
    
    public ValidacaoResult getterTabelaRede() throws Exception;
    
}
