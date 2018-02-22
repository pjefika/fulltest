/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.strategy;

import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import exception.SemGerenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.fulltest.operacional.facade.FullTestGenericFacade;
import model.validacao.impl.realtime.Validator;

/**
 * Estratégia de execução que interrompe a execução caso encontre validações
 * negativas.
 *
 * @author G0042204
 */
public class CondicionalStrategy implements ExecutionStrategy {

    private static final Logger LOG = Logger.getLogger(CondicionalStrategy.class.getName());

    @Override
    public void action(FullTestGenericFacade ft) throws Exception {
        for (Validator v : ft.getBateria()) {
            ValidacaoResult r;
            try {
                r = v.validar();
                if (r != null) {
                    ft.getValids().add(r);
                    if (!r.getResultado()) {
                        ft.setResultado(r.getResultado());
                        ft.setMensagem(r.getMensagem());
                        return;
                    }
                }
            } catch (Exception e) {
                if (e instanceof FuncIndisponivelDslamException) {
                } else {
                    LOG.log(Level.INFO, e.getMessage());
                    ft.setResultado(Boolean.FALSE);
                    ft.setMensagem(e.getMessage());
                    if (e instanceof SemGerenciaException) {
                        throw e;
                    }
                }
            }
        }

    }
}
