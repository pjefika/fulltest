/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.DslamNaoImplException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.fulltest.operacional.FullTestGpon;
import model.validacao.Validator;

/**
 *
 * @author G0042204
 */
@Path("/fulltest")
public class FullTestController {

    @POST
    @Path("/fulltest")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response fulltest(EfikaCustomer cs) throws Exception {
        try {
            Validator v = new FullTestGpon(cs);
            v.validar();
            return Response.status(200).entity(v).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }

    }

    @GET
    @Path("/{instancia}")
    public void teste(@PathParam("instancia") String instancia) {
        System.out.println(instancia);
    }

}
