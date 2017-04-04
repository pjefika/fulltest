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

@Stateless
public class ComponenteTestsDAO {

    @PersistenceContext
    protected EntityManager entityManager;

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

    public void clear() {
        this.entityManager.clear();
    }
    
    public void close() {
        this.entityManager.close();
    }

}
