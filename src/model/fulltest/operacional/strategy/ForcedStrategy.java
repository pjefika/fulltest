/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.strategy;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.fulltest.operacional.facade.FullTestGenericFacade;

/**
 * Estratégia de execução que interrompe a execução caso encontre validações
 * negativas.
 *
 * @author G0042204
 */
public class ForcedStrategy implements ExecutionStrategy {

    @Override
    public void action(FullTestGenericFacade ft) {
        try {
            ft.getBateria().forEach((v) -> {
                try {
                    ft.getValids().add(v.validar());
                } catch (Exception ex) {
                    Logger.getLogger(ForcedStrategy.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        } catch (Exception e) {
            ft.setMensagem(e.getMessage());
            ft.setResultado(Boolean.FALSE);
        }

    }

}
