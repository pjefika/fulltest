/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;

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
        return new ComandoDslam("display interface vdsl 0/" + i.getSlot() + "/" + i.getPorta());
    }

}
