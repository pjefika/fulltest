/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.service;

import dao.FactoryDAO;
import dao.InterfaceDAO;
import model.entity.manobra.LogManobra;

/**
 *
 * @author G0042204
 */
public class ManobraServiceImpl implements ManobraService{

    private InterfaceDAO<LogManobra> dao;

    public ManobraServiceImpl() {
    }

    public InterfaceDAO<LogManobra> getDao() {
        if (dao == null) {
            dao = FactoryDAO.create();
        }
        return dao;
    }

}
