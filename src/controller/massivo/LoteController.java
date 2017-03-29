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
import controller.AbstractController;
import controller.autenticacao.SessionUsuarioEfika;
import dao.massivo.LoteDAO;
import java.util.Date;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import model.entity.Lote;
import model.fulltest.Status;

/**
 *
 * @author G0034481
 */
@Controller
@RequestScoped
public class LoteController extends AbstractController {

    @Inject
    private SessionUsuarioEfika session;

//    @Inject
    private LoteDAO loteDAO;

    public LoteController() {
    }    

    @Path("/lote/massivo/ativos")
    @Get
    public void listarLotesAtivos() {
        loteDAO = new LoteDAO();
        List<Lote> l = this.loteDAO.listarLotesAtivo(this.session.getUsuario().getLogin());
        if (l != null) {
            this.includeSerializer(l);
        }
        System.out.println(this.session.getUsuario().getLogin());
    }

    @Post
    @Consumes("application/json")
    @Path("/lote/massivo/cadastrar")
    public void cadastrar(Lote lote) {
        try {
            lote.setStatus(Status.ATIVO);
            lote.setMatricula(this.session.getUsuario().getLogin());
            lote.setDataCriacao(new Date());
            this.loteDAO.cadastrar(lote);
            result.use(Results.json()).from(lote).serialize();
        } catch (Exception e) {
            this.result.use(Results.json()).from(e).serialize();
        }
    }

    @Post
    @Consumes("application/json")
    @Path("/lote/massivo/modificar")
    public void modificar(Lote lote) {
        try {
            this.loteDAO.editar(lote);
            this.includeSerializer(lote);
        } catch (Exception e) {
            this.result.use(Results.json()).from(e).serialize();
        }
    }

    @Post
    @Consumes("application/json")
    @Path("/lote/massivo/excluir")
    public void excluir(Lote lote) {
        try {
            this.loteDAO.excluir(lote);
            this.includeSerializer(lote);
        } catch (Exception e) {
            this.result.use(Results.json()).from(e).serialize();
        }
    }

    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).include("tests").serialize();
    }

}
