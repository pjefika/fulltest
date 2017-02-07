/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.massivo;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.view.Results;
import controller.AbstractController;
import dao.massivo.TesteClienteDAO;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import model.entity.TesteCliente;
import model.entity.ValidacaoGpon;
import model.fulltest.Status;
import model.fulltest.massivo.BackgroundTestThread;

/**
 *
 * @author G0042204
 */
@Controller
public class BackgroundTestController extends AbstractController {

    @Inject
    private TesteClienteDAO dao;

    public BackgroundTestController() {
    }

    @Get
    public void load() {

        List<TesteCliente> l = dao.listarInstancias();

        if (l != null) {

            BackgroundTestThread b = new BackgroundTestThread(l);
            try {
                b.run();
                for ( TesteCliente tcl : b.getCls()) {
                    tcl.setStatus(Status.CONCLUIDO);
                    dao.editar(tcl);
                    for (ValidacaoGpon validacaoGpon : tcl.getValid()) {
                        validacaoGpon.setTeste(tcl);
                        dao.cadastrar(validacaoGpon);
                    }
                }
                result.use(Results.json()).from(b.getCls()).include("valid").serialize();
            } catch (Exception ex) {
                result.use(Results.json()).from(ex.getStackTrace()).serialize();
            }

        } else {
            this.includeSerializer(new ArrayList<TesteCliente>());
        }
    }

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).serialize();
    }
}
