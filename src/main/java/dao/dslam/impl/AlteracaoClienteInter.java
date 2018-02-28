/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;

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
