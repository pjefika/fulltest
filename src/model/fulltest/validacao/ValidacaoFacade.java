/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.validacao;

import model.dslam.AbstractDslam;
import model.dslam.consulta.ConsultaGponDefault;
import model.dslam.consulta.TabelaParametrosGpon;
import model.entity.ValidacaoGpon;

/**
 *
 * @author G0041775
 */
public class ValidacaoFacade {

    private ConsultaGponDefault gpon;

    private ValidacaoGpon valid;

    private AbstractDslam dslam;

    private TabelaParametrosGpon tabParam;

    public TabelaParametrosGpon getTabParam() {
        return tabParam;
    }

    public void setTabParam(TabelaParametrosGpon tabParam) {
        this.tabParam = tabParam;
    }

    public ValidacaoFacade(AbstractDslam gpon) {
        this.gpon = (ConsultaGponDefault) gpon;
        this.dslam = gpon;
        this.valid = new ValidacaoGpon();
    }

    public ValidacaoGpon validar() throws Exception {

//        try {
//            this.valid.setPortState(gpon.getEstadoDaPorta().validar(dslam));
//            Thread.sleep(1000);
//            System.out.println("Estado da Porta: " + this.valid.getPortState());
//        } catch (Exception e) {
//            Thread.sleep(10000);
//            try {
//                this.valid.setPortState(gpon.getEstadoDaPorta().validar(dslam));
//                System.out.println("First catch-> Estado da Porta: " + this.valid.getPortState());
//            } catch (Exception ex) {
//                System.out.println("nao pego state");
//            }
//        }
//
//        try {
//            this.valid.setOntAssociado(gpon.getSerialOnt().getSerial());
//            Thread.sleep(1000);
//            System.out.println(this.valid.getOntAssociado());
//        } catch (Exception e) {
//            Thread.sleep(10000);
//            try {
//                this.valid.setOntAssociado(gpon.getSerialOnt().getSerial());
//                System.out.println("First catch->" + this.valid.getOntAssociado());
//            } catch (Exception ex) {
//                System.out.println("nao pego serial");
//            }
//        }
//
//        try {
//            this.valid.setProfile(gpon.getProfile().validar(dslam));
//            Thread.sleep(1000);
//            System.out.println("Profile: " + this.valid.getProfile());
//        } catch (Exception e) {
//            Thread.sleep(10000);
//            try {
//                this.valid.setProfile(gpon.getProfile().validar(dslam));
//                System.out.println("Catch-> Profile: " + this.valid.getProfile());
//            } catch (Exception ex) {
//                System.out.println("nao pego profile");
//            }
//        }

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

//        try {
//            this.valid.setVlanBanda(gpon.getVlanBanda().validar(dslam));
//            Thread.sleep(1000);
//            System.out.println("VlanBanda: " + this.valid.getVlanBanda());
//        } catch (Exception e) {
//            Thread.sleep(10000);
//            try {
//                this.valid.setVlanBanda(gpon.getVlanBanda().validar(dslam));
//                System.out.println("Catch-> VlanBanda: " + this.valid.getVlanBanda());    
//            } catch (Exception ex) {
//                System.out.println("nao pego vlanbanda");
//            }
//        }
//
//        if (!dslam.getProd().getLinha().getTipo().equals("TDM/H248")) {
//            try {
//                this.valid.setVlanVoip(gpon.getVlanVoip().validar(dslam));
//                Thread.sleep(1000);
//                System.out.println("VlanVoip: " + this.valid.getVlanVoip());    
//            } catch (Exception e) {
//                Thread.sleep(10000);
//                try {
//                    this.valid.setVlanVoip(gpon.getVlanVoip().validar(dslam));
//                    Thread.sleep(1000);
//                    System.out.println("Catch-> VlanVoip: " + this.valid.getVlanVoip());        
//                } catch (Exception ex) {
//                    System.out.println("nao pego vlanvoip");
//                }
//            }
//        }
//        
//        if(dslam.getProd().getTv().getTipo() != null){
//            if (dslam.getProd().getTv().getTipo().contains("HIBRIDA")) {
//                try {
//                    this.valid.setVlanVod(gpon.getVlanVod().validar(dslam));
//                    Thread.sleep(1000);
//                    System.out.println("VlanVod: " + this.valid.getVlanVod());    
//                } catch (Exception e) {
//                    Thread.sleep(10000);
//                    try {
//                        this.valid.setVlanVod(gpon.getVlanVod().validar(dslam));
//                        System.out.println("Catch-> VlanVod: " + this.valid.getVlanVod());        
//                    } catch (Exception ex) {
//                        System.out.println("nao pego vlanvod");
//                    }
//                    
//                }
//                
//                try {
//                    this.valid.setVlanMulticast(gpon.getVlanMulticast().validar(dslam));
//                    Thread.sleep(1000);
//                    System.out.println("VlanMulticast: " + this.valid.getVlanMulticast());
//                } catch (Exception e) {
//                    Thread.sleep(10000);
//                    try {
//                        this.valid.setVlanMulticast(gpon.getVlanMulticast().validar(dslam));
//                        System.out.println("Catch-> VlanMulticast: " + this.valid.getVlanMulticast());
//                    } catch (Exception ex) {
//                        System.out.println("nao pego multicast");
//                    }
//                }
//
//                
//            }    
//        }
//
//        try {
//            this.valid.setSemAlarme(gpon.getAlarmes().validar(dslam));
//            Thread.sleep(3000);
//            this.valid.setListaAlarmes(gpon.getAlarmes().getListAlarmes().toString());
//            Thread.sleep(1000);
//            System.out.println("SemAlarme: " + this.valid.getSemAlarme());
//        } catch (Exception e) {
//            Thread.sleep(10000);
//            try {
//                this.valid.setSemAlarme(gpon.getAlarmes().validar(dslam));
//                Thread.sleep(3000);
//                this.valid.setListaAlarmes(gpon.getAlarmes().getListAlarmes().toString());
//                System.out.println("Catch-> SemAlarme: " + this.valid.getSemAlarme());
//            } catch (Exception ex) {
//                System.out.println("nao pego alarmes");
//            }
//        }
//        
//        if(valid.getParametros() == null && valid.getPortState() == null &&
//           valid.getProfile() == null && valid.getSemAlarme() == null &&
//           valid.getVlanBanda() == null && valid.getVlanVoip() == null  &&
//           valid.getListaAlarmes() == null && valid.getOntAssociado() == null &&
//           valid.getPotOlt() == null && valid.getPotOnt() == null){
//            
//            valid.setReteste(Boolean.TRUE);
//            
//        }
        valid.setCadastro(Boolean.TRUE);

        valid.setConsulta(Boolean.TRUE);

        valid.setImplementacao(Boolean.TRUE);

        dslam.getCd().close();

        return valid;
    }

}
