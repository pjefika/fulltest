/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.factory.exception;

/**
 *
 * @author G0042204
 */
public class WorkOrderInexException extends Exception {

    public WorkOrderInexException() {
        super("Número de PON (SS) inválido.");
    }

}
