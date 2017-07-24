/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.metalico;

/**
 *
 * @author G0042204
 * @param <TabelaParametrosAbstract>
 */
public interface TabelaParam<TabelaParametrosAbstract> {

    public Boolean validar(TabelaParametrosAbstract t);

}
