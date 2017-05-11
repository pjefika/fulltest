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
import br.com.caelum.vraptor.serialization.gson.WithRoot;
import br.com.caelum.vraptor.view.Results;
import controller.AbstractController;
import controller.autenticacao.SessionUsuarioEfika;
import dao.ManobraDAO;
import dao.cadastro.CadastroDAO;
import java.rmi.RemoteException;
import java.util.List;
import javax.inject.Inject;
import model.Motivos;
import model.annotation.Logado;
import model.annotation.NoCache;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.Cliente;
import model.entity.manobra.ValidacaoManobra;
import model.facade.ConsultaClienteFacade;
import model.facade.ValidaClienteManobraFacade;

/**
 *
 * @author G0041775
 */
@Controller
public class ManobraController extends AbstractController {

    private CadastroDAO dao = new CadastroDAO();

    @Inject
    private SessionUsuarioEfika sessionUsuarioEfika;

    @Inject
    private ManobraDAO mDAO;

    @Logado
    @NoCache
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
            this.includeSerializer(f.getCl());
        } catch (DslamNaoImplException ex) {
            includeSerializerNonRecursive(ex);
        } catch (RemoteException ex) {
            includeSerializerNonRecursive(ex);
        }
    }

    @Post
    @Consumes(value = "application/json", options = WithRoot.class)
    @Path("/manobra/valida")
    public void validarManobra(Cliente cliente, String motivo, String atividade) {
        try {
            ValidaClienteManobraFacade f = new ValidaClienteManobraFacade(cliente, Motivos.valueOf(motivo), atividade);
            f.validar();
            mDAO.cadastrar(new ValidacaoManobra(f));
            this.includeSerializer(f);
//            this.result.use(Results.json()).from(f).include("valids").include("conclusao").serialize();
        } catch (Exception e) {
            includeSerializerNonRecursive(e);
        }
    }

    @Post
    @Consumes("application/json")
    @Path("/manobra/listavalidesp")
    public void listarValidEspecifo(Cliente cliente) {
        try {
            List<ValidacaoManobra> l = mDAO.listarValidEspecifo(cliente);
            this.includeSerializer(l);
        } catch (Exception e) {
            includeSerializerNonRecursive(e);
        }
    }

    @Get
    @Path("/manobra/motivos")
    public void listaMotivos() {
        try {
            this.includeSerializer(Motivos.values());
        } catch (Exception e) {
            this.includeSerializerNonRecursive(e);
        }
    }

    @Get
    @Path("/manobra/veatendente")
    public void atendente() {
        try {
            this.includeSerializer(sessionUsuarioEfika.isAtendente());
        } catch (Exception e) {
            this.includeSerializerNonRecursive(e);
        }
    }

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).recursive().serialize();
    }

    public void includeSerializerNonRecursive(Object a) {
        result.use(Results.json()).from(a).serialize();
    }

}
