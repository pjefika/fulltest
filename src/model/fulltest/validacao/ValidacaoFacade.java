/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.validacao;

import model.dslam.AbstractDslam;
import model.dslam.consulta.ConsultaGponDefault;
import model.entity.ValidacaoGpon;

/**
 *
 * @author G0041775
 */
public class ValidacaoFacade {

    private ConsultaGponDefault gpon;

    private ValidacaoGpon valid;

    private AbstractDslam dslam;

    public ValidacaoFacade(AbstractDslam gpon) {
        this.gpon = (ConsultaGponDefault) gpon;
        this.dslam = gpon;
        this.valid = new ValidacaoGpon();
    }

    public ValidacaoGpon validar() throws Exception {

        try {
            this.valid.setAdmState(gpon.getEstadoDaPorta().validar(dslam));
            Thread.sleep(1000);
            System.out.println("Estado da Porta: " + this.valid.getAdmState());    
        } catch (Exception e) {
            Thread.sleep(7000);
            try {
                this.valid.setAdmState(gpon.getEstadoDaPorta().validar(dslam));
                System.out.println("First catch-> Estado da Porta: " + this.valid.getAdmState());
            } catch (Exception ex) {
                System.out.println("nao pego state");
            }
        }
        
        try {
            this.valid.setOntAssociado(gpon.getSerialOnt().getSerial());
            Thread.sleep(1000);
            System.out.println(this.valid.getOntAssociado());
        } catch (Exception e) {
            Thread.sleep(7000);
            try {
                this.valid.setOntAssociado(gpon.getSerialOnt().getSerial());
                System.out.println("First catch->"+this.valid.getOntAssociado());    
            } catch (Exception ex) {
                System.out.println("nao pego serial");
            }
        }
        
        try {
            this.valid.setProfile(gpon.getProfile().validar(dslam));
            Thread.sleep(1000);
            System.out.println("Profile: " + this.valid.getProfile());    
        } catch (Exception e) {
            Thread.sleep(7000);
            try {
                this.valid.setProfile(gpon.getProfile().validar(dslam));
                System.out.println("Catch-> Profile: " + this.valid.getProfile());
            } catch (Exception ex) {
                System.out.println("nao pego profile");
            }
        }
        
        
        try {
            this.valid.setParametros(gpon.getTabelaParametros().validar(dslam));
            Thread.sleep(1000);
            System.out.println("Parametros: " + this.valid.getParametros());
        } catch (Exception e) {
            Thread.sleep(7000);
            try {
                this.valid.setParametros(gpon.getTabelaParametros().validar(dslam));
                System.out.println("Catch-> Parametros: " + this.valid.getParametros());
            } catch (Exception ex) {
                System.out.println("nao pego parametros");
            }
            
        }
        
        try {
            this.valid.setPotOlt(gpon.getTabelaParametros().getPotOlt());    
            Thread.sleep(1000);
            System.out.println("potolt: "+this.valid.getPotOlt());
        } catch (Exception e) {
            Thread.sleep(7000);
            try {
                this.valid.setPotOlt(gpon.getTabelaParametros().getPotOlt());        
                System.out.println("Catch-> potolt: "+this.valid.getPotOlt());
            } catch (Exception ex) {
                System.out.println("nao pego potolt");
            }
        }
        
        try {
            this.valid.setPotOnt(gpon.getTabelaParametros().getPotOnt());    
            Thread.sleep(1000);
            System.out.println("potont: "+this.valid.getPotOnt());
        } catch (Exception e) {
            Thread.sleep(7000);
            try {
                this.valid.setPotOnt(gpon.getTabelaParametros().getPotOnt());        
                System.out.println("Catch-> potont: "+this.valid.getPotOnt());
            } catch (Exception ex) {
                System.out.println("nao pego potont");
            }
        }
        

        try {
            this.valid.setVlanBanda(gpon.getVlanBanda().validar(dslam));
            Thread.sleep(1000);
            System.out.println("VlanBanda: " + this.valid.getVlanBanda());
        } catch (Exception e) {
            Thread.sleep(7000);
            try {
                this.valid.setVlanBanda(gpon.getVlanBanda().validar(dslam));
                System.out.println("Catch-> VlanBanda: " + this.valid.getVlanBanda());    
            } catch (Exception ex) {
                System.out.println("nao pego vlanbanda");
            }
        }

        if (!dslam.getProd().getLinha().getTipo().equals("TDM/H248")) {
            try {
                this.valid.setVlanVoip(gpon.getVlanVoip().validar(dslam));
                Thread.sleep(1000);
                System.out.println("VlanVoip: " + this.valid.getVlanVoip());    
            } catch (Exception e) {
                Thread.sleep(7000);
                try {
                    this.valid.setVlanVoip(gpon.getVlanVoip().validar(dslam));
                    Thread.sleep(1000);
                    System.out.println("Catch-> VlanVoip: " + this.valid.getVlanVoip());        
                } catch (Exception ex) {
                    System.out.println("nao pego vlanvoip");
                }
            }
        }
        
        if(dslam.getProd().getTv().getTipo() != null){
            if (dslam.getProd().getTv().getTipo().contains("HIBRIDA")) {
                try {
                    this.valid.setVlanVod(gpon.getVlanVod().validar(dslam));
                    Thread.sleep(1000);
                    System.out.println("VlanVod: " + this.valid.getVlanVod());    
                } catch (Exception e) {
                    Thread.sleep(7000);
                    try {
                        this.valid.setVlanVod(gpon.getVlanVod().validar(dslam));
                        System.out.println("Catch-> VlanVod: " + this.valid.getVlanVod());        
                    } catch (Exception ex) {
                        System.out.println("nao pego vlanvod");
                    }
                    
                }
                
                try {
                    this.valid.setVlanMulticast(gpon.getVlanMulticast().validar(dslam));
                    Thread.sleep(1000);
                    System.out.println("VlanMulticast: " + this.valid.getVlanMulticast());
                } catch (Exception e) {
                    Thread.sleep(7000);
                    try {
                        this.valid.setVlanMulticast(gpon.getVlanMulticast().validar(dslam));
                        System.out.println("Catch-> VlanMulticast: " + this.valid.getVlanMulticast());
                    } catch (Exception ex) {
                        System.out.println("nao pego multicast");
                    }
                }

                
            }    
        }

        try {
            this.valid.setSemAlarme(gpon.getAlarmes().validar(dslam));
            Thread.sleep(1000);
            this.valid.setListaAlarmes(gpon.getAlarmes().getListAlarmes().toString());
            Thread.sleep(1000);
            System.out.println("SemAlarme: " + this.valid.getSemAlarme());
        } catch (Exception e) {
            Thread.sleep(7000);
            try {
                this.valid.setSemAlarme(gpon.getAlarmes().validar(dslam));
                Thread.sleep(1000);
                this.valid.setListaAlarmes(gpon.getAlarmes().getListAlarmes().toString());
                System.out.println("Catch-> SemAlarme: " + this.valid.getSemAlarme());
            } catch (Exception ex) {
                System.out.println("nao pego alarmes");
            }
        }
        

        return valid;
    }

}