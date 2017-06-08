/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;

/**
 *
 * @author G0042204
 */
public interface ConsultaGponDefault extends ConsultaClienteInter{

    public SerialOntGpon getSerialOnt() throws Exception;

    public TabelaParametrosGpon getTabelaParametros() throws Exception;

    public VlanBanda getVlanBanda() throws Exception;

    public VlanMulticast getVlanMulticast() throws Exception;

    public VlanVoip getVlanVoip() throws Exception;

    public VlanVod getVlanVod() throws Exception;

    public AlarmesGpon getAlarmes() throws Exception;

    public Profile getProfile() throws Exception;

}
