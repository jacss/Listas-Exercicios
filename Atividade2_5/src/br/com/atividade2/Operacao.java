package br.com.atividade2;

import javax.swing.JOptionPane;

public class Operacao {
	private int num1;
	private int num2;
	private int num3;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public void calculaNumeros() {
		String opcao = null;
		do {
			num1 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número")));
			num2 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero número")));
			num3 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número")));
			opcao = JOptionPane.showInputDialog(
					"Digite:\n" + "MD - Calcular Média \n" + "SD - Para dividir ou somar\n" + "Sair - para Sair");
			switch (opcao) {

			case "md":

				int media = (num1 + num2 + num3) / 3;
				JOptionPane.showMessageDialog(null,
						"A média dos numeros " + num1 + " ; " + num2 + " ; " + num3 + " é igual a: " + media);

				break;
			case "sd":
				String escolha = JOptionPane.showInputDialog(
						"Você deseja Somar ou Multiplicar?\n" + "S - para Somar\n" + "M - para Multiplicar");

				if (escolha.equals("s")) {

					int soma = num1 + num2 + num3;
					JOptionPane.showMessageDialog(null,
							"A Soma dos numeros " + num1 + " ; " + num2 + " ; " + num3 + " é igual a: " + soma);

				} else if (escolha.equals("m")) {

					int multiplicacao = num1 * num2 * num3;
					JOptionPane.showMessageDialog(null, "A Multiplicação dos numeros " + num1 + " ; " + num2 + " ; "
							+ num3 + " é igual a: " + multiplicacao);

				}
				break;
			default:
				if (opcao.equals("sair")) {
					JOptionPane.showMessageDialog(null, "Você está saindo do sistema!!");

				} else {
					JOptionPane.showMessageDialog(null, "Entrada de dados Errada!!");
				}
				break;
			}
		} while (!opcao.equals("sair"));
	}

}
