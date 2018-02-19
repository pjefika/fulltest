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
public class FalhaJumpAccessEsception extends Exception{

    public FalhaJumpAccessEsception() {
        super("Falha ao conectar-se com o Jump Access");
    }

    public FalhaJumpAccessEsception(String message) {
        super(message);
    }
    
}
