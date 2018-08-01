/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.AlteracaoGponDefault;
import dao.dslam.impl.login.LoginDslamStrategy;
import model.dslam.credencial.Credencial;

public abstract class DslamGpon extends AbstractDslam
        implements
        AlteracaoGponDefault {

    public DslamGpon(String ipDslam, Credencial credencial, LoginDslamStrategy loginStrategy) {
        super(ipDslam, credencial, loginStrategy);
    }

    public void resetIptvStatistics(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

}
