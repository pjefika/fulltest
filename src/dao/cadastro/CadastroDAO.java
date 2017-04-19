/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.cadastro;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoAuthentication;
import com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOut;
import com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoIn;
import com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut;
import com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusIn;
import com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusOut;
import com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoIn;
import com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut;
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

    public OSSTurbonetClienteAutenticadoOut isClienteAutenticado(GetInfoOut info) throws RemoteException {
        return ws.isClienteAutenticado(new OSSTurbonetClienteAutenticadoIn(new OSSTurbonetInCustom(info)));
    }

    /**
     * Consulta de Autenticação via Cache (Radius Relay);
     *
     * @param info
     * @return
     * @throws RemoteException
     */
    public OSSTurbonetStatusConexaoOut getAuthRadiusRelay(GetInfoOut info) throws RemoteException {
        return ws.getStatusConexao(new OSSTurbonetStatusConexaoIn(new OSSTurbonetInCustom(info)));
    }

    public Cliente getCliente(Cliente c) throws DslamNaoImplException, RemoteException {
        c.setCadastro(this.getInfo(this.getDesignador(c.getDesignador())));
        c.setIncon(this.verificarInconsistenciaTBSRadius(c.getCadastro()));
//        c.setAuth(this.getAutentication(c.getCadastro()));
        return c;
    }

    public GetInfoOut getInfo(String designador) throws RemoteException {
        String designator = this.getDesignador(designador);
        String accessDesignator = this.getAccessDesignator(designator);
        GetInfoOut leInfo = new GetInfoOut();
        return ws.getInfo(designator, accessDesignator, "wise", "wise", designator, "wise", "0", "0");
    }

    public AbstractDslam getDslam(GetInfoOut info) throws DslamNaoImplException, RemoteException {
        return factory.getInstance(info);
    }

    public String getAccessDesignator(String designador) throws RemoteException {
        return ws.getAccessDesignator(designador);
    }

    public AbstractDslam getDslam(String instancia) throws DslamNaoImplException, RemoteException {
        try {
            String designator = this.getDesignador(instancia);
            String accessDesignator = this.getAccessDesignator(designator);
            return factory.getInstance(ws.getInfo(designator, accessDesignator, "wise", "wise", instancia, "wise", "0", "0"));
        } catch (RemoteException | DslamNaoImplException ex) {
            throw ex;
        }
    }

    public InfoAuthentication getAutentication(GetInfoOut i) throws RemoteException {
        return ws.getInfoAuthentication(i.getDesignator(), i.getDesignator(), "wise", "wise", "wise");
    }

    public OSSTurbonetStatusConexaoOut getAuthenticationByIPorMac(String ipOrmac) throws RemoteException {
        return ws.getAuthenticationByIPorMac(ipOrmac);
    }

    /**
     * Histórico de Autenticação WiseTool
     *
     * @return
     * @throws RemoteException
     */
    public OSSTurbonetAdslUseReportOut getAdslUseReport() throws RemoteException {
        return ws.getAdslUseReport(null);
    }

}
