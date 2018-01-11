/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import dao.dslam.impl.retorno.TratativaRetornoUtil;
import telecom.properties.metalico.TabelaParametrosMetalico;
import telecom.properties.metalico.TabelaParametrosMetalicoVdsl;
import telecom.velocidade.Velocidades;

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
            t.setAtnDown(0d);
            t.setAtnUp(0d);
            t.setSnrDown(6d);
            t.setSnrUp(5d);
            t.setVelSincDown(TratativaRetornoUtil.velocidadeMinima(v).get(0));
            t.setVelSincUp(TratativaRetornoUtil.velocidadeMinima(v).get(1));
            t.setVelMaxDown(TratativaRetornoUtil.velocidadeMinima(v).get(2));
            t.setVelMaxUp(TratativaRetornoUtil.velocidadeMinima(v).get(3));
            return t;
        } else {
            TabelaParametrosMetalicoVdsl t = new TabelaParametrosMetalicoVdsl();
            t.setAtnDown(0d);
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
            t.setVelSincDown(TratativaRetornoUtil.velocidadeMinima(v).get(0));
            t.setVelSincUp(TratativaRetornoUtil.velocidadeMinima(v).get(1));
            t.setVelMaxDown(TratativaRetornoUtil.velocidadeMinima(v).get(2));
            t.setVelMaxUp(TratativaRetornoUtil.velocidadeMinima(v).get(3));
            return t;
        }

    }

}
