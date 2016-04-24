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

    private String[] letras;

    /**
     * Creates a new instance of TestController
     */
    public GameController() {
        this.letras = new String[]{"A", "B", "C", "D", "E", "F",
        "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
        "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    }

    public String[] getLetras() {
        return letras;
    }
}
