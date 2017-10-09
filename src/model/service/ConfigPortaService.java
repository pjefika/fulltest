/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import model.dslam.consulta.EstadoDaPorta;

/**
 *
 * @author G0042204
 */
public interface ConfigPortaService <T> {

    public T consultar() throws Exception;
    
    public EstadoDaPorta setterEstadoDaPorta(EstadoDaPorta est) throws Exception;

}
