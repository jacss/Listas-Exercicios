package br.com.atividade3;

import java.util.Scanner;

public class Conjunto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[3];
		int soma = 0;
		int produto = 0;
		int media = 0;
		do {
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Digite o " + (i + 1) + "º" + "número.\n");
				numeros[i] = sc.nextInt();
				soma += numeros[i];
				media = soma / 3;
				produto = numeros[0] * numeros[1] * numeros[2];

			}
			System.out.printf("A soma de %d,%d,%d é %d\n ", numeros[0], numeros[1], numeros[2], soma);
			System.out.printf("A Média de %d,%d,%d é %d\n ", numeros[0], numeros[1], numeros[2], media);
			System.out.printf("A produto de %d,%d,%d é %d\n ", numeros[0], numeros[1], numeros[2], produto);
		} while ((numeros[0] < numeros[1]) && numeros[1] < numeros[2]);

	}

}
