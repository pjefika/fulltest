/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest;

import model.entity.TesteCliente;
import dao.cadastro.CadastroDAO;
import java.util.List;
import model.dslam.AbstractDslam;

/**
 *
 * @author G0042204
 */
public class BackgroudTestSingleton {

    private static BackgroudTestSingleton instance = null;

    private List<TesteCliente> lista;

    protected BackgroudTestSingleton() {
    }

    public static BackgroudTestSingleton getInstance() {
        if (instance == null) {
            instance = new BackgroudTestSingleton();
        }
        return instance;
    }

    public void run() {

        for (TesteCliente t : lista) {

            try {
                CadastroDAO dao = new CadastroDAO();
                AbstractDslam ds = dao.getDslam(t.getInstancia());
                FullTestFacade f = new FullTestFacade(ds);

                f.estadoPorta();
                f.serialOnt();
                f.consultaParametros();
//            f.consultaVlanBanda();
//            f.consultaVlanVoip();
//            f.consultaVlanVod();
//            f.consultaVlanMulticast();
//            f.consultaAlarmes();

                f.close();

            } catch (Exception e) {
            }

        }

    }

    public List<TesteCliente> getLista() {
        return lista;
    }

    public void setLista(List<TesteCliente> lista) {
        this.lista = lista;
    }

}
