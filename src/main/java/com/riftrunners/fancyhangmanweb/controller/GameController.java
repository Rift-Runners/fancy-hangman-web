/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riftrunners.fancyhangmanweb.controller;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author 631420063
 */
@ManagedBean(eager = true)
@ApplicationScoped
public class GameController {
    
    String nome;
    /**
     * Creates a new instance of TestController
     */
    public GameController() {
        this.nome = "Teste!";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
