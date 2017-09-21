/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.strategy;

import exception.SemGerenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.fulltest.operacional.facade.FullTestGenericFacade;
import model.validacao.ValidacaoResult;
import model.validacao.validador.Validator;

/**
 * Estratégia de execução que interrompe a execução caso encontre validações
 * negativas.
 *
 * @author G0042204
 */
public class ForcedStrategy implements ExecutionStrategy {

    private static final Logger LOG = Logger.getLogger(ForcedStrategy.class.getName());

    @Override
    public void action(FullTestGenericFacade ft) throws Exception {

        for (Validator v : ft.getBateria()) {
            System.out.println("Valid");
            try {
                ValidacaoResult r = v.validar();
                if (r != null) {
                    ft.getValids().add(r);
                }
            } catch (Exception ex) {
                ft.setMensagem(ex.getMessage());
                ft.setResultado(Boolean.FALSE);
                if (ex instanceof SemGerenciaException) {
                    throw ex;
                }

            }
        }

    }

}
