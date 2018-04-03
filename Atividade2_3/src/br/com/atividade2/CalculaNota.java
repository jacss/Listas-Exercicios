package br.com.atividade2;

import javax.swing.JOptionPane;

public class CalculaNota {

	public static void main(String[] args) {
		Nota nota = new Nota();
		//converte de inteiro para string e captura a primeira nota digitada
		nota.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota.")));
		//converte de inteiro para string e captura segunda nota digitada
		nota.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota.")));
		//converte de inteiro para string e captura a terceira nota digitada
		nota.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota.")));
		JOptionPane.showMessageDialog(null,
				"A maior nota digitada foi: " + nota.maiorNota() + "\n" + "A média é: " + nota.calculaMedia());

	}

}
