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
import model.fulltest.Status;

/**
 *
 * @author G0034481
 */
public class LoteDAO extends ComponenteTestsDAO {

    public LoteDAO() {
    }

    public List<Lote> listarLotes() {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM Lote l");
            List<Lote> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }

    public List<Lote> listarLotesAtivo(String usuario) {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM Lote l WHERE l.status !=:param1 AND l.matricula =:param2");
            query.setParameter("param1", Status.EXCLUIDO);
            query.setParameter("param2", usuario);
            List<Lote> result = query.getResultList();
//            closeConnection();
            return query.getResultList();
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }
    
    public List<Lote> listarLotesEmExec(){
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM Lote l WHERE l.status =:param1");
            query.setParameter("param1", Status.EM_EXECUCAO);
            List<Lote> result = query.getResultList();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return new ArrayList<>();
        }
    }

    public Lote buscarLotePorId(Lote lote) {
        try {
//            startConnection();
            Query query = this.entityManager.createQuery("FROM Lote l WHERE l.id =:param1");
            query.setParameter("param1", lote.getId());
            Lote result = (Lote) query.getSingleResult();
//            closeConnection();
            return result;
        } catch (Exception e) {
//            closeConnection();
            return null;
        }
    }
}
