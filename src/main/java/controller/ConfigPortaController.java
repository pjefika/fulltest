/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoPorta;
import br.net.gvt.efika.fulltest.model.telecom.config.ProfileConfig;
import br.net.gvt.efika.fulltest.model.telecom.properties.Porta;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import controller.in.ConsultaConfigPortaIn;
import controller.in.CorretorEstadoDaPortaIn;
import controller.in.CorretorProfileIn;
import controller.in.CorretorVlanBandaIn;
import controller.in.CorretorVlanVoIPIn;
import controller.in.CorretorVlansVideoIn;
import controller.in.FixVlansIn;
import controller.in.GetConfiabilidadeRedeIn;
import controller.in.GetEstadoPortasProximasIn;
import controller.in.GetOntFromOltIn;
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
import controller.in.ValidadorParametrosIn;
import dao.FactoryDAO;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.entity.LogEntity;
import model.service.ConfigGetterGponService;
import model.service.ConfigGetterMetalicoService;
import model.service.ConfigGetterService;
import model.service.ConfigSetterGponService;
import model.service.ConfigSetterMetalicoService;
import model.service.ConfigSetterService;
import model.service.ConfigSetterSpecific;
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
        LogEntity log = cs.create();
        try {
            ConfiguracaoPorta config = FactoryService.create(cs.getCust()).consultar();
            log.setSaida(config);
            r = ok(config);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().save(log);
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
            FactoryDAO.createLogEntityDAO().save(log);
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
            ConfigSetterSpecific config = FactoryService.createConfigSpecificSetterService(cs.getCust());

            ProfileConfig result = config.setterProfile(cs.getProfile());

            log.setSaida(result);
            r = ok(result);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().save(log);
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
            FactoryDAO.createLogEntityDAO().save(log);
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
            FactoryDAO.createLogEntityDAO().save(log);
        }
        return r;
    }

    @POST
    @Path("/getOntFromOlt")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getOntFromOlt(GetOntFromOltIn cs) throws Exception {
        Response r;
        LogEntity log = cs.create();
        try {
            ConfigGetterGponService config = FactoryService.createConfigGetterGponService(cs.getCust());
            ValidacaoResult result = config.getterOntFromOlt();
            log.setSaida(result);
            r = ok(result);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().save(log);
        }
        return r;
    }

    @POST
    @Path("/fixVlans")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response fixVlans(FixVlansIn cs) throws Exception {
                Response r;
        LogEntity log = cs.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(cs.getCust());
            List<ValidacaoResult> result = config.setterVlans();
            log.setSaida(result);
            r = ok(result);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
            e.printStackTrace();
        } finally {
            FactoryDAO.createLogEntityDAO().save(log);
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
            FactoryDAO.createLogEntityDAO().save(log);
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
            FactoryDAO.createLogEntityDAO().save(log);
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
            FactoryDAO.createLogEntityDAO().save(log);
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
            FactoryDAO.createLogEntityDAO().save(log);
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
            FactoryDAO.createLogEntityDAO().save(log);
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
            FactoryDAO.createLogEntityDAO().save(log);
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
            FactoryDAO.createLogEntityDAO().save(log);
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
            FactoryDAO.createLogEntityDAO().save(log);
        }
        return r;
    }

    @POST
    @Path("/isManageable")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response isManageable(CorretorEstadoDaPortaIn in) throws Exception {
        Response r;
        LogEntity log = in.create();
        try {
            ConfigGetterService config = FactoryService.createConfigGetterService(in.getCust());
            Boolean result = config.isManageable();
            log.setSaida(result);
            r = ok(result);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().save(log);
        }
        return r;
    }

    @POST
    @Path("/corretorEstadoDaPorta")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response corretorEstadoDaPorta(CorretorEstadoDaPortaIn in) throws Exception {
        Response r;
        LogEntity log = in.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(in.getCust());
            ValidacaoResult result = config.corretorEstadoDaPorta();
            log.setSaida(result);
            r = ok(result);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().save(log);
        }
        return r;
    }

    @POST
    @Path("/corretorVlanBanda")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response corretorVlanBanda(CorretorVlanBandaIn in) throws Exception {
        Response r;
        LogEntity log = in.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(in.getCust());
            ValidacaoResult result = config.corretorVlanBanda();
            log.setSaida(result);
            r = ok(result);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().save(log);
        }
        return r;
    }

    @POST
    @Path("/corretorProfile")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response corretorProfile(CorretorProfileIn in) throws Exception {
        Response r;
        LogEntity log = in.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(in.getCust());
            ValidacaoResult result = config.corretorProfile();
            log.setSaida(result);
            r = ok(result);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().save(log);
        }
        return r;
    }

    @POST
    @Path("/corretorVlansVideo")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response corretorVlansVideo(CorretorVlansVideoIn in) throws Exception {
        Response r;
        LogEntity log = in.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(in.getCust());
            ValidacaoResult result = config.corretorVlansVideo();
            log.setSaida(result);
            r = ok(result);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().save(log);
        }
        return r;
    }

    @POST
    @Path("/corretorVlanVoIP")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response corretorVlanVoIP(CorretorVlanVoIPIn in) throws Exception {
        Response r;
        LogEntity log = in.create();
        try {
            ConfigSetterService config = FactoryService.createConfigSetterService(in.getCust());
            ValidacaoResult result = config.corretorVlanVoIP();
            log.setSaida(result);
            return ok(result);
        } catch (Exception e) {
            log.setSaida(e.getMessage());
            return serverError(e);
        } finally {
            FactoryDAO.createLogEntityDAO().save(log);
        }
    }

    @POST
    @Path("/validadorParametros")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response validadorParametros(ValidadorParametrosIn in) throws Exception {
        Response r;
        LogEntity log = in.create();
        try {
            ConfigGetterService config = FactoryService.createConfigGetterService(in.getCust());
            ValidacaoResult result = config.validadorParametros();
            log.setSaida(result);
            r = ok(result);
        } catch (Exception e) {
            r = serverError(e);
            log.setSaida(e.getMessage());
        } finally {
            FactoryDAO.createLogEntityDAO().save(log);
        }
        return r;
    }
}
