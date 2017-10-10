/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.TipoRede;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.AlteracaoClienteInter;
import dao.dslam.impl.AlteracaoGponDefault;
import dao.dslam.impl.AlteracaoMetalicoDefault;
import dao.dslam.impl.ConsultaClienteInter;
import dao.dslam.impl.ConsultaGponDefault;
import dao.dslam.impl.ConsultaMetalicoDefault;
import model.dslam.config.ConfiguracaoPorta;
import model.dslam.config.ProfileGpon;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.velocidade.Velocidades;
import model.validacao.impl.both.ValidacaoResult;
import model.validacao.impl.realtime.ValidadorEstadoAdmPorta;
import model.validacao.impl.realtime.ValidadorProfile;
import model.validacao.impl.realtime.ValidadorVlanBanda;

/**
 *
 * @author G0042204
 */
public class ConfigPortaServiceImpl extends ConfigGenericService implements ConfigPortaService<ConfiguracaoPorta>, ConfigSetterService {

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
    public ValidacaoResult setterEstadoDaPorta(EstadoDaPorta est) throws Exception{
        alteracao().setEstadoDaPorta(getEc().getRede(), est);
        return this.exec(new ValidadorEstadoAdmPorta(getDslam(), getEc()));
    }
    
    @Override
    public ProfileGpon setterProfile(Profile profile) throws Exception {
        ProfileGpon pg = new ProfileGpon();
        alteracao().setProfileDown(getEc().getRede(), profile.getDown());
        alteracao().setProfileUp(getEc().getRede(), profile.getDown(), profile.getUp());
        pg.setAtual(this.exec(new ValidadorProfile(getDslam(), getEc())));
        pg.setDownValues(this.getDslam().listarVelocidadesDown());
        pg.setUpValues(this.getDslam().listarVelocidadesUp());
        
        return pg;
    }

    @Override
    public ValidacaoResult setterVlanBanda() throws Exception {
        alteracao().deleteVlanBanda(getEc().getRede());
        alteracao().createVlanBanda(getEc().getRede(), Velocidades.find(getEc().getServicos().getVelDown()), Velocidades.find(getEc().getServicos().getVelUp()));
        return exec(new ValidadorVlanBanda(getDslam(), getEc()));
    }
    
    

}
