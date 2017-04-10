/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.manobra;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.view.Results;
import controller.AbstractController;
import dao.cadastro.CadastroDAO;
import java.rmi.RemoteException;
import model.ConsultaClienteFacade;
import model.annotation.Logado;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.Cliente;

/**
 *
 * @author G0041775
 */
@Controller
public class ManobraController extends AbstractController {

    CadastroDAO dao = new CadastroDAO();

    @Logado
    public void create() {
    }

    @Path("/manobra/{instancia}")
    public void consultaCliente(String instancia) {
        try {
            Cliente c = new Cliente(instancia);
            ConsultaClienteFacade f = new ConsultaClienteFacade(c);
            c = f.consultar();
            includeSerializer(c);
        } catch (DslamNaoImplException ex) {
            includeSerializer(ex);
        } catch (RemoteException ex) {
            includeSerializer(ex);
        }
    }

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).serialize();
    }

}
