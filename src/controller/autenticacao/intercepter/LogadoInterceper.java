package controller.autenticacao.intercepter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.AcceptsWithAnnotations;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;
import controller.autenticacao.SessionUsuarioEfika;
import controller.autenticacao.UsuarioController;
import model.annotation.Logado;

@Intercepts
@RequestScoped
@AcceptsWithAnnotations(Logado.class)
public class LogadoInterceper {

    @Inject
    private Result result;

    @Inject
    private SessionUsuarioEfika session;

    /**
     * @deprecated CDI eyes only
     */
    protected LogadoInterceper() {

    }

    @Inject
    public LogadoInterceper(SessionUsuarioEfika session) {
        this.session = session;
    }

    @AroundCall
    public void around(SimpleInterceptorStack stack) {
        if (session.getUsuario().getLogin() != null) {
            stack.next();
        } else {
            result.forwardTo(UsuarioController.class).logar();
        }
    }

}
