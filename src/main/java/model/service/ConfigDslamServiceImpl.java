/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaLinha;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaTv;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.exception.TratativaExcessao;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoDSLAM;
import br.net.gvt.efika.fulltest.model.telecom.config.ProfileConfig;
import br.net.gvt.efika.fulltest.model.telecom.config.ProfileGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import dao.dslam.impl.AlteracaoMetalicoDefault;
import dao.dslam.impl.ConsultaMetalicoDefault;
import model.validacao.impl.realtime.ValidadorEstadoAdmPorta;
import model.validacao.impl.realtime.ValidadorProfile;
import model.validacao.impl.realtime.ValidadorTabelaRede;
import model.validacao.impl.realtime.ValidadorVlanBanda;
import model.validacao.impl.realtime.ValidadorVlanMulticast;
import model.validacao.impl.realtime.ValidadorVlanVod;
import model.validacao.impl.realtime.ValidadorVlanVoip;
import model.validacao.impl.realtime.metalico.ValidadorParametrosMetalico;

public class ConfigDslamServiceImpl extends ConfigGenericService implements ConfigPortaService<ConfiguracaoDSLAM>,
        ConfigSetterMetalicoService,
        ConfigGetterMetalicoService {

    public ConfigDslamServiceImpl(EfikaCustomer ec) {
        super(ec);
    }

    @Override
    public ConfiguracaoDSLAM consultar() throws Exception {
        try {
            ConfiguracaoDSLAM config = new ConfiguracaoDSLAM();

            config.setEstadoPorta(this.exec(new ValidadorEstadoAdmPorta(getDslam(), getEc(), local)));
            config.setParametros(this.exec(new ValidadorParametrosMetalico(getDslam(), getEc(), local)));
            config.setTabRede(this.exec(new ValidadorTabelaRede(getDslam(), getEc(), local)));
            config.setVlanBanda(this.exec(new ValidadorVlanBanda(getDslam(), getEc(), local)));
            config.setProfile(new ProfileConfig(this.exec(new ValidadorProfile(getDslam(), getEc(), local)),
                    this.getDslam().listarVelocidadesDown()));

            if (getEc().getServicos().getTipoLinha() == TecnologiaLinha.SIP) {
                config.setVlanVoip(this.exec(new ValidadorVlanVoip(getDslam(), getEc(), local)));
            }
            if (getEc().getServicos().getTipoTv() != null) {
                if (getEc().getServicos().getTipoTv() != TecnologiaTv.DTH) {
                    config.setVlanVod(this.exec(new ValidadorVlanVod(getDslam(), getEc(), local)));
                    config.setVlanMulticast(this.exec(new ValidadorVlanMulticast(getDslam(), getEc(), local)));
                }
            }

            return config;
        } catch (Exception e) {
            throw TratativaExcessao.treatException(e);
        }
    }

    @Override
    public ConsultaMetalicoDefault consulta() throws Exception {
        try {
            return (ConsultaMetalicoDefault) getDslam();
        } catch (ClassCastException e) {
            throw new FuncIndisponivelDslamException();
        }
    }

    @Override
    public AlteracaoMetalicoDefault alteracao() throws Exception {
        try {
            return (AlteracaoMetalicoDefault) getDslam();
        } catch (ClassCastException e) {
            throw new FuncIndisponivelDslamException();
        }
    }

    @Override
    public void resetTabelaRede() throws Exception {
        try {
            this.alteracao().resetTabelaRede(getEc().getRede());
        } catch (Exception e) {
            throw TratativaExcessao.treatException(e);
        }
    }

    @Override
    public ValidacaoResult getterTabelaRede() throws Exception {
        try {
            return this.exec(new ValidadorTabelaRede(getDslam(), getEc(), local));
        } catch (Exception e) {
            e.printStackTrace();
            throw TratativaExcessao.treatException(e);
        }

    }

    @Override
    public ProfileConfig setterProfile(Profile profile) throws Exception {
        try {
            ProfileGpon pg = new ProfileGpon();
            alteracao().setProfileDown(getEc().getRede(), profile.getDown());
            pg.setAtual(this.exec(new ValidadorProfile(getDslam(), getEc(), local)));
            pg.setDownValues(this.getDslam().listarVelocidadesDown());
            pg.setUpValues(this.getDslam().listarVelocidadesUp());

            return pg;
        } catch (Exception e) {
            throw TratativaExcessao.treatException(e);
        }
    }

}
