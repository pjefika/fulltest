/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.log;

import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import dao.FactoryDAO;
import dao.log.ValidacaoEntityDAO;
import java.util.Calendar;
import java.util.List;
import model.entity.ValidacaoEntity;
import model.validacao.impl.realtime.Validador;

/**
 *
 * @author G0041775
 */
public class ValidacaoEntityOperator {

    private static ValidacaoEntityDAO dao = FactoryDAO.createValidacaoDAO();

    public static ValidacaoEntity start(Validador valid, String owner) throws Exception {
        ValidacaoEntity v = new ValidacaoEntity(owner);
        v.setDataInicio(Calendar.getInstance().getTime());
        v.setNome(valid.getClass().getSimpleName());
        v.setCust(valid.getCust());
        dao.save(v);
        return v;
    }

    public static ValidacaoEntity end(ValidacaoEntity v, ValidacaoResult valid) throws Exception {
        v.setDataFim(Calendar.getInstance().getTime());
        v.setValid(valid);
        dao.update(v, dao.createUpdateOperations().set("dataFim", v.getDataFim()).set("valid", v.getValid()));
        return v;
    }

    public static List<ValidacaoEntity> find(String owner) throws Exception {
        return dao.findByOwner(owner);
    }

}
