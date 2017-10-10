/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.in.SetAdminStateIn;
import controller.in.ConsultaConfigPortaIn;
import controller.in.SetProfileIn;
import dao.FactoryDAO;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.dslam.config.ConfiguracaoPorta;
import model.dslam.config.ProfileGpon;
import model.entity.LogEntity;
import model.service.ConfigSetterService;
import model.service.FactoryService;
import model.validacao.impl.both.ValidacaoResult;

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
        LogEntity log = cs.create();
        try {
            ConfiguracaoPorta config = FactoryService.create(cs.getCust()).consultar();
            log.setSaida(config);
            r = ok(config);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().cadastrar(log);
        }
        return r;
    }
    
    
    @POST
    @Path("/setAdminState")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setAdminState(SetAdminStateIn cs) throws Exception {
        Response r;
        LogEntity log = cs.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(cs.getCust());
            ValidacaoResult result = config.setterEstadoDaPorta(cs.getEstadoPorta());
            log.setSaida(result);
            r = ok(result);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().cadastrar(log);
        }
        return r;
    }
    
    
    @POST
    @Path("/setProfile")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setProfile(SetProfileIn cs) throws Exception {
        Response r;
        LogEntity log = cs.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(cs.getCust());
            ProfileGpon result = config.setterProfile(cs.getProfile());
            log.setSaida(result);
            r = ok(result);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().cadastrar(log);
        }
        return r;
    }
    

}
