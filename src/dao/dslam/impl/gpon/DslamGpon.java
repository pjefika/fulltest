/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.AlteracaoGponDefault;
import dao.dslam.impl.ConsultaGponDefault;
import dao.dslam.impl.login.LoginDslamStrategy;
import model.dslam.credencial.Credencial;

public abstract class DslamGpon extends AbstractDslam
        implements
        ConsultaGponDefault, AlteracaoGponDefault {

    public DslamGpon(String ipDslam, Credencial credencial, LoginDslamStrategy loginStrategy) {
        super(ipDslam, credencial, loginStrategy);
    }

    @Override
    public void resetIptvStatistics(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

}
