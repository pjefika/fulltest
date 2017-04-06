/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.gpon;

import java.util.ArrayList;
import java.util.List;
import model.dslam.AbstractDslam;
import model.fulltest.validacao.Validador;

/**
 *
 * @author G0041775
 */
public class AlarmesGpon implements Validador{

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

    @Override
    public Boolean validar(AbstractDslam ds) {
        return this.listAlarmes.isEmpty();
    }
    
    
    
}
