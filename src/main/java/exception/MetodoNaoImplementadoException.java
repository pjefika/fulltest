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
public class MetodoNaoImplementadoException extends Exception{

    public MetodoNaoImplementadoException() {
        super("Método não implementado para este DSLAM.");
    }

    public MetodoNaoImplementadoException(String message) {
        super(message);
    }
    
}
