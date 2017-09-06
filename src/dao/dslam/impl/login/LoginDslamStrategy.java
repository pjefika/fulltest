/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.login;

import dao.dslam.impl.ConsultaDslam;

/**
 *
 * @author G0042204
 */
public interface LoginDslamStrategy {

    public void conectar(ConsultaDslam cs) throws Exception;

}
