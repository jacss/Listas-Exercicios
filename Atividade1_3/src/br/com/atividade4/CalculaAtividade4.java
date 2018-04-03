package br.com.atividade4;

import javax.swing.JOptionPane;

public class CalculaAtividade4 {

	public static void main(String[] args) {
		Atividade4 ativ = new Atividade4();
		ativ.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura!!")));
		ativ.setRaio(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o raio!!")));

		JOptionPane.showMessageDialog(null, "O volume é: " + ativ.calculaVolume());

	}

}
