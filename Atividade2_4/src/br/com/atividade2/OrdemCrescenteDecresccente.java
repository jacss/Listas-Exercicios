package br.com.atividade2;

import java.util.Scanner;

public class OrdemCrescenteDecresccente {

	public static void main(String[] args) {

		String codigo;
		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite:");
			System.out.println("C para Crescente:");
			System.out.println("D para Decrecente:");
			System.out.println("Sair:");
			
			codigo = sc.next();

			switch (codigo) {
			case "c":
			case "C":
				int num1;
				int num2;
				int num3;
				int maior;
				int menor;
				int meio;
				Scanner leitor = new Scanner(System.in);

				System.out.println("Digite o numero 1");
				num1 = leitor.nextInt();

				System.out.println("Digite o numero 2");
				num2 = leitor.nextInt();

				System.out.println("Digite o numero 3");
				num3 = leitor.nextInt();
				if ((num1 > num2) && (num1 > num3)) {
					maior = num1;

				} else if ((num2 > num1) && (num2 > num3)) {
					maior = num2;

				} else {
					maior = num3;
				}
				if ((num1 < num2) && (num1 < num3)) {
					menor = num1;
				} else if ((num2 < num1) && (num2 < num3)) {
					menor = num2;
				} else {
					menor = num3;
				}
				meio = (num1 + num2 + num3) - (maior + menor);
				System.out.println("Ordem Crescente: " + menor + "," + meio + "," + maior);

				break;
			case "d":
			case "D":

				System.out.println("Digite o numero 1");
				num1 = sc.nextInt();

				System.out.println("Digite o numero 2");
				num2 = sc.nextInt();

				System.out.println("Digite o numero 3");
				num3 = sc.nextInt();
				if ((num1 > num2) && (num1 > num3)) {
					maior = num1;

				} else if ((num2 > num1) && (num2 > num3)) {
					maior = num2;

				} else {
					maior = num3;
				}
				if ((num1 < num2) && (num1 < num3)) {
					menor = num1;
				} else if ((num2 < num1) && (num2 < num3)) {
					menor = num2;
				} else {
					menor = num3;
				}
				meio = (num1 + num2 + num3) - (maior + menor);

				System.out.println("Ordem Decrecente: " + maior + "," + meio + "," + menor);

				break;

			default:
				break;
			}
		} while (!codigo.equals("sair") );

	}

}
