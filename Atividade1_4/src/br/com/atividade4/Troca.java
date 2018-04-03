package br.com.atividade4;

import javax.swing.JOptionPane;

public class Troca {

	public static void main(String[] args) {
		//Intanciação da classe TrocaValores.
		TrocaValores tv = new TrocaValores();
		
		//Converção de int para string e a captura do valor de A.
		tv.setA(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Valor de A.")));
		//Converção de int para string e a captura do valor de B.
		tv.setB(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Valor de B.")));
		//Chama o método que gerencia a troca de posições.
		tv.trocarValores();

	}

}
