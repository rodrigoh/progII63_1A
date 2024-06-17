package aula20.exemploHeranca;

public class Principal {
	public static void main(String[] args) {
		Motorista m1 = new Motorista("Pedro","Silva",123);
		m1.setMatricula(123);
		//m1.setNome("Pedro");
		m1.setSobrenome("Santos");
		m1.setCnh("12313213");
		System.out.println("O novo motorista chama "+m1.getNome());

		Engenheiro e1 = new Engenheiro("Anna","Silva",158,"123456789");
		e1.setNome("Anna");
		e1.setSobrenome("Silva");
		e1.setCrea("123456789");
	}
}
