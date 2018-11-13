/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.huawei;

import br.net.gvt.efika.fulltest.model.telecom.config.ComandoDslam;

/**
 *
 * @author G0041775
 */
public class Huawei5800GponDlamVivo1 extends HuaweiGponDslamVivo1 {

    public Huawei5800GponDlamVivo1(String ipDslam) {
        super(ipDslam);
    }

    @Override
    public void conectar() throws Exception {
        super.conectar();
        getCd().consulta(getComandoEnableConfig1());
    }

    @Override
    protected ComandoDslam getComandoEnableConfig() {
        return new ComandoDslam("enable", 500, "config", 500);
    }

    protected ComandoDslam getComandoEnableConfig1() {
        return new ComandoDslam("undo smart", 500, "undo alarm output all", 500, "scroll 500");
    }

}
