/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.service.factory;

import model.manobra.service.ManobraService;
import model.manobra.service.ManobraServiceImpl;

/**
 *
 * @author G0042204
 */
public class FactoryManobraService {
    
    public static ManobraService create(){
        return new ManobraServiceImpl();
    }
    
}
