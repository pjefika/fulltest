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
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.ConsultaGponDefault;
import exception.MetodoNaoImplementadoException;
import java.util.ArrayList;
import java.util.Calendar;
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
public class FullTestGponFacade extends FullTestFacade implements FullTestInterface, Validator {

    protected ConsultaGponDefault cg;

    public FullTestGponFacade(EfikaCustomer cl) throws DslamNaoImplException, FuncIndisponivelDslamException {
        super(cl);
    }

    @Override
    protected void preparaBateria() {
        bateria = new ArrayList<>();
        bateria.add(new ValidacaoRtSerialOntGpon(dslam, cl));
        bateria.add(new ValidacaoRtEstadoAdmPorta(dslam, cl));
        bateria.add(new ValidacaoRtEstadoOperPorta(dslam, cl));
//        bateria.add(new ValidacaoRtAlarmes(dslam, cl));
        bateria.add(new ValidacaoRtParametrosGpon(dslam, cl));
        bateria.add(new ValidacaoRtProfile(dslam, cl));
        bateria.add(new ValidacaoRtVlanBanda(dslam, cl));
        bateria.add(new ValidacaoRtVlanVoip(dslam, cl));
        bateria.add(new ValidacaoRtVlanVod(dslam, cl));
        bateria.add(new ValidacaoRtVlanMulticast(dslam, cl));
        bateria.add(new ValidacaoRtDeviceMAC(dslam, cl));

    }

    @Override
    public Boolean validar() throws Exception {
        valids = new ArrayList<>();
        dataInicio = Calendar.getInstance();
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
                mensagem = "Mensagem Negativa.";
                dataFim = Calendar.getInstance();
                return false;
            }
        }

        dslam.desconectar();
        mensagem = "Mensagem Positiva";
        dataFim = Calendar.getInstance();
        return true;
    }

    public List<Validacao> getValids() {
        return valids;
    }

    @Override
    public FullTest executar() throws Exception {
        resultado = validar();
        return FullTestAdapter.adapter(this);
    }

    @Override
    protected void preparaDslam() throws DslamNaoImplException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Validacao> carregarValidacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
