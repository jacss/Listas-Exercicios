package br.com.atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class NumPrimo {

	public static void main(String[] args) {
		int numero = 0;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número.");
		numero = sc.nextInt();
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			System.out.println("O numero " + numero + " é Primo.");
		} else {
			System.out.println("O numero " + numero + " não é Primo.");
		}

	}
}
