/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.exception.FalhaAoCorrigirException;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoProfile;

/**
 *
 * @author G0041775
 */
public class CorretorProfile extends Corretor {

    public CorretorProfile(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            getPreresults().add(alter.setProfileDown(cust.getRede(), Velocidades.find(cust.getServicos().getVelDown())));
            valid =  this.consultar();
            if (!valid.validar().getResultado()) {
                getPreresults().add(alter.setProfileUp(cust.getRede(), Velocidades.find(cust.getServicos().getVelDown()), Velocidades.find(cust.getServicos().getVelUp())));
                valid = this.consultar();
                valid.validar();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new FalhaAoCorrigirException();
        }
    }

    @Override
    protected String fraseCorrecaoOk() {
        return bundle.getString("correcaoProfile_ok");
    }

    @Override
    protected String fraseFalhaCorrecao() {
        return bundle.getString("correcaoProfile_nok");
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoProfile(consulta.getProfile(cust.getRede()), cust, bundle.getLocale());
    }

}
