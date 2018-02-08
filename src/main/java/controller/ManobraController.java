/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.net.gvt.efika.customer.EfikaCustomer;
import controller.RestJaxAbstract;
import controller.in.AnaliticoIn;
import dao.FactoryDAO;
import dao.InterfaceDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.entity.manobra.LogManobra;
import model.manobra.analitcs.FinalizacaoManobra;
import model.manobra.analitcs.FinalizacaoManobraAdapter;
import model.manobra.analitcs.MotivoManobraEnum;
import model.manobra.asserts.facade.AssertsManobra;
import model.manobra.asserts.facade.Assertter;
import model.manobra.facade.AnalisadorManobra;
import model.manobra.facade.AnalisadorManobraFacade;
import util.JacksonMapper;

/**
 *
 * @author G0042204
 */
@Path("/manobra")
public class ManobraController extends RestJaxAbstract {

    private InterfaceDAO<LogManobra> dao;

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
            dao = FactoryDAO.create();
            LogManobra l = new LogManobra();
            l.setId(id);

            r = ok(dao.buscarPorId(l));
        } catch (Exception e) {
            r = serverError(e);
        } finally {
            dao.close();
        }

        return r;
    }

    @POST
    @Path("/analitico")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response analitico(AnaliticoIn in) {
        Response r;
        try {
            AnalisadorManobra f = new AnalisadorManobraFacade(in.getCust());
            FinalizacaoManobra fim = f.analisar();

            try {
                LogManobra l = new LogManobra(in.getCust());
                l.setCustomer(new JacksonMapper(EfikaCustomer.class).serialize(in.getCust()));
                l.setAnalises(new JacksonMapper(FinalizacaoManobra.class).serialize(fim));
                l.setExecutor(in.getExecutor());
                l.setConclusao(fim.getConclusao().getConclusao());
                l.setMotivo(fim.getConclusao().getMotivo());
                l.setManobrar(fim.getManobrar());
                l.setMotivoEntrada(in.getMotivo());
                dao = FactoryDAO.create();
                dao.cadastrar(l);
                dao.close();
            } catch (Exception ex) {
                Logger.getLogger(ManobraController.class.getName()).log(Level.SEVERE, null, ex);
            }

            r = ok(FinalizacaoManobraAdapter.adapter(fim));
        } catch (Exception e) {
            r = serverError(e);
        }

        return r;
    }

    @POST
    @Path("/asserts")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response asserts(EfikaCustomer cust) {
        Response r;
        try {
            Assertter instance = new AssertsManobra(cust);
            r = ok(instance.assertThese());
        } catch (Exception e) {
            r = serverError(e);
        }
        return r;
    }

    @GET
    @Path("/motivos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarMotivos() {
        Response r;
        try {
            r = ok(MotivoManobraEnum.toDTO());
        } catch (Exception e) {
            r = serverError(e);
        }
        return r;
    }

    @POST
    @Path("/listarManobras")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response listarManobras(EfikaCustomer cust) {
        Response r;
        try {
            r = ok(FactoryDAO.create().listarLogManobraPorCustomer(cust));
        } catch (Exception e) {
            r = serverError(e);
        }
        return r;
    }

}
