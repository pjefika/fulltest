/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import java.rmi.RemoteException;
import model.Motivos;
import model.dslam.consulta.EstadoDaPorta;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import model.entity.Cliente;
import model.validacao.ValidacaoAutenticacao;
import model.validacao.ValidacaoEstadoPortaAdm;
import model.validacao.ValidacaoRede;
import model.validacao.ValidacaoVlanBanda;
import model.validacao.manobra.ValidacaoEstadoPortaManobra;
import model.validacao.manobra.ValidacaoRedeManobra;

/**
 *
 * @author G0042204
 */
public class ValidaClienteManobraSemSincFacade extends ValidaClienteManobraFacade {

    public ValidaClienteManobraSemSincFacade(Cliente cl, String workOrderId){
        super(cl, Motivos.SEMSINC, workOrderId);
    }

    public ValidaClienteManobraSemSincFacade(){
        super(null, Motivos.SEMSINC, null);
    }
    
    

    @Override
    public void validar() throws DslamNaoImplException, RemoteException, Exception, FuncIndisponivelDslamException {
        super.validar();
        ValidacaoAutenticacao vA = new ValidacaoAutenticacao(cl.getAuth(), workOrder, m);
        Boolean result = vA.validar();
        valids.add(vA);

        if (result) {
            EstadoDaPorta ep = met.getEstadoDaPorta();
            ValidacaoEstadoPortaAdm vEP = new ValidacaoEstadoPortaManobra(ep, m);
            valids.add(vEP);
            if (vEP.validar()) {
                ValidacaoVlanBanda vlanValid = new ValidacaoVlanBanda(met.getVlanBanda(), dslam);
                valids.add(vlanValid);

                if (vlanValid.validar()) {
                    ValidacaoRede vR = new ValidacaoRedeManobra(met.getTabelaRede(), m);
                    valids.add(vR);

                    conclusao.setConclusao(vR.validar());
                    conclusao.setFraseologia(vR.getMensagem());
                } else {
                    conclusao.setConclusao(vlanValid.getResultado());
                    conclusao.setFraseologia(vlanValid.getMensagem());
                }
            } else {
                conclusao.setConclusao(vEP.getResultado());
                conclusao.setFraseologia(vEP.getMensagem());
            }
        } else {
            conclusao.setConclusao(vA.getResultado());
            conclusao.setFraseologia(vA.getMensagem());
        }
        this.finalizar();
    }

}
