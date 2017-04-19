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
            case "35840":
                minDown = new Double("37000");
                break;
            case "25600":
                minDown = new Double("26680");
                break;
            case "15360":
                minDown = new Double("17503");
                break;
            case "10240":
                minDown = new Double("11742");
                break;
            case "5120":
                minDown = new Double("5120");
                break;
            case "3072":
                minDown = new Double("3072");
                break;
            default:
                minDown = new Double("0");
                break;
        }
        
        switch(velUp){
            case "5120":
                minUp = new Double("5120");
                break;
            case "3072":
                minUp = new Double("3600");
                break;
            case "2048":
                minUp = new Double("2344");
                break;
            case "1024":
                minUp = new Double("1024");
                break;
            case "768":
                minUp = new Double("750");
                break;
            default:
                minUp = new Double("0");
                break;
        }
        
    }
    
    
    
}
