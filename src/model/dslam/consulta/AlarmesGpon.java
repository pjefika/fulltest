/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0041775
 */
public class AlarmesGpon {

    private List<String> listAlarmes;

    
    public AlarmesGpon(){
        this.listAlarmes = new ArrayList<>();
    }
    
    public List<String> getListAlarmes() {
        return listAlarmes;
    }

    public void setListAlarmes(List<String> listAlarmes) {
        this.listAlarmes = listAlarmes;
    }
    
    
    
}
