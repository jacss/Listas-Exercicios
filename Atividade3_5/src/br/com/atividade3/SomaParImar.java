package br.com.atividade3;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class SomaParImar {

	public void entradaDeNumeros() {
		ArrayList<Float> par = new ArrayList<>();
		ArrayList<Float> impar = new ArrayList<>();

		float[] numeros = new float[60];
		int somaPar = 0;
		int somaImpar = 0;
		int i = 0;
		
		
			for (; i < numeros.length; i++) {

				if (i % 2 == 0) {
					somaPar += i;
					par.add((float) i);

				} else if (i % 2 != 0) {
					somaImpar += i;
					impar.add((float) i);

				}
				if((somaPar>1000)&&(somaImpar>1000)) {
					System.out.println("A soma dos pares ultrapassou 1000");
					System.exit(0);
				}
			}
			Arrays.sort(numeros);
			JOptionPane.showMessageDialog(null,
					"Soma dos numeros pares: " + somaPar + "\n" + "Soma dos numeros Impares: " + somaImpar + "\n"
							+ "Números Pares: " + par + "\n" + "Numeros Impares: " + impar);
		
	}

}
