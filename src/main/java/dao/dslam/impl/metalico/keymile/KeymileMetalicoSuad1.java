/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.retorno.TratativaRetornoUtil;

/**
 *
 * @author G0041775
 */
public class KeymileMetalicoSuad1 extends KeymileMetalicoSuadDslam {

    public KeymileMetalicoSuad1(String ipDslam) {
        super(ipDslam);
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametrosIdeal(Velocidades v) throws Exception {
        TabelaParametrosMetalico t = new TabelaParametrosMetalico();
        t.setSnrDown(1d);
        t.setSnrUp(5d);
        t.setAtnDown(0d);
        t.setAtnUp(0d);
        t.setVelSincDown(TratativaRetornoUtil.velocidadeMinima(v).get(0));
        t.setVelSincUp(TratativaRetornoUtil.velocidadeMinima(v).get(1));
        t.setVelMaxDown(TratativaRetornoUtil.velocidadeMinima(v).get(2));
        t.setVelMaxUp(TratativaRetornoUtil.velocidadeMinima(v).get(3));

        return t;
    }

}
