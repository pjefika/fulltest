/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.customer;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import java.util.List;

/**
 *
 * @author G0042204
 */
public interface NetworkInventoryDAO {

    public List<EfikaCustomer> consultarVizinhos(EfikaCustomer ec, Integer qtde) throws Exception;

}
