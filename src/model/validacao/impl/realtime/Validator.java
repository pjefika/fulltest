/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import model.validacao.impl.both.ValidacaoResult;

/**
 *
 * @author G0042204
 */
public interface Validator {

    public ValidacaoResult validar() throws Exception;

    public Object getObject();

}
