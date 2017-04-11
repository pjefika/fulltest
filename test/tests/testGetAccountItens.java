/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;
import model.dslam.velocidade.Velocidades;

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
            
            OSSTurbonetProxy ws = new OSSTurbonetProxy();
            String designator = ws.getDesignatorByAccessDesignator("4133335556");
            
            java.lang.String accountId = null;
            java.lang.String addressId = null;
            
            java.lang.String networkOwnerId = null;
            boolean inactiveCancelled = true;
            br.com.gvt.oss.inventory.service.impl.InventoryService service = new br.com.gvt.oss.inventory.service.impl.InventoryService();
            br.com.gvt.oss.inventory.service.impl.InventoryImpl port = service.getInventoryImplPort();
            // TODO process result here
            com.gvt.ws.eai.oss.inventory.api.InventoryAccountResponse result = port.getAccountItems(accountId, addressId, designator, networkOwnerId, inactiveCancelled);
            
            for (com.gvt.ws.eai.oss.inventory.api.Account acc : result.getAccounts()) {
            for (com.gvt.ws.eai.oss.inventory.api.Address adr : acc.getAddress()) {
                for (com.gvt.ws.eai.oss.inventory.api.Item item : adr.getItems()) {
                    for (com.gvt.ws.eai.oss.inventory.api.Item itn : item.getItems()) {
                        if(itn.getStatusName().equals("PENDING")){
                            for (com.gvt.ws.eai.oss.inventory.api.Param param : itn.getParam()) {
                            if(param.getName().equals("Downstream")){
                                System.out.println("Down "+param.getValue());
                                Velocidades leVel = Velocidades.valueOf("VEL_"+param.getValue());
                                System.out.println(leVel.getVel());
                            }
                            if(param.getName().equals("Upstream")){
                                System.out.println("Up "+param.getValue());
                                Velocidades leVel = Velocidades.valueOf("VEL_"+param.getValue());
                                System.out.println(leVel.getVel());
                            }
                        }
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
