/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.fulltest.model.telecom.config.ProfileConfig;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;

/**
 *
 * @author G0041775
 */
public interface ConfigSetterMetalicoService extends ConfigSetterSpecific {

    public void resetTabelaRede() throws Exception;

    @Override
    public ProfileConfig setterProfile(Profile profile) throws Exception;

}
