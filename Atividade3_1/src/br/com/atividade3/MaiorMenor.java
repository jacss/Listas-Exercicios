package br.com.atividade3;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MaiorMenor {

	public void calculaNumero() {

		float num[] = new float[15];

		for (int i = 1; i <= num.length; i++) {
			num[i - 1] = Float.parseFloat(JOptionPane.showInputDialog("Digite o " + i + "º " + "número:"));

		}

		Arrays.sort(num);
		JOptionPane.showMessageDialog(null, "Número menor: " + num[0] + "\n" + "Número Maior: " + num[14]);

	}

}
