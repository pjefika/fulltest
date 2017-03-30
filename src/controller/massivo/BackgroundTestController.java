/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.massivo;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.view.Results;
import controller.AbstractController;
import dao.massivo.TesteClienteDAO;
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
    @Path("/unitario/{inst}")
    public void exec(String inst) {
        TesteCliente t = new TesteCliente(inst);
        BackgroundTestThread b = new BackgroundTestThread(t, dao);
        b.run();
        t = dao.buscarInstanciaPorId(t);
        
        result.use(Results.json()).from(t).include("valid").serialize();
    }
    
    

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).serialize();
    }
}
