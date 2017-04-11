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
import model.entity.TesteClienteGpon;
import model.entity.ValidacaoGpon;
import model.fulltest.Status;

/**
 *
 * @author G0034481
 */
public class TesteClienteDAO extends ComponenteTestsDAO {

    public TesteClienteDAO() {
    }

    public List<TesteClienteGpon> listarInstancias() {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteCliente");
            List<TesteClienteGpon> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }

    public List<TesteClienteGpon> listarInstanciasPendentes() {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteClienteGpon t WHERE t.status =:param1  AND (t.lote.status =:param1 OR t.lote.status=:param2)");
            query.setParameter("param1", Status.ATIVO);
            query.setParameter("param2", Status.EM_EXECUCAO);
            List<TesteClienteGpon> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }

    public List<TesteClienteGpon> listarInstanciasPendentes(Integer limit) {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteClienteGpon t WHERE t.status =:param1  AND (t.lote.status =:param1 OR t.lote.status=:param2)");
            query.setParameter("param1", Status.ATIVO);
            query.setParameter("param2", Status.EM_EXECUCAO);
            query.setMaxResults(limit);
            List<TesteClienteGpon> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public List<TesteClienteGpon> listarInstanciasPresasExec(Integer limit) {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteClienteGpon t WHERE t.status =:param2  AND (t.lote.status =:param1 OR t.lote.status=:param2)");
            query.setParameter("param1", Status.ATIVO);
            query.setParameter("param2", Status.EM_EXECUCAO);
            query.setMaxResults(limit);

            List<TesteClienteGpon> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }

    public TesteClienteGpon buscarInstanciaPorId(TesteClienteGpon tc) {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteClienteGpon t WHERE t.id=:param1");
            query.setParameter("param1", tc.getId());
//            TesteClienteGpon result = (TesteClienteGpon) query.getSingleResult();
//            closeConnection();
            return (TesteClienteGpon) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
//            closeConnection();
            return null;
        }
    }

    public List<TesteClienteGpon> listarInstanciasPorLote(Lote lote) {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM TesteClienteGpon t WHERE t.lote =:param1");
            query.setParameter("param1", lote);
            List<TesteClienteGpon> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }

    public ValidacaoGpon getValidacaoPorTeste(TesteClienteGpon t) {
        try {
            Query query = this.entityManager.createQuery("FROM ValidacaoGpon l WHERE l.teste =:param1");
            query.setParameter("param1", t.getId());
            return (ValidacaoGpon) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new ValidacaoGpon();
        }

    }

    public List<TesteClienteGpon> listarLotesSelect(List<String> idLotes) {
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
            //System.out.println("Cod: 1: FROM TesteClienteGpon t WHERE " + lotes);
            Query query = this.entityManager.createQuery("FROM TesteClienteGpon t WHERE " + lotes);
            List<TesteClienteGpon> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }
}
