/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

import br.net.gvt.efika.asserts.AssertsEnum;
import br.net.gvt.efika.customer.CustomerAssert;
import java.util.ArrayList;
import java.util.List;
import model.manobra.ConclusaoMotivo;
import model.manobra.MotivoManobraEnum;

/**
 *
 * @author G0042204
 */
public class FactoryCriterio {

    public static List<CriterioMotivo> obter(MotivoManobraEnum m) {
        List<CriterioMotivo> lst = new ArrayList<>();
        switch (m) {
            case AUTH_SINC:
                CriterioMotivo c = new CriterioMotivo();
                c.setMotivo(MotivoManobraEnum.AUTH_SINC);
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.AUTH_ABERTURA_ORDEM, Boolean.TRUE));
                c.setConclusao(ConclusaoMotivo.PORTA_OK);
                lst.add(c);

                c = new CriterioMotivo();
                c.setMotivo(MotivoManobraEnum.AUTH_SINC);
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.AUTH_ABERTURA_ORDEM, Boolean.FALSE));
                c.setConclusao(ConclusaoMotivo.PORTA_NOK);
                lst.add(c);

                break;
        }

        return lst;
    }

}
