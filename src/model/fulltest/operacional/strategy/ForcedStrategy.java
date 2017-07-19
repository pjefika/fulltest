/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.strategy;

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
        ft.getBateria().forEach((v) -> {
            try {
                v.validar();
            } catch (Exception e) {
                v.setMensagem(e.getMessage());
            } finally {
                ft.getValids().add(v);
            }
        });
    }

}
