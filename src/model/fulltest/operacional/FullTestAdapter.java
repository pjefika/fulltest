/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

/**
 *
 * @author G0041775
 */
public class FullTestAdapter {

    public static FullTest adapter(FullTestFacade ff) {
        FullTest ft = new FullTest();
//        ft.setBateria(ff.bateria);
        ft.setCl(ff.cl);
        ft.setDataFim(ff.dataFim);
        ft.setDataInicio(ff.dataInicio);
        ft.setValids(ff.valids);
        ft.setMensagem(ff.mensagem);
        ft.setResultado(ff.resultado);
        
        return ft;
    }
}
