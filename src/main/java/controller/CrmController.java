/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FactoryDAO;
import dao.InterfaceDAO;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.entity.crm.LogCrm;

/**
 *
 * @author G0042204
 */
@Path("/crm")
public class CrmController extends RestJaxAbstract {

    private InterfaceDAO<LogCrm> dao;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/log")
    public Response log(LogCrm l) throws Exception {
        try {
            dao = FactoryDAO.createLogCRM();
            dao.cadastrar(l);
            return ok(l);
        } catch (Exception e) {
            return serverError(e);
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") Integer id) {
        Response r;
        try {
            dao = FactoryDAO.createLogCRM();
            LogCrm l = new LogCrm();
            l.setId(id);

            r = ok(dao.buscarPorId(l));
        } catch (Exception e) {
            r = serverError(e);
        }

        return r;
    }

}
