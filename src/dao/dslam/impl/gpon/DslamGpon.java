/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon;

import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.AlteracaoGponDefault;
import dao.dslam.impl.ConsultaGponDefault;
import dao.dslam.impl.login.LoginDslamStrategy;
import java.util.List;
import model.dslam.credencial.Credencial;
import model.dslam.velocidade.VelocidadeVendor;

public abstract class DslamGpon extends AbstractDslam
        implements
        ConsultaGponDefault, AlteracaoGponDefault {

    public DslamGpon(String ipDslam, Credencial credencial, LoginDslamStrategy loginStrategy) {
        super(ipDslam, credencial, loginStrategy);
    }

    @Override
    protected  List<VelocidadeVendor> obterVelocidadesUpVendor(){
        return null;
    }

    @Override
    protected  List<VelocidadeVendor> obterVelocidadesDownVendor(){
        return null;
    }

    

}
