package br.com.atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		float[]num = new float[3];
		double soma=0;
		@SuppressWarnings("resource")
		ArrayList<Float>list =new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<num.length;i++) {
			System.out.printf("Digite o %d º número",i);
			num[i]=sc.nextFloat();
			list.add(num[i]);
			soma +=num[i];
		}
		System.out.println(list);
		System.out.println(soma);
	}

}
