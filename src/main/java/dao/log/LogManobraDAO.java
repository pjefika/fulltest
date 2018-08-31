/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.log;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.mongo.dao.AbstractMongoDAO;
import br.net.gvt.efika.mongo.dao.MongoEndpointEnum;
import java.util.Calendar;
import java.util.List;
import model.entity.manobra.LogManobra;

/**
 *
 * @author G0042204
 */
public class LogManobraDAO extends AbstractMongoDAO<LogManobra> implements ManobraDAO {

    public LogManobraDAO() {
        super(MongoEndpointEnum.MONGO.getIp(), "fulltestAPI", LogManobra.class);
    }

    @Override
    public void cadastrar(LogManobra t) throws Exception {
        super.save(t);
    }

    @Override
    public LogManobra buscarPorId(LogManobra t) throws Exception {
        return super.read(t.getId());
    }

    @Override
    public void close() {
        //
    }

    @Override
    public List<LogManobra> listarLogManobraPorCustomer(EfikaCustomer e) throws Exception {
        try {
            Calendar hj = Calendar.getInstance();
            hj.set(Calendar.HOUR, 0);
            hj.set(Calendar.MINUTE, 0);
            hj.set(Calendar.SECOND, 0);

            return getDatastore().createQuery(LogManobra.class)
                    .field("instancia")
                    .equal(e.getInstancia())
                    .field("datahora")
                    .greaterThanOrEq(hj.getTime())
                    .asList();

        } catch (Exception ex) {
            return null;
        }

    }

}
