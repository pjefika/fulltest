/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import model.dslam.consulta.DeviceMAC;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.ReConexao;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;

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
