/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;
import java.rmi.RemoteException;
import model.DslamGpon;

/**
 *
 * @author G0041775
 */
public class DadosDslamDAO {
    public DadosDslamDAO() {
    
    }
    
    public DslamGpon montaDslamGpon(String instancia){
                
        try {    
            OSSTurbonetProxy ws = new OSSTurbonetProxy();
            String designator = ws.getDesignatorByAccessDesignator(instancia);
            String accessDesignator = ws.getAccessDesignator(designator);
            GetInfoOut leInfo = ws.getInfo(designator, accessDesignator, "wise", "wise", instancia, "wise", "25600", "12800");
            
            DslamGpon leDslam = new DslamGpon();
            
            leDslam.setTecnologia(leInfo.getTechnology());
            leDslam.setPorta(leInfo.getInfoTBS().getPortNumber()); 
            leDslam.setVendor(leInfo.getInfoTBS().getDslamModel());
            leDslam.setModelo(leInfo.getInfoTBS().getDslamVendor());
            leDslam.setIpDslam(leInfo.getInfoTBS().getIpDslam());
            leDslam.setSlot(leInfo.getInfoTBS().getSlot());
            leDslam.setLogica(leInfo.getInfoTBS().getPortAddrSequence());
            leDslam.setSequencial(leInfo.getInfoTBS().getPortAddrSeq());
            
            return leDslam;
            
            
        } catch (RemoteException ex) {
//            Logger.getLogger(DadosDslamDAO.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println(ex.detail);
              return new DslamGpon();
        }
    }
    
}
