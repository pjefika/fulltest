/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import model.dslam.consulta.metalico.TabelaParametrosAbstract;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaParametrosMetalicoVdsl;

/**
 *
 * @author G0041775
 */
public class ValidacaoParametrosMetalico extends Validacao {

    protected transient TabelaParametrosMetalico t;
    protected transient TabelaParametrosMetalico tIdeal;
    protected transient TabelaParametrosMetalicoVdsl tVdsl;
    protected transient TabelaParametrosMetalicoVdsl tVdslIdeal;
    protected transient Boolean isVdsl;

    public ValidacaoParametrosMetalico(TabelaParametrosAbstract tab, TabelaParametrosAbstract tabIdeal) {
        super("Parâmetros de Sincronismo");
        t = (TabelaParametrosMetalico) tab;
        tIdeal = (TabelaParametrosMetalico) tabIdeal;
        tVdsl = (TabelaParametrosMetalicoVdsl) tab;
        tVdslIdeal = (TabelaParametrosMetalicoVdsl) tabIdeal;
        isVdsl = tVdsl.getAtnDown1() != null;
    }

    @Override
    public Boolean validar() throws Exception {

        Boolean result = t.validar(tIdeal);

        String msg = result ? "Parâmetros dentro dos padrões." : "";

        if (t.getVelSincDown().compareTo(tIdeal.getVelSincDown()) < 0) {
            msg += " Velocidade de Down deveria ser acima de " + tIdeal.getVelSincDown().toString() + " porém é " + t.getVelSincDown().toString() + ".";
        }
        if (t.getVelSincUp().compareTo(tIdeal.getVelSincUp()) < 0) {
            msg += " Velocidade de Up deveria ser acima de " + tIdeal.getVelSincUp().toString() + " porém é " + t.getVelSincUp().toString() + ".";
        }
        if (t.getSnrDown().compareTo(tIdeal.getSnrDown()) < 0) {
            msg += " Sinal Ruído de Down deveria ser acima de " + tIdeal.getSnrDown().toString() + " porém é " + t.getSnrDown().toString() + ".";
        }
        if (t.getSnrUp().compareTo(tIdeal.getSnrUp()) < 0) {
            msg += " Sinal Ruído de Up deveria ser acima de " + tIdeal.getSnrUp().toString() + " porém é " + t.getSnrUp().toString() + ".";
        }
        if (t.getAtnDown().compareTo(tIdeal.getAtnDown()) < 0) {
            msg += " Sinal Atenuação de Down deveria ser acima de " + tIdeal.getAtnDown().toString() + " porém é " + t.getAtnDown().toString() + ".";
        }
        if (t.getAtnUp().compareTo(tIdeal.getAtnUp()) < 0) {
            msg += " Sinal Atenuação de Up deveria ser acima de " + tIdeal.getAtnUp().toString() + " porém é " + t.getAtnUp().toString() + ".";
        }
        

        return getResultado();
    }

}
