/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.factory.exception.CorrecaoInterruptoraException;
import dao.dslam.factory.exception.FalhaAoCorrigirException;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoEstadoPortaAdm;

/**
 *
 * @author G0041775
 */
public class CorretorEstadoAdmPorta extends Corretor {

    private EstadoDaPorta ep;

    public CorretorEstadoAdmPorta(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    public ValidavelAbs getObject() {
        return ep;
    }

    @Override
    protected void corrigir() throws FalhaAoCorrigirException {
        try {
            ep.setAdminState(Boolean.TRUE);
            ValidacaoEstadoPortaAdm v;
            v = new ValidacaoEstadoPortaAdm(alter.setEstadoDaPorta(cust.getRede(), ep), bundle.getLocale());

            v.validar();
            this.setValid(v);
        } catch (Exception e) {
            throw new FalhaAoCorrigirException();
        }
    }

    @Override
    protected Validacao consultar() throws Exception {

        try {
            ep = consulta.getEstadoDaPorta(cust.getRede());
        } catch (Exception e) {
            try {
                System.out.println("criandoblan");
                alter.createVlanBanda(cust.getRede(), Velocidades.find(cust.getServicos().getVelDown()), Velocidades.find(cust.getServicos().getVelDown()));
                alter.createVlanVoip(cust.getRede());
                throw new CorrecaoInterruptoraException("Foi necessária a criação da porta Lógica, por favor, teste novamente em instantes.");
            } catch (Exception e1) {
                System.out.println("faiocriandoblan");
                throw e1;
            }
        }

        return new ValidacaoEstadoPortaAdm(ep, bundle.getLocale());
    }

    @Override
    protected String fraseCorrecaoOk() {
        return bundle.getString("correcaoEstadoAdm_ok");
    }

    @Override
    protected String fraseFalhaCorrecao() {
        return bundle.getString("correcaoEstadoAdm_nok");
    }

}
