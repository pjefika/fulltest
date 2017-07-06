/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import model.dslam.consulta.Profile;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0041775
 */
public class KeymileMetalicoSuvd3 extends KeymileMetalicoSuvdDslam {

    public KeymileMetalicoSuvd3(String ipDslam) {
        super(ipDslam);
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametrosIdeal(Velocidades v) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profile castProfile(Velocidades v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
