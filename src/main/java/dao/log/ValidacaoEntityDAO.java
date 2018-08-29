/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.log;

import br.net.gvt.efika.mongo.dao.AbstractMongoDAO;
import br.net.gvt.efika.mongo.dao.MongoEndpointEnum;
import java.util.List;
import model.entity.ValidacaoEntity;

/**
 *
 * @author G0041775
 */
public class ValidacaoEntityDAO extends AbstractMongoDAO<ValidacaoEntity> {

    public ValidacaoEntityDAO() {
        super(MongoEndpointEnum.MONGO.getIp(), "fulltestAPI", ValidacaoEntity.class);
    }

    public List<ValidacaoEntity> findByOwner(String owner) throws Exception {
        return getDatastore().createQuery(ValidacaoEntity.class)
                .field("owner")
                .equal(owner)
                .asList();
    }

}
