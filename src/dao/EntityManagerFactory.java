/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author G0042204
 */
public class EntityManagerFactory {

    @Produces
    @RequestScoped
    public EntityManager criar() {
        System.out.println("EntityManager criado.");
        return Persistence.createEntityManagerFactory("fulltestAPIPU").createEntityManager();
    }

    public void finalizar(@Disposes EntityManager manager) {
        manager.close();
    }

}
