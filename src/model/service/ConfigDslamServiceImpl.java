/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.ConsultaMetalicoDefault;
import model.dslam.config.ConfiguracaoDslam;

public class ConfigDslamServiceImpl extends ConfigGenericService implements ConfigPortaService<ConfiguracaoDslam> {

    public ConfigDslamServiceImpl(EfikaCustomer ec) {
        super(ec);
    }

    @Override
    public ConfiguracaoDslam consultar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ConsultaMetalicoDefault consulta() throws Exception {
        try {
            return (ConsultaMetalicoDefault) getDslam();
        } catch (ClassCastException e) {
            throw new FuncIndisponivelDslamException();
        }
    }

}
