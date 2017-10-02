/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import java.util.List;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.dslam.consulta.gpon.SerialOntDispGpon;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;

/**
 *
 * @author G0042204
 */
public interface ConsultaGponDefault extends ConsultaClienteInter {

    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception;

    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception;

    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception;

    public List<SerialOntDispGpon> getSlotsAvailableOnts(InventarioRede i) throws Exception;

}
