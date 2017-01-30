/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

/**
 *
 * @author G0042204
 */
public interface ConsultaGponDefault {

    public EstadoDaPorta getEstadoDaPorta() throws Exception;

    public SerialOntGpon getSerialOnt() throws Exception;

    public TabelaParametrosGpon getTabelaParametros() throws Exception;

    public Vlan getVlanBanda() throws Exception;

    public VlanMulticast getVlanMulticast() throws Exception;

    public Vlan getVlanVoip() throws Exception;

    public Vlan getVlanVod() throws Exception;
    
    public AlarmesGpon getAlarmes() throws Exception;
    
    public ProfileGpon getProfile() throws Exception;
   
}
