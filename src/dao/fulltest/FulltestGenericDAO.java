/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.fulltest;

import dao.AbstractHibernateDAO;
import dao.InterfaceDAO;
import model.entity.FulltestGenericEntity;

/**
 *
 * @author G0042204
 */
public class FulltestGenericDAO extends AbstractHibernateDAO implements InterfaceDAO<FulltestGenericEntity> {

    @Override
    public FulltestGenericEntity buscarPorId(FulltestGenericEntity t) throws Exception {
        return getEm().find(FulltestGenericEntity.class, t.getId());
    }

    @Override
    public void cadastrar(FulltestGenericEntity t) throws Exception {
        super.persist(t);
    }

}
