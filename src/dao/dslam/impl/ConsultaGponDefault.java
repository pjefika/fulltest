/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import java.util.List;
import model.dslam.consulta.DeviceMAC;
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
public interface ConsultaGponDefault extends ConsultaClienteInter {

    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception;

    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception;

    public VlanBanda getVlanBanda(InventarioRede i) throws Exception;

    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception;

    public VlanVoip getVlanVoip(InventarioRede i) throws Exception;

    public VlanVod getVlanVod(InventarioRede i) throws Exception;

    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception;

    public Profile getProfile(InventarioRede i) throws Exception;

    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception;

    public List<SerialOntGpon> getSlotsAvailableOnts(InventarioRede i) throws Exception;

}
