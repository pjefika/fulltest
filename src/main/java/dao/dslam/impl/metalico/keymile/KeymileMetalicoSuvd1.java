/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.Modulacao;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalicoVdsl;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.List;

/**
 *
 * @author G0041775
 */
public class KeymileMetalicoSuvd1 extends KeymileMetalicoSuvdDslam {

    public KeymileMetalicoSuvd1(String ipDslam) {
        super(ipDslam);
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametrosIdeal(Velocidades v) throws Exception {

        Boolean isAdsl = new Double(v.getVel()).compareTo(20d) <= 0;
        if (isAdsl) {
            TabelaParametrosMetalico t = new TabelaParametrosMetalico();
            t.setAtnDown(0d);
            t.setAtnUp(0d);
            t.setSnrDown(2d);
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
            t.setAtnDown2(12d);
            t.setAtnUp(0d);
            t.setAtnUp1(7d);
            t.setAtnUp2(15d);
            t.setSnrDown(2d);
            t.setSnrDown1(5d);
            t.setSnrDown2(5d);
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

    @Override
    public Modulacao getModulacao(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getModul(i)).getRetorno();
        String modul = TratativaRetornoUtil.tratKeymile(leResp, "\\ # Name");
        Modulacao m = new Modulacao();
        m.setModulacao(modul);

        return m;
    }

    @Override
    public Modulacao setModulacao(InventarioRede i, Velocidades v) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetModulacao(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getModulacao(i);
    }

    protected ComandoDslam getComandoSetModulacao(InventarioRede i) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/cfgm/portprofiles VDSL_17A_B8_12_SUVD1");
    }

    @Override
    public Modulacao castModulacao(Velocidades v) {
        Modulacao m = new Modulacao();
        m.setModulacao("VDSL_17A_B8_12_SUVD1");
        return m;
    }

}
