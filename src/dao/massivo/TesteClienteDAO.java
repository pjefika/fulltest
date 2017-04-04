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
import model.entity.ValidacaoGpon;
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
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteCliente");
            List<TesteCliente> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }

    public List<TesteCliente> listarInstanciasPendentes() {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteCliente t WHERE t.status =:param1  AND (t.lote.status =:param1 OR t.lote.status=:param2)");
            query.setParameter("param1", Status.ATIVO);
            query.setParameter("param2", Status.EM_EXECUCAO);
            List<TesteCliente> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }

    public List<TesteCliente> listarInstanciasPendentes(Integer limit) {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteCliente t WHERE t.status =:param1  AND (t.lote.status =:param1 OR t.lote.status=:param2)");
            query.setParameter("param1", Status.ATIVO);
            query.setParameter("param2", Status.EM_EXECUCAO);
            query.setMaxResults(limit);
            List<TesteCliente> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public List<TesteCliente> listarInstanciasPresasExec(Integer limit) {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteCliente t WHERE t.status =:param2  AND (t.lote.status =:param1 OR t.lote.status=:param2)");
            query.setParameter("param1", Status.ATIVO);
            query.setParameter("param2", Status.EM_EXECUCAO);
            query.setMaxResults(limit);

            List<TesteCliente> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }

    public TesteCliente buscarInstanciaPorId(TesteCliente tc) {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteCliente t WHERE t.id=:param1");
            query.setParameter("param1", tc.getId());
//            TesteCliente result = (TesteCliente) query.getSingleResult();
//            closeConnection();
            return (TesteCliente) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
//            closeConnection();
            return null;
        }
    }

    public List<TesteCliente> listarInstanciasPorLote(Lote lote) {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteCliente l WHERE l.lote =:param1");
            query.setParameter("param1", lote);
            List<TesteCliente> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }

    public ValidacaoGpon getValidacaoPorTeste(TesteCliente t) {
        try {
            Query query = this.entityManager.createQuery("FROM ValidacaoGpon l WHERE l.teste =:param1");
            query.setParameter("param1", t.getId());
            return (ValidacaoGpon) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new ValidacaoGpon();
        }

    }

    public List<TesteCliente> listarLotesSelect(List<String> idLotes) {
        try {
//            startConnection();
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
            List<TesteCliente> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }
}
