/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.log;

import br.net.gvt.efika.mongo.dao.AbstractMongoDAO;
import br.net.gvt.efika.mongo.dao.MongoEndpointEnum;
import dao.dslam.impl.ComandoDslam;

/**
 *
 * @author G0041775
 */
public class ComandoDslamDAO extends AbstractMongoDAO<ComandoDslam> {

    public ComandoDslamDAO() {
        super(MongoEndpointEnum.MONGO.getIp(), "fulltestAPI", ComandoDslam.class);
    }

}
