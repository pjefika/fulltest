/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.log;

import dao.AbstractHibernateDAO;
import dao.InterfaceDAO;
import model.entity.crm.LogCrm;

/**
 *
 * @author G0042204
 */
public class LogCrmDAO extends AbstractHibernateDAO implements InterfaceDAO<LogCrm> {
    
   
    @Override
    public void cadastrar(LogCrm t) throws Exception {
        super.persist(t);
    }

    @Override
    public LogCrm buscarPorId(LogCrm t) throws Exception {
        return getEm().find(LogCrm.class, t.getId());
    }

    @Override
    public void close() {
        super.close(); //To change body of generated methods, choose Tools | Templates.
    }

}
