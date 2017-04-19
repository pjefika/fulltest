/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.manobra;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import java.math.BigInteger;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import model.entity.AbstractEntity;
import model.entity.Cliente;
import model.facade.ValidaClienteManobraFacade;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "fulltestAPI_ValidacaoManobra")
public class ValidacaoManobra extends AbstractEntity {

    private String designador, modeloDslam;
    private BigInteger slot, porta, shelf, endSeqPorta;
    private String ipDslam, nomeArmario, nomeBras;
    @Transient
    private Cliente c;
//
//    @OneToMany(fetch = FetchType.LAZY)
//    private List<ValidacaoPersist> valids;

    public ValidacaoManobra() {
    }

    public ValidacaoManobra(ValidaClienteManobraFacade f) {
        if (f.getCl() != null) {
            c = f.getCl();
            GetInfoOut cad = c.getCadastro();
            this.designador = c.getDesignador();
            this.modeloDslam = cad.getInfoTBS().getDslamModel() + " " + cad.getInfoTBS().getDslamVendor();
            this.slot = cad.getInfoTBS().getSlot();
            this.porta = cad.getInfoTBS().getSlot();
            this.shelf = new BigInteger(cad.getInfoTBS().getShelf());
            this.endSeqPorta = cad.getInfoTBS().getPortAddrSequence();
            this.ipDslam = cad.getInfoTBS().getIpDslam();
            this.nomeArmario = cad.getInfoRadius().getCabinet();
            this.nomeBras = cad.getInfoCricket().getIpGerenciaBRAS();
        }
    }
}
