/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import fulltest.ValidacaoResult;
import java.util.List;
import telecom.config.ProfileGpon;
import telecom.properties.EstadoDaPorta;
import telecom.properties.Profile;

/**
 *
 * @author G0041775
 */
public interface ConfigSetterService {

    public ValidacaoResult setterEstadoDaPorta(EstadoDaPorta est) throws Exception;

    public ProfileGpon setterProfile(Profile profile) throws Exception;

    public ValidacaoResult setterVlanBanda() throws Exception;

    public ValidacaoResult setterVlanVoip() throws Exception;

    public ValidacaoResult setterVlanVod() throws Exception;

    public ValidacaoResult setterVlanMulticast() throws Exception;

    public void resetIptvStatistics() throws Exception;

    public List<ValidacaoResult> getIptvVlans() throws Exception;

}
