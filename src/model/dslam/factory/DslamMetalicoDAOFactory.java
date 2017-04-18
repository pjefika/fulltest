/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.factory;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import dao.produtos.ProdutosDAO;
import java.math.BigInteger;
import model.dslam.AbstractDslam;
import model.dslam.factory.exception.DslamNaoImplException;
import model.dslam.vivo2.metalico.DslamMetalico;
import model.dslam.vivo2.metalico.keymile.KeymileMetalicoSuadDslam;
import model.dslam.vivo2.metalico.keymile.KeymileMetalicoSuvd11;
import model.dslam.vivo2.metalico.keymile.KeymileMetalicoSuvd3;
import model.dslam.vivo2.metalico.zhone.ZhoneMetalicoComboDslam;
import model.dslam.vivo2.metalico.zhone.ZhoneMetalicoMxkDslam;

/**
 *
 * @author G0042204
 */
public class DslamMetalicoDAOFactory implements FactoryDslamInterface {

    @Override
    public AbstractDslam getInstance(GetInfoOut info) throws DslamNaoImplException {

        DslamMetalico leDslam;

        // Cuidado confusão do IT -
        InfoTBS tbs = info.getInfoTBS();

        if (tbs.getDslamModel().equalsIgnoreCase("ZHONE")) {
            if (tbs.getDslamVendor().equalsIgnoreCase("COMBOZH48")) {
                leDslam = new ZhoneMetalicoComboDslam();
            } else if (tbs.getDslamVendor().equalsIgnoreCase("MXK")) {
                leDslam = new ZhoneMetalicoMxkDslam();
            } else {
                throw new DslamNaoImplException();
            }
        } else if (tbs.getDslamModel().trim().equalsIgnoreCase("KEYMILE")) {
            if (tbs.getDslamVendor().equalsIgnoreCase("SUVD3")) {
                leDslam = new KeymileMetalicoSuvd3();
            } else if (tbs.getDslamVendor().equalsIgnoreCase("SUVD11")) {
                leDslam = new KeymileMetalicoSuvd11();
            } else if (tbs.getDslamVendor().equalsIgnoreCase("SUAD")) {
                leDslam = new KeymileMetalicoSuadDslam();
            } else {
                throw new DslamNaoImplException();
            }
        } else {
            throw new DslamNaoImplException();
        }

        leDslam.setTecnologia(info.getTechnology());
        leDslam.setPorta(info.getInfoTBS().getPortNumber());
        leDslam.setVendor(info.getInfoTBS().getDslamModel());
        leDslam.setModelo(info.getInfoTBS().getDslamVendor());
        leDslam.setIpDslam(info.getInfoTBS().getIpDslam());
        leDslam.setSlot(info.getInfoTBS().getSlot());
        leDslam.setSequencial(info.getInfoTBS().getPortAddrSeq());
        leDslam.setRin(new Integer(info.getInfoTBS().getRin()).toString());
        leDslam.setP100(leDslam.getSequencial().add(new BigInteger("100")).toString());
        leDslam.setVlanVoipe(info.getInfoTBS().getVlanVoIP().toString());
        leDslam.setVlanVode(info.getInfoTBS().getVlanVoD().toString());
        leDslam.setVlanMulticaste(info.getInfoTBS().getVlanMcast().toString());

        ProdutosDAO proDao = new ProdutosDAO(info.getDesignator());
        leDslam.setProd(proDao.getProdCliente());

        return leDslam;
    }

}
