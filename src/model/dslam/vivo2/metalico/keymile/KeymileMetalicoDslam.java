/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.metalico.keymile;

import dao.dslam.telnet.ComandoDslam;
import java.util.List;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.retorno.TratativaRetornoUtil;
import model.dslam.vivo2.metalico.DslamMetalico;

/**
 *
 * @author G0042204
 */
public abstract class KeymileMetalicoDslam extends DslamMetalico {

    private String srvc;

    public String getSrvc() {
        return srvc;
    }

    public void setSrvc(String srvc) {
        this.srvc = srvc;
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta() throws Exception {
        List<String> admin = this.getCd().consulta(this.getComandoConsultaEstadoAdminDaPorta()).getRetorno();
        List<String> oper = this.getCd().consulta(this.getComandoConsultaEstadoOperDaPorta()).getRetorno();

        String adminState = TratativaRetornoUtil.tratKeymile(admin, "State");
        String operState = TratativaRetornoUtil.tratKeymile(oper, "State");

        EstadoDaPorta portState = new EstadoDaPorta();
        portState.setAdminState(adminState);
        portState.setOperState(operState);

        return portState;
    }

    public ComandoDslam getComandoConsultaEstadoAdminDaPorta() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/main/AdministrativeStatus");
    }

    public ComandoDslam getComandoConsultaEstadoOperDaPorta() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/port-" + this.getPorta() + "/main/OperationalStatus");
    }
    
    public ComandoDslam getComandoConsultaVlan() {
        return new ComandoDslam("get /services/packet/" + this.getSrvc() + "/cfgm/Service");
    }

}
