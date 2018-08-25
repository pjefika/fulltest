/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.util.json.JacksonMapper;
import java.util.List;
import model.entity.FulltestGenericEntity;
import model.fulltest.operacional.facade.FullTestGenericFacade;

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
        ft.setOwner(ff.getOwner());
        
        return ft;
    }
    
    public static FulltestGenericEntity adapter(FullTest f) {
        try {
            return new FulltestGenericEntity(
                    new JacksonMapper(EfikaCustomer.class).serialize(f.getCl()),
                    new JacksonMapper(List.class).serialize(f.getValids()),
                    f.getResultado(),
                    f.getDataInicio(),
                    f.getDataFim(),
                    f.getMensagem());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
