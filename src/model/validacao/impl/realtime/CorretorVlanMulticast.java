/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.FalhaAoCorrigirException;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoVlanMulticast;
import model.validacao.impl.both.ValidacaoVlanMulticastComPacotes;

/**
 *
 * @author G0042204
 */
public class CorretorVlanMulticast extends Corretor {

    public CorretorVlanMulticast(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            alter.deleteVlanMulticast(cust.getRede());
            try {
                valid = new ValidacaoVlanMulticast(alter.createVlanMulticast(cust.getRede()), cust, bundle.getLocale());
            } catch (Exception e) {
                throw new FalhaAoCorrigirException();
            }
        } catch (Exception e) {
            try {
                valid = new ValidacaoVlanMulticast(alter.createVlanMulticast(cust.getRede()), cust, bundle.getLocale());
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
        return new ValidacaoVlanMulticast(consulta.getVlanMulticast(cust.getRede()), cust, bundle.getLocale());
    }

}
