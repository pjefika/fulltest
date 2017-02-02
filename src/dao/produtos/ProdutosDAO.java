/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.produtos;

import model.produtos.ProdutoBanda;
import model.produtos.ProdutoCliente;
import model.produtos.ProdutoLinha;
import model.produtos.ProdutoTv;

/**
 *
 * @author G0041775
 */
public class ProdutosDAO {
    
    private br.com.gvt.oss.inventory.service.impl.InventoryService service = new br.com.gvt.oss.inventory.service.impl.InventoryService();
    private br.com.gvt.oss.inventory.service.impl.InventoryImpl port = service.getInventoryImplPort();
    private com.gvt.ws.eai.oss.inventory.api.InventoryAccountResponse result;
    private String designator;

    public ProdutosDAO(String designator) {
        this.designator = designator;
        this.result = port.getAccountItems(null, null, designator, null, false);
    }
    
    public ProdutoBanda getBanda(){
        ProdutoBanda leBanda = new ProdutoBanda();
        for (com.gvt.ws.eai.oss.inventory.api.Account acc : result.getAccounts()) {
            for (com.gvt.ws.eai.oss.inventory.api.Address adr : acc.getAddress()) {
                for (com.gvt.ws.eai.oss.inventory.api.Item item : adr.getItems()) {
                    for (com.gvt.ws.eai.oss.inventory.api.Item itn : item.getItems()) {
                        if(itn.getStatusName().equals("ACTIVE")){
                            for (com.gvt.ws.eai.oss.inventory.api.Param param : itn.getParam()) {
                                if(param.getName().equals("Downstream")){
                                    leBanda.setDownCrm(param.getValue());
                                }
                                if(param.getName().equals("Upstream")){
                                    leBanda.setUpCrm(param.getValue());
                                }
                            }
                        }
                    }
                }
            }
        }
        return leBanda;
    }
    
    public ProdutoLinha getLinha(){
        
        ProdutoLinha linha = new ProdutoLinha();
        for (com.gvt.ws.eai.oss.inventory.api.Account acc : result.getAccounts()) {
            for (com.gvt.ws.eai.oss.inventory.api.Address adr : acc.getAddress()) {
                for (com.gvt.ws.eai.oss.inventory.api.Item item : adr.getItems()) {
                    for (com.gvt.ws.eai.oss.inventory.api.Item itn : item.getItems()) {
                        for (com.gvt.ws.eai.oss.inventory.api.Param param : itn.getParam()) {
                            if(param.getName().equals("TecnologiaVoz")){
                                linha.setTipo(param.getValue());
                            }
                        }
                    }
                }
            }
        }

        return linha;
    }
    
    public ProdutoTv getTv(){
        
        ProdutoTv tv = new ProdutoTv();
        for (com.gvt.ws.eai.oss.inventory.api.Account acc : result.getAccounts()) {
            for (com.gvt.ws.eai.oss.inventory.api.Address adr : acc.getAddress()) {
                for (com.gvt.ws.eai.oss.inventory.api.Item item : adr.getItems()) {
                    for (com.gvt.ws.eai.oss.inventory.api.Item itn : item.getItems()) {
                        for (com.gvt.ws.eai.oss.inventory.api.Param param : itn.getParam()) {
                            if(param.getName().equals("TecnologiaTV")){
                                tv.setTipo(param.getValue());
                            }
                        }
                    }
                }
            }
        }

        return tv;
    }
    
    public ProdutoCliente getProdCliente(){
        
        ProdutoCliente prod = new ProdutoCliente();
        prod.setBanda(this.getBanda());
        prod.setLinha(this.getLinha());
        prod.setTv(this.getTv());
        
        return prod;
    }
    
}
