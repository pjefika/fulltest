/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.in.ConsultaConfigPortaIn;
import controller.in.GetEstadoPortasProximasIn;
import controller.in.GetConfiabilidadeRedeIn;
import controller.in.ResetIptvStatisticsIn;
import controller.in.ResetTabelaRedeIn;
import controller.in.SetAdminStateIn;
import controller.in.SetOntToOltIn;
import controller.in.SetProfileIn;
import controller.in.SetVlanBandaIn;
import controller.in.SetVlanMulticastIn;
import controller.in.SetVlanVodIn;
import controller.in.SetVlanVoipIn;
import controller.in.UnsetOntFromOltIn;
import dao.FactoryDAO;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.dslam.config.ConfiguracaoPorta;
import model.dslam.config.ProfileGpon;
import model.dslam.consulta.Porta;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.entity.LogEntity;
import model.service.ConfigGetterGponService;
import model.service.ConfigGetterMetalicoService;
import model.service.ConfigSetterGponService;
import model.service.ConfigSetterMetalicoService;
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

    @POST
    @Path("/unsetOntFromOlt")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response unsetOntFromOlt(UnsetOntFromOltIn cs) throws Exception {
        Response r;
        LogEntity log = cs.create();
        try {
            ConfigSetterGponService config = FactoryService.createConfigSetterGponService(cs.getCust());
            List<SerialOntGpon> result = config.unsetterOntFromOlt();
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
    @Path("/setOntToOlt")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setOntToOlt(SetOntToOltIn cs) throws Exception {
        Response r;
        LogEntity log = cs.create();
        try {
            ConfigSetterGponService config = FactoryService.createConfigSetterGponService(cs.getCust());
            ValidacaoResult result = config.setterOntToOlt(cs.getSerial());
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
    @Path("/setVlanBanda")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setVlanBanda(SetVlanBandaIn cs) throws Exception {
        Response r;
        LogEntity log = cs.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(cs.getCust());
            ValidacaoResult result = config.setterVlanBanda();
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
    @Path("/setVlanVoip")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setVlanVoip(SetVlanVoipIn cs) throws Exception {
        Response r;
        LogEntity log = cs.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(cs.getCust());
            ValidacaoResult result = config.setterVlanVoip();
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
    @Path("/setVlanVod")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setVlanVod(SetVlanVodIn cs) throws Exception {
        Response r;
        LogEntity log = cs.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(cs.getCust());
            ValidacaoResult result = config.setterVlanVod();
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
    @Path("/setVlanMulticast")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setVlanMulticast(SetVlanMulticastIn cs) throws Exception {
        Response r;
        LogEntity log = cs.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(cs.getCust());
            ValidacaoResult result = config.setterVlanMulticast();
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
    @Path("/getEstadoPortasProximas")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getEstadoPortasProximas(GetEstadoPortasProximasIn cs) throws Exception {
        Response r;
        LogEntity log = cs.create();
        try {
            ConfigGetterGponService config = FactoryService.createConfigGetterGponService(cs.getCust());
            List<Porta> result = config.getterEstadoPortasProximas();
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
    @Path("/getConfiabilidadeRede")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getConfiabilidadeRede(GetConfiabilidadeRedeIn in) throws Exception {
        Response r;
        LogEntity log = in.create();
        try {
            ConfigGetterMetalicoService config = FactoryService.createConfigGetterMetalicoService(in.getCust());
            ValidacaoResult result = config.getterTabelaRede();
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

    /**
     * Discutir melhor estratégia para retorno!!!
     *
     * @param in
     * @return String success || Exception.getMessage()
     * @throws Exception
     */
    @POST
    @Path("/resetTabelaRede")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response resetTabelaRede(ResetTabelaRedeIn in) throws Exception {
        Response r;
        LogEntity log = in.create();
        try {
            ConfigSetterMetalicoService config = FactoryService.createConfigSetterMetalicoService(in.getCust());
            config.resetTabelaRede();
            ConfigGetterMetalicoService config1 = FactoryService.createConfigGetterMetalicoService(in.getCust());
            ValidacaoResult result = config1.getterTabelaRede();
            //a ser melhorado -- discutir com @henmerlin
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
    @Path("/resetIptvStatistics")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response resetIptvStatistics(ResetIptvStatisticsIn in) throws Exception {
        Response r;
        LogEntity log = in.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(in.getCust());
            config.resetIptvStatistics();

            List<ValidacaoResult> result = config.getIptvVlans();
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
