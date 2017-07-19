/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import model.validacao.Validacao;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface ValidacaoCorretiva <T>{
    
    public void init(T v);
    
    public Boolean validar();
    
    public void corrigir();
    
    public Validacao resultado();
    
}
