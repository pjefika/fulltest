/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.TipoRede;
import dao.dslam.impl.AbstractDslam;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
        Locale local = new Locale("manobra", "CO");

        bateria.add(new CorretorEstadoAdmPorta(dslam, cust, local));
        bateria.add(new CorretorProfile(dslam, cust, local));

        bateria.add(new CorretorVlanBanda(dslam, cust, local));
        bateria.add(new CorretorVlanVoip(dslam, cust, local));
        bateria.add(new CorretorVlanVod(dslam, cust, local));

        return bateria;
    }

    public static List<Validator> crm(AbstractDslam dslam, EfikaCustomer cust) {
        List<Validator> bateria = new ArrayList<>();
        Locale local = new Locale("crm", "CRM");
        bateria.add(new CorretorEstadoAdmPorta(dslam, cust, local));
        bateria.add(new ValidadorEstadoOperPorta(dslam, cust, local));
        bateria.add(new ValidadorSerialOntGpon(dslam, cust, local));
//        bateria.add(new ValidacaoRtAlarmes(dslam, cl));
        bateria.add(new ValidadorParametrosGpon(dslam, cust, local));
        bateria.add(new CorretorProfile(dslam, cust, local));
        bateria.add(new CorretorVlanBanda(dslam, cust, local));
        bateria.add(new CorretorVlanVoip(dslam, cust, local));
        bateria.add(new CorretorVlanVod(dslam, cust, local));
        bateria.add(new CorretorVlanMulticast(dslam, cust, local));
        bateria.add(new ValidadorDeviceMAC(dslam, cust, local));

        return bateria;
    }

    public static List<Validator> co(AbstractDslam dslam, EfikaCustomer cust) {
        List<Validator> bateria = new ArrayList<>();
        Locale local = new Locale("manobra", "CO");

        if (cust.getRede().getTipo() == TipoRede.GPON) {
            bateria.add(new ValidadorSerialOntGpon(dslam, cust, local));
        }

        bateria.add(new CorretorEstadoAdmPorta(dslam, cust, local));
        bateria.add(new ValidadorEstadoOperPorta(dslam, cust, local));
//        bateria.add(new ValidacaoRtAlarmes(dslam, cl));

        if (cust.getRede().getTipo() == TipoRede.GPON) {
            bateria.add(new ValidadorParametrosGpon(dslam, cust, local));
        }

        bateria.add(new CorretorProfile(dslam, cust, local));
        bateria.add(new CorretorVlanBanda(dslam, cust, local));
        bateria.add(new CorretorVlanVoip(dslam, cust, local));
        bateria.add(new CorretorVlanVod(dslam, cust, local));
        bateria.add(new CorretorVlanMulticast(dslam, cust, local));
        bateria.add(new ValidadorDeviceMAC(dslam, cust, local));

        return bateria;
    }

    public static List<Validator> link(AbstractDslam dslam, EfikaCustomer cust) {
        List<Validator> bateria = new ArrayList<>();
        Locale local = new Locale("co", "CO");
        bateria.add(new ValidadorSerialOntGpon(dslam, cust, local));
        bateria.add(new CorretorEstadoAdmPorta(dslam, cust, local));
        bateria.add(new ValidadorEstadoOperPorta(dslam, cust, local));
//        bateria.add(new ValidacaoRtAlarmes(dslam, cl));
        bateria.add(new ValidadorParametrosGpon(dslam, cust, local));
        bateria.add(new CorretorProfile(dslam, cust, local));
        bateria.add(new CorretorVlanBanda(dslam, cust, local));
        bateria.add(new CorretorVlanVoip(dslam, cust, local));
        bateria.add(new CorretorVlanVod(dslam, cust, local));
        bateria.add(new CorretorVlanMulticast(dslam, cust, local));
        bateria.add(new ValidadorDeviceMAC(dslam, cust, local));

        return bateria;
    }

}
