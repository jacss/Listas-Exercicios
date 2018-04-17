package br.com.atividade3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		ArrayList<Integer> nPar = new ArrayList<>();
		ArrayList<Integer> nImpar = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Ditige um numero");
		numero = sc.nextInt();
		for (int i = 0; i < numero; i++) {
			if (i % 2 == 0) {
				nPar.add(i);

			} else {
				nImpar.add(i);

			}

		}
		System.out.print("Primos: " + nPar + "\n");
		System.out.print("Não Primos: " + nImpar);
	}

}
