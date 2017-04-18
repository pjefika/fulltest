/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.manobra;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.view.Results;
import controller.AbstractController;
import dao.cadastro.CadastroDAO;
import java.rmi.RemoteException;
import javax.faces.bean.RequestScoped;
import model.Motivos;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.Cliente;
import model.facade.ConsultaClienteFacade;

/**
 *
 * @author G0041775
 */
@Controller
@RequestScoped
public class ManobraController extends AbstractController {

    CadastroDAO dao = new CadastroDAO();

    public void atendimento() {

    }

    public void create() {
    }

    @Post
    @Consumes("application/json")
    @Path("/manobra/busca")
    public void consultaCliente(String instancia) {
        try {
            Cliente c = new Cliente(instancia);
            ConsultaClienteFacade f = new ConsultaClienteFacade(c);
            f.consultar();
            includeSerializer(f.getCl());
        } catch (DslamNaoImplException ex) {
            includeSerializer(ex);
        } catch (RemoteException ex) {
            includeSerializer(ex);
        }
    }

    @Post
    @Consumes("application/json")
    @Path("/manobra/busca")
    public void validarManobra(Cliente c, Motivos e) {
        ConsultaClienteFacade f = new ConsultaClienteFacade(c);
        f.validar();
        includeSerializer(f.getCl());
    }

    @Get
    @Path("/manobra/motivos")
    public void listaMotivos() {
        try {
            this.includeSerializer(Motivos.values());
        } catch (Exception e) {
            this.includeSerializer(e);
        }
    }

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).recursive().serialize();
    }

}
