package br.edu.usj.aluno;

public class Felino {	
	private String nome;
	private String tipoPelo;
	private String raca;
	private Double tamanho;
	private Double peso;
	
	
	public Felino() {
		super();
	}


	public Felino(String nome, String tipoPelo, String raca, Double tamanho, Double peso) {
		super();
		this.nome = nome;
		this.tipoPelo = tipoPelo;
		this.raca = raca;
		this.tamanho = tamanho;
		this.peso = peso;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipoPelo() {
		return tipoPelo;
	}


	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public Double getTamanho() {
		return tamanho;
	}


	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}


	public Double getPeso() {
		return peso;
	}


	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
	
}
