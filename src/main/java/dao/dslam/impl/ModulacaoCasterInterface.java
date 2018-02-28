/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.Modulacao;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;

/**
 *
 * @author G0041775
 */
public interface ModulacaoCasterInterface {

    public Modulacao castModulacao(Velocidades v);

}
