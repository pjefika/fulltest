/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.gpon;

import java.math.BigInteger;
import model.dslam.AbstractDslam;

/**
 *
 * @author G0041775
 */
public class DslamGpon extends AbstractDslam{
    
    private BigInteger slot;
    private BigInteger porta;
    private BigInteger logica;
    private BigInteger sequencial;
    
    public void setSlot(BigInteger slot){
        this.slot = slot;
    }
    public void setPorta(BigInteger porta){
        this.porta = porta;
    }
    public void setLogica(BigInteger logica){
        this.logica = logica;
    }
    public void setSequencial(BigInteger sequencial){
        this.sequencial = sequencial;
    }
    
    public BigInteger getSlot(){
        return this.slot;
    }
    public BigInteger getPorta(){
        return this.porta;
    }
    public BigInteger getLogica(){
        return this.logica;
    }
    public BigInteger getSequencial(){
        return this.sequencial;
    }
}
