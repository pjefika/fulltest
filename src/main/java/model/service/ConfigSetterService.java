/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.config.ProfileConfig;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import java.util.List;

/**
 *
 * @author G0041775
 */
public interface ConfigSetterService {

    public ValidacaoResult setterEstadoDaPorta(EstadoDaPorta est) throws Exception;

    public ValidacaoResult corretorEstadoDaPorta() throws Exception;

    public ValidacaoResult corretorVlanBanda() throws Exception;

    public ValidacaoResult setterVlanBanda() throws Exception;

    public ValidacaoResult setterVlanVoip() throws Exception;

    public ValidacaoResult setterVlanVod() throws Exception;

    public ValidacaoResult setterVlanMulticast() throws Exception;

    public void resetIptvStatistics() throws Exception;

    public List<ValidacaoResult> getIptvVlans() throws Exception;

}
