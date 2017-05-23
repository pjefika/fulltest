/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.massivo.ComponenteTestsDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import model.entity.Cliente;
import model.entity.manobra.ValidacaoManobra;

/**
 *
 * @author G0042204
 */
public class ManobraDAO extends ComponenteTestsDAO {

    public List<ValidacaoManobra> listarValidEspecifo(Cliente cliente) {
        try {
            Query query = this.entityManager.createQuery("FROM ValidacaoManobra v WHERE 1=1 "
                    + "AND (v.instancia =:param OR v.designador =:param) "
                    + "AND DATEDIFF('day', v.data, NOW()) = 0"
                    + "AND v.resultado =:param1");
            query.setParameter("param", cliente.getDesignador());
            query.setParameter("param1", false);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

}
