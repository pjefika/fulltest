/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

/**
 *
 * @author G0041775
 */
public class VelocidadeMinima {
    
    private Double minDown;
    private Double minUp;

    public Double getMinDown() {
        return minDown;
    }

    public Double getMinUp() {
        return minUp;
    }

    public VelocidadeMinima(String velDown, String velUp) {
        switch(velDown){
            case "51200":
                minDown = new Double("51200");
                break;
            default:
                minDown = new Double("0");
                break;
        }
        
        switch(velUp){
            case "5120":
                minUp = new Double("5120");
                break;
            default:
                minUp = new Double("0");
                break;
        }
        
    }
    
    
    
}
