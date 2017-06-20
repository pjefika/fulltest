/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import br.net.gvt.efika.customer.EfikaCustomer;
import exception.MetodoNaoImplementadoException;
import model.dslam.consulta.VlanMulticast;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanMulticast extends Validacao {

    private transient VlanMulticast vlan;

    private transient EfikaCustomer e;

    public ValidacaoVlanMulticast(VlanMulticast v, EfikaCustomer ec) {
        super("Vlan Multicast");
        this.vlan = v;
        this.e = ec;
    }

    @Override
    public Boolean validar() throws Exception{
        if(vlan == null){
            throw new MetodoNaoImplementadoException();
        }
        if (e.getServicos().getIsHib()) {
            if (vlan.validar(e)) {
                setMensagem("Vlan de Multicast configurado corretamente.");
                setResultado(true);
                return true;
            } else {
                setMensagem("Vlan de Multicast configurado incorretamente. Svlan esperado: " + e.getRede().getVlanVod()+ " - Svlan configurado: " + vlan.getSvlan()
                        + " Estado Vlan: " + vlan.getState().getEstadoVlan()+".");
                setResultado(false);
            }
        }else{
            setMensagem("Cliente sem TV Híbrida.");
            setResultado(Boolean.TRUE);
            return true;
        }

        return false;
    }

}
