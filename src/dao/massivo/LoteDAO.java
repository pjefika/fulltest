/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.massivo;

import br.com.caelum.vraptor.Controller;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import model.Status;
import model.entity.Lote;

/**
 *
 * @author G0034481
 */
@Controller
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

    public List<Lote> listarLotesAtivo() {
        try {
            Query query = this.entityManager.createQuery("FROM Lote l WHERE l.status =:param1 AND l.matricula =:param2");
            query.setParameter("param1", Status.ATIVO);
            query.setParameter("param2", "G0034481");
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
