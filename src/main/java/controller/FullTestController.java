/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.util.thread.EfikaThread;
import controller.in.FulltestCOIn;
import controller.in.FulltestCRMIn;
import controller.in.FulltestManobraIn;
import dao.FactoryDAO;
import dao.customer.CustomerDAO;
import dao.log.LogEntityDAO;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dao.log.LogManobraDAO;
import model.entity.LogEntity;
import model.entity.manobra.LogManobra;
import model.fulltest.operacional.FactoryRunnable;
import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import model.fulltest.operacional.facade.FactoryFulltest;
import model.fulltest.operacional.facade.FullTestCRMFacade;
import model.fulltest.operacional.facade.FullTestFacade;
import model.fulltest.operacional.facade.FullTestInterface;
import model.service.FactoryService;

import java.util.List;

/**
 *
 * @author G0042204
 */
@Path("/fulltest")
public class FullTestController extends RestJaxAbstract {
    
    private LogEntityDAO logDao = FactoryDAO.createLogEntityDAO();
    
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
            throw new Exception(e);
            //return serverError(e);
        } finally {
            try {
                FactoryDAO.createLogEntityDAO().save(log);
            } catch (Exception e) {
            }
        }
    }

    @POST
    @Path("/findManobraByCustomer")
    @Produces({"application/json", "application/xml"})
    public Response findMonobraByCustomer(EfikaCustomer customer)
            throws Exception {
        List<LogManobra> logManobra = new LogManobraDAO().listarLogManobraPorCustomer(customer);
        return Response.ok(logManobra).build();
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
            FactoryDAO.createLogEntityDAO().save(log);
        }
    }

    /**
     * Rota responsavel por fazer a chamada do fulltest
     * @param cs
     * @return
     * @throws Exception
     */
    @POST
    @Path("/co")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response co(FulltestCOIn cs) throws Exception {
        //Grava no mongo
        LogEntity log = cs.create();
        logDao.save(log);
        try {
            new EfikaThread(FactoryRunnable.coRunnable(log));
            return ok(new FullTest(log.getId().toString()));
        } catch (Exception e) {
            logDao.update(log, logDao.createUpdateOperations().set("saida", e.getMessage()));
            return serverError(e);
        }
    }
    
    @GET
    @Path("/findById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") String id) throws Exception {
        try {
            FullTest r = FactoryService.createEntityWatcherService().mountById(id);
            return ok(r);
        } catch (Exception e) {
            return serverError(e);
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
