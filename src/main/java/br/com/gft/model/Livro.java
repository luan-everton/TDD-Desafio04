package br.com.gft.model;


public class Livro extends Produto implements Imposto {
	private String autor;
	private Tema tema;
	private int qtdPag;
	

	public Livro(double preco, Tema tema) {
		super(preco);
		this.tema = tema;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Tema getTema() {
		return tema;
	}


	public void setTema(Tema tema) {
		this.tema = tema;
	}


	public int getQtdPag() {
		return qtdPag;
	}


	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}


	@Override
	public double calculaImposto() {
		if (tema != Tema.EDUCATIVO)
			return 0.1 * getPreco();
		return 0;

	}
	

}
