/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import model.dslam.config.ProfileGpon;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.validacao.impl.both.ValidacaoResult;

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

}
