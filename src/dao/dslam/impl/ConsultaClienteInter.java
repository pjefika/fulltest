/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import model.dslam.consulta.EstadoDaPorta;

/**
 *
 * @author G0042204
 */
public interface ConsultaClienteInter {

    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception;
    
    

}
