/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.properties.Porta;
import java.util.List;

/**
 *
 * @author G0041775
 */
public interface ConfigGetterGponService extends ConfigGetterService {

    public List<Porta> getterEstadoPortasProximas() throws Exception;

    public ValidacaoResult getterOntFromOlt() throws Exception;
}
