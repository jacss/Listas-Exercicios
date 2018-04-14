//package br.com.atividade3;
//
//import java.util.Scanner;
//
//public class Conjunto2 {
//
//	public static void main(String[] args) {
//		int qtdConjunto;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Entre com a quantidade de conjuntos!!");
//		qtdConjunto = sc.nextInt();
//		double[][] calcNumeros = new double[qtdConjunto][];
//		for (int i = 0; i < calcNumeros.length; i++) {
//			System.out.println("Digite a quandiade de numeros que serão calculados!!");
//			int qdtNumeros = sc.nextInt();
//			calcNumeros[i] = new double[qdtNumeros];
//
//			for (int j = 0; j < calcNumeros[i].length; j++) {
//				System.out.println("Digite o " + (j + 1) + "º" + " números.");
//				calcNumeros[i][j] = sc.nextDouble();
//
//			}
//			System.out.println();
//		}
//		
//		double soma;
//		double produto;
//		for (int i = 0; i < calcNumeros.length; i++) {
//			soma = 0;
//			produto = 0;
//			System.out.println("Conjunto " + (i+1) + ":");
//			for (int j = 0; j < calcNumeros[i].length; j++) {
//				soma += calcNumeros[i][j];
//				produto= calcNumeros[i][j]*calcNumeros[i][j]*calcNumeros[i][j];
//
//			}
//			System.out.println("Soma: " + soma+" ");
//			System.out.println("Média: " + soma / 3+" ");
//			System.out.println("Produto: " + produto+" "+"\n");
//
//		}
//
//	}
//
//}
