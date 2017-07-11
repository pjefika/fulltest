/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import model.dslam.consulta.metalico.Modulacao;

/**
 *
 * @author G0041775
 */
public interface AlteracaoMetalicoDefault extends AlteracaoClienteInter {
    
    public Modulacao setModulacao(InventarioRede i, Modulacao m);
    
}
