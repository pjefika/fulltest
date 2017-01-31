/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.validacao;

import java.math.BigInteger;
import model.dslam.AbstractDslam;
import model.dslam.consulta.ConsultaGponDefault;
import model.fulltest.validacao.tipo.ValidacaoGpon;

/**
 *
 * @author G0041775
 */
public class ValidacaoFacade {
    
    private ConsultaGponDefault gpon;
    
    private ValidacaoGpon valid;
    
    private AbstractDslam dslam;

    public ValidacaoFacade(ConsultaGponDefault gpon) {
        this.gpon = gpon;
        this.dslam = (AbstractDslam) gpon;
        this.valid = new ValidacaoGpon();
    }
    
    public ValidacaoGpon validar() throws Exception{
      
        this.valid.setAdmState(gpon.getAlarmes().validar(dslam));
        System.out.println("Admin: "+this.valid.getAdmState());
        
        this.valid.setLink(gpon.getEstadoDaPorta().validar(dslam));
        System.out.println("Link(Oper): "+this.valid.getLink());
        
        this.valid.setProfile(gpon.getProfile().validar(dslam));
        System.out.println("Profile: "+this.valid.getProfile());
        
        this.valid.setParametros(gpon.getTabelaParametros().validar(dslam) );
        System.out.println("Parametros: "+this.valid.getParametros());
        
        this.valid.setVlanBanda(gpon.getVlanBanda().validar(dslam));
        System.out.println("VlanBanda: "+this.valid.getVlanBanda());
         
        this.valid.setVlanVoip(gpon.getVlanVoip().validar(dslam));
        System.out.println("VlanVoip: "+this.valid.getVlanVoip());
        
        this.valid.setVlanVod(gpon.getVlanVod().validar(dslam));
        System.out.println("VlanVod: "+this.valid.getVlanVod());
        
        this.valid.setVlanMulticast(gpon.getVlanMulticast().validar(dslam));
        System.out.println("VlanMulticast: "+this.valid.getVlanMulticast());
        
        this.valid.setSemAlarme(gpon.getAlarmes().validar(dslam));         
        System.out.println("SemAlarme: "+this.valid.getSemAlarme());
        
        
     return null;   
    }
    
    
    
    
}
