/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import java.util.List;
import telecom.properties.Porta;
import telecom.properties.gpon.AlarmesGpon;
import telecom.properties.gpon.PortaPON;
import telecom.properties.gpon.SerialOntGpon;
import telecom.properties.gpon.TabelaParametrosGpon;


/**
 *
 * @author G0042204
 */
public interface ConsultaGponDefault extends ConsultaClienteInter {

    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception;

    public PortaPON getPortaPON(InventarioRede i) throws Exception;

    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception;

    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception;

    public List<SerialOntGpon> getSlotsAvailableOnts(InventarioRede i) throws Exception;

    public List<Porta> getEstadoPortasProximas(InventarioRede i) throws Exception;

}
