/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author G0041775
 */
public class SemGerenciaException extends Exception{

    public SemGerenciaException() {
        super("Identificado Shelf sem gerência.");
    }

    public SemGerenciaException(String message) {
        super(message);
    }
    
}
