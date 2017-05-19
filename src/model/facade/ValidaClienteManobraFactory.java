/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import model.Motivos;

/**
 *
 * @author G0042204
 */
public class ValidaClienteManobraFactory {

    public static ValidaClienteManobraFacade create(Motivos motivo) {

        switch (motivo) {
            case SEMSINC:
                return new ValidaClienteManobraSemSincFacade();
            case QUEDA:
                return new ValidaClienteManobraQuedasFacade();
            case SEMAUTH:
                return new ValidaClienteManobraSemAuthFacade();
            default:
                return null;
        }

    }

}
