/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.log;

import dao.AbstractHibernateDAO;
import dao.InterfaceDAO;
import model.entity.LogEntity;

/**
 *
 * @author G0042204
 */
public class LogEntityDAO extends AbstractHibernateDAO implements InterfaceDAO<LogEntity> {
   
    @Override
    public void cadastrar(LogEntity t) throws Exception {
        super.persist(t);
    }

    @Override
    public LogEntity buscarPorId(LogEntity t) throws Exception {
        return getEm().find(LogEntity.class, t.getId());
    }

    @Override
    public void close() {
        super.close(); //To change body of generated methods, choose Tools | Templates.
    }

}
