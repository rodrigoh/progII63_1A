package aulaOnze.exemploLampada;

public class Teste {
	public static void main(String[] args) {
		Lampada l1 = new Lampada();
		l1.marca = "lg";
		l1.modelo = "led";
		l1.local = "sala";
		l1.cor = "branca";

		System.out.println(l1.obterDados());
		l1.ligar();
		System.out.println(l1.obterDados());
	}
}
