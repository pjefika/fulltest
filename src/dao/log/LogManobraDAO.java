/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.log;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.AbstractHibernateDAO;
import javax.persistence.Query;
import model.entity.manobra.LogManobra;

/**
 *
 * @author G0042204
 */
public class LogManobraDAO extends AbstractHibernateDAO implements ManobraDAO {

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

    @Override
    public LogManobra buscarLogManobraExistente(EfikaCustomer e) throws Exception {
        try {
            Query query = getEm().createQuery("FROM LogManobra v WHERE 1=1 "
                    + "AND (v.instancia =:param OR v.designador =:param1 OR v.designadorAcesso =:param2) "
                    + "AND DATEDIFF('day', v.inicio, NOW()) = 0"
                    + "AND v.resultado =:param3");
            query.setParameter("param", e.getInstancia());
            query.setParameter("param1", e.getDesignador());
            query.setParameter("param2", e.getDesignadorAcesso());
            query.setParameter("param3", false);
            return (LogManobra) query.getSingleResult();
        } catch (Exception ex) {
            return null;
        }

    }

}
