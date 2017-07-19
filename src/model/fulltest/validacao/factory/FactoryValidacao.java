/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.validacao.factory;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import java.util.ArrayList;
import java.util.List;
import model.validacao.Validacao;
import model.validacao.realtime.gpon.ValidacaoRtDeviceMAC;
import model.validacao.realtime.gpon.ValidacaoRtEstadoOperPorta;
import model.validacao.realtime.gpon.ValidacaoRtParametrosGpon;
import model.validacao.realtime.gpon.ValidacaoRtSerialOntGpon;
import model.validacao.realtime.gpon.corretiva.ValidacaoCorretivaRtEstadoAdmPorta;
import model.validacao.realtime.gpon.corretiva.ValidacaoCorretivaRtProfile;
import model.validacao.realtime.gpon.corretiva.ValidacaoCorretivaRtVlanBanda;
import model.validacao.realtime.gpon.corretiva.ValidacaoCorretivaRtVlanMulticast;
import model.validacao.realtime.gpon.corretiva.ValidacaoCorretivaRtVlanVod;
import model.validacao.realtime.gpon.corretiva.ValidacaoCorretivaRtVlanVoip;

/**
 *
 * @author G0042204
 */
public class FactoryValidacao {

    public static List<Validacao> manobra(AbstractDslam dslam, EfikaCustomer cust) {
        List<Validacao> lst = new ArrayList<>();
        return lst;
    }

    public static List<Validacao> crm(AbstractDslam dslam, EfikaCustomer cust) {
        List<Validacao> bateria = new ArrayList<>();
        bateria.add(new ValidacaoRtSerialOntGpon(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtEstadoAdmPorta(dslam, cust));
        bateria.add(new ValidacaoRtEstadoOperPorta(dslam, cust));
//        bateria.add(new ValidacaoRtAlarmes(dslam, cl));
        bateria.add(new ValidacaoRtParametrosGpon(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtProfile(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtVlanBanda(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtVlanVoip(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtVlanVod(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtVlanMulticast(dslam, cust));
        bateria.add(new ValidacaoRtDeviceMAC(dslam, cust));

        return bateria;
    }

    public static List<Validacao> link(AbstractDslam dslam, EfikaCustomer cust) {
        List<Validacao> bateria = new ArrayList<>();
        bateria.add(new ValidacaoRtSerialOntGpon(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtEstadoAdmPorta(dslam, cust));
        bateria.add(new ValidacaoRtEstadoOperPorta(dslam, cust));
//        bateria.add(new ValidacaoRtAlarmes(dslam, cl));
        bateria.add(new ValidacaoRtParametrosGpon(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtProfile(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtVlanBanda(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtVlanVoip(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtVlanVod(dslam, cust));
        bateria.add(new ValidacaoCorretivaRtVlanMulticast(dslam, cust));
        bateria.add(new ValidacaoRtDeviceMAC(dslam, cust));

        return bateria;
    }

}
