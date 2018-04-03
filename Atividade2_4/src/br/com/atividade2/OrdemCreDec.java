package br.com.atividade2;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class OrdemCreDec {
	public void crescenteDecrescente() {
		String opcao = null;

		int num[] = new int[3];
		do {
			for (int i = 1; i <= num.length; i++) {
				num[i - 1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + i + "º " + " número:"));

			}
			Arrays.sort(num);
			opcao = JOptionPane.showInputDialog(
					"Escolha:\n C - Para Ordem Crescente \n D - Dara Ordem Decrescente\n S - Para Sair");
			switch (opcao) {
			case "c":
				JOptionPane.showMessageDialog(null, "Ordem crescente: " + Arrays.toString(num));
				break;
			case "d":
				JOptionPane.showMessageDialog(null,
						"Ordem decrecente: " + "[" + num[2] + "," + num[1] + "," + num[0] + "]");
				break;
			default:
				if (!opcao.equals("s")) {
					JOptionPane.showMessageDialog(null, "Caracter inválido!!");
				}else {
					JOptionPane.showMessageDialog(null, "Você esta saindo do sistema!!");
				}

				break;
			}
		} while (!opcao.equals("s"));
	}

}
