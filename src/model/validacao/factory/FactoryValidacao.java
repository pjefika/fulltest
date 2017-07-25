/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.factory;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import java.util.ArrayList;
import java.util.List;
import model.validacao.validador.Validator;
import model.validacao.realtime.gpon.ValidadorDeviceMAC;
import model.validacao.realtime.gpon.ValidadorEstadoAdmPorta;
import model.validacao.realtime.gpon.ValidadorEstadoOperPorta;
import model.validacao.realtime.gpon.ValidadorParametrosGpon;
import model.validacao.realtime.gpon.ValidadorSerialOntGpon;
import model.validacao.realtime.gpon.ValidadorVlanBanda;
import model.validacao.realtime.gpon.ValidadorVlanVod;
import model.validacao.realtime.gpon.ValidadorVlanVoip;
import model.validacao.realtime.gpon.corretiva.CorretorEstadoAdmPorta;
import model.validacao.realtime.gpon.corretiva.CorretorProfile;
import model.validacao.realtime.gpon.corretiva.CorretorVlanBanda;
import model.validacao.realtime.gpon.corretiva.CorretorVlanMulticast;
import model.validacao.realtime.gpon.corretiva.CorretorVlanVod;
import model.validacao.realtime.gpon.corretiva.CorretorVlanVoip;

/**
 *
 * @author G0042204
 */
public class FactoryValidacao {

    public static List<Validator> manobra(AbstractDslam dslam, EfikaCustomer cust) {
        List<Validator> bateria = new ArrayList<>();
        
        bateria.add(new ValidadorEstadoAdmPorta(dslam, cust));
        bateria.add(new ValidadorVlanBanda(dslam, cust));
        bateria.add(new ValidadorVlanVoip(dslam, cust));
        bateria.add(new ValidadorVlanVod(dslam, cust));
        
//        bateria.add(new CorretorEstadoAdmPorta(dslam, cust));
//        bateria.add(new CorretorVlanBanda(dslam, cust));
//        bateria.add(new CorretorVlanVoip(dslam, cust));
//        bateria.add(new CorretorVlanVod(dslam, cust));
//        bateria.add(new CorretorVlanMulticast(dslam, cust));
        return bateria;
    }

    public static List<Validator> crm(AbstractDslam dslam, EfikaCustomer cust) {
        List<Validator> bateria = new ArrayList<>();
        bateria.add(new ValidadorSerialOntGpon(dslam, cust));
        bateria.add(new CorretorEstadoAdmPorta(dslam, cust));
        bateria.add(new ValidadorEstadoOperPorta(dslam, cust));
//        bateria.add(new ValidacaoRtAlarmes(dslam, cl));
        bateria.add(new ValidadorParametrosGpon(dslam, cust));
        bateria.add(new CorretorProfile(dslam, cust));
        bateria.add(new CorretorVlanBanda(dslam, cust));
        bateria.add(new CorretorVlanVoip(dslam, cust));
        bateria.add(new CorretorVlanVod(dslam, cust));
        bateria.add(new CorretorVlanMulticast(dslam, cust));
        bateria.add(new ValidadorDeviceMAC(dslam, cust));

        return bateria;
    }

    public static List<Validator> link(AbstractDslam dslam, EfikaCustomer cust) {
        List<Validator> bateria = new ArrayList<>();
        bateria.add(new ValidadorSerialOntGpon(dslam, cust));
        bateria.add(new CorretorEstadoAdmPorta(dslam, cust));
        bateria.add(new ValidadorEstadoOperPorta(dslam, cust));
//        bateria.add(new ValidacaoRtAlarmes(dslam, cl));
        bateria.add(new ValidadorParametrosGpon(dslam, cust));
        bateria.add(new CorretorProfile(dslam, cust));
        bateria.add(new CorretorVlanBanda(dslam, cust));
        bateria.add(new CorretorVlanVoip(dslam, cust));
        bateria.add(new CorretorVlanVod(dslam, cust));
        bateria.add(new CorretorVlanMulticast(dslam, cust));
        bateria.add(new ValidadorDeviceMAC(dslam, cust));

        return bateria;
    }

}
