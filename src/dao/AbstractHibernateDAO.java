/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author G0042204
 */
public class AbstractHibernateDAO {

    private EntityManagerFactory emf;

    private EntityManager em;

    public void persist(Object obj) throws Exception {
        getEm().getTransaction().begin();
        getEm().persist(obj);
        getEm().getTransaction().commit();
    }

    public EntityManager getEm() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("fulltestAPIPU");
            em = emf.createEntityManager();
        }
        return em;
    }

    public void close() {
        if (emf.isOpen()) {
            emf.close();
        }
    }

}
