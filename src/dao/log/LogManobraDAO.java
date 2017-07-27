/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.log;

import dao.AbstractHibernateDAO;
import dao.InterfaceDAO;
import model.entity.crm.LogCrm;
import model.entity.manobra.LogManobra;

/**
 *
 * @author G0042204
 */
public class LogManobraDAO extends AbstractHibernateDAO implements InterfaceDAO<LogManobra> {
    
   
    @Override
    public void cadastrar(LogManobra t) throws Exception {
        super.persist(t);
    }

    @Override
    public LogManobra buscarPorId(LogManobra t) throws Exception {
        return getEm().find(LogManobra.class, t.getId());
    }

    @Override
    public void close() {
        super.close(); //To change body of generated methods, choose Tools | Templates.
    }

}
