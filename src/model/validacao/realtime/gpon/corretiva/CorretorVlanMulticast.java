/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.FalhaAoCorrigirException;
import dao.dslam.impl.AbstractDslam;
import model.validacao.impl.Validacao;
import model.validacao.impl.ValidacaoVlanMulticast;
import model.validacao.realtime.Corretor;

/**
 *
 * @author G0042204
 */
public class CorretorVlanMulticast extends Corretor {

    public CorretorVlanMulticast(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            alter.deleteVlanMulticast(cust.getRede());
            try {
                valid = new ValidacaoVlanMulticast(alter.createVlanMulticast(cust.getRede()), cust);
            } catch (Exception e) {
                throw new FalhaAoCorrigirException();
            }
        } catch (Exception e) {
            try {
                valid = new ValidacaoVlanMulticast(alter.createVlanMulticast(cust.getRede()), cust);
            } catch (Exception ex) {
                throw new FalhaAoCorrigirException();
            }
        }
    }

    @Override
    protected String fraseCorrecaoOk() {
        return "Efetuado correção de bridge, solicite ao cliente que reinicialize o modem e teste novamente.";
    }

    @Override
    protected String fraseFalhaCorrecao() {
        return "Não foi possível corrigir o a bridge. Seguir o fluxo com o problema/sintoma informado pelo cliente.";
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoVlanMulticast(consulta.getVlanMulticast(cust.getRede()), cust);
    }

}
