/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.factory;

import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.Conector;
import dao.dslam.impl.ConsultaDslamVivo1;
import dao.dslam.impl.ConsultaDslamVivo2;
import dao.dslam.impl.gpon.DslamVivo1;

/**
 *
 * @author G0041775
 */
public class ConsultaDslamFactory {
    
    public static Conector create(AbstractDslam dslam){
       if(dslam instanceof DslamVivo1){
           return new ConsultaDslamVivo1(dslam);
       }else{
           return new ConsultaDslamVivo2(dslam);
       }
    }
    
}
