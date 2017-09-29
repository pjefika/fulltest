/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.ConsultaGponDefault;
import model.dslam.config.ConfiguracaoOLT;
import model.dslam.config.ProfileGpon;

public class ConfigOLTServiceImpl extends ConfigGenericService implements ConfigPortaService<ConfiguracaoOLT> {

    public ConfigOLTServiceImpl(EfikaCustomer ec) {
        super(ec);
    }

    @Override
    public ConfiguracaoOLT consultar() throws Exception {
        ConfiguracaoOLT olt = new ConfiguracaoOLT();
        InventarioRede i = getEc().getRede();
        ConsultaGponDefault c = consulta();
        olt.setEstadoPorta(c.getEstadoDaPorta(i));
        olt.setParametros(c.getTabelaParametros(i));
        
        
        ProfileGpon pg = new ProfileGpon();
        pg.setAtual(c.getProfile(i));
        pg.setDownValues(this.getDslam().listarVelocidadesDown());
        pg.setUpValues(this.getDslam().listarVelocidadesUp());
        
        olt.setProfile(pg);
        olt.setSerial(c.getSerialOnt(i));
        olt.setVlanBanda(c.getVlanBanda(i));
        olt.setVlanVoip(c.getVlanVoip(i));
        olt.setVlanVod(c.getVlanVod(i));
        olt.setVlanMulticast(c.getVlanMulticast(i));
        
        
        return olt;
    }

    @Override
    public ConsultaGponDefault consulta() throws Exception {
        try {
            return (ConsultaGponDefault) getDslam();
        } catch (ClassCastException e) {
            throw new FuncIndisponivelDslamException();
        }
    }

}
