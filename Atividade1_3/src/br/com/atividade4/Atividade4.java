package br.com.atividade4;

public class Atividade4 {
	private static final double PI = 3.14;
	private double altura;
	private double raio;
	private double volume;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getPI() {
		return PI;
	}
public double calculaVolume() {
	volume = PI * (raio*raio)  * altura;
	return volume;
	
}
}
