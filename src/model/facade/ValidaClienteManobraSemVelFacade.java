/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import java.rmi.RemoteException;
import model.Motivos;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import model.entity.Cliente;
import model.validacao.ValidacaoParametros;
import model.validacao.ValidacaoRede;
import model.validacao.manobra.ValidacaoParametrosManobra;
import model.validacao.manobra.ValidacaoRedeManobra;

/**
 *
 * @author G0042204
 */
public class ValidaClienteManobraSemVelFacade extends ValidaClienteManobraFacade {

    public ValidaClienteManobraSemVelFacade(Cliente cl, Motivos m, String workOrderId){
        super(cl, Motivos.SEMVEL, workOrderId);
    }

    public ValidaClienteManobraSemVelFacade(){
        super(null, Motivos.SEMVEL, null);
    }

    @Override
    public void validar() throws DslamNaoImplException, RemoteException, Exception, FuncIndisponivelDslamException {
        super.validar();
        ValidacaoParametros vP = new ValidacaoParametrosManobra(met.getTabelaParametros(), dslam);
        valids.add(vP);

        if (!vP.validar()) {
            ValidacaoRede vR = new ValidacaoRedeManobra(met.getTabelaRede(), m);
            valids.add(vR);

            conclusao.setConclusao(vR.validar());
            conclusao.setFraseologia(vR.getMensagem());
        } else {
            conclusao.setConclusao(vP.validar());
            conclusao.setFraseologia(vP.getMensagem());
        }
        this.finalizar();
    }

}
