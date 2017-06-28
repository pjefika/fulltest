/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import model.dslam.consulta.Profile;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0041775
 */
public interface ProfileCasterInterface {
 
    public Profile castProfile(Velocidades v);
    
}
