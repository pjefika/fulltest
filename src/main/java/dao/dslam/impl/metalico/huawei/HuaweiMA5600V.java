/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.List;

/**
 *
 * @author G0041775
 */
public class HuaweiMA5600V extends HuaweiMA5600TDslamVivo1 {

    public HuaweiMA5600V(String ipDslam) {
        super(ipDslam);
    }

    @Override
    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("display interface vdsl 0/" + i.getSlot() + "/" + i.getPorta(), 2000);
    }

    @Override
    public EstadoDaPorta tratGetEstadoDaPorta(List<String> ret) {
        String adm = TratativaRetornoUtil.tratHuawei(ret, "VDSL");
        String oper = TratativaRetornoUtil.tratHuawei(ret, "VDSL", 2);
        EstadoDaPorta est = new EstadoDaPorta();
        est.setAdminState(adm.contains("up"));
        est.setOperState(oper.contains("active") || oper.contains("activated"));
        return est;
    }

}
