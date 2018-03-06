/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.tratativa;

/**
 *
 * @author G0042204
 */
public class TratativaException extends Exception {

    public TratativaException(String message) {
        super("Falha ao obter resposta do DSLAM: " + message);
    }

}
