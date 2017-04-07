/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.massivo;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.view.Results;
import controller.AbstractController;
import dao.massivo.LoteDAO;
import javax.inject.Inject;
import model.annotation.Logado;
import model.entity.TesteClienteGpon;
import model.fulltest.Status;

/**
 *
 * @author G0034481
 */
@Controller
public class MassivoController extends AbstractController {

    @Inject
    private LoteDAO dao;
//    
//    @Inject
//    private LoteDAO lDao;

    public MassivoController() {

    }

    @Logado
    public void create() {
        
    }

    @Post
    @Consumes("application/json")
    @Path("/instancia/massivo/cadastrar")
    public void cadastrar(TesteClienteGpon testeCliente) {
        try {
            testeCliente.setStatus(Status.ATIVO);
            this.dao.cadastrar(testeCliente);
            this.includeSerializer(testeCliente);
        } catch (Exception e) {
            this.result.use(Results.json()).from(e).serialize();
        }
    }

    @Post
    @Consumes("application/json")
    @Path("/instancia/massivo/modificar")
    public void modificar(TesteClienteGpon testeCliente) {
        try {
            this.dao.editar(testeCliente);
            this.includeSerializer(testeCliente);
        } catch (Exception e) {
            this.result.use(Results.json()).from(e).serialize();
        }
    }

    @Post
    @Consumes("application/json")
    @Path("/instancia/massivo/excluir")
    public void excluir(TesteClienteGpon testeCliente) {
        try {
            this.dao.excluir(testeCliente);
            this.includeSerializer(testeCliente);
        } catch (Exception e) {
            this.result.use(Results.json()).from(e).serialize();
        }
    }

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).include("valid").include("lote").serialize();
    }

}
