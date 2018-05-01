/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.enums.TipoRede;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.AlteracaoClienteInter;
import dao.dslam.impl.AlteracaoGponDefault;
import dao.dslam.impl.AlteracaoMetalicoDefault;
import dao.dslam.impl.ConsultaClienteInter;
import dao.dslam.impl.ConsultaGponDefault;
import dao.dslam.impl.ConsultaMetalicoDefault;
import java.util.ArrayList;
import java.util.List;
import model.validacao.impl.realtime.CorretorEstadoAdmPorta;
import model.validacao.impl.realtime.CorretorProfile;
import model.validacao.impl.realtime.CorretorVlanBanda;
import model.validacao.impl.realtime.ValidadorEstadoAdmPorta;
import model.validacao.impl.realtime.ValidadorEstadoOperPorta;
import model.validacao.impl.realtime.ValidadorVlanBanda;
import model.validacao.impl.realtime.ValidadorVlanMulticast;
import model.validacao.impl.realtime.ValidadorVlanVod;
import model.validacao.impl.realtime.ValidadorVlanVoip;

/**
 *
 * @author G0042204
 */
public class ConfigPortaServiceImpl extends ConfigGenericService implements ConfigPortaService<ConfiguracaoPorta>, ConfigSetterService, ConfigGetterService {

    public ConfigPortaServiceImpl(EfikaCustomer ec) {
        super(ec);
    }

    @Override
    public ConsultaClienteInter consulta() throws Exception {
        if (this.getEc().getRede().getTipo() == TipoRede.GPON) {
            try {
                return (ConsultaGponDefault) getDslam();
            } catch (ClassCastException e) {
                throw new FuncIndisponivelDslamException();
            }
        } else {
            try {
                return (ConsultaMetalicoDefault) getDslam();
            } catch (ClassCastException e) {
                throw new FuncIndisponivelDslamException();
            }
        }
    }

    @Override
    public AlteracaoClienteInter alteracao() throws Exception {
        if (this.getEc().getRede().getTipo() == TipoRede.GPON) {
            try {
                return (AlteracaoGponDefault) getDslam();
            } catch (ClassCastException e) {
                throw new FuncIndisponivelDslamException();
            }
        } else {
            try {
                return (AlteracaoMetalicoDefault) getDslam();
            } catch (ClassCastException e) {
                throw new FuncIndisponivelDslamException();
            }
        }
    }

    @Override
    public ConfiguracaoPorta consultar() throws Exception {
        if (this.getEc().getRede().getTipo() == TipoRede.GPON) {
            return FactoryService.createConfigOLTService(this.getEc()).consultar();
        } else {
            return FactoryService.createConfigDslamService(this.getEc()).consultar();
        }
    }

    @Override
    public ValidacaoResult setterEstadoDaPorta(EstadoDaPorta est) throws Exception {
        alteracao().setEstadoDaPorta(getEc().getRede(), est);
        return this.exec(new ValidadorEstadoAdmPorta(getDslam(), getEc(), local));
    }

    @Override
    public ValidacaoResult setterVlanBanda() throws Exception {
        alteracao().deleteVlanBanda(getEc().getRede());
        alteracao().createVlanBanda(getEc().getRede(), Velocidades.find(getEc().getServicos().getVelDown()), Velocidades.find(getEc().getServicos().getVelUp()));
        return exec(new ValidadorVlanBanda(getDslam(), getEc(), local));
    }

    @Override
    public ValidacaoResult setterVlanVoip() throws Exception {
        alteracao().deleteVlanVoip(getEc().getRede());
        alteracao().createVlanVoip(getEc().getRede());
        return exec(new ValidadorVlanVoip(getDslam(), getEc(), local));
    }

    @Override
    public ValidacaoResult setterVlanVod() throws Exception {
        alteracao().deleteVlanVod(getEc().getRede());
        alteracao().createVlanVod(getEc().getRede());
        return exec(new ValidadorVlanVod(getDslam(), getEc(), local));
    }

    @Override
    public ValidacaoResult setterVlanMulticast() throws Exception {
        alteracao().deleteVlanMulticast(getEc().getRede());
        alteracao().createVlanMulticast(getEc().getRede());
        return exec(new ValidadorVlanMulticast(getDslam(), getEc(), local));
    }

    @Override
    public void resetIptvStatistics() throws Exception {
        alteracao().resetIptvStatistics(getEc().getRede());
    }

    @Override
    public List<ValidacaoResult> getIptvVlans() throws Exception {
        List<ValidacaoResult> l = new ArrayList<>();
        l.add(exec(new ValidadorVlanVod(getDslam(), getEc(), local)));
        l.add(exec(new ValidadorVlanMulticast(getDslam(), getEc(), local)));
        return l;
    }

    @Override
    public Boolean isManageable() throws Exception {
        this.getDslam().conectar();
        return true;
    }

    @Override
    public ValidacaoResult corretorEstadoDaPorta() throws Exception {
        ValidacaoResult v = exec(new ValidadorEstadoOperPorta(getDslam(), getEc(), local));
        if(v.getResultado()){
            return v;
        }
        ValidacaoResult c = exec(new CorretorEstadoAdmPorta(getDslam(), getEc(), local));
        if(!c.getResultado()){
            return c;
        }
        return v;
    }

    @Override
    public ValidacaoResult corretorVlanBanda() throws Exception {
        return exec(new CorretorVlanBanda(getDslam(), getEc(), local));
    }

    @Override
    public ValidacaoResult corretorProfile() throws Exception {
        return exec(new CorretorProfile(getDslam(), getEc(), local));
    }

    
}
