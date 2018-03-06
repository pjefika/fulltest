/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

import br.net.gvt.efika.efika_customer.model.customer.CustomerAssert;
import br.net.gvt.efika.efika_customer.model.customer.asserts.AssertsEnum;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class FactoryCriterio {

    public static List<CriterioMotivo> obter(MotivoManobraEnum m) {
        List<CriterioMotivo> lst = new ArrayList<>();
        CriterioMotivo c;
        switch (m) {
            case AUTH_SINC:
                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.AUTH_ABERTURA_ORDEM, Boolean.TRUE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_OK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.AUTH_ABERTURA_ORDEM, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_NOK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.FALSE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.AUTH_ABERTURA_ORDEM, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_NOK);
                lst.add(c);

                break;

            case NAO_ATINGE:

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.ATT_DOWN_OK, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.ATT_UP_OK, Boolean.TRUE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_OK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.ATT_DOWN_OK, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_NOK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.ATT_UP_OK, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_NOK);
                lst.add(c);

                break;

            case SEMNAVEG:

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.PACOTES_DOWN_MAIOR_6000, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.TROCAR_MODEM);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.PACOTES_UP_MAIOR_4000, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.TROCAR_MODEM);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.PACOTES_DOWN_MAIOR_6000, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.PACOTES_UP_MAIOR_4000, Boolean.TRUE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_OK);
                lst.add(c);

                break;

            case QUEDA:

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.IS_REPARO, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_300, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_50, Boolean.TRUE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_OK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.IS_REPARO, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_300, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_50, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_OK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.IS_REPARO, Boolean.FALSE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_300, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_50, Boolean.TRUE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_OK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.IS_REPARO, Boolean.FALSE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_300, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_NOK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.IS_REPARO, Boolean.FALSE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_50, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_NOK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.IS_REPARO, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_300, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.TROCAR_MODEM);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_300, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_NOK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_50, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_NOK);
                lst.add(c);

                break;

            case MUDA:

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.LINHA_MUDA, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.ORIGINOU_CHAMADA_POS_ABERTURA_ORDEM, Boolean.TRUE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_OK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.LINHA_MUDA, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.ORIGINOU_CHAMADA_POS_ABERTURA_ORDEM, Boolean.FALSE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_NOK);
                lst.add(c);

                break;

            case RUIDO:

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.IS_SIP, Boolean.FALSE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RUIDO_CHIADO, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.RESYNC_MENOR_5, Boolean.TRUE));
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.REDE_CONFIAVEL, Boolean.TRUE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_NOK);
                lst.add(c);

                c = new CriterioMotivo();
                c.adicionarCriterio(new CustomerAssert(AssertsEnum.IS_SIP, Boolean.TRUE));
                c.setConclusao(ConclusaoManobraEnum.PORTA_OK);

        }

        return lst;
    }

}
