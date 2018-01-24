/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.AlteracaoClienteInter;
import dao.dslam.impl.ConsultaClienteInter;
import fulltest.ValidacaoResult;
import java.util.Locale;
import model.validacao.impl.realtime.Validator;

/**
 *
 * @author G0042204
 */
public abstract class ConfigGenericService {

    private EfikaCustomer ec;

    private AbstractDslam dslam;
    
    protected transient Locale local = new Locale("co", "CO");

    public ConfigGenericService(EfikaCustomer ec) {
        this.ec = ec;
    }

    public EfikaCustomer getEc() {
        return ec;
    }

    public void setEc(EfikaCustomer ec) {
        this.ec = ec;
    }

    public AbstractDslam getDslam() throws Exception {
        if (dslam == null) {
            dslam = DslamDAOFactory.getInstance(ec.getRede());
        }
        return dslam;
    }

    public abstract ConsultaClienteInter consulta() throws Exception;

    public abstract AlteracaoClienteInter alteracao() throws Exception;

    public ValidacaoResult exec(Validator v) throws Exception {
        return v.validar();
    }
    

}
