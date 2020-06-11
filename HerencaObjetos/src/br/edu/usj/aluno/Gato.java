package br.edu.usj.aluno;

public class Gato extends Felino {

	private boolean domesticado;

	
	public boolean isDomesticado() {
		return domesticado;
	}

	public void setDomesticado(boolean domesticado) {
		this.domesticado = domesticado;
	}

	@Override
	public String toString() {
		return "Gato [domesticado=" + domesticado + ", Nome =" + getNome() + ", Tipo Pelo =" + getTipoPelo()
				+ ", Raça=" + getRaca() + ", Tamanho =" + getTamanho() + ", Peso =" + getPeso() + "]";
	} 
	
	
	
}
