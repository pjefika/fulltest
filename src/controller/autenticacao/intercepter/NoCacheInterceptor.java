/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.autenticacao.intercepter;

import br.com.caelum.vraptor.BeforeCall;
import br.com.caelum.vraptor.Intercepts;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

@Intercepts
public class NoCacheInterceptor {

    private final HttpServletResponse response;

    /**
     * @deprecated CDI eyes only
     */
    protected NoCacheInterceptor() {
        this(null);
    }

    @Inject
    public NoCacheInterceptor(HttpServletResponse response) {
        this.response = response;
    }

    @BeforeCall
    public void intercept() {

        // set the expires to past
        response.setHeader("Expires", "Wed, 31 Dec 1969 21:00:00 GMT");

        // no-cache headers for HTTP/1.1
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");

        // no-cache headers for HTTP/1.1 (IE)
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");

        // no-cache headers for HTTP/1.0
        response.setHeader("Pragma", "no-cache");
    }
}
