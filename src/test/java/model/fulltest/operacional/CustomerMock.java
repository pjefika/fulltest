/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import br.net.gvt.efika.customer.InventarioServico;
import br.net.gvt.efika.enums.OrigemPlanta;
import br.net.gvt.efika.enums.TecnologiaLinha;
import br.net.gvt.efika.enums.TecnologiaTv;
import br.net.gvt.efika.util.dao.http.HttpDAO;
import br.net.gvt.efika.util.dao.http.HttpDAOGenericImpl;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import util.JacksonMapper;

/**
 *
 * @author G0042204
 */
public class CustomerMock {

    public static EfikaCustomer gponKeymile() {

        EfikaCustomer c = new EfikaCustomer();

        InventarioRede r = new InventarioRede();

        //lab
        r.setIpDslam("10.200.38.155");
        r.setModeloDslam("SUGP1");

        r.setSlot(21);
        r.setPorta(1);
        r.setSequencial(2023);
        r.setCvlan(2123);
        r.setLogica(23);
        r.setRin(111);

        r.setVlanVoip(1111);
        r.setVlanVod(3111);
        r.setVlanMulticast(4000);

        c.setRede(r);
        c.setServicos(sipVdsl());

        return c;
    }

    public static InventarioServico sipVdsl() {
        InventarioServico s = new InventarioServico();
        s.setTipoTv(TecnologiaTv.IPTV);
        s.setTipoLinha(TecnologiaLinha.SIP);
        s.setVelDown(51200l);
        s.setVelUp(25600l);
        return s;
    }

    public static class CustomerRequest {

        private String executor;

        private String parameter;

        public CustomerRequest() {
        }

        public CustomerRequest(String instancia) {
            this.parameter = instancia;
            this.executor = "TESTE";
        }

        public String getExecutor() {
            return executor;
        }

        public void setExecutor(String executor) {
            this.executor = executor;
        }

        public String getParameter() {
            return parameter;
        }

        public void setParameter(String parameter) {
            this.parameter = parameter;
        }
    };

    public static EfikaCustomer getCustomer(String instancia) {
        try {

            HttpDAO dao = new HttpDAOGenericImpl<EfikaCustomer>(EfikaCustomer.class) {
            };

            CustomerRequest req = new CustomerRequest(instancia);

            EfikaCustomer ec = (EfikaCustomer) dao.post("http://10.40.198.168:7171/customerAPI/customer/findByParameter",
                    req);

            return ec;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static EfikaCustomer gponZhone() {

        EfikaCustomer c = new EfikaCustomer();
        //lab
        InventarioRede r = new InventarioRede();
        r.setIpDslam("10.200.38.121");
        r.setModeloDslam("GPON_CARD8");

        r.setSlot(5);
        r.setPorta(2);
        r.setSequencial(135);
        r.setCvlan(235);
        r.setLogica(11);
        r.setRin(121);

        r.setVlanVoip(1121);
        r.setVlanVod(3121);
        r.setVlanMulticast(4000);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setTipoTv(TecnologiaTv.IPTV);

        s.setTipoLinha(TecnologiaLinha.SIP);
        s.setVelDown(15360l);
        s.setVelUp(1024l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer gponAlcatel() {

        EfikaCustomer c = new EfikaCustomer();
        InventarioRede r = new InventarioRede();

        //1630145676
        r.setIpDslam("10.214.57.22");
        r.setModeloDslam("GPON_CARD");

        r.setSlot(7);
        r.setPorta(7);
        r.setSequencial(2749);
        r.setLogica(17);
        r.setRin(14);

        r.setVlanVoip(1014);
        r.setVlanVod(3014);
        r.setVlanMulticast(4000);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setTipoTv(TecnologiaTv.IPTV);
        s.setTipoLinha(TecnologiaLinha.SIP);
        s.setVelDown(51200l);
        s.setVelUp(25600l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer gponHuaweiV1() {
        EfikaCustomer c = new EfikaCustomer();
        InventarioRede r = new InventarioRede();

        //112757790674006 - 1977906740
        r.setTerminal("112757790674006");
        r.setIpDslam("BR_IDUDP_OLT01");
        r.setModeloDslam("MA5600T_FV1");

        r.setIdOnt("0002817789");

        r.setSlot(15);
        r.setPorta(4);
        r.setLogica(2);
        r.setCvlan(2382);
        r.setRin(407);
        r.setBhs(Boolean.TRUE);

        r.setVlanVoip(3004);

        //todo huawei utiliza 400
        r.setVlanVod(400);
        r.setVlanMulticast(3009);
        r.setPlanta(OrigemPlanta.VIVO1);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setTipoTv(TecnologiaTv.IPTV);
        s.setTipoLinha(TecnologiaLinha.SIP);
        s.setVelDown(51200l);
        s.setVelUp(25600l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer alcatel7302() {
        EfikaCustomer c = new EfikaCustomer();
        InventarioRede r = new InventarioRede();

        // Achar cliente 
        //110007570563807 - 1137587599
        //115637212216107 - 1239112215
        //110007556549800 - 1127811121
        r.setTerminal("110007810216308");
        r.setIpDslam("10.58.237.94");
        r.setModeloDslam("7302 ISAM FTTU");

        r.setSlot(12); // Slot
        r.setPorta(1); // Porta Pon
        r.setLogica(1); // Id cliente
        r.setCvlan(373); // Vlan usuario
        r.setRin(41); // Vlan Rede

        r.setVlanVoip(3008); // Vlan Voz
        r.setVlanVod(3005); // Vlan Multicast
        r.setVlanMulticast(3005); // Vlan Multicast
        r.setIdOnt("0002818097");
        r.setBhs(Boolean.TRUE);
        r.setPlanta(OrigemPlanta.VIVO1);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setTipoTv(TecnologiaTv.IPTV);
        s.setTipoLinha(TecnologiaLinha.SIP);
        s.setVelDown(51200l);
        s.setVelUp(25600l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer gponAlcatel7342v1() {
        EfikaCustomer c = new EfikaCustomer();
        InventarioRede r = new InventarioRede();

        //110007790578404 - 1156416900 - 7302
        //110007612130407 - 1122624939
        r.setTerminal("110007612130407");
        r.setIpDslam("BR_SPOTR_OLT01");
        r.setModeloDslam("7342FTTU");

        r.setIdOnt("0002596166");

        r.setSlot(4);
        r.setPorta(4);
        r.setLogica(38);
        r.setCvlan(2070);
        r.setRin(115);
        r.setBhs(Boolean.TRUE);

        r.setVlanVoip(3004);

        r.setVlanVod(3001);
        r.setVlanMulticast(3001);
        r.setPlanta(OrigemPlanta.VIVO1);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setTipoTv(TecnologiaTv.DTH);
        s.setTipoLinha(TecnologiaLinha.SIP);
        s.setVelDown(51200l);
        s.setVelUp(25600l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer metalicoHuawei5600t() {
        EfikaCustomer c = new EfikaCustomer();
        InventarioRede r = new InventarioRede();

        r.setTerminal("1120414633");
        r.setIpDslam("10.58.150.74");
        r.setModeloDslam("MA5600T");

//        r.setIdOnt("0002596166");

        r.setSlot(15);
        r.setPorta(3);
//        r.setLogica(38);
        r.setCvlan(951);
        r.setRin(103);
        r.setBhs(Boolean.FALSE);

//        r.setVlanVoip(3004);

//        r.setVlanVod(3001);
//        r.setVlanMulticast(3001);
        r.setPlanta(OrigemPlanta.VIVO1);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
//        s.setTipoTv(TecnologiaTv.DTH);
        s.setTipoLinha(TecnologiaLinha.TDM);
        s.setVelDown(2048l);
        s.setVelUp(1024l);

        c.setServicos(s);

        return c;
    }

}
