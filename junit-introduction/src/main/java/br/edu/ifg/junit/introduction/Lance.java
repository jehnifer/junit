package br.edu.ifg.junit.introduction;

public class Lance {

	
	private String nome;
	private double valor;

	public Lance(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;

	}
	
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
}
