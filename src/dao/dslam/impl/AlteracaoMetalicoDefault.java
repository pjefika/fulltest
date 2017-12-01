/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0041775
 */
public interface AlteracaoMetalicoDefault extends AlteracaoClienteInter {
    
    public Modulacao setModulacao(InventarioRede i, Velocidades v) throws Exception;
    
    public void resetTabelaRede(InventarioRede i) throws Exception;
    
}
