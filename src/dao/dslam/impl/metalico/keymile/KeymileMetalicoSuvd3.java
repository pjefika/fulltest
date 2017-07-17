/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import br.net.gvt.efika.customer.InventarioRede;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaParametrosMetalicoVdsl;
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

        Boolean isAdsl = new Double(v.getVel()).compareTo(20d) <= 0;
        if (isAdsl) {
            TabelaParametrosMetalico t = new TabelaParametrosMetalico();
            t.setAtnDown(2d);
            t.setAtnUp(0d);
            t.setSnrDown(6d);
            t.setSnrUp(5d);
            return t;
        } else {
            TabelaParametrosMetalicoVdsl t = new TabelaParametrosMetalicoVdsl();
            t.setAtnDown(2d);
            t.setAtnDown1(7d);
            t.setAtnDown2(14d);
            t.setAtnUp(0d);
            t.setAtnUp1(4d);
            t.setAtnUp2(8d);
            t.setSnrDown(6d);
            t.setSnrDown1(5d);
            t.setSnrDown2(14d);
            t.setSnrUp(5d);
            t.setSnrUp1(5d);
            t.setSnrUp2(5d);
            return t;
        }

    }


}
