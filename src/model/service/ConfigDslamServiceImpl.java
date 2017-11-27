/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.AlteracaoMetalicoDefault;
import dao.dslam.impl.ConsultaMetalicoDefault;
import model.dslam.config.ConfiguracaoDSLAM;
import model.validacao.impl.both.ValidacaoResult;
import model.validacao.impl.realtime.ValidadorEstadoAdmPorta;
import model.validacao.impl.realtime.ValidadorTabelaRede;
import model.validacao.impl.realtime.ValidadorVlanBanda;
import model.validacao.impl.realtime.ValidadorVlanMulticast;
import model.validacao.impl.realtime.ValidadorVlanVod;
import model.validacao.impl.realtime.ValidadorVlanVoip;
import model.validacao.impl.realtime.metalico.ValidadorParametrosMetalico;

public class ConfigDslamServiceImpl extends ConfigGenericService implements ConfigPortaService<ConfiguracaoDSLAM>, ConfigSetterMetalicoService, ConfigGetterMetalicoService {

    public ConfigDslamServiceImpl(EfikaCustomer ec) {
        super(ec);
    }

    @Override
    public ConfiguracaoDSLAM consultar() throws Exception {
        ConfiguracaoDSLAM config = new ConfiguracaoDSLAM();

        config.setEstadoPorta(this.exec(new ValidadorEstadoAdmPorta(getDslam(), getEc(), local)));
        config.setParametros(this.exec(new ValidadorParametrosMetalico(getDslam(), getEc(), local)));
        config.setTabRede(this.exec(new ValidadorTabelaRede(getDslam(), getEc(), local)));
        config.setVlanBanda(this.exec(new ValidadorVlanBanda(getDslam(), getEc(), local)));
        config.setVlanVoip(this.exec(new ValidadorVlanVoip(getDslam(), getEc(), local)));
        config.setVlanVod(this.exec(new ValidadorVlanVod(getDslam(), getEc(), local)));
        try {
            config.setVlanMulticast(this.exec(new ValidadorVlanMulticast(getDslam(), getEc(), local)));
        } catch (Exception e) {
            config.setVlanMulticast(null);
        }

        return config;
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
        this.alteracao().resetTabelaRede(getEc().getRede());
    }

    @Override
    public ValidacaoResult getterTabelaRede() throws Exception {
        return this.exec(new ValidadorTabelaRede(getDslam(), getEc(), local));
    }

}
