package br.com.atividade2;

import javax.swing.JOptionPane;

public class CrescenteDecrescente {
	private int valor1;
	private int valor2;
	private int valor3;

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int getValor3() {
		return valor3;
	}

	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}

	public void insereValores() {
		String opcao = null;
		int aux=0;
		do {
			valor1 = (Integer.parseInt(JOptionPane.showInputDialog("Primeiro Numero")));
			valor2 = (Integer.parseInt(JOptionPane.showInputDialog("Primeiro segundo")));
			valor3 = (Integer.parseInt(JOptionPane.showInputDialog("Primeiro terceiro")));

			opcao = (JOptionPane.showInputDialog("Digite:\n C = Ordem Crecente\n D = Ordem Decrescente\n S = Sair"));
			switch (opcao) {
			//valor1  valor2  valor3
			//  4       2       3
			//  1       3       2
			//                 
			
			case "c":
				if((valor1<valor2)&&(valor2<valor3)) {
					JOptionPane.showMessageDialog(null, "Ordem Crescente6:\n "+valor1+" - "+valor2+" - "+valor3);
				}else if((valor1<valor3)&&(valor1<valor2)) {
					JOptionPane.showMessageDialog(null, "Ordem Crescente6:\n "+valor1+" - "+valor3+" - "+valor2);
					
				}else if((valor3<valor2)&&(valor3<valor1)) {
					JOptionPane.showMessageDialog(null, "Ordem Crescente6:\n "+valor3+" - "+valor2+" - "+valor1);
					
				}else if((valor3<valor1)&&(valor3<valor2)) {
					JOptionPane.showMessageDialog(null, "Ordem Crescente6:\n "+valor3+" - "+valor1+" - "+valor2);
					
				}else if((valor2<valor1)&&(valor2<valor3)) {
					JOptionPane.showMessageDialog(null, "Ordem Crescente6:\n "+valor2+" - "+valor1+" - "+valor3);
					
				}else {
					JOptionPane.showMessageDialog(null, "Ordem Crescente6:\n "+valor2+" - "+valor3+" - "+valor1);
				}
				
				break;
			case "d":
				JOptionPane.showMessageDialog(null, "Decrescente");
				break;

			default:
				if (opcao.equals("s")) {
					JOptionPane.showMessageDialog(null, "Você está saindo do sistema");
				} else {
					JOptionPane.showMessageDialog(null, "Caracter errado!!");
				}

				break;
			}
		} while (!opcao.equals("s"));

	}

}
