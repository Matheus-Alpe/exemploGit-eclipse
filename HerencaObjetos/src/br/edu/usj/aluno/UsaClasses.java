package br.edu.usj.aluno;

import javax.swing.JOptionPane;

public class UsaClasses {

	public static void main(String[] args) {
		
		Gato gato1 = new Gato();
		
		gato1.setNome(JOptionPane.showInputDialog("Digite o nome do gato:"));;		
		gato1.setTipoPelo("Preto");
		gato1.setRaca("Persa");
		gato1.setTamanho(20.5);
		gato1.setPeso(5.9);
		gato1.setDomesticado(true);
		System.out.println(gato1.toString());
	}

}
