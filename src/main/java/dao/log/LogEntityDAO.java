/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.log;

import dao.AbstractMongoDAO;
import model.entity.LogEntity;

/**
 *
 * @author G0042204
 */
public class LogEntityDAO extends AbstractMongoDAO<LogEntity> {

    public LogEntityDAO() {
        super("10.200.35.67", "fulltestAPI", LogEntity.class);
    }

}
