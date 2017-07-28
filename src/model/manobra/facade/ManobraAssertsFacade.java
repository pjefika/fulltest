/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.facade;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.ArrayList;
import java.util.List;
import model.manobra.MotivoManobraEnum;
import model.manobra.analitcs.AnaliseMotivo;
import model.manobra.analitcs.AnaliseMotivoGeneric;
import model.manobra.analitcs.Analiser;

/**
 *
 * @author G0042204
 */
public class ManobraAssertsFacade implements AssertsManobraFacade{

    private final EfikaCustomer e;

    public ManobraAssertsFacade(EfikaCustomer e) {
        this.e = e;
    }

    @Override
    public List<AnaliseMotivo> run() {
        List<AnaliseMotivo> list = new ArrayList<>();
        for (MotivoManobraEnum v : MotivoManobraEnum.values()) {
            Analiser a = new AnaliseMotivoGeneric(e.getAsserts(), v);
            AnaliseMotivo result = a.run();
            list.add(result);
        }
        return list;
    }

}
