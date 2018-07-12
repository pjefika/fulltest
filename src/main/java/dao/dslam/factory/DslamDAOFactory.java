/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.factory;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.efika_customer.model.customer.enums.TipoRede;
import br.net.gvt.efika.fulltest.exception.DslamNaoImplException;
import br.net.gvt.efika.fulltest.exception.FalhaInventarioRedeException;
import br.net.gvt.efika.fulltest.exception.InventarioRedeIncompletoException;
import dao.dslam.impl.AbstractDslam;

/**
 *
 * @author G0042204
 */
public class DslamDAOFactory {

    public static AbstractDslam getInstance(String modelo, String ip) throws DslamNaoImplException {
        try {
            return DslamGponDAOFactory.getInstance(modelo, ip);
        } catch (DslamNaoImplException e) {
            return DslamMetalicoDAOFactory.getInstance(modelo, ip);
        }
    }

    public static AbstractDslam getInstance(InventarioRede r) throws Exception {
        validar(r);
        if (r.getTipo() == TipoRede.GPON) {
            return DslamGponDAOFactory.getInstance(r.getModeloDslam(), r.getIpDslam());
        }
        return DslamMetalicoDAOFactory.getInstance(r.getModeloDslam(), r.getIpDslam());

    }

    public static void validar(InventarioRede rede) throws Exception {
        if (rede == null) {
            throw new FalhaInventarioRedeException();
        } else {
            if (rede.getIpDslam() == null || rede.getModeloDslam() == null) {
                throw new InventarioRedeIncompletoException();
            }
        }
    }

}
