package aula24.exemploInteface.exercicio;

public class Teste {
	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		c1.setRaio(5);
		System.out.println("A figura "+c1.obterNomeFigura());
		System.out.println("Tem área de "+String.format("%.2f cm²",
						c1.calculaArea()));
		System.out.println("Tem perímetro de "+String.format("%.2f cm",c1.calculaPerimetro()));
	}
}
