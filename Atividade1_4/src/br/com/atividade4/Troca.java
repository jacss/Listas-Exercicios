package br.com.atividade4;

import javax.swing.JOptionPane;

public class Troca {

	public static void main(String[] args) {
		//Intancia��o da classe TrocaValores.
		TrocaValores tv = new TrocaValores();
		
		//Conver��o de int para string e a captura do valor de A.
		tv.setA(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Valor de A.")));
		//Conver��o de int para string e a captura do valor de B.
		tv.setB(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Valor de B.")));
		//Chama o m�todo que gerencia a troca de posi��es.
		tv.trocarValores();

	}

}
