/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.InventarioRede;
import java.util.List;
import telecom.properties.metalico.Modulacao;
import telecom.properties.metalico.TabelaParametrosMetalico;
import telecom.properties.metalico.TabelaRedeMetalico;
import telecom.velocidade.Velocidades;

/**
 *
 * @author G0041775
 */
public interface ConsultaMetalicoDefault extends ConsultaClienteInter {

    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception;

    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception;

    public List<TabelaRedeMetalico> getHistoricoTabelaRede(InventarioRede i) throws Exception;

    public Modulacao getModulacao(InventarioRede i) throws Exception;

    public TabelaParametrosMetalico getTabelaParametrosIdeal(Velocidades v) throws Exception;

}
