/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoOLT;
import br.net.gvt.efika.fulltest.model.telecom.config.ProfileGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Porta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import dao.dslam.impl.AlteracaoGponDefault;
import dao.dslam.impl.ConsultaGponDefault;
import java.util.List;
import model.validacao.impl.realtime.CorretorSerialOntGpon;
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
        if (!olt.getSerial().getResultado()) {
            olt.setSerialDisp(c.getSlotsAvailableOnts(i));
        }
        olt.setVlanBanda(this.exec(new ValidadorVlanBanda(getDslam(), getEc(), local)));
        olt.setVlanVoip(this.exec(new ValidadorVlanVoip(getDslam(), getEc(), local)));
        olt.setVlanVod(this.exec(new ValidadorVlanVod(getDslam(), getEc(), local)));
        try {
            olt.setVlanMulticast(this.exec(new ValidadorVlanMulticast(getDslam(), getEc(), local)));
        } catch (Exception e) {
            olt.setVlanMulticast(null);
        }
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
        try {
            alteracao().setEstadoDaPorta(getEc().getRede(), new EstadoDaPorta(Boolean.TRUE));
        } catch (Exception e) {
            Thread.sleep(2000);
        }

        return consulta().getSlotsAvailableOnts(getEc().getRede());
    }

    @Override
    public ValidacaoResult getterOntFromOlt() throws Exception {
//        consulta().getSerialOnt(getEc().getRede());
//        alteracao().setEstadoDaPorta(getEc().getRede(), new EstadoDaPorta(Boolean.TRUE));
        return exec(new CorretorSerialOntGpon(getDslam(), getEc(), local));
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

    @Override
    public ProfileGpon setterProfile(Profile p) throws Exception {
        ProfileGpon pg = new ProfileGpon();
        alteracao().setProfileDown(getEc().getRede(), p.getDown());
        alteracao().setProfileUp(getEc().getRede(), p.getDown(), p.getUp());
        pg.setAtual(this.exec(new ValidadorProfile(getDslam(), getEc(), local)));
        pg.setDownValues(this.getDslam().listarVelocidadesDown());
        pg.setUpValues(this.getDslam().listarVelocidadesUp());

        return pg;
    }

}
