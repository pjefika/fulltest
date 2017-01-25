/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest;

import dao.dslam.ComandoDslam;
import dao.dslam.ConsultaDslam;
import model.dslam.AbstractDslam;
import model.dslam.vivo2.gpon.DslamGpon;

/**
 *
 * @author G0042204
 */
public class FullTestFacade {

    private ConsultaDslam cd;

    private AbstractDslam dslam;

    public FullTestFacade(AbstractDslam dslam) {
        this.dslam = dslam;
        this.cd = new ConsultaDslam(dslam);
    }

    public void dev() throws Exception {
        DslamGpon meuDslam = (DslamGpon) dslam;
        String pegaSerial = "info configure equipment ont interface 1/1/" + meuDslam.getSlot() + "/" + meuDslam.getPorta() + "/" + meuDslam.getLogica() + " detail xml";
        ComandoDslam cmd = new ComandoDslam(pegaSerial);
        this.cd.consulta(cmd);

        System.out.println("model.fulltest.FullTestFacade.dev()");
        System.out.println(cmd.getRetorno());

    }

}
