/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.FalhaAoCorrigirException;
import dao.dslam.impl.AbstractDslam;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dslam.velocidade.Velocidades;
import model.validacao.impl.Validacao;
import model.validacao.impl.ValidacaoVlanBanda;
import model.validacao.realtime.CorretorGpon;

/**
 *
 * @author G0042204
 */
public class CorretorVlanBanda extends CorretorGpon {

    public CorretorVlanBanda(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            alter.deleteVlanBanda(cust.getRede());
            valid = new ValidacaoVlanBanda(alter.createVlanBanda(cust.getRede(), Velocidades.valueOf("VEL_" + cust.getServicos().getVelDown()), Velocidades.valueOf("VEL_" + cust.getServicos().getVelUp())), cust);
        } catch (Exception ex) {
            throw new FalhaAoCorrigirException();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
