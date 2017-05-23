/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import java.rmi.RemoteException;
import model.Motivos;
import model.dslam.factory.exception.DslamNaoImplException;
import model.dslam.factory.exception.FuncIndisponivelDslamException;
import model.entity.Cliente;
import model.validacao.ValidacaoRede;
import model.validacao.manobra.ValidacaoRedeManobra;

/**
 *
 * @author G0042204
 */
public class ValidaClienteManobraQuedasFacade extends ValidaClienteManobraFacade {

    public ValidaClienteManobraQuedasFacade(Cliente cl, Motivos m, String workOrderId) {
        super(cl, Motivos.QUEDA, workOrderId);
    }

    public ValidaClienteManobraQuedasFacade(){
        super(null, Motivos.QUEDA, null);
    }

    @Override
    public void validar() throws DslamNaoImplException, RemoteException, Exception, FuncIndisponivelDslamException {
        super.validar();
        ValidacaoRede vR = new ValidacaoRedeManobra(met.getTabelaRede(), m);
        valids.add(vR);
        conclusao.setConclusao(vR.validar());
        conclusao.setFraseologia(vR.getMensagem());
        this.finalizar();
    }

}
