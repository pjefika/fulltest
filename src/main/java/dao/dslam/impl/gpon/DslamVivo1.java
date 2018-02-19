/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon;

import dao.dslam.impl.login.LoginDslamStrategy;
import model.dslam.credencial.Credencial;

/**
 *
 * @author G0041775
 */
public abstract class DslamVivo1 extends DslamGpon {
    
    public DslamVivo1(String ipDslam, Credencial credencial, LoginDslamStrategy loginStrategy) {
        super(ipDslam, credencial, loginStrategy);
    }
    
}
