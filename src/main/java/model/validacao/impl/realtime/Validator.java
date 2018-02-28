/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;

/**
 *
 * @author G0042204
 */
public interface Validator {

    public ValidacaoResult validar() throws Exception;

    public ValidavelAbs getObject();

}
