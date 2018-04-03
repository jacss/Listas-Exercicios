package br.com.atividade3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ParOuImpar {

	public void mostraParImpar() {
		ArrayList<Integer> nPar = new ArrayList<>();
		ArrayList<Integer> nImpar = new ArrayList<>();
		int[] num = new int[10];
		String par = null;
		String impar = null;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite os numeros");
			num[i] = scanner.nextInt();
			if (num[i] % 2 == 0) {
				nPar.add(num[i]);

			} else if(num[i]%2!=0){


				nImpar.add(num[i]);
			}

		}
		System.out.println("Numeros pares: " + nPar);
		System.out.println("Numeros impares: " + nImpar);

	}

	public static void main(String[] args) {
		ParOuImpar p = new ParOuImpar();
		p.mostraParImpar();

	}

}
