package br.com.atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class Conjunto {

	public static void main(String[] args) {
		float num1=0;
		float num2=0;
		float num3=0;
		int qtdConjunto =1;
		Scanner sc = new Scanner(System.in);
		ArrayList<Float>numeros =new ArrayList<>();
		System.out.println("\nDigite a quantidade de conjuntos!!");
		qtdConjunto = sc.nextInt();
		
		for(int i = 0; i<qtdConjunto;i++) {
			
			System.out.printf("\n\nConjunto %d ",i+1);
			
			System.out.printf("\nDigite o primeiro número");
			num1=sc.nextFloat();
			System.out.printf("\nDigite o primeiro número");
			num2=sc.nextFloat();
			System.out.printf("\nDigite o primeiro número");
			num3=sc.nextFloat();
			
			Conjunto c = new Conjunto();
			c.soma_prod_media(num1, num2, num3);
			
		}
		
		
	}
	public void soma_prod_media(float n1,float n2, float n3) {
		System.out.printf("\nSoma: %.2f", n1+n2+n3);
		System.out.printf("\nProduto: %.2f", n1*n2*n3);
		System.out.printf("\nMedia: %.2f", (n1+n2+n3)/3);
	}
	

}
