package br.com.atividade2;

import javax.swing.JOptionPane;

public class VerificaParOuImpar {

	public static void main(String[] args) {
		//Instancia a classe ParImpar
		ParImpar pi = new ParImpar();
		//Converte int em string e captura o numero digitado
		pi.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero")));
		//Chama o m�todo que faz a verifica��o se � par ou impar/negativo ou positivo
		pi.verificaParImpar();
	}

}
