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
import model.validacao.impl.both.ValidacaoVlanBanda;

/**
 *
 * @author G0042204
 */
public class CorretorVlanBandaLight extends Corretor {

    public CorretorVlanBandaLight(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
        nome = "Vlan Banda";
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
//            getPreresults().add(alter.(cust.getRede()));
            try {
                valid = new ValidacaoVlanBanda(alter.createVlanBanda(cust.getRede(), Velocidades.valueOf("VEL_" + cust.getServicos().getVelDown()), Velocidades.valueOf("VEL_" + cust.getServicos().getVelUp())), cust, bundle.getLocale());
            } catch (Exception e) {
                try {
                    valid = new ValidacaoVlanBanda(alter.createVlanBanda(cust.getRede(), Velocidades.VEL_1024, Velocidades.VEL_1024), cust, bundle.getLocale());
                } catch (Exception x) {
                    throw new FalhaAoCorrigirException();
                }

            }
        } catch (Exception ex) {
            try {
                valid = new ValidacaoVlanBanda(alter.createVlanBanda(cust.getRede(), Velocidades.valueOf("VEL_" + cust.getServicos().getVelDown()), Velocidades.valueOf("VEL_" + cust.getServicos().getVelUp())), cust, bundle.getLocale());
            } catch (Exception e) {
                try {
                    valid = new ValidacaoVlanBanda(alter.createVlanBanda(cust.getRede(), Velocidades.VEL_1024, Velocidades.VEL_1024), cust, bundle.getLocale());
                } catch (Exception exc) {
                    throw new FalhaAoCorrigirException();
                }

            }
        }
    }

    @Override
    protected String fraseCorrecaoOk() {
        return bundle.getString("correcaoVlan_ok");
    }

    @Override
    protected String fraseFalhaCorrecao() {
        return bundle.getString("correcaoVlan_nok");
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoVlanBanda(consulta.getVlanBanda(cust.getRede()), cust, bundle.getLocale());
    }

}
