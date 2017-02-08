/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.massivo.TesteClienteDAO;
import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import model.entity.TesteCliente;

/**
 *
 * @author G0042204
 */
@Singleton
@Startup
public class MassivoSingleton {

    @Inject
    private TesteClienteDAO dao;

    public MassivoSingleton() {
    }

    @PostConstruct
    public void dev() {

        System.out.println("model.fulltest.massivo.MassivoSingleton.dev() - pirogue");
        for (TesteCliente o : dao.listarInstancias()) {
            System.out.println(o.getInstancia());
        }
    }

    /**
     *
     */
    @Schedule(minute = "∗/5")
    public void abreThread() {

    }

}
