/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.zhone;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.login.LoginDslamStrategy;
import java.util.List;
import model.dslam.consulta.EstadoDaPorta;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import dao.dslam.impl.metalico.DslamMetalico;
import model.dslam.consulta.Profile;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;


/**
 *
 * @author G0042204
 */
public abstract class ZhoneMetalicoDslam extends DslamMetalico {

    public ZhoneMetalicoDslam(String ipDslam, Credencial credencial, LoginDslamStrategy loginStrategy) {
        super(ipDslam, credencial, loginStrategy);
    }

    protected ComandoDslam getComandoConsultaVlan(InventarioRede i) {
        return new ComandoDslam("bridge show vlan " + i.getCvLan(), 5000);
    }

    public EstadoDaPorta getEstadoDaPorta(List<String> r) throws Exception {
        EstadoDaPorta e = new EstadoDaPorta();
        String admState = TratativaRetornoUtil.tratZhone(r, "AdminStatus", "\\b\\w+\\b").get(1);
        String operState = TratativaRetornoUtil.tratZhone(r, "LineStatus", "\\b\\w+\\b").get(1);
        if (operState.equalsIgnoreCase("DATA")) {
            operState = "Up";
        } else {
            operState = "Down";
        }
        e.setAdminState(admState);
        e.setOperState(operState);

        return e;
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametrosIdeal(Velocidades v) throws Exception {
        TabelaParametrosMetalico t = new TabelaParametrosMetalico();
        t.setVelSincDown(TratativaRetornoUtil.velocidadeMinima(v).get(0));
        t.setVelSincUp(TratativaRetornoUtil.velocidadeMinima(v).get(1));
        t.setSnrDown(6d);
        t.setSnrUp(5d);
        t.setAtnDown(1d);
        t.setAtnUp(2d);
        return t;
    }

}
