import javax.swing.JOptionPane;

public class Triangulo {
	private int num1;
	private int num2;
	private int num3;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public void calculaTriangulo() {
		if ((num1 == num2) && (num1 == num3) && (num2 == num3)) {
			JOptionPane.showMessageDialog(null,
					"O triangulo possui três lados iguais então ele é um: " + "TRIANGULO EQUILÁTERO\n"+valorDigitado());

		} else if ((num1 != num2) && (num1 != num3) && (num2 != num3)) {
			JOptionPane.showMessageDialog(null,
					"O triangulo possui três lados diferentes então ele é um: " + "TRIANGULO ESCALENO\n"+valorDigitado());

		} else {
			JOptionPane.showMessageDialog(null,
					"O triangulo possui dois lados iguais e um diferente então ele é um: " + "TRIANGULO ISÓSCELES\n"+ valorDigitado());

		}

	}
	public String valorDigitado() {
	String valor = "Os valores digitados foram: "+num1+","+num2+","+num3;
		return valor ;
	}

}
