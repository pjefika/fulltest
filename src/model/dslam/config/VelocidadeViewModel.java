/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.config;

import java.util.List;
import model.dslam.config.velocidade.VelocidadeDTO;

/**
 *
 * @author G0042204
 */
public interface VelocidadeViewModel {

    public List<VelocidadeDTO> listarVelocidadesDown();

    public List<VelocidadeDTO> listarVelocidadesUp();

}
