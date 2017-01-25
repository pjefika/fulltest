/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.gpon.alcatel;

import dao.dslam.ComandoDslam;
import model.dslam.consulta.TabelaParametrosGpon;
import model.dslam.credencial.Credencial;
import model.dslam.tratativa.TratativaRetornoUtil;
import model.dslam.vivo2.gpon.DslamGpon;
import org.w3c.dom.Document;

/**
 *
 * @author G0042204
 */
public class AlcatelGponDslam extends DslamGpon {

    public AlcatelGponDslam() {
        this.setCredencial(Credencial.ALCATEL);
    }

    public ComandoDslam getSerialOntSintax() {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + " detail xml");
    }

    @Override
    public ComandoDslam getComandoTabelaParametros() {
        return new ComandoDslam("show equipment ont optics 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + " detail xml");
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(ComandoDslam cmd) {

        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        String oi = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='rx-signal-level']");
        String oi1 = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='olt-rx-sig-level']");
        System.out.println(oi + " | " + oi1);

        return null;
    }

}
