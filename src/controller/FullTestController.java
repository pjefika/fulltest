/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.net.gvt.efika.customer.EfikaCustomer;
import controller.in.FulltestCOIn;
import controller.in.FulltestCRMIn;
import controller.in.FulltestManobraIn;
import dao.FactoryDAO;
import dao.customer.CustomerDAO;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.entity.LogEntity;
import model.fulltest.operacional.FullTest;
import model.fulltest.operacional.facade.FactoryFulltest;
import model.fulltest.operacional.facade.FullTestCOFacade;
import model.fulltest.operacional.facade.FullTestCRMFacade;
import model.fulltest.operacional.facade.FullTestFacade;
import model.fulltest.operacional.facade.FullTestInterface;

/**
 *
 * @author G0042204
 */
@Path("/fulltest")
public class FullTestController extends RestJaxAbstract {

    @POST
    @Path("/manobra")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response manobra(FulltestManobraIn cs) throws Exception {
        LogEntity log = cs.create();
        try {
            FullTestInterface v = FactoryFulltest.manobra();
            FullTest res = v.executar(cs.getCust());
            log.setSaida(res);
            return ok(res);
        } catch (Exception e) {
            log.setSaida(e.getMessage());
            return serverError(e);
        } finally {
            try {
                FactoryDAO.createLogEntityDAO().cadastrar(log);
            } catch (Exception e) {
            }
        }
    }

    @POST
    @Path("/crm")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crm(FulltestCRMIn cs) throws Exception {
        LogEntity log = cs.create();
        try {
            FullTestInterface v = new FullTestCRMFacade();
            FullTest res = v.executar(cs.getCust());
            log.setSaida(res);
            return ok(res);
        } catch (Exception e) {
            log.setSaida(e.getMessage());
            return serverError(e);
        } finally {
            FactoryDAO.createLogEntityDAO().cadastrar(log);
        }
    }

    @POST
    @Path("/co")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response co(FulltestCOIn cs) throws Exception {
        LogEntity log = cs.create();
        try {
            FullTestInterface v = new FullTestCOFacade();
            FullTest res = v.executar(cs.getCust());
            log.setSaida(res);
            return ok(res);
        } catch (Exception e) {
            log.setSaida(e.getMessage());
            return serverError(e);
        } finally {
            FactoryDAO.createLogEntityDAO().cadastrar(log);
        }
    }

    @GET
    @Path("/{instancia}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response teste(@PathParam("instancia") String instancia) {
        try {
            EfikaCustomer cs = CustomerDAO.getCustomer(instancia);
            FullTestInterface v = new FullTestFacade();
            return Response.status(200).entity(v.executar(cs)).build();
        } catch (Exception e) {
            return serverError(e);
        }
    }

}
