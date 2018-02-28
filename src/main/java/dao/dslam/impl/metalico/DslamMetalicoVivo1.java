/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico;

import dao.dslam.impl.login.LoginDslamStrategy;
import model.dslam.credencial.Credencial;

public abstract class DslamMetalicoVivo1 extends DslamMetalico {

    public DslamMetalicoVivo1(String ipDslam, Credencial credencial, LoginDslamStrategy loginStrategy) {
        super(ipDslam, credencial, loginStrategy);
        checkCredentials();
    }

    protected void checkCredentials() {
        if (getIpDslam() != null && getIpDslam().contains("MS")) {
            setCredencial(Credencial.VIVO1);
        }
    }

}
