package aula24.exemploAbstrata;

public class Teste {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		c1.setNomeFigura("Círculo");
		c1.setRaio(5);
		System.out.println("O "+c1.getNomeFigura());
		System.out.println("Tem área de "+String.format("%.2f",c1.calculaArea())+
						"cm²");
		System.out.println("Tem perímetro de "+String.format("%.2f",
						c1.calculaPerimetro())+"cm");
		Quadrado q1 = new Quadrado();
		q1.setNomeFigura("Quadrado");
		q1.setLado(6);
		System.out.println("O "+q1.getNomeFigura());
		System.out.println("Tem área de "+q1.calculaArea()+"cm²");
		System.out.println("Tem perímetro de "+q1.calculaPerimetro()+"cm");
		Retangulo r1 = new Retangulo();
		r1.setNomeFigura("Retângulo");
		r1.setBase(5);
		r1.setAltura(2);
		System.out.println("O "+r1.getNomeFigura());
		System.out.println("Tem área de "+r1.calculaArea()+"cm²");
		System.out.println("Tem perímetro de "+r1.calculaPerimetro()+"cm");
	}
}
