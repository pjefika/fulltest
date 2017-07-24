/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.strategy;

import model.fulltest.operacional.facade.FullTestGenericFacade;
import model.validacao.ValidacaoResult;
import model.validacao.validador.Validator;

/**
 * Estratégia de execução que interrompe a execução caso encontre validações
 * negativas.
 *
 * @author G0042204
 */
public class CondicionalStrategy implements ExecutionStrategy {

    @Override
    public void action(FullTestGenericFacade ft) {
        for (Validator v : ft.getBateria()) {
            ValidacaoResult r;
            try {
                r = v.validar();
                ft.getValids().add(r);
                if (!r.getResultado()) {
                    ft.setResultado(r.getResultado());
                    ft.setMensagem(r.getMensagem());
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                ft.setResultado(Boolean.FALSE);
                ft.setMensagem(e.getMessage());
            }
        }

    }

}
