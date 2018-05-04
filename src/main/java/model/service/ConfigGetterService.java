/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;

/**
 *
 * @author G0041775
 */
public interface ConfigGetterService {

    public Boolean isManageable() throws Exception;

    public ValidacaoResult validadorParametros() throws Exception;

}
