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
public class CorrecaoInterruptoraException extends Exception {

    public CorrecaoInterruptoraException() {
        super("Esta correção requer um reteste completo.");
    }
    
    public CorrecaoInterruptoraException(String str) {
        super(str);
    }

}
