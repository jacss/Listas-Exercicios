package br.com.atividade2;

public class Nota {
	private double nota1;
	private double nota2;
	private double nota3;

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	// Metodo que calcula a media
	public double calculaMedia() {
		double media = (nota1 + nota2 + nota3) / 3;
		return media;
	}

	// Método que calcula a nota maior
	public double maiorNota() {
		double maior;
		if ((nota1 >= nota2) && (nota1 >= nota3)) {
			maior = nota1;

		} else if ((nota2 >= nota1) && (nota2 >= nota3)) {
			maior = nota2;

		} else {
			maior = nota3;
		}
		return maior;
	}

}
