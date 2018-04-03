package br.com.atividade5;

public class QuadradoNumero {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	//metodo que calcula o quadrado do numero
	public int calculaQuadrado() {
		int quadrado = (int) Math.pow(numero,2);
		return quadrado;
	}

}
