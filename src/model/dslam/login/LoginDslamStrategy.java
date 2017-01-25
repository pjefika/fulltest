/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.login;

import dao.dslam.ConsultaDslam;

/**
 *
 * @author G0042204
 */
public interface LoginDslamStrategy {

    public void conectar(ConsultaDslam cs);

}
