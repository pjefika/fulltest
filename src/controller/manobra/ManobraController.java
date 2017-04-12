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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.RequestScoped;
import model.ConsultaClienteFacade;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.Cliente;
import model.entity.Motivos;

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
    
    @Get
    @Path("/manobra/motivos")
    public void listaMotivos() {
        try {            
            List<Motivos> lm = Arrays.asList(Motivos.values());            
            List<String> l = new ArrayList<>();            
            for (Motivos motivos : lm) {
                l.add(motivos.getMotivos());
            }                    
            this.includeSerializer(l);
        } catch (Exception e) {
            this.includeSerializer(e);
        }
    }

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).recursive().serialize();
    }

}
