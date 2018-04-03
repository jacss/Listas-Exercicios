package br.com.atividade3;

public class Tabuada {

	public static void main(String[] args) {

		for(int i = 1; i<=9;i++) {
		
			for(int j=1; j<=9;j++) {
				
				System.out.println(i+" x "+ j+ " = "+ (i*j));
				if(j == 9)
				System.out.println("|--Taboada de "+(i+1)+"--|");
			}
			
		
			
		}

	}

}
