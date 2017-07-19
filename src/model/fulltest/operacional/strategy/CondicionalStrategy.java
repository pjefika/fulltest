/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.strategy;

import model.fulltest.operacional.facade.FullTestGenericFacade;
import model.validacao.Validacao;

/**
 * Estratégia de execução que interrompe a execução caso encontre validações
 * negativas.
 *
 * @author G0042204
 */
public class CondicionalStrategy implements ExecutionStrategy {

    @Override
    public void action(FullTestGenericFacade ft) {
        for (Validacao v : ft.getBateria()) {
            Boolean res;
            try {
                res = v.validar();
                ft.getValids().add(v);
            } catch (Exception e) {
                res = true;
            }

            if (!res) {
                ft.setResultado(res);
                ft.setMensagem(v.getMensagem());
                return;
            }
        }
    }

}
