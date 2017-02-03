/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.massivo;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.view.Results;
import dao.massivo.TesteClienteDAO;
import java.util.List;
import javax.inject.Inject;
import model.fulltest.Status;
import controller.AbstractController;
import javax.faces.bean.RequestScoped;
import model.entity.Lote;
import model.entity.TesteCliente;

/**
 *
 * @author G0034481
 */
@Controller
@RequestScoped
public class TesteClienteController extends AbstractController {

    @Inject
    private TesteClienteDAO testsDAO;

    public TesteClienteController() {
    }

    public void create() {

    }
    
    @Path("/testecliente/{lote.id}")
    public void export(Lote lote) {        
        System.out.println(lote.getId());
        List<TesteCliente> l = this.testsDAO.listarInstanciasPorLote(lote);
        //System.out.println(l.size());
        if (l != null) {
            //this.includeSerializer(l);
            this.result.include("instancias", l);
        }
    }

    @Get
    @Path("/instancia/massivo/ativos")
    public void listarLotesAtivos() {
        List<TesteCliente> l = this.testsDAO.listarInstancias();
        if (l != null) {
            this.includeSerializer(l);
        }
    }

    @Post
    @Consumes("application/json")
    @Path("/instancia/massivo/cadastrar")
    public void cadastrar(TesteCliente testeCliente) {
        try {
            testeCliente.setStatus(Status.ATIVO);
            this.testsDAO.cadastrar(testeCliente);
            this.includeSerializer(testeCliente);
        } catch (Exception e) {
            this.result.use(Results.json()).from(e).serialize();
        }
    }

    @Post
    @Consumes("application/json")
    @Path("/instancia/massivo/modificar")
    public void modificar(TesteCliente testeCliente) {
        try {
            this.testsDAO.editar(testeCliente);
            this.includeSerializer(testeCliente);
        } catch (Exception e) {
            this.result.use(Results.json()).from(e).serialize();
        }
    }

    @Post
    @Consumes("application/json")
    @Path("/instancia/massivo/excluir")
    public void excluir(TesteCliente testeCliente) {
        try {
            this.testsDAO.excluir(testeCliente);
            this.includeSerializer(testeCliente);
        } catch (Exception e) {
            this.result.use(Results.json()).from(e).serialize();
        }
    }

    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).serialize();
    }
}
