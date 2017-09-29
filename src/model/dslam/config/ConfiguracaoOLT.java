/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.config;

import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;

/**
 *
 * @author G0042204
 */
public class ConfiguracaoOLT extends ConfiguracaoPorta {

    private ProfileGpon profile;

    private SerialOntGpon serial;

    private TabelaParametrosGpon parametros;

    public ConfiguracaoOLT() {
    }

    public SerialOntGpon getSerial() {
        return serial;
    }

    public void setSerial(SerialOntGpon serial) {
        this.serial = serial;
    }

    public TabelaParametrosGpon getParametros() {
        return parametros;
    }

    public void setParametros(TabelaParametrosGpon parametros) {
        this.parametros = parametros;
    }

    public ProfileGpon getProfile() {
        return profile;
    }

    public void setProfile(ProfileGpon profile) {
        this.profile = profile;
    }

}
