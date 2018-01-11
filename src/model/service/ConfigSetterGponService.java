/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import fulltest.ValidacaoResult;
import java.util.List;
import telecom.properties.gpon.SerialOntGpon;

/**
 *
 * @author G0041775
 */
public interface ConfigSetterGponService {

    public List<SerialOntGpon> unsetterOntFromOlt() throws Exception;

    public ValidacaoResult setterOntToOlt(SerialOntGpon serial) throws Exception;

}
