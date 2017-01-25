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
import model.dslam.consulta.ConsultaTabelaParametrosGpon;

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
        ConsultaTabelaParametrosGpon meuDslam = (ConsultaTabelaParametrosGpon) dslam;
        ComandoDslam ds = this.cd.consulta(meuDslam.getComandoTabelaParametros());
        meuDslam.getTabelaParametros(ds);

    }

    public void consultaParametros() {

    }

    public void close() throws IOException {
        this.cd.close();
    }

}
