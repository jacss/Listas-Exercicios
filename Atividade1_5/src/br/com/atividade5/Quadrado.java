package br.com.atividade5;

import javax.swing.JOptionPane;

public class Quadrado {

	public static void main(String[] args) {
		//Instancia��o da classe QuadradoNumero
		QuadradoNumero qn = new QuadradoNumero();
		//convers�o de int para string e captura o valor do numero
		qn.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero:")));
		//Mosa o resultado
		JOptionPane.showMessageDialog(null, "O quadrado de "+ qn.getNumero()+ " � "+qn.calculaQuadrado() );

	}

}
