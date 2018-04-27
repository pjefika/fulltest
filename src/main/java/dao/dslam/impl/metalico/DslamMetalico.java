/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.AlteracaoMetalicoDefault;
import dao.dslam.impl.ConsultaMetalicoDefault;
import dao.dslam.impl.login.LoginDslamStrategy;
import model.dslam.credencial.Credencial;

/**
 *
 * @author G0041775
 */
public abstract class DslamMetalico extends AbstractDslam
        implements
        ConsultaMetalicoDefault, AlteracaoMetalicoDefault {

    public DslamMetalico(String ipDslam, Credencial credencial, LoginDslamStrategy loginStrategy) {
        super(ipDslam, credencial, loginStrategy);
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public void resetIptvStatistics(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

}
