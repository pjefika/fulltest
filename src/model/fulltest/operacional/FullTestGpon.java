/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.factory.DslamGponDAOFactory;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.impl.ConsultaGponDefault;
import java.util.ArrayList;
import java.util.List;
import model.validacao.Validacao;
import model.validacao.Validator;
import model.validacao.realtime.gpon.ValidacaoRtEstadoAdmPorta;
import model.validacao.realtime.gpon.ValidacaoRtEstadoOperPorta;
import model.validacao.realtime.gpon.ValidacaoRtParametrosGpon;
import model.validacao.realtime.gpon.ValidacaoRtProfile;
import model.validacao.realtime.gpon.ValidacaoRtSerialOntGpon;
import model.validacao.realtime.gpon.ValidacaoRtVlanBanda;

/**
 *
 * @author G0042204
 */
public class FullTestGpon implements Validator {

    private final EfikaCustomer cl;

    private List<Validacao> bateria;

    private List<Validacao> valids;

    private ConsultaGponDefault dslam;

    public FullTestGpon(EfikaCustomer cl) throws DslamNaoImplException {
        this.cl = cl;
        valids = new ArrayList<>();
        preparaDslam();
        preparaBateria();
    }

    private void preparaDslam() throws DslamNaoImplException {
        InventarioRede rede = cl.getRede();
        dslam = (ConsultaGponDefault) DslamGponDAOFactory.getInstance(rede.getModeloDslam(), rede.getIpDslam());
    }

    private void preparaBateria() {
        bateria = new ArrayList<>();
        bateria.add(new ValidacaoRtSerialOntGpon(dslam, cl));
        bateria.add(new ValidacaoRtEstadoAdmPorta(dslam, cl));
        bateria.add(new ValidacaoRtEstadoOperPorta(dslam, cl));
        bateria.add(new ValidacaoRtParametrosGpon(dslam, cl));
        bateria.add(new ValidacaoRtProfile(dslam, cl));
        bateria.add(new ValidacaoRtVlanBanda(dslam, cl));
    }

    @Override
    public Boolean validar() {
        for (Validacao v : bateria) {
            Boolean res = v.validar();
            valids.add(v);
            if (!res) {
                dslam.desconectar();
                return false;
            }
        }

        dslam.desconectar();
        return true;
    }

    public List<Validacao> getValids() {
        return valids;
    }

}
