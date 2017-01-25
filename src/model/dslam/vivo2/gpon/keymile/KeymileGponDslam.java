/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.gpon.keymile;

import dao.dslam.ComandoDslam;
import model.dslam.consulta.TabelaParametrosGpon;
import model.dslam.credencial.Credencial;
import model.dslam.vivo2.gpon.DslamGpon;

/**
 *
 * @author G0042204
 */
public class KeymileGponDslam extends DslamGpon {

    public KeymileGponDslam() {
        this.setCredencial(Credencial.KEYMILE);
    }

    @Override
    public ComandoDslam getComandoTabelaParametros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(ComandoDslam cmd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
