/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.customer;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.network_inventory.model.dto.ClientesVizinhosRequestDTO;
import br.net.gvt.efika.network_inventory.model.service.FactoryOfflineNetworkInventoryService;
import java.util.List;

public class NetworkInventoryDAOImpl implements NetworkInventoryDAO {

    @Override
    public List<EfikaCustomer> consultarVizinhos(EfikaCustomer ec, Integer qtde) throws Exception {

        ClientesVizinhosRequestDTO request = new ClientesVizinhosRequestDTO();
        request.setEc(ec);
        request.setQtde(qtde);
        return FactoryOfflineNetworkInventoryService.newNetworkInventoryService().consultarVizinhos(request).getVizinhos();

    }

}
