/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.ReConexao;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;


/**
 *
 * @author G0042204
 */
public interface ConsultaClienteInter {

    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception;

    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception;

    public Profile getProfile(InventarioRede i) throws Exception;

    public VlanBanda getVlanBanda(InventarioRede i) throws Exception;

    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception;

    public VlanVoip getVlanVoip(InventarioRede i) throws Exception;

    public VlanVod getVlanVod(InventarioRede i) throws Exception;

    public ReConexao getReconexoes(InventarioRede i) throws Exception;

    public void desconectar();

}
