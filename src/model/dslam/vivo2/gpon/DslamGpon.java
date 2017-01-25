/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.gpon;

import dao.dslam.ComandoDslam;
import java.math.BigInteger;
import model.dslam.AbstractDslam;
import model.dslam.consulta.ConsultaEstadoDaPorta;
import model.dslam.consulta.ConsultaSerialOntGpon;
import model.dslam.consulta.ConsultaTabelaParametrosGpon;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.SerialOntGpon;
import model.dslam.consulta.TabelaParametrosGpon;
import model.dslam.consulta.Vlan;
import model.dslam.consulta.ConsultaVlanBanda;
import model.dslam.consulta.ConsultaVlanMulticast;
import model.dslam.consulta.ConsultaVlanVod;
import model.dslam.consulta.ConsultaVlanVoip;

/**
 *
 * @author G0041775
 */
public abstract class DslamGpon extends AbstractDslam implements ConsultaTabelaParametrosGpon, 
        ConsultaSerialOntGpon, ConsultaEstadoDaPorta, ConsultaVlanBanda, ConsultaVlanVoip,
        ConsultaVlanVod, ConsultaVlanMulticast {

    private BigInteger slot;
    private BigInteger porta;
    private BigInteger logica;
    private BigInteger sequencial;

    @Override
    public abstract ComandoDslam getComandoTabelaParametros();

    @Override
    public abstract TabelaParametrosGpon getTabelaParametros(ComandoDslam cmd);
    
    @Override
    public abstract ComandoDslam getComandoSerialOnt();

    @Override
    public abstract SerialOntGpon getSerialOnt(ComandoDslam cmd);
    
    @Override
    public abstract ComandoDslam getComandoConsultaEstadoDaPorta();

    @Override
    public abstract EstadoDaPorta getEstadoDaPorta(ComandoDslam cmd);
    
    @Override
    public abstract ComandoDslam getComandoConsultaVlanBanda();

    @Override
    public abstract Vlan getVlanBanda(ComandoDslam cmd);
    
    @Override
    public abstract ComandoDslam getComandoConsultaVlanVoip();

    @Override
    public abstract Vlan getVlanVoip(ComandoDslam cmd);
    
    @Override
    public abstract ComandoDslam getComandoConsultaVlanVod();

    @Override
    public abstract Vlan getVlanVod(ComandoDslam cmd);
    
    @Override
    public abstract ComandoDslam getComandoConsultaVlanMulticast();

    @Override
    public abstract Vlan getVlanMulticast(ComandoDslam cmd);

    public void setSlot(BigInteger slot) {
        this.slot = slot;
    }

    public void setPorta(BigInteger porta) {
        this.porta = porta;
    }

    public void setLogica(BigInteger logica) {
        this.logica = logica;
    }

    public void setSequencial(BigInteger sequencial) {
        this.sequencial = sequencial;
    }

    public BigInteger getSlot() {
        return this.slot;
    }

    public BigInteger getPorta() {
        return this.porta;
    }

    public BigInteger getLogica() {
        return this.logica;
    }

    public BigInteger getSequencial() {
        return this.sequencial;
    }
}
