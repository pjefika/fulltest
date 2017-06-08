/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.impl.AbstractDslam;
import java.util.ArrayList;
import java.util.List;
import model.validacao.Validacao;
import model.validacao.Validator;
import model.validacao.realtime.gpon.ValidacaoRtEstadoAdmPorta;

/**
 *
 * @author G0042204
 */
public class FullTestGpon implements Validator {

    private EfikaCustomer cl;
    

    private List<Validacao> bateria;

    private List<Validacao> valids;

    public FullTestGpon(EfikaCustomer cl) throws DslamNaoImplException {
        this.cl = cl;
        bateria = new ArrayList<>();
        valids = new ArrayList<>();
        bateria.add(new ValidacaoRtEstadoAdmPorta(DslamDAOFactory.getInstance(cl.getRede().getModeloDslam()), this.cl));
    }

    @Override
    public Boolean validar() {

        for (Validacao v : bateria) {
            Boolean res = v.validar();
            valids.add(v);
            if (!res) {
                return false;
            }
        }
        return true;
    }

}
