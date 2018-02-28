/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.enumsservice;

import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaLinha;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaTv;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0041775
 */
public class EnumService {
    
    public EnumService() {
    }
    
    public static List<Long> getVelocidades() {
        List<Long> l = new ArrayList<>();
        Velocidades[] values = Velocidades.values();
        for (Velocidades value : values) {
            l.add(new Long(value.toString().substring(4)));
        }
        return l;
    }
    
    public static List<String> getTecnologiasTv() {
        List<String> l = new ArrayList<>();
        TecnologiaTv[] values = TecnologiaTv.values();
        for (TecnologiaTv value : values) {
            l.add(value.toString());
        }
        return l;
    }
    
    public static List<String> getTecnologiasVoz() {
        List<String> l = new ArrayList<>();
        TecnologiaLinha[] values = TecnologiaLinha.values();
        for (TecnologiaLinha value : values) {
            l.add(value.toString());
        }
        return l;
    }
    
}
