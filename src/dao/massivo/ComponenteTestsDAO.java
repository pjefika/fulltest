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

    public ComponenteTestsDAO() {
    }

    @Transactional
    public void cadastrar(AbstractEntity a) throws Exception {        
        try {
            this.entityManager.persist(a);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }        
    }

    @Transactional
    public void editar(AbstractEntity a) throws Exception {        
        try {
            this.entityManager.merge(a);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }        
    }

    @Transactional
    public void excluir(AbstractEntity a) throws Exception {        
        try {
            this.entityManager.remove(this.entityManager.merge(a));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }        
    }

}
