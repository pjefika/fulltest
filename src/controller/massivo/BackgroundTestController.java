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
            this.includeSerializer(l);
            BackgroundTestThread b = new BackgroundTestThread(l);
            b.run();
        } else {
            this.includeSerializer(new ArrayList<TesteCliente>());
        }
    }

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).serialize();
    }
}
