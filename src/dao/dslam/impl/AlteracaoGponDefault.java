/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import java.util.List;
import model.dslam.consulta.gpon.SerialOntGpon;

/**
 *
 * @author G0042204
 */
public interface AlteracaoGponDefault extends AlteracaoClienteInter {

    public SerialOntGpon setOntToOlt(InventarioRede i, SerialOntGpon s) throws Exception;
    
    public void unsetOntFromOlt(InventarioRede i) throws Exception;
    
}
