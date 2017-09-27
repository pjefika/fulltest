/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.in.ConsultaConfigPortaIn;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.service.FactoryService;

/**
 *
 * @author G0042204
 */
@Path("/configPorta")
public class ConfigPortaController extends RestJaxAbstract {

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response consulta(ConsultaConfigPortaIn cs) throws Exception {
        Response r;
        try {
            r = ok(FactoryService.create(cs.getCust()).consultar());
        } catch (Exception e) {
            r = serverError(e);
        }
        return r;
    }

}
