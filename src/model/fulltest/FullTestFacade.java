/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest;

import dao.dslam.ConsultaDslam;
import java.io.IOException;
import model.dslam.AbstractDslam;
import model.dslam.consulta.ConsultaGponDefault;

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

    public void consultaParametros() throws Exception {
        ConsultaGponDefault meuDslam = (ConsultaGponDefault) dslam;
        meuDslam.getTabelaParametros();
    }

    public void serialOnt() throws Exception {
        ConsultaGponDefault meuDslam = (ConsultaGponDefault) dslam;
        meuDslam.getSerialOnt();
    }

    public void estadoPorta() throws Exception {
        ConsultaGponDefault meuDslam = (ConsultaGponDefault) dslam;
        meuDslam.getEstadoDaPorta();
    }

    public void consultaVlanBanda() throws Exception {
        ConsultaGponDefault meuDslam = (ConsultaGponDefault) dslam;
        meuDslam.getVlanBanda();
    }

    public void consultaVlanVoip() throws Exception {
        ConsultaGponDefault meuDslam = (ConsultaGponDefault) dslam;
        meuDslam.getVlanVoip();
    }

    public void consultaVlanVod() throws Exception {
        ConsultaGponDefault meuDslam = (ConsultaGponDefault) dslam;
        meuDslam.getVlanVod();
    }

    public void consultaVlanMulticast() throws Exception {
        ConsultaGponDefault meuDslam = (ConsultaGponDefault) dslam;
        meuDslam.getVlanMulticast();
    }

    public void consultaAlarmes() throws Exception {
        ConsultaGponDefault meuDslam = (ConsultaGponDefault) dslam;
        meuDslam.getAlarmes();
    }

    public void close() throws IOException {
        this.cd.close();
    }

}
