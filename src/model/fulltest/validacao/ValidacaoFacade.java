/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.validacao;

import java.math.BigInteger;
import model.dslam.consulta.ConsultaGponDefault;
import model.dslam.vivo2.gpon.DslamGpon;
import model.fulltest.validacao.tipo.ValidacaoGpon;

/**
 *
 * @author G0041775
 */
public class ValidacaoFacade {
    
    private ConsultaGponDefault gpon;
    
    private ValidacaoGpon valid;
    
    private DslamGpon dslam;

    public ValidacaoFacade(ConsultaGponDefault gpon, DslamGpon dslam) {
        this.gpon = gpon;
        this.dslam = dslam;
        this.valid = new ValidacaoGpon();
    }
    
    public ValidacaoGpon validar() throws Exception{
      
        this.valid.setAdmState(gpon.getEstadoDaPorta().getAdminState().equalsIgnoreCase("up"));
        
        this.valid.setLink(gpon.getEstadoDaPorta().getOperState().equalsIgnoreCase("up"));
        
        this.valid.setProfile(!gpon.getProfile().getProfileDown().isEmpty() && !gpon.getProfile().getProfileUp().isEmpty());
        
        this.valid.setParametros(gpon.getTabelaParametros().getPotOlt() < -8 && 
                gpon.getTabelaParametros().getPotOlt() > -25  &&
                gpon.getTabelaParametros().getPotOnt() < -8 &&
                gpon.getTabelaParametros().getPotOnt() > -25 );
        
        this.valid.setVlanBanda(gpon.getVlanBanda().getP100().equals(new BigInteger(dslam.getP100())) && 
                gpon.getVlanBanda().getCvlan().equals(new BigInteger(dslam.getRin())));
        
        this.valid.setVlanVoip(gpon.getVlanVoip().getP100().equals(new BigInteger(dslam.getP100())) &&
                gpon.getVlanVoip().getCvlan().equals(new BigInteger(dslam.getVlanVoipe())));
        
        this.valid.setVlanVod(gpon.getVlanVod().getP100().equals(new BigInteger(dslam.getP100())) &&
                gpon.getVlanVod().getCvlan().equals(new BigInteger(dslam.getVlanVode())));
        
        this.valid.setVlanMulticast(gpon.getVlanMulticast().getCvlan().equals(new BigInteger(dslam.getVlanMulticaste())));
        
        this.valid.setSemAlarme(gpon.getAlarmes().getListAlarmes().isEmpty());         
        
     return null;   
    }
    
    
    
    
}
