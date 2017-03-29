/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.massivo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
import model.entity.AbstractEntity;

/**
 *
 * @author G0034481
 */
@Stateless
public class ComponenteTestsDAO {

//    @PersistenceContext
//    protected EntityManager entityManager;
    private EntityManagerFactory emf;
    protected EntityManager entityManager;

    public void startConnection() {
        emf = Persistence.createEntityManagerFactory("localPU");
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
    }

    public void closeConnection() {
        entityManager.getTransaction().commit();
        emf.close();
    }

    public ComponenteTestsDAO() {
    }

    @Transactional
    public void cadastrar(AbstractEntity a) throws Exception {
        this.entityManager.persist(a);
    }

    @Transactional
    public void editar(AbstractEntity a) throws Exception {
        try {
            this.entityManager.merge(a);
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional
    public void excluir(AbstractEntity a) throws Exception {
        try {
            this.entityManager.remove(this.entityManager.merge(a));
        } catch (Exception e) {
            throw e;
        }
    }

    public void flush() {
        this.entityManager.flush();
    }

}
