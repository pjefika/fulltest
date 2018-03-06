/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.enumsservice.EnumService;

/**
 *
 * @author G0042204
 */
@Path("/listEnums")
public class ListEnumsController extends RestJaxAbstract {

    @GET
    @Path("/velocidades")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response velocidades() throws Exception {
        Response r;
        try {
            r = ok(EnumService.getVelocidades());
        } catch (Exception e) {
            r = serverError(e);
        }
        return r;
    }
    
    @GET
    @Path("/tecTv")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response tecTv() throws Exception {
        Response r;
        try {
            r = ok(EnumService.getTecnologiasTv());
        } catch (Exception e) {
            r = serverError(e);
        }
        return r;
    }
    
    @GET
    @Path("/tecVoz")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response tecVoz() throws Exception {
        Response r;
        try {
            r = ok(EnumService.getTecnologiasVoz());
        } catch (Exception e) {
            r = serverError(e);
        }
        return r;
    }

}
