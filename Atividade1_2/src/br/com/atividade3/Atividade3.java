package br.com.atividade3;

public class Atividade3 {
	private double grausCelsius;
	private double fahrenheit;

	public double getGrausCelsius() {
		return grausCelsius;
	}

	public void setGrausCelsius(double grausCelsius) {
		this.grausCelsius = grausCelsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	public double calculaTemperatura() {
		fahrenheit = (9* grausCelsius+160)/5;
		return fahrenheit;
		
	}

}
