/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.cadastro;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;
import java.rmi.RemoteException;
import model.dslam.AbstractDslam;
import model.dslam.credencial.Credencial;
import model.dslam.vivo2.gpon.DslamGpon;
import model.dslam.vivo2.gpon.alcatel.AlcatelGponDslam;
import model.dslam.vivo2.gpon.keymile.KeymileGponDslam;
import model.dslam.vivo2.gpon.zhone.ZhoneGponDslam;

/**
 *
 * @author G0041775
 */
public class CadastroDAO {

    private OSSTurbonetProxy ws = new OSSTurbonetProxy();

    public CadastroDAO() {

    }

    public String getDesignador(String instancia) throws RemoteException {
        return ws.getDesignatorByAccessDesignator(instancia);
    }

    public AbstractDslam montaDslamGpon(String instancia) {

        try {

            String designator = this.getDesignador(instancia);
            String accessDesignator = ws.getAccessDesignator(designator);
            GetInfoOut leInfo = ws.getInfo(designator, accessDesignator, "wise", "wise", instancia, "wise", "25600", "12800");

            AlcatelGponDslam leDslam = new AlcatelGponDslam();

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
//            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.detail);
            return null;
        }
    }

}
