/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.metalico.DslamMetalico;
import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import model.fulltest.operacional.strategy.FactoryExecutionStrategy;
import model.validacao.impl.realtime.FactoryValidador;

/**
 *
 * @author G0042204
 */
public class FullTestManobraFacade extends FullTestGenericFacade implements FullTestInterface {

    @Override
    public FullTest executar(EfikaCustomer cl) throws Exception {
        super.exec(cl);
        return cast();
    }

    @Override
    void iniciar(EfikaCustomer e) throws Exception {
        super.iniciar(e);
        if (dslam instanceof DslamMetalico == false) {
            throw new FuncIndisponivelDslamException();
        } else {
            this.setExec(FactoryExecutionStrategy.forced());
            this.setBateria(FactoryValidador.manobra(dslam, cl));
        }
    }

//    @Override
//    void validar() {
//        super.validar();
//
//        // Adaptação de Fraseologia
//        getValids().forEach((t) -> {
//            if (!t.getResultado()) {
//                this.setResultado(Boolean.FALSE);
//                this.setMensagem(t.getMensagem());
//            }
//        });
//    }

    @Override
    protected void encerramento() {
        if (mensagem == null) {
            mensagem = "Não foram identificados problemas de configuração.";
        }

        if (resultado == null) {
            resultado = true;
        }
    }

}
