package br.com.atividade2;

import javax.swing.JOptionPane;

public class CalculaAtividade2 {

	public static void main(String[] args) {
		Atividade2 ativ = new Atividade2();
		ativ.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número!!")));
		ativ.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número!!")));

		JOptionPane.showMessageDialog(null,
				"Soma: " + ativ.calculaSoma() + "\n" + "Diferença: " + ativ.calculadiferenca() + "\n" + "Produto: "
						+ ativ.calculaProduto() + "\n" + "Média: " + ativ.calculaMedia() + "\n"
						+ "Os Números digitados foram: " + ativ.getNum1() + " e " + ativ.getNum2());

	}

}
