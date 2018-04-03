package br.com.atividade2;

import javax.swing.JOptionPane;

public class ParImpar {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int verificaParImpar() {
		if ((numero % 2 == 0) && (numero > 0)) {
			JOptionPane.showMessageDialog(null, "O Numero " + numero + " é PAR e POSITIVO");

		} else if ((numero % 2 == 0) && (numero < 0)) {
			JOptionPane.showMessageDialog(null, "O Numero " + numero + " é PAR e NEGATIVO");
		} else if ((numero % 2 != 0) && (numero > 0)) {
			JOptionPane.showMessageDialog(null, "O Numero " + numero + " é IMPAR e POSITIVO");

		} else {
			JOptionPane.showMessageDialog(null, "O Numero " + numero + " é IMPAR e NEGATIVO");
		}
		return numero;
	}

}
