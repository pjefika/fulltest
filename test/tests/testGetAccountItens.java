/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import com.gvt.ws.eai.oss.inventory.api.Account;
import com.gvt.ws.eai.oss.inventory.api.Address;
import com.gvt.ws.eai.oss.inventory.api.Item;
import com.gvt.ws.eai.oss.inventory.api.Param;

/**
 *
 * @author G0042204
 */
public class testGetAccountItens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            java.lang.String accountId = null;
            java.lang.String addressId = null;
            java.lang.String designator = "FSA-811ICTYTZY-013";
            java.lang.String networkOwnerId = null;
            boolean inactiveCancelled = false;
            br.com.gvt.oss.inventory.service.impl.InventoryService service = new br.com.gvt.oss.inventory.service.impl.InventoryService();
            br.com.gvt.oss.inventory.service.impl.InventoryImpl port = service.getInventoryImplPort();
            // TODO process result here
            com.gvt.ws.eai.oss.inventory.api.InventoryAccountResponse result = port.getAccountItems(accountId, addressId, designator, networkOwnerId, inactiveCancelled);
            
            for (Account acc : result.getAccounts()) {
                System.out.println(acc.getAccountType());

                for (Address adr : acc.getAddress()) {

                    for (Item item : adr.getItems()) {

                        for (Item itn : item.getItems()) {

                            for (Param param : itn.getParam()) {
                                System.out.println("-" + param.getName());
                                System.out.println("- " + param.getValue());
                            }

                        }

                    }

                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
