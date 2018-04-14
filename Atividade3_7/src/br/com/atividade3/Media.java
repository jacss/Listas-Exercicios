package br.com.atividade3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Media {

	public void calculaMedia() {
		ArrayList<Float> lista = new ArrayList<>();

		double media = 0;
		double soma = 0;
		int quantidade = 0;
		int vetorC=0;
		DecimalFormat df = new DecimalFormat("0.00");

		do {
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que queira analizar"));
			float vetor[] = new float[quantidade];
			for (int i = 0; i < quantidade; i++) {

				vetor[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a " + (i + 1) + "ª" + " média"));
				lista.add(vetor[i]);
				soma += vetor[i];
				vetorC=(int) vetor[i];

			}
			media = soma / quantidade;
			Arrays.sort(vetor);
			JOptionPane.showMessageDialog(null, "Media menor: " + vetor[0] + "\n" + "Media Maior: "
					+ lista.get(lista.size() - 1) + "\n" + "Média aritimética: " + df.format(media));
		} while (vetorC > 0);
	}

	public static void main(String[] args) {
		Media m = new Media();
		m.calculaMedia();
	}

}
