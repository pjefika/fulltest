/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.AlteracaoGponDefault;
import dao.dslam.impl.ConsultaGponDefault;
import java.util.List;
import model.dslam.config.ConfiguracaoOLT;
import model.dslam.config.ProfileGpon;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Porta;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.validacao.impl.both.ValidacaoResult;
import model.validacao.impl.realtime.ValidadorEstadoAdmPorta;
import model.validacao.impl.realtime.ValidadorProfile;
import model.validacao.impl.realtime.ValidadorVlanBanda;
import model.validacao.impl.realtime.ValidadorVlanMulticast;
import model.validacao.impl.realtime.ValidadorVlanVod;
import model.validacao.impl.realtime.ValidadorVlanVoip;
import model.validacao.impl.realtime.gpon.ValidadorParametrosGpon;
import model.validacao.impl.realtime.gpon.ValidadorSerialOntGpon;

public class ConfigOLTServiceImpl extends ConfigGenericService implements ConfigPortaService<ConfiguracaoOLT>, ConfigSetterGponService, ConfigGetterGponService {

    
    
    public ConfigOLTServiceImpl(EfikaCustomer ec) {
        super(ec);
    }

    @Override
    public ConfiguracaoOLT consultar() throws Exception {
        ConfiguracaoOLT olt = new ConfiguracaoOLT();
        InventarioRede i = getEc().getRede();
        ConsultaGponDefault c = consulta();

        olt.setEstadoPorta(this.exec(new ValidadorEstadoAdmPorta(getDslam(), getEc(), local)));
        olt.setParametros(this.exec(new ValidadorParametrosGpon(getDslam(), getEc(), local)));

        ProfileGpon pg = new ProfileGpon();
        pg.setAtual(this.exec(new ValidadorProfile(getDslam(), getEc(), local)));
        pg.setDownValues(this.getDslam().listarVelocidadesDown());
        pg.setUpValues(this.getDslam().listarVelocidadesUp());

        olt.setProfile(pg);
        
        olt.setSerial(this.exec(new ValidadorSerialOntGpon(getDslam(), getEc(), local)));
        if(!olt.getSerial().getResultado()){
            olt.setSerialDisp(c.getSlotsAvailableOnts(i));
        }
        olt.setVlanBanda(this.exec(new ValidadorVlanBanda(getDslam(), getEc(), local)));
        olt.setVlanVoip(this.exec(new ValidadorVlanVoip(getDslam(), getEc(), local)));
        olt.setVlanVod(this.exec(new ValidadorVlanVod(getDslam(), getEc(), local)));
        olt.setVlanMulticast(this.exec(new ValidadorVlanMulticast(getDslam(), getEc(), local)));

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

    @Override
    public AlteracaoGponDefault alteracao() throws Exception {
        try {
            return (AlteracaoGponDefault) getDslam();
        } catch (ClassCastException e) {
            throw new FuncIndisponivelDslamException();
        }
    }

    @Override
    public List<SerialOntGpon> unsetterOntFromOlt() throws Exception {
        alteracao().unsetOntFromOlt(getEc().getRede());
        alteracao().setEstadoDaPorta(getEc().getRede(), new EstadoDaPorta(Boolean.TRUE));
        return consulta().getSlotsAvailableOnts(getEc().getRede());
    }

    @Override
    public ValidacaoResult setterOntToOlt(SerialOntGpon serial) throws Exception {
        alteracao().setOntToOlt(getEc().getRede(), serial);
        alteracao().setEstadoDaPorta(getEc().getRede(), new EstadoDaPorta(Boolean.TRUE));
        return exec(new ValidadorSerialOntGpon(getDslam(), getEc(), local));
    }

    @Override
    public List<Porta> getterEstadoPortasProximas() throws Exception {
        return consulta().getEstadoPortasProximas(getEc().getRede());
    }
    
}
