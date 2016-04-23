/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Guilherme
 */
public class Jogador {
    
    private Integer vidas;

    public Jogador(Integer vidas) {
        this.vidas = vidas;
    }
    
    public Integer getVidas() {
        return vidas;
    }

    public void setVidas(Integer vidas) {
        this.vidas = vidas;
    }
}
