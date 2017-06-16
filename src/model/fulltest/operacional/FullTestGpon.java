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
import exception.MetodoNaoImplementadoException;
import java.util.ArrayList;
import java.util.List;
import model.validacao.Validacao;
import model.validacao.Validator;
import model.validacao.realtime.gpon.ValidacaoRtDeviceMAC;
import model.validacao.realtime.gpon.ValidacaoRtEstadoAdmPorta;
import model.validacao.realtime.gpon.ValidacaoRtEstadoOperPorta;
import model.validacao.realtime.gpon.ValidacaoRtParametrosGpon;
import model.validacao.realtime.gpon.ValidacaoRtProfile;
import model.validacao.realtime.gpon.ValidacaoRtSerialOntGpon;
import model.validacao.realtime.gpon.ValidacaoRtVlanBanda;
import model.validacao.realtime.gpon.ValidacaoRtVlanMulticast;
import model.validacao.realtime.gpon.ValidacaoRtVlanVod;
import model.validacao.realtime.gpon.ValidacaoRtVlanVoip;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 * @author G0042204
 */
@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true, value = {"cl", "dslam", "bateria"})
public class FullTestGpon implements Validator {

    private final EfikaCustomer cl;

    private List<Validacao> bateria;

    private List<Validacao> valids;

    private ConsultaGponDefault dslam;

    public FullTestGpon(EfikaCustomer cl) throws DslamNaoImplException {
        this.cl = cl;
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
        bateria.add(new ValidacaoRtVlanVoip(dslam, cl));
        bateria.add(new ValidacaoRtVlanVod(dslam, cl));
        bateria.add(new ValidacaoRtVlanMulticast(dslam, cl));
        bateria.add(new ValidacaoRtDeviceMAC(dslam, cl));
    }

    @Override
    public Boolean validar() {
        valids = new ArrayList<>();
        for (Validacao v : bateria) {
            Boolean res;
            try {
                res = v.validar();
                valids.add(v);
            } catch (MetodoNaoImplementadoException e) {
                res = true;
            }

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
