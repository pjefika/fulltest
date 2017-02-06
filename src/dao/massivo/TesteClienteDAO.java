/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.massivo;

import java.util.ArrayList;
import java.util.List;
import model.entity.Lote;
import javax.persistence.Query;
import model.entity.TesteCliente;

/**
 *
 * @author G0034481
 */
public class TesteClienteDAO extends ComponenteTestsDAO {

    public TesteClienteDAO() {
    }

    public List<TesteCliente> listarInstancias() {
        try {
            Query query = this.entityManager.createQuery("FROM TesteCliente");
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public List<TesteCliente> listarInstanciasPorLote(Lote lote) {
        try {
            Query query = this.entityManager.createQuery("FROM TesteCliente l WHERE l.lote =:param1");
            query.setParameter("param1", lote);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
