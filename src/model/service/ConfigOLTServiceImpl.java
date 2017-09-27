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
import java.util.ArrayList;
import java.util.List;
import model.dslam.config.ConfiguracaoOLT;
import model.dslam.consulta.VlanAbstract;

public class ConfigOLTServiceImpl extends ConfigGenericService implements ConfigOLTService {

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
        olt.setProfile(c.getProfile(i));
        olt.setSerial(c.getSerialOnt(i));
        List<VlanAbstract> lVlans = new ArrayList<>();
        lVlans.add(c.getVlanBanda(i));
        lVlans.add(c.getVlanVoip(i));
        lVlans.add(c.getVlanVod(i));
        lVlans.add(c.getVlanMulticast(i));
        olt.setVlans(lVlans);
        
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
