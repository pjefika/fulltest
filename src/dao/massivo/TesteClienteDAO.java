/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.massivo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import model.entity.Lote;
import model.entity.TesteCliente;
import model.fulltest.Status;

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

    public List<TesteCliente> listarInstanciasPendentes() {
        try {
            Query query = this.entityManager.createQuery("FROM TesteCliente t WHERE t.status =:param1");
            query.setParameter("param1", Status.ATIVO);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public List<TesteCliente> listarInstanciasPendentes(Integer limit) {
        try {
            Query query = this.entityManager.createQuery("FROM TesteCliente t WHERE t.status =:param1 LIMIT :param2");
            query.setParameter("param1", Status.ATIVO);
            query.setParameter("param2", limit);
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
    
    public List<TesteCliente> listarLotesSelect(List<String> idLotes) {
        try {
            StringBuilder concat = new StringBuilder();
            Integer cont = 0;
            for (String idLote : idLotes) {
                if (cont == 0) {
                    concat.append("t.lote.id = " + idLote + " ");
                } else {
                    concat.append("OR t.lote.id = " + idLote + " ");
                }
                cont++;
            }            
            String lotes = concat.toString();            
            //System.out.println("Cod: 1: FROM TesteCliente t WHERE " + lotes);            
            Query query = this.entityManager.createQuery("FROM TesteCliente t WHERE " + lotes);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
