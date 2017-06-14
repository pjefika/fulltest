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
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.fulltest.operacional.FullTestGpon;
import model.validacao.Validator;

/**
 *
 * @author G0041775
 */
@Path("/fulltest")
public class FullTestController{

    @GET
    @Path("/{instancia}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Validator fulltest(@PathParam("customer") EfikaCustomer ec) throws DslamNaoImplException {
        Validator v = new FullTestGpon(ec);
        v.validar();
        return v;
    }

}
