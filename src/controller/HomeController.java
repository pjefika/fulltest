package controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import model.annotation.Logado;

@Controller
public class HomeController extends AbstractController {

    public HomeController() {

    }

    @Path("/home/")
    @Logado
    public void index() {

    }

    public void restrito() {
    }

}
