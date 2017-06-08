/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon;

import java.math.BigInteger;
import dao.dslam.impl.AbstractDslam;
import model.dslam.consulta.gpon.AlarmesGpon;
import dao.dslam.impl.ConsultaGponDefault;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;

/**
 *
 * @author G0041775
 */
public abstract class DslamGpon extends AbstractDslam
        implements
        ConsultaGponDefault {

    private BigInteger slot;
    private BigInteger porta;
    private BigInteger logica;
    private BigInteger sequencial;

    @Override
    public abstract TabelaParametrosGpon getTabelaParametros() throws Exception;

    @Override
    public abstract SerialOntGpon getSerialOnt() throws Exception;

    @Override
    public abstract EstadoDaPorta getEstadoDaPorta() throws Exception;

    @Override
    public abstract VlanBanda getVlanBanda() throws Exception;

    @Override
    public abstract VlanVoip getVlanVoip() throws Exception;

    @Override
    public abstract VlanVod getVlanVod() throws Exception;

    @Override
    public abstract VlanMulticast getVlanMulticast() throws Exception;

    @Override
    public abstract AlarmesGpon getAlarmes() throws Exception;

    @Override
    public abstract Profile getProfile() throws Exception;

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
