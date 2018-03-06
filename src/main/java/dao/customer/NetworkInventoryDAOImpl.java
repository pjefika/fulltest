/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.customer;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.util.dao.http.HttpDAO;
import br.net.gvt.efika.util.dao.http.HttpDAOGenericImpl;
import java.util.List;

public class NetworkInventoryDAOImpl implements NetworkInventoryDAO {

    @Override
    public List<EfikaCustomer> consultarVizinhos(EfikaCustomer ec, Integer qtde) throws Exception {

        HttpDAO dao = new HttpDAOGenericImpl(ClientesVizinhosResponse.class) {
        };
        ClientesVizinhosResponse ret = (ClientesVizinhosResponse) dao.post("http://10.200.35.67:80/networkInventoryAPI/networkInventoryGpon/vizinhos", new ClientesVizinhosRequest(ec, qtde));

        return ret.getVizinhos();
    }

}
