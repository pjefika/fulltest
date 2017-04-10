/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.factory;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import dao.produtos.ProdutosDAO;
import model.dslam.AbstractDslam;
import model.dslam.factory.exception.DslamNaoImplException;
import model.dslam.vivo2.metalico.DslamMetalico;
import model.dslam.vivo2.metalico.keymile.KeymileMetalicoDslam;
import model.dslam.vivo2.metalico.zhone.ZhoneMetalicoDslam;

/**
 *
 * @author G0042204
 */
public class DslamMetalicoDAOFactory implements FactoryDslamInterface {

    @Override
    public AbstractDslam getInstance(GetInfoOut info) throws DslamNaoImplException {

        DslamMetalico leDslam;

        // Cuidado confusão do IT -
        String vendor = info.getInfoTBS().getDslamModel();

        if (vendor.trim().equalsIgnoreCase("ZHONE")) {
            leDslam = new ZhoneMetalicoDslam();
        } else if (vendor.trim().equalsIgnoreCase("KEYMILE")) {
            leDslam = new KeymileMetalicoDslam();
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
        leDslam.setP100(info.getInfoTBS().getCvlan().toString());
        leDslam.setVlanVoipe(info.getInfoTBS().getVlanVoIP().toString());
        leDslam.setVlanVode(info.getInfoTBS().getVlanVoD().toString());
        leDslam.setVlanMulticaste(info.getInfoTBS().getVlanMcast().toString());

        ProdutosDAO proDao = new ProdutosDAO(info.getDesignator());
        leDslam.setProd(proDao.getProdCliente());

        return leDslam;
    }

}
