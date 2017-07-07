/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import model.dslam.consulta.Profile;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaParametrosMetalicoVdsl;
import model.dslam.velocidade.Velocidades;

/**
 *
 */
public class KeymileMetalicoSuvd11 extends KeymileMetalicoSuvdDslam {

    public KeymileMetalicoSuvd11(String ipDslam) {
        super(ipDslam);
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametrosIdeal(Velocidades v) throws Exception {
        return new TabelaParametrosMetalicoVdsl();
    }

    @Override
    public Profile castProfile(Velocidades v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
