/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.customer.NetworkInventoryDAO;
import dao.customer.NetworkInventoryDAOImpl;
import dao.log.InteracaoDslamDAO;
import dao.log.LogCrmDAO;
import dao.log.LogEntityDAO;
import dao.log.LogManobraDAO;
import dao.log.ManobraDAO;
import dao.log.ValidacaoEntityDAO;
import model.entity.crm.LogCrm;

/**
 *
 * @author G0042204
 */
public class FactoryDAO {

    public static InterfaceDAO<LogCrm> createLogCRM() {
        return new LogCrmDAO();
    }

    public static LogEntityDAO createLogEntityDAO() {
        return new LogEntityDAO();
    }

    public static InteracaoDslamDAO createInteracaoDslamDAO() {
        return new InteracaoDslamDAO();
    }

    public static ManobraDAO create() {
        return new LogManobraDAO();
    }

    public static NetworkInventoryDAO createNetworkInventoryDAO() {
        return new NetworkInventoryDAOImpl();
    }

    public static ValidacaoEntityDAO createValidacaoDAO() {
        return new ValidacaoEntityDAO();
    }

}
