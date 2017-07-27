/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

import br.net.gvt.efika.customer.CustomerAssert;
import java.util.ArrayList;
import java.util.List;
import model.manobra.ConclusaoMotivo;
import model.manobra.MotivoManobraEnum;

/**
 *
 * @author G0042204
 */
public class CriterioMotivo implements Checker {

    private MotivoManobraEnum motivo;

    private List<CustomerAssert> cas;

    private ConclusaoMotivo conclusao;

    public CriterioMotivo() {
    }

    public void adicionarCriterio(CustomerAssert c) {
        getCas().add(c);
    }

    @Override
    public Boolean check(List<CustomerAssert> lst) {
        return cas.containsAll(lst);
    }

    public List<CustomerAssert> getCas() {
        if (cas == null) {
            cas = new ArrayList<>();
        }
        return cas;
    }

    public MotivoManobraEnum getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoManobraEnum motivo) {
        this.motivo = motivo;
    }

    public ConclusaoMotivo getConclusao() {
        return conclusao;
    }

    public void setConclusao(ConclusaoMotivo conclusao) {
        this.conclusao = conclusao;
    }

}
