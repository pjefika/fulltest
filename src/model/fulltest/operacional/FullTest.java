/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.ArrayList;
import java.util.List;
import model.validacao.impl.both.ValidacaoResult;

/**
 *
 * @author G0042204
 */
public class FullTest extends FullTestAbs {

    protected EfikaCustomer cl;

    protected List<ValidacaoResult> valids;

    public FullTest() {
        valids = new ArrayList<>();
    }

    public EfikaCustomer getCl() {
        return cl;
    }

    public void setCl(EfikaCustomer cl) {
        this.cl = cl;
    }

    public List<ValidacaoResult> getValids() {
        return valids;
    }

    public void setValids(List<ValidacaoResult> valids) {
        this.valids = valids;
    }

}
