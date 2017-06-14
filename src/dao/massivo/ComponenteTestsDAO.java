/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.massivo;

import dao.FactoryEntityManager;
import javax.persistence.EntityManager;
import model.entity.AbstractEntity;

public class ComponenteTestsDAO {

//    @PersistenceContext
    protected EntityManager entityManager = FactoryEntityManager.getInstance();

    public ComponenteTestsDAO() {
    }

    public void cadastrar(AbstractEntity a) throws Exception {
        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.getTransaction().commit();
    }

    public void editar(AbstractEntity a) throws Exception {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(a);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }
    }

    public void excluir(AbstractEntity a) throws Exception {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(this.entityManager.merge(a));
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }
    }

    public void flush() {
        this.entityManager.flush();
    }

    public void clear() {
        this.entityManager.clear();
    }

    public void close() {
        this.entityManager.close();
    }

}
