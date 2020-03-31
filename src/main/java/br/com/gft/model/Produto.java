package br.com.gft.model;

public abstract class Produto {
	private String nome;
	private double preco;
	private int qtd;

	public Produto() {

	}

	public Produto( double preco ) {

		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}



}
