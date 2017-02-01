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
import model.dslam.factory.DslamDAOFactory;
import model.dslam.factory.exception.DslamNaoImplException;

/**
 *
 * @author G0041775
 */
public class CadastroDAO {

    private OSSTurbonetProxy ws = new OSSTurbonetProxy();

    private DslamDAOFactory factory = new DslamDAOFactory();

   
    
    
    public CadastroDAO() {

    }

    public String getDesignador(String instancia) throws RemoteException {
        return ws.getDesignatorByAccessDesignator(instancia);
    }

    public AbstractDslam getDslam(String instancia) throws DslamNaoImplException {

        try {

            String designator = this.getDesignador(instancia);
            String accessDesignator = ws.getAccessDesignator(designator);
            
            GetInfoOut leInfo = ws.getInfo(designator, accessDesignator, "wise", "wise", instancia, "wise", "0", "0");
            
            
            return factory.getInstance(leInfo);

        } catch (RemoteException ex) {
//            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.detail);
            return null;
        }
    }

}
