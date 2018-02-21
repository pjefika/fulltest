/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.Porta;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.AlarmesGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.PortaPON;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGpon;
import java.util.List;


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
