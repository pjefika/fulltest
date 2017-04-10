/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.metalico;

import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.VlanBanda;

/**
 *
 * @author G0041775
 */
public interface ConsultaMetalicoDefault {

    public EstadoDaPorta getEstadoDaPorta() throws Exception;

    public TabelaParametrosMetalico getTabelaParametros() throws Exception;

    public TabelaRedeMetalico getTabelaRede() throws Exception;

    public VlanBanda getVlanBanda() throws Exception;
//
//    public VlanMulticast getVlanMulticast() throws Exception;
//
//    public VlanVoip getVlanVoip() throws Exception;
//
//    public VlanVod getVlanVod() throws Exception;
//
//    public AlarmesGpon getAlarmes() throws Exception;
//
//    public ProfileGpon getProfile() throws Exception;

}
