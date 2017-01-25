/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest;

import dao.dslam.ComandoDslam;
import dao.dslam.ConsultaDslam;
import java.io.IOException;
import model.dslam.AbstractDslam;
import model.dslam.consulta.ConsultaEstadoDaPorta;
import model.dslam.consulta.ConsultaSerialOntGpon;
import model.dslam.consulta.ConsultaTabelaParametrosGpon;
import model.dslam.consulta.ConsultaVlanBanda;
import model.dslam.consulta.ConsultaVlanMulticast;
import model.dslam.consulta.ConsultaVlanVod;
import model.dslam.consulta.ConsultaVlanVoip;

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
        ConsultaTabelaParametrosGpon meuDslam = (ConsultaTabelaParametrosGpon) dslam;
        ComandoDslam ds = this.cd.consulta(meuDslam.getComandoTabelaParametros());
        meuDslam.getTabelaParametros(ds);
    }

    public void serialOnt() throws Exception {
        ConsultaSerialOntGpon meuDslam = (ConsultaSerialOntGpon) dslam;
        ComandoDslam ds = this.cd.consulta(meuDslam.getComandoSerialOnt());
        meuDslam.getSerialOnt(ds);
    }

    public void estadoPorta() throws Exception {
        ConsultaEstadoDaPorta meuDslam = (ConsultaEstadoDaPorta) dslam;
        ComandoDslam ds = this.cd.consulta(meuDslam.getComandoConsultaEstadoDaPorta());
        meuDslam.getEstadoDaPorta(ds);
    }

    public void consultaVlanBanda() throws Exception {
        ConsultaVlanBanda meuDslam = (ConsultaVlanBanda) dslam;
        ComandoDslam ds = this.cd.consulta(meuDslam.getComandoConsultaVlanBanda());
        meuDslam.getVlanBanda(ds);
    }

    public void consultaVlanVoip() throws Exception {
        ConsultaVlanVoip meuDslam = (ConsultaVlanVoip) dslam;
        ComandoDslam ds = this.cd.consulta(meuDslam.getComandoConsultaVlanVoip());
        meuDslam.getVlanVoip(ds);
    }

    public void consultaVlanVod() throws Exception {
        ConsultaVlanVod meuDslam = (ConsultaVlanVod) dslam;
        ComandoDslam ds = this.cd.consulta(meuDslam.getComandoConsultaVlanVod());
        meuDslam.getVlanVod(ds);
    }

    public void consultaVlanMulticast() throws Exception {
        ConsultaVlanMulticast meuDslam = (ConsultaVlanMulticast) dslam;
        ComandoDslam ds = this.cd.consulta(meuDslam.getComandoConsultaVlanMulticast());
        meuDslam.getVlanMulticast(ds);
    }

    public void close() throws IOException {
        this.cd.close();
    }

}
