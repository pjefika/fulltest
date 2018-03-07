/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.config.ProfileGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import java.util.List;

/**
 *
 * @author G0041775
 */
public interface ConfigSetterGponService extends ConfigSetterSpecific {

    public List<SerialOntGpon> unsetterOntFromOlt() throws Exception;

    public ValidacaoResult setterOntToOlt(SerialOntGpon serial) throws Exception;

    public ProfileGpon setterProfile(Profile p) throws Exception;

}
