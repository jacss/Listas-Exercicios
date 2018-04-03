package br.com.atividade2;

import javax.swing.JOptionPane;

public class VerificaParOuImpar {

	public static void main(String[] args) {
		//Instancia a classe ParImpar
		ParImpar pi = new ParImpar();
		//Converte int em string e captura o numero digitado
		pi.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número")));
		//Chama o método que faz a verificação se é par ou impar/negativo ou positivo
		pi.verificaParImpar();
	}

}
