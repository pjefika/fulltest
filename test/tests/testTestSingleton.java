/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.ArrayList;
import java.util.List;
import model.fulltest.BackgroudTestSingleton;
import model.fulltest.TesteCliente;

/**
 *
 * @author G0042204
 */
public class testTestSingleton {

    public static void main(String[] args) throws Exception {

        BackgroudTestSingleton b = BackgroudTestSingleton.getInstance();

        List<TesteCliente> cl = new ArrayList<>();

        cl.add(new TesteCliente("1630105408"));
        cl.add(new TesteCliente("1633226955"));
        cl.add(new TesteCliente("7930272843"));

        b.setLista(cl);

        b.run();

    }

}
