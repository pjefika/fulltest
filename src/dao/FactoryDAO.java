/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.customer.NetworkInventoryDAO;
import dao.customer.NetworkInventoryDAOImpl;
import dao.fulltest.FulltestGenericDAO;
import dao.log.LogCrmDAO;
import dao.log.LogEntityDAO;
import dao.log.LogManobraDAO;
import dao.log.ManobraDAO;
import model.entity.FulltestGenericEntity;
import model.entity.LogEntity;
import model.entity.crm.LogCrm;

/**
 *
 * @author G0042204
 */
public class FactoryDAO {

    public static InterfaceDAO<LogCrm> createLogCRM() {
        return new LogCrmDAO();
    }

    public static InterfaceDAO<LogEntity> createLogEntityDAO() {
        return new LogEntityDAO();
    }

    public static ManobraDAO create() {
        return new LogManobraDAO();
    }

    public static InterfaceDAO<FulltestGenericEntity> createFtDAO() {
        return new FulltestGenericDAO();
    }
    
    public static NetworkInventoryDAO createNetworkInventoryDAO() {
        return new NetworkInventoryDAOImpl();
    }

}
