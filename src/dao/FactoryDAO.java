/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.fulltest.FulltestGenericDAO;
import dao.log.LogCrmDAO;
import dao.log.LogManobraDAO;
import model.entity.FulltestGenericEntity;
import model.entity.crm.LogCrm;
import model.entity.manobra.LogManobra;

/**
 *
 * @author G0042204
 */
public class FactoryDAO {

    public static InterfaceDAO<LogCrm> createLogCRM() {
        return new LogCrmDAO();
    }

    public static InterfaceDAO<LogManobra> createLogManobra() {
        return new LogManobraDAO();
    }

    public static InterfaceDAO<FulltestGenericEntity> createFtDAO() {
        return new FulltestGenericDAO();
    }

}
