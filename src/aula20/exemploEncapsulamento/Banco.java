package aula20.exemploEncapsulamento;

public class Banco {
	public static void main(String[] args) {
		Conta c1 = new Conta("Ana",100);
		System.out.println("Ana conta cadastrada com id "+c1.getIdentificador());
		c1.depositar(10);
		c1.setTitular("Anna");
		c1.depositar(100);
		System.out.println(c1.getIdentificador());
		System.out.println(c1.getTitular());

	}
}
