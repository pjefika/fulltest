/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.manobra;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import model.entity.AbstractEntity;
import model.facade.ValidaClienteManobraFacade;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "fulltestAPI_ValidacaoManobra")
public class ValidacaoManobra extends AbstractEntity {

    private String designador;

    @OneToMany(fetch = FetchType.LAZY)
    private List<ValidacaoPersist> valids;

    public ValidacaoManobra() {
    }

    public ValidacaoManobra(ValidaClienteManobraFacade f) {
        this.designador = f.getCl().getDesignador();
    }
}
