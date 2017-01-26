/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.validacao;

import model.dslam.consulta.TabelaParametrosGpon;

/**
 *
 * @author G0042204
 */
public interface ValidacaoBasica {

    public Boolean validar(TabelaParametrosGpon tb);

}
