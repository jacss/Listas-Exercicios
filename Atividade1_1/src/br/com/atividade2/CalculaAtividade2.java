package br.com.atividade2;

import javax.swing.JOptionPane;

public class CalculaAtividade2 {

	public static void main(String[] args) {
		Atividade2 ativ = new Atividade2();
		ativ.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro n�mero!!")));
		ativ.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo n�mero!!")));

		JOptionPane.showMessageDialog(null,
				"Soma: " + ativ.calculaSoma() + "\n" + "Diferen�a: " + ativ.calculadiferenca() + "\n" + "Produto: "
						+ ativ.calculaProduto() + "\n" + "M�dia: " + ativ.calculaMedia() + "\n"
						+ "Os N�meros digitados foram: " + ativ.getNum1() + " e " + ativ.getNum2());

	}

}
