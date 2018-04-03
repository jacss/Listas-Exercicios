import javax.swing.JOptionPane;

public class VerificaTriangulo {

	public static void main(String[] args) {
		//Estancia a classe triangulo
		Triangulo tri = new Triangulo();
		//converte de inteiro para string e captura o primeiro valor digitado
		tri.setNum1(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Primeiro lado do triangulo.")));
		//converte de inteiro para string e captura o segundo valor digitado
		tri.setNum2(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Segundo lado do triangulo.")));
		//converte de inteiro para string e captura o terceiro valor digitado
		tri.setNum3(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Terceiro lado do triangulo.")));
		tri.calculaTriangulo();
		
	}

}
