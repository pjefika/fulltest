/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import telecom.properties.EstadoDaPorta;
import telecom.properties.VlanBanda;
import telecom.properties.VlanMulticast;
import telecom.properties.VlanVod;
import telecom.properties.VlanVoip;
import telecom.velocidade.Velocidades;

/**
 *
 * @author G0042204
 */
public interface AlteracaoClienteInter extends ConsultaClienteInter {

    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception;

    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception;

    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception;

    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception;

    public VlanVoip createVlanVoip(InventarioRede i) throws Exception;

    public VlanVod createVlanVod(InventarioRede i) throws Exception;

    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception;

    public void deleteVlanBanda(InventarioRede i) throws Exception;

    public void deleteVlanVoip(InventarioRede i) throws Exception;

    public void deleteVlanVod(InventarioRede i) throws Exception;

    public void deleteVlanMulticast(InventarioRede i) throws Exception;

    public void resetIptvStatistics(InventarioRede i) throws Exception;

    public void desconectar();

}
