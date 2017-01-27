/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.nosql;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.entity.TesteCliente;

@Stateless
public class DslamDAO {

    @PersistenceContext(unitName = "fulltestPU")
    private EntityManager em;

    public void salvar(TesteCliente t) {
        em.persist(t);
    }

}
