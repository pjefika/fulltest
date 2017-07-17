/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.metalico;

import java.util.List;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface TabelaMetalicoInter<T> {

    public Boolean validar(T t);

    public List<Double> getSnrsDown();

    public List<Double> getSnrsUp();
    
    

}
