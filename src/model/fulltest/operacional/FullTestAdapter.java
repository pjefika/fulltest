/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import model.entity.FulltestGenericEntity;
import model.fulltest.operacional.facade.FullTestGenericFacade;
import util.GsonUtil;

/**
 *
 * @author G0041775
 */
public class FullTestAdapter {

    public static FullTest adapter(FullTestGenericFacade ff) {
        FullTest ft = new FullTest();
        
        ft.setCl(ff.getCl());
        ft.setDataFim(ff.getDataFim());
        ft.setDataInicio(ff.getDataInicio());
        ft.setValids(ff.getValids());
        ft.setMensagem(ff.getMensagem());
        ft.setResultado(ff.getResultado());

        return ft;
    }

    public static FulltestGenericEntity adapter(FullTest f) {
        return new FulltestGenericEntity(
                GsonUtil.serialize(f.getCl()),
                GsonUtil.serialize(f.getValids()),
                f.getResultado(),
                f.getDataInicio(),
                f.getDataFim(),
                f.getMensagem());
    }

}
