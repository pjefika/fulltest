/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.ConsultaGponDefault;
import dao.dslam.impl.login.LoginDslamStrategy;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;
import model.dslam.credencial.Credencial;

/**
 *
 * @author G0041775
 */
public abstract class DslamGpon extends AbstractDslam
        implements
        ConsultaGponDefault {

    public DslamGpon(String ipDslam, Credencial credencial, LoginDslamStrategy loginStrategy) {
        super(ipDslam, credencial, loginStrategy);
    }

    @Override
    public abstract TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception;

    @Override
    public abstract SerialOntGpon getSerialOnt(InventarioRede i) throws Exception;

    @Override
    public abstract VlanBanda getVlanBanda(InventarioRede i) throws Exception;

    @Override
    public abstract VlanVoip getVlanVoip(InventarioRede i) throws Exception;

    @Override
    public abstract VlanVod getVlanVod(InventarioRede i) throws Exception;

    @Override
    public abstract VlanMulticast getVlanMulticast(InventarioRede i) throws Exception;

    @Override
    public abstract AlarmesGpon getAlarmes(InventarioRede i) throws Exception;

    @Override
    public abstract Profile getProfile(InventarioRede i) throws Exception;

}
