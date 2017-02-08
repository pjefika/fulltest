/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.massivo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import model.fulltest.Status;
import model.entity.Lote;

/**
 *
 * @author G0034481
 */
public class LoteDAO extends ComponenteTestsDAO {

    public LoteDAO() {
    }

    public List<Lote> listarLotes() {
        try {
            Query query = this.entityManager.createQuery("FROM Lote l");
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public List<Lote> listarLotesAtivo(String usuario) {
        try {
            Query query = this.entityManager.createQuery("FROM Lote l WHERE l.status !=:param1 AND l.matricula =:param2");
            query.setParameter("param1", Status.EXCLUIDO);
            query.setParameter("param2", usuario);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public List<Lote> listarLoteExport(Lote lote) {
        try {
            Query query = this.entityManager.createQuery("FROM Lote l WHERE l.id =:param1");
            query.setParameter("param1", lote.getId());
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
