/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0041775
 */
public interface ConsultaMetalicoDefault extends ConsultaClienteInter {

    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception;

    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception;

    public VlanBanda getVlanBanda(InventarioRede i) throws Exception;

    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception;

    public VlanVoip getVlanVoip(InventarioRede i) throws Exception;

    public VlanVod getVlanVod(InventarioRede i) throws Exception;

    public Profile getProfile(InventarioRede i) throws Exception;

    public Modulacao getModulacao(InventarioRede i) throws Exception;
    
    public TabelaParametrosMetalico getTabelaParametrosIdeal(Velocidades v) throws Exception;

}
