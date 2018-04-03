package br.com.atividade3;

import javax.swing.JOptionPane;

public class CalculaAtividade3 {

	public static void main(String[] args) {
		Atividade3 ativ = new Atividade3();
		ativ.setGrausCelsius(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor em Gruas Ceulsius!!")));
		JOptionPane.showMessageDialog(null, ativ.getGrausCelsius() + " em Graus Celsius corresponde a "
				+ ativ.calculaTemperatura()+" em Fahrenhit.");

	}

}
