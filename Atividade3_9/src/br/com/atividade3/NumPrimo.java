package br.com.atividade3;

import java.util.Scanner;

public class NumPrimo {

	public static void main(String[] args) {
		int verifica;
		System.out.println("Digite um numero");
		Scanner sc = new Scanner(System.in);
		verifica=sc.nextInt();
		if(eNumeroPrimo(verifica)) {
			System.out.println("O numero : "+verifica+ " é primo");
		}else {
			System.out.println("O numero : "+verifica+ " não é primo");
		}
		

	}

	public static boolean eNumeroPrimo(int numero) {
		boolean primo = false;
		int contador = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			primo = true;

		}

		return primo;
	}
}
