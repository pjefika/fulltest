/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.validacao;

import dao.cadastro.CadastroDAO;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dslam.AbstractDslam;
import model.dslam.consulta.ConsultaGponDefault;
import model.dslam.consulta.TabelaParametrosGpon;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.TesteCliente;
import model.entity.ValidacaoGpon;
import model.fulltest.validacao.decorator.ValidacaoGponDecorator;

/**
 *
 * @author G0041775
 */
public class ValidacaoFacade {

    private CadastroDAO cad = new CadastroDAO();

    private ConsultaGponDefault gpon;

    private ValidacaoGpon valid;

    private AbstractDslam dslam;

    private TabelaParametrosGpon tabParam;

    private TesteCliente teste;

    private ValidacaoGponDecorator d = new ValidacaoGponDecorator();

    public ValidacaoFacade(AbstractDslam gpon) {
        this.gpon = (ConsultaGponDefault) gpon;
        this.dslam = gpon;
        this.valid = new ValidacaoGpon();
    }

    public ValidacaoFacade(TesteCliente t) {
        this.teste = t;
        this.valid = new ValidacaoGpon();
    }

    public TabelaParametrosGpon getTabParam() {
        return tabParam;
    }

    public void setTabParam(TabelaParametrosGpon tabParam) {
        this.tabParam = tabParam;
    }

    public ValidacaoGpon validar() {

        AbstractDslam abs;
        try {
            abs = cad.getDslam(teste.getInstancia());

            this.gpon = (ConsultaGponDefault) abs;
            this.dslam = abs;

            try {
                if (this.tabParam == null) {
                    this.setTabParam(gpon.getTabelaParametros());
                }
                Thread.sleep(1000);
                System.out.println("Parametros: " + this.tabParam.validar(dslam));
            } catch (Exception e) {
                Thread.sleep(10000);
                try {
                    this.setTabParam(gpon.getTabelaParametros());
                    System.out.println("Catch-> Parametros: " + this.tabParam.validar(dslam));
                } catch (Exception ex) {
                    System.out.println("nao pego parametros");
                }
            } finally {
                this.valid.setParametros(this.tabParam.validar(dslam));
            }

            try {
                if (this.tabParam == null) {
                    this.setTabParam(gpon.getTabelaParametros());
                }
                System.out.println("potolt: " + this.tabParam.getPotOlt());
            } catch (Exception e) {
                Thread.sleep(10000);
                try {
                    this.setTabParam(gpon.getTabelaParametros());
                    System.out.println("Catch-> potolt: " + this.tabParam.getPotOlt());
                } catch (Exception ex) {
                    System.out.println("nao pego potolt");
                }
            } finally {
                this.valid.setPotOlt(this.tabParam.getPotOlt());
            }

            try {
                if (this.tabParam == null) {
                    this.setTabParam(gpon.getTabelaParametros());
                }
                System.out.println("potont: " + this.tabParam.getPotOnt());
            } catch (Exception e) {
                Thread.sleep(10000);
                try {
                    this.valid.setPotOnt(this.tabParam.getPotOnt());
                    System.out.println("Catch-> potont: " + this.valid.getPotOnt());
                } catch (Exception ex) {
                    System.out.println("nao pego potont");
                }
            } finally {
                this.valid.setPotOnt(this.tabParam.getPotOnt());
            }

            valid.setCadastro(Boolean.TRUE);

            valid.setConsulta(Boolean.TRUE);

            valid.setImplementacao(Boolean.TRUE);

            try {
                dslam.getCd().close();
            } catch (IOException ex) {
                Logger.getLogger(ValidacaoFacade.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (DslamNaoImplException ex) {
            return d.falhaImplementacao();
        } catch (RemoteException ex) {
            try {
                Thread.sleep(15000);
                return this.validar();
            } catch (InterruptedException ex1) {
                return d.falhaCadastro();
            }
        } catch (InterruptedException ex) {
            return d.falhaCadastro();
        }

        return valid;
    }

}
