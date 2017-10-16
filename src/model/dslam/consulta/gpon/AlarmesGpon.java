/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.ArrayList;
import java.util.List;
import model.dslam.consulta.Validavel;

/**
 *
 * @author G0041775
 */
public class AlarmesGpon implements Validavel {

    private List<String> listAlarmes;

    public AlarmesGpon() {
        this.listAlarmes = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return "Lista de Alarmes";
    }

    public List<String> getListAlarmes() {
        return listAlarmes;
    }

    public void setListAlarmes(List<String> listAlarmes) {
        this.listAlarmes = listAlarmes;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.listAlarmes.isEmpty();
    }

}
