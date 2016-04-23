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
public class Jogo {
    
	private Jogador jogador;
    private PalavraSecreta palavra;
    
	public Jogo(Jogador jogador, PalavraSecreta palavra) {
		super();
		this.jogador = jogador;
		this.palavra = palavra;
	}
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public PalavraSecreta getPalavra() {
		return palavra;
	}
	public void setPalavra(PalavraSecreta palavra) {
		this.palavra = palavra;
	}
    
    
}
