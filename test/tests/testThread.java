/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.ArrayList;
import java.util.List;
import model.entity.TesteCliente;
import model.fulltest.massivo.BackgroundTestThread;

/**
 *
 * @author G0042204
 */
public class testThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<TesteCliente> cls = new ArrayList<TesteCliente>();

        cls.add(new TesteCliente("4130222839"));

        Runnable ba = new BackgroundTestThread(cls);

        ba.run();

    }

}
