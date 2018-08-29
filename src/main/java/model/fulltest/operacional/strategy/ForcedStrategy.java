/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.strategy;

import br.net.gvt.efika.fulltest.exception.CorrecaoInterruptoraException;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.exception.SemGerenciaException;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import java.net.SocketException;
import java.util.logging.Logger;
import model.fulltest.operacional.facade.FullTestGenericFacade;
import model.log.ValidacaoEntityOperator;
import model.entity.ValidacaoEntity;
import model.validacao.impl.realtime.Validador;
import model.validacao.impl.realtime.Validator;

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
            System.out.println("Valid _> " + v.getClass().getSimpleName());
            try {
                ValidacaoEntity ve = ValidacaoEntityOperator.start((Validador) v, ft.getOwner());
                ValidacaoResult r = v.validar();
                ve = ValidacaoEntityOperator.end(ve, r);
                if (r != null) {
                    ft.getValids().add(r);
                }
            } catch (Exception ex) {
                System.out.println("Exec Exception -> " + ex.getMessage());
//                ex.printStackTrace();
                if (ex instanceof FuncIndisponivelDslamException) {

                } else {
                    ex.printStackTrace();
                    ft.setMensagem(ex.getMessage());
                    ft.setResultado(Boolean.FALSE);
                    if (ex instanceof SemGerenciaException) {
                        throw ex;
                    }
                    if (ex instanceof SocketException) {
                        throw new SemGerenciaException();
                    }
                    if (ex instanceof CorrecaoInterruptoraException) {
                        return;
                    }
                }
            }
        }

    }

}
