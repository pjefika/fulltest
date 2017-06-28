/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0042204
 */
public interface AlteracaoClienteInter extends ConsultaClienteInter {

    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception;

    public Profile setProfileDown(InventarioRede i, Velocidades v) throws Exception;
    
    public Profile setProfileUp(InventarioRede i, Velocidades v) throws Exception;

    public VlanBanda createVlanBanda(InventarioRede i) throws Exception;

    public VlanVoip createVlanVoip(InventarioRede i) throws Exception;

    public VlanVod createVlanVod(InventarioRede i) throws Exception;

    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception;
    
    public void deleteVlanBanda(InventarioRede i) throws Exception;
    
    public void deleteVlanVoip(InventarioRede i) throws Exception;
    
    public void deleteVlanVod(InventarioRede i) throws Exception;
    
    public void deleteVlanMulticast(InventarioRede i) throws Exception;

    
    public void desconectar();

}
