/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.customer;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.http.GenericHttpDAO;
import java.util.List;

public class NetworkInventoryDAOImpl extends GenericHttpDAO<List<EfikaCustomer>> implements NetworkInventoryDAO {

    @Override
    public List<EfikaCustomer> consultarVizinhos(EfikaCustomer ec, Integer qtde) throws Exception {
        return this.jsonPost(new ClientesVizinhosRequest(ec, qtde));
    }

}
