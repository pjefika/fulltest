/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import dao.FactoryDAO;
import java.util.List;
import model.entity.LogEntity;
import model.entity.ValidacaoEntity;
import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import model.log.ValidacaoEntityOperator;
import org.bson.types.ObjectId;

public class FulltestWatcherService implements EntityWatcherService<FullTest> {

    @Override
    public FullTest mountById(String id) throws Exception {
        LogEntity r = FactoryDAO.createLogEntityDAO().read(new ObjectId(id));
        if (r.getSaida() != null) {
            return (FullTest) r.getSaida();
        }
        List<ValidacaoEntity> vs = ValidacaoEntityOperator.find(id);
        FullTest ft = new FullTest();
        ft.setOwner(id);
        vs.forEach((t) -> {
            ft.getValids().add(t.getValid());
        });
        ft.setMensagem("Verificando " + vs.get(vs.size() - 1).getNome());
        return ft;
    }

}
