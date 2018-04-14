package br.com.atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class NumPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> primos = new ArrayList<>();
		ArrayList<Integer> naoprimos = new ArrayList<>();

		int numero;
		System.out.println("Digite um numero");
		numero = sc.nextInt();
		for (int i = 1; i < numero; i++) {
			int contador = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0)
					contador++;
			}
			if (contador == 2) {
				primos.add(i);

			} else {
				naoprimos.add(i);
			}

		}
		System.out.print("Primos: " + primos + "\n");
		System.out.print("Não primos: " + naoprimos);
	}

}
