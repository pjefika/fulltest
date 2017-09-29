/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import java.util.ArrayList;
import java.util.List;
import model.validacao.impl.realtime.gpon.ValidadorDeviceMAC;
import model.validacao.impl.realtime.gpon.ValidadorParametrosGpon;
import model.validacao.impl.realtime.gpon.ValidadorSerialOntGpon;

/**
 *
 * @author G0042204
 */
public class FactoryValidador {

    public static List<Validator> manobra(AbstractDslam dslam, EfikaCustomer cust) {
        List<Validator> bateria = new ArrayList<>();

        bateria.add(new CorretorEstadoAdmPorta(dslam, cust));
        bateria.add(new CorretorProfile(dslam, cust));

        bateria.add(new CorretorVlanBanda(dslam, cust));
        bateria.add(new CorretorVlanVoip(dslam, cust));
        bateria.add(new CorretorVlanVod(dslam, cust));

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
