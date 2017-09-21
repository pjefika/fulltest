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

/**
 * Estratégia de execução que interrompe a execução caso encontre validações
 * negativas.
 *
 * @author G0042204
 */
public class ForcedStrategy implements ExecutionStrategy {

    private static final Logger LOG = Logger.getLogger(ForcedStrategy.class.getName());

    @Override
    public void action(FullTestGenericFacade ft) {
        try {
            ft.getBateria().forEach((v) -> {
                try {
                    ValidacaoResult r = v.validar();
                    if (r != null) {
                        ft.getValids().add(r);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(ForcedStrategy.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        } catch (Exception e) {
            LOG.log(Level.INFO, e.getMessage());
            if (e instanceof SemGerenciaException) {
                throw e;
            }

            ft.setMensagem(e.getMessage());
            ft.setResultado(Boolean.FALSE);
        }

    }

}
