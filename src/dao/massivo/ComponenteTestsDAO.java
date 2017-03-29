/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.massivo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import model.entity.AbstractEntity;

/**
 *
 * @author G0034481
 */
@Stateless
public class ComponenteTestsDAO {

    @PersistenceContext
    protected EntityManager entityManager;
//    private EntityManagerFactory emf;
//    protected EntityManager entityManager;

//    public void startConnection() {
//        emf = Persistence.createEntityManagerFactory("localPU");
//        entityManager = emf.createEntityManager();
//    }
//
//    public void closeConnection() {
//        emf.close();
//    }
//
//    public void startTransaction() {
//        startConnection();
//        entityManager.getTransaction().begin();
//    }
//
//    public void closeTransaction() {
//        entityManager.getTransaction().commit();
//        closeConnection();
//    }

    public ComponenteTestsDAO() {
    }

    @Transactional
    public void cadastrar(AbstractEntity a) throws Exception {
//        startTransaction();
        this.entityManager.persist(a);
//        closeTransaction();
    }

    @Transactional
    public void editar(AbstractEntity a) throws Exception {
        try {
//            startTransaction();
            this.entityManager.merge(a);
//            closeTransaction();
        } catch (Exception e) {
//            closeTransaction();
            throw e;
        }
    }

    @Transactional
    public void excluir(AbstractEntity a) throws Exception {
        try {
//            startTransaction();
            this.entityManager.remove(this.entityManager.merge(a));
//            closeTransaction();
        } catch (Exception e) {
//            closeTransaction();
            throw e;
        }
    }

    public void flush() {
        this.entityManager.flush();
    }

}
