/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.cadastro;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusIn;
import com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusOut;
import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;
import java.rmi.RemoteException;
import model.dslam.AbstractDslam;
import model.dslam.factory.DslamDAOFactory;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.Cliente;

/**
 *
 * @author G0041775
 */
public class CadastroDAO {

    private OSSTurbonetProxy ws = new OSSTurbonetProxy();
    private DslamDAOFactory factory = new DslamDAOFactory();

    public CadastroDAO() {
    }

    public OSSTurbonetInconsistenciaTBSRadiusOut verificarInconsistenciaTBSRadius(GetInfoOut info) throws RemoteException {
        return ws.verificarInconsistenciaTBSRadius(new OSSTurbonetInconsistenciaTBSRadiusIn(new OSSTurbonetInCustom(info)));
    }

    public String getDesignador(String instancia) throws RemoteException {
        return ws.getDesignatorByAccessDesignator(instancia);
    }

    public Cliente getCliente(Cliente c) throws DslamNaoImplException, RemoteException {
        c.setCadastro(this.getInfo(this.getDesignador(c.getDesignador())));
        c.setIncon(this.verificarInconsistenciaTBSRadius(c.getCadastro()));
        return c;
    }

    public GetInfoOut getInfo(String designador) throws RemoteException {
        String designator = designador;
        String accessDesignator = ws.getAccessDesignator(designator);
        GetInfoOut leInfo = new GetInfoOut();
        return ws.getInfo(designator, accessDesignator, "wise", "wise", designador, "wise", "0", "0");
    }

    public AbstractDslam getDslam(GetInfoOut info) throws DslamNaoImplException, RemoteException {
        return factory.getInstance(info);
    }

    public AbstractDslam getDslam(String instancia) throws DslamNaoImplException, RemoteException {
        try {
            String designator = this.getDesignador(instancia);
            String accessDesignator = ws.getAccessDesignator(designator);
            GetInfoOut leInfo = new GetInfoOut();
            leInfo = ws.getInfo(designator, accessDesignator, "wise", "wise", instancia, "wise", "0", "0");
            return factory.getInstance(leInfo);
        } catch (RemoteException | DslamNaoImplException ex) {
            throw ex;
        }
    }

}
