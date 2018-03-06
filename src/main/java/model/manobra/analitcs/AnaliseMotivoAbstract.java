/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

import br.net.gvt.efika.efika_customer.model.customer.CustomerAssert;
import java.util.List;

/**
 *
 * @author G0042204
 */
public abstract class AnaliseMotivoAbstract implements Analiser {

    private final List<CustomerAssert> asserts;

    private final MotivoManobraEnum motivo;

    private final List<CriterioMotivo> criterios;

    public AnaliseMotivoAbstract(List<CustomerAssert> asserts, MotivoManobraEnum motivo, List<CriterioMotivo> criterios) {
        this.asserts = asserts;
        this.motivo = motivo;
        this.criterios = criterios;
    }

    @Override
    public final AnaliseMotivo run() {

        for (CriterioMotivo criterio : criterios) {
            if (criterio.check(asserts)) {
                return new AnaliseMotivo(motivo, criterio.getConclusao());
            }
        }
        return new AnaliseMotivo(motivo, ConclusaoManobraEnum.PORTA_OK);
    }

}
