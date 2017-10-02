/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.config;

import java.util.List;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.validacao.impl.both.ValidacaoResult;

/**
 *
 * @author G0042204
 */
public class ConfiguracaoOLT extends ConfiguracaoPorta {

    private ProfileGpon profile;

    private ValidacaoResult serial;

    private List<SerialOntGpon> serialDisp;

    private ValidacaoResult parametros;

    public ConfiguracaoOLT() {
    }

    public List<SerialOntGpon> getSerialDisp() {
        return serialDisp;
    }

    public void setSerialDisp(List<SerialOntGpon> serialDisp) {
        this.serialDisp = serialDisp;
    }

    public ProfileGpon getProfile() {
        return profile;
    }

    public void setProfile(ProfileGpon profile) {
        this.profile = profile;
    }

    public ValidacaoResult getSerial() {
        return serial;
    }

    public void setSerial(ValidacaoResult serial) {
        this.serial = serial;
    }

    public ValidacaoResult getParametros() {
        return parametros;
    }

    public void setParametros(ValidacaoResult parametros) {
        this.parametros = parametros;
    }

}
