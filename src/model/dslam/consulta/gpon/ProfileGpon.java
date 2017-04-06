/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.gpon;

import model.dslam.AbstractDslam;
import model.dslam.retorno.TratativaRetornoUtil;
import model.dslam.velocidade.Velocidades;
import model.fulltest.validacao.Validador;

/**
 *
 * @author G0041775
 */
public class ProfileGpon implements Validador {
    
    private String profileUp;
    
    private String profileDown;

    public String getProfileUp() {
        return profileUp;
    }

    public void setProfileUp(String profileUp) {
        this.profileUp = profileUp;
    }

    public String getProfileDown() {
        return profileDown;
    }

    public void setProfileDown(String profileDown) {
        this.profileDown = profileDown;
    }

    @Override
    public Boolean validar(AbstractDslam ds) {
        
        String leprofDown = TratativaRetornoUtil.numberFromString(this.profileDown).get(0);
        String leprofUp = TratativaRetornoUtil.numberFromString(this.profileUp).get(0);
        
        if(leprofUp.length()>3 && !leprofUp.contains(".")){
            leprofUp = leprofUp.substring(0, (leprofUp.length()-3));
        }
        
        return (leprofDown.equals(velDown(ds)) && leprofUp.equals(velUp(ds)));
    }
    
    public static String velDown(AbstractDslam ds){
        String downCrm = ds.getProd().getBanda().getDownCrm();
        Velocidades velDown = Velocidades.valueOf("VEL_"+downCrm);
                
        return velDown.getVel();
    }
    
    public static String velUp(AbstractDslam ds){
        String upCrm = ds.getProd().getBanda().getUpCrm();
        Velocidades velUp = Velocidades.valueOf("VEL_"+upCrm);
                
        return velUp.getVel();
    }
    
}
