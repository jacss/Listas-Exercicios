package br.com.atividade4;

import javax.swing.JOptionPane;

public class TrocaValores {
	private int A;
	private int B;
	private int T;

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public int getT() {
		return T;
	}

	public void setT(int t) {
		T = t;
	}
	//Método para realizar a troca de posições
	public void trocarValores() {
		T = A;
		A = B;
		B = T;
		JOptionPane.showMessageDialog(null, "Os numeros reais de entrada foram:\n" + " A = " + B + "\n" + " B = " + A
				+ "\n" + "Depois da troca de posições ficou assim:  \n" + " A = " +A +"\n" + " B = " + B);
	}

}
