package br.com.atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class NumPrimos {

	public static void main(String[] args) {
		ArrayList<Integer> primo = new ArrayList<>();
		ArrayList<Integer> naoPrimo = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int i = 0;

		for (; i < numeros.length; i++) {
			System.out.println("Digite:");
			numeros[i] = sc.nextInt();
			if (eNumeroPrimo(numeros[i])) {

				primo.add(numeros[i]);

			} else {
				naoPrimo.add(numeros[i]);

			}

		}

		System.out.println("Números Primos: " + primo);
		System.out.println("Números não Primos: " + naoPrimo);

	}

	public static boolean eNumeroPrimo(int numero) {
		boolean eNumeroPrimo = false;
		int contador = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			eNumeroPrimo = true;

		}
		return eNumeroPrimo;
	}

}
