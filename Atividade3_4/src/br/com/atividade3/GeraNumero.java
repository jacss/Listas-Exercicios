package br.com.atividade3;

import javax.swing.JOptionPane;

public class GeraNumero {
	public void geraNumeros() {
		int cont = 0;
		for(int i=1000;i<1999;i++) {
			
			if(i%11==5) {
				cont++;
				System.out.println(i);
				
			}
			
		}
	}

}
