package br.com.atividade3;

public class Fracoes {

	public static void main(String[] args) {
		int contador = 1;
		float soma = 0;
		for(int i=1;i<=99;i=i+2) {
			
			System.out.println(i+ "/" + contador);
			
			soma = soma +(i/contador);
			contador++;
		}
		
		System.out.println("A Soma é: " + soma);
		System.out.println("contador: "+ contador);
	}

}
