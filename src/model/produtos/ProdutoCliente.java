/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.produtos;

/**
 *
 * @author G0041775
 */
public class ProdutoCliente {
    private ProdutoBanda banda;
    private ProdutoLinha linha;
    private ProdutoTv tv;

    public ProdutoCliente() {
    }

    public ProdutoBanda getBanda() {
        return banda;
    }

    public void setBanda(ProdutoBanda banda) {
        this.banda = banda;
    }

    public ProdutoLinha getLinha() {
        return linha;
    }

    public void setLinha(ProdutoLinha linha) {
        this.linha = linha;
    }

    public ProdutoTv getTv() {
        return tv;
    }

    public void setTv(ProdutoTv tv) {
        this.tv = tv;
    }
}
