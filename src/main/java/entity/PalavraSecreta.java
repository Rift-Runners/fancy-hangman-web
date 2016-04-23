package entity;

public class PalavraSecreta {

	private String palavra, assunto, dificuldade;
	
	public PalavraSecreta(String palavra, String assunto, String dificuldade) {
		super();
		this.palavra = palavra;
		this.assunto = assunto;
		this.dificuldade = dificuldade;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}
	
}
