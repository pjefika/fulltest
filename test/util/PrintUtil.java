/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import model.fulltest.operacional.FullTest;
import model.validacao.realtime.Corretor;

/**
 *
 * @author G0042204
 */
public class PrintUtil {

    public static void print(FullTest f) {
        f.getValids().forEach((valid) -> {
            System.out.println("Nome: " + valid.getNome() + " "
                    + "|  Resultado: " + valid.getResultado() + " "
                    + "|  Mensagem: " + valid.getMensagem());
        });
        System.out.println("Resultado Final: " + f.getResultado());
        System.out.println("Resultado Final: " + f.getMensagem());
    }
    

}
