package br.com.atividade2;

public class Atividade2 {
	private double num1;
	private double num2;
	private double soma;
	private double diferenca;
	private double produto;
	private double media;

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

	public double getDiferenca() {
		return diferenca;
	}

	public void setDiferenca(double diferenca) {
		this.diferenca = diferenca;
	}

	public double getProduto() {
		return produto;
	}

	public void setProduto(double produto) {
		this.produto = produto;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double calculaSoma() {
		double resultadoSoma = num1 + num2;
		return resultadoSoma;
	}

	public double calculadiferenca() {
		double resultadoDiferenca = num1 - num2;
		return resultadoDiferenca;
	}

	public double calculaProduto() {
		double resultadoProduto = num1 * num2;
		return resultadoProduto;
	}

	public double calculaMedia() {
		double resultadoMedia = (num1 + num2) / 2;
		return resultadoMedia;
	}

}
