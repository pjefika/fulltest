/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.cadastro;

import com.gvt.ws.eai.oss.ossturbonet.OSSTurbonet;
import com.gvt.ws.eai.oss.ossturbonetadslusereport.OSSTurbonetAdslUseReportOut;
import com.gvt.ws.eai.oss.ossturbonetclienteautenticado.OSSTurbonetClienteAutenticadoIn;
import com.gvt.ws.eai.oss.ossturbonetclienteautenticado.OSSTurbonetClienteAutenticadoOut;
import com.gvt.ws.eai.oss.ossturbonetinconsistenciatbsradius.OSSTurbonetInconsistenciaTBSRadiusIn;
import com.gvt.ws.eai.oss.ossturbonetinconsistenciatbsradius.OSSTurbonetInconsistenciaTBSRadiusOut;
import com.gvt.ws.eai.oss.ossturbonetstatusconexao.OSSTurbonetStatusConexaoOut;
import java.com_gvt_oss_ossturbonet.GetInfoOut;
import java.com_gvt_oss_ossturbonet.InfoAuthentication;
import model.dslam.AbstractDslam;
import model.dslam.factory.DslamDAOFactory;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.Cliente;

/**
 *
 * @author G0041775
 */
public class CadastroDAO {

    private OSSTurbonet ws;
    private DslamDAOFactory factory = new DslamDAOFactory();

    public CadastroDAO() {
        com.gvt.ws.eai.oss.ossturbonet.OSSTurbonetService service = new com.gvt.ws.eai.oss.ossturbonet.OSSTurbonetService();
        ws = service.getOSSTurbonetSoapPort();
    }

    public OSSTurbonetInconsistenciaTBSRadiusOut verificarInconsistenciaTBSRadius(GetInfoOut info) throws Exception {
        OSSTurbonetInconsistenciaTBSRadiusIn in = new OSSTurbonetInconsistenciaTBSRadiusIn();
        in.setOssTurbonetIn(new OSSTurbonetInCustom(info));
        return ws.verificarInconsistenciaTBSRadius(in);
    }

    public String getDesignador(String instancia) throws Exception {
        return ws.getDesignatorByAccessDesignator(instancia);
    }

    public Cliente getCliente(Cliente c) throws DslamNaoImplException, Exception {
        c.setCadastro(this.getInfo(this.getDesignador(c.getDesignador())));
        c.setIncon(this.verificarInconsistenciaTBSRadius(c.getCadastro()));
        c.setAuth(this.getAutentication(c.getCadastro()));
        return c;
    }

    public GetInfoOut getInfo(String designador) throws Exception {
        String designator = this.getDesignador(designador);
        String accessDesignator = this.getAccessDesignator(designator);
        GetInfoOut leInfo = new GetInfoOut();
        return ws.getInfo(designator, accessDesignator, "wise", "wise", designator, "wise", "0", "0");
    }

    public AbstractDslam getDslam(GetInfoOut info) throws DslamNaoImplException, Exception {
        return factory.getInstance(info);
    }

    public String getAccessDesignator(String designador) throws Exception {
        return ws.getAccessDesignator(designador);
    }

    public AbstractDslam getDslam(String instancia) throws DslamNaoImplException, Exception {
        try {
            String designator = this.getDesignador(instancia);
            String accessDesignator = this.getAccessDesignator(designator);
            return factory.getInstance(ws.getInfo(designator, accessDesignator, "wise", "wise", instancia, "wise", "0", "0"));
        } catch (Exception ex) {
            throw ex;
        }
    }

    public InfoAuthentication getAutentication(GetInfoOut i) throws Exception {
        return ws.getInfoAuthentication(i.getDesignator(), i.getDesignator(), "wise", "wise", "wise");
    }

    public OSSTurbonetClienteAutenticadoOut getTeste(GetInfoOut i) throws Exception {
        OSSTurbonetClienteAutenticadoIn in = new OSSTurbonetClienteAutenticadoIn();
        in.setOssTurbonetIn(new OSSTurbonetInCustom(i));
        return ws.verificaSeClienteAutenticadoNoRelay(in);
    }

    public OSSTurbonetStatusConexaoOut getAuthenticationByIPorMac(String ipOrmac) throws Exception {
        return ws.getAuthenticationByIPorMac(ipOrmac);
    }

    /**
     * Histórico de Autenticação WiseTool
     *
     * @return
     * @throws Exception
     */
    public OSSTurbonetAdslUseReportOut getAdslUseReport() throws Exception {
        return ws.getAdslUseReport(null);
    }

}
